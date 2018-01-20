package org.apereo.cas.support.saml.services.idp.metadata.cache.resolver;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apereo.cas.configuration.model.support.saml.idp.SamlIdPProperties;
import org.apereo.cas.configuration.model.support.saml.idp.metadata.SamlIdPMetadataProperties;
import org.apereo.cas.services.RegisteredService;
import org.apereo.cas.support.saml.OpenSamlConfigBean;
import org.apereo.cas.support.saml.services.SamlRegisteredService;
import org.apereo.cas.util.CollectionUtils;
import org.apereo.cas.util.ResourceUtils;
import org.apereo.cas.util.http.HttpClient;
import org.opensaml.saml.metadata.resolver.MetadataResolver;
import org.opensaml.saml.metadata.resolver.impl.FileBackedHTTPMetadataResolver;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.UrlResource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * This is {@link UrlResourceMetadataResolver}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@Slf4j
public class UrlResourceMetadataResolver extends BaseSamlRegisteredServiceMetadataResolver {


    private final HttpClient httpClient;

    public UrlResourceMetadataResolver(final SamlIdPProperties samlIdPProperties,
                                       final OpenSamlConfigBean configBean,
                                       final HttpClient httpClient) {
        super(samlIdPProperties, configBean);
        this.httpClient = httpClient;
    }

    @Override
    public Collection<MetadataResolver> resolve(final SamlRegisteredService service) {
        try {

            final String metadataLocation = service.getMetadataLocation();
            LOGGER.info("Loading SAML metadata from [{}]", metadataLocation);
            final AbstractResource metadataResource = ResourceUtils.getResourceFrom(metadataLocation);

            final File backupFile = getMetadataBackupFile(metadataResource, service);
            final String canonicalPath = backupFile.getCanonicalPath();
            LOGGER.debug("Metadata backup file will be at [{}]", canonicalPath);
            FileUtils.forceMkdirParent(backupFile);

            final FileBackedHTTPMetadataResolver metadataProvider = new FileBackedHTTPMetadataResolver(
                this.httpClient.getWrappedHttpClient(), metadataResource.getURL().toExternalForm(),
                canonicalPath);
            configureAndInitializeSingleMetadataResolver(metadataProvider, service);
            return CollectionUtils.wrap(metadataProvider);
        } catch (final Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return new ArrayList<>(0);
    }

    private File getMetadataBackupFile(final AbstractResource metadataResource,
                                       final RegisteredService service) throws IOException {
        final SamlIdPMetadataProperties md = samlIdPProperties.getMetadata();
        final File backupDirectory = new File(md.getLocation().getFile(), "metadata-backups");
        LOGGER.debug("Metadata backup directory is at [{}]", backupDirectory.getCanonicalPath());

        final String metadataFileName = service.getName().concat("-").concat(UUID.randomUUID().toString()).concat(metadataResource.getFilename());
        final File backupFile = new File(backupDirectory, metadataFileName);
        if (backupFile.exists()) {
            LOGGER.warn("Metadata file designated for service [{}] already exists at path [{}].", service.getName(), backupFile.getCanonicalPath());
        } else {
            LOGGER.debug("Metadata to fetch for service [{}] will be placed at [{}]", service.getName(), backupFile.getCanonicalPath());
        }
        try {
            FileUtils.forceMkdir(backupDirectory);
        } catch (final Exception e) {
            LOGGER.error("Unable to create metadata backup directory [{}] to store downloaded metadata from [{}]. "
                + "This is likely due to a permission issue", backupDirectory, metadataResource);
            LOGGER.debug(e.getMessage(), e);
        }
        return backupFile;
    }

    @Override
    public boolean supports(final SamlRegisteredService service) {
        try {
            final String metadataLocation = service.getMetadataLocation();
            final AbstractResource metadataResource = ResourceUtils.getResourceFrom(metadataLocation);
            return metadataResource instanceof UrlResource;
        } catch (final Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }
}
