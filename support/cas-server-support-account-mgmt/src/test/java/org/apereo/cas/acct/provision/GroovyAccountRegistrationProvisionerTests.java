package org.apereo.cas.acct.provision;

import org.apereo.cas.acct.AccountRegistrationRequest;
import org.apereo.cas.config.CasAccountManagementWebflowConfiguration;
import org.apereo.cas.config.CasCoreHttpConfiguration;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.web.flow.BaseWebflowConfigurerTests;

import lombok.val;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is {@link GroovyAccountRegistrationProvisionerTests}.
 *
 * @author Misagh Moayyed
 * @since 6.5.0
 */
@SpringBootTest(classes = {
    RefreshAutoConfiguration.class,
    CasAccountManagementWebflowConfiguration.class,
    BaseWebflowConfigurerTests.SharedTestConfiguration.class,
    CasCoreHttpConfiguration.class
}, properties = "cas.account-registration.provisioning.groovy.location=classpath:/groovy-provisioner.groovy")
@EnableConfigurationProperties(CasConfigurationProperties.class)
@Tag("Groovy")
public class GroovyAccountRegistrationProvisionerTests {
    @Autowired
    @Qualifier("accountMgmtRegistrationProvisioner")
    private AccountRegistrationProvisioner accountMgmtRegistrationProvisioner;

    @Test
    public void verifyOperation() throws Exception {
        val registrationRequest = new AccountRegistrationRequest(Map.of("username", "casuser"));
        val results = accountMgmtRegistrationProvisioner.provision(registrationRequest);
        assertTrue(results.isSuccess());
    }
}
