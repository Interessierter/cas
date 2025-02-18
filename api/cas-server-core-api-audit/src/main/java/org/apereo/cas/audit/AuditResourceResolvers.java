package org.apereo.cas.audit;

/**
 * This is {@link AuditResourceResolvers}.
 *
 * @author Misagh Moayyed
 * @since 6.4.0
 */
public interface AuditResourceResolvers {
    /**
     * Resource resolver id {@code REQUEST_FORGOT_USERNAME_RESOURCE_RESOLVER}.
     */
    String REQUEST_FORGOT_USERNAME_RESOURCE_RESOLVER = "REQUEST_FORGOT_USERNAME_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code DELEGATED_CLIENT_RESOURCE_RESOLVER}.
     */
    String DELEGATED_CLIENT_RESOURCE_RESOLVER = "DELEGATED_CLIENT_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code SAVE_CONSENT_RESOURCE_RESOLVER}.
     */
    String SAVE_CONSENT_RESOURCE_RESOLVER = "SAVE_CONSENT_RESOURCE_RESOLVER";
    
    /**
     * Resource resolver id {@code AUP_VERIFY_RESOURCE_RESOLVER}.
     */
    String AUP_VERIFY_RESOURCE_RESOLVER = "AUP_VERIFY_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code AUP_SUBMIT_RESOURCE_RESOLVER}.
     */
    String AUP_SUBMIT_RESOURCE_RESOLVER = "AUP_SUBMIT_RESOURCE_RESOLVER";
    
    /**
     * Resource resolver id {@code CHANGE_PASSWORD_RESOURCE_RESOLVER}.
     */
    String CHANGE_PASSWORD_RESOURCE_RESOLVER = "CHANGE_PASSWORD_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code REQUEST_CHANGE_PASSWORD_RESOURCE_RESOLVER}.
     */
    String REQUEST_CHANGE_PASSWORD_RESOURCE_RESOLVER = "REQUEST_CHANGE_PASSWORD_RESOURCE_RESOLVER";
    
    /**
     * Resource resolver id {@code REST_API_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER}.
     */
    String REST_API_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER = "REST_API_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code REST_API_SERVICE_TICKET_RESOURCE_RESOLVER}.
     */
    String REST_API_SERVICE_TICKET_RESOURCE_RESOLVER = "REST_API_SERVICE_TICKET_RESOURCE_RESOLVER";
    
    /**
     * Resource resolver id {@code SAML2_RESPONSE_RESOURCE_RESOLVER}.
     */
    String SAML2_RESPONSE_RESOURCE_RESOLVER = "SAML2_RESPONSE_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code SAML2_REQUEST_RESOURCE_RESOLVER}.
     */
    String SAML2_REQUEST_RESOURCE_RESOLVER = "SAML2_REQUEST_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code ADAPTIVE_RISKY_AUTHENTICATION_RESOURCE_RESOLVER}.
     */
    String ADAPTIVE_RISKY_AUTHENTICATION_RESOURCE_RESOLVER = "ADAPTIVE_RISKY_AUTHENTICATION_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code AUTHENTICATION_RESOURCE_RESOLVER}.
     */
    String AUTHENTICATION_RESOURCE_RESOLVER = "AUTHENTICATION_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code AUTHENTICATION_EVENT_RESOURCE_RESOLVER}.
     */
    String AUTHENTICATION_EVENT_RESOURCE_RESOLVER = "AUTHENTICATION_EVENT_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code CREATE_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER}.
     */
    String CREATE_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER = "CREATE_TICKET_GRANTING_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code CREATE_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER}.
     */
    String CREATE_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER = "CREATE_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code DESTROY_TICKET_RESOURCE_RESOLVER}.
     */
    String DESTROY_TICKET_RESOURCE_RESOLVER = "DESTROY_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code DESTROY_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER}.
     */
    String DESTROY_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER = "DESTROY_PROXY_GRANTING_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code GRANT_SERVICE_TICKET_RESOURCE_RESOLVER}.
     */
    String GRANT_SERVICE_TICKET_RESOURCE_RESOLVER = "GRANT_SERVICE_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code GRANT_PROXY_TICKET_RESOURCE_RESOLVER}.
     */
    String GRANT_PROXY_TICKET_RESOURCE_RESOLVER = "GRANT_PROXY_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code VALIDATE_SERVICE_TICKET_RESOURCE_RESOLVER}.
     */
    String VALIDATE_SERVICE_TICKET_RESOURCE_RESOLVER = "VALIDATE_SERVICE_TICKET_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code VALIDATE_PROTOCOL_SPECIFICATION_RESOURCE_RESOLVER}.
     */
    String VALIDATE_PROTOCOL_SPECIFICATION_RESOURCE_RESOLVER = "VALIDATE_PROTOCOL_SPECIFICATION_RESOURCE_RESOLVER";

    /**
     * Resource resolver id {@code SAVE_SERVICE_RESOURCE_RESOLVER}.
     */
    String SAVE_SERVICE_RESOURCE_RESOLVER = "SAVE_SERVICE_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code DELETE_SERVICE_RESOURCE_RESOLVER}.
     */
    String DELETE_SERVICE_RESOURCE_RESOLVER = "DELETE_SERVICE_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code SERVICE_ACCESS_ENFORCEMENT_RESOURCE_RESOLVER}.
     */
    String SERVICE_ACCESS_ENFORCEMENT_RESOURCE_RESOLVER = "SERVICE_ACCESS_ENFORCEMENT_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code SURROGATE_AUTHENTICATION_ELIGIBILITY_VERIFICATION_RESOURCE_RESOLVER}.
     */
    String SURROGATE_AUTHENTICATION_ELIGIBILITY_VERIFICATION_RESOURCE_RESOLVER = "SURROGATE_AUTHENTICATION_ELIGIBILITY_VERIFICATION_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code SURROGATE_AUTHENTICATION_ELIGIBILITY_SELECTION_RESOURCE_RESOLVER}.
     */
    String SURROGATE_AUTHENTICATION_ELIGIBILITY_SELECTION_RESOURCE_RESOLVER = "SURROGATE_AUTHENTICATION_ELIGIBILITY_SELECTION_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code MULTIFACTOR_AUTHENTICATION_BYPASS_RESOURCE_RESOLVER}.
     */
    String MULTIFACTOR_AUTHENTICATION_BYPASS_RESOURCE_RESOLVER = "MULTIFACTOR_AUTHENTICATION_BYPASS_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code TRUSTED_AUTHENTICATION_RESOURCE_RESOLVER}.
     */
    String TRUSTED_AUTHENTICATION_RESOURCE_RESOLVER = "TRUSTED_AUTHENTICATION_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code OAUTH2_USER_PROFILE_RESOURCE_RESOLVER}.
     */
    String OAUTH2_USER_PROFILE_RESOURCE_RESOLVER = "OAUTH2_USER_PROFILE_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code OAUTH2_ACCESS_TOKEN_REQUEST_RESOURCE_RESOLVER}.
     */
    String OAUTH2_ACCESS_TOKEN_REQUEST_RESOURCE_RESOLVER = "OAUTH2_ACCESS_TOKEN_REQUEST_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code OAUTH2_ACCESS_TOKEN_RESPONSE_RESOURCE_RESOLVER}.
     */
    String OAUTH2_ACCESS_TOKEN_RESPONSE_RESOURCE_RESOLVER = "OAUTH2_ACCESS_TOKEN_RESPONSE_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code OAUTH2_CODE_RESPONSE_RESOURCE_RESOLVER}.
     */
    String OAUTH2_CODE_RESPONSE_RESOURCE_RESOLVER = "OAUTH2_CODE_RESPONSE_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code ACCOUNT_REGISTRATION_TOKEN_CREATION_RESOURCE_RESOLVER}.
     */
    String ACCOUNT_REGISTRATION_TOKEN_CREATION_RESOURCE_RESOLVER = "ACCOUNT_REGISTRATION_TOKEN_CREATION_RESOURCE_RESOLVER";
    /**
     * Resource resolver id {@code ACCOUNT_REGISTRATION_TOKEN_VALIDATION_RESOURCE_RESOLVER}.
     */
    String ACCOUNT_REGISTRATION_TOKEN_VALIDATION_RESOURCE_RESOLVER = "ACCOUNT_REGISTRATION_TOKEN_VALIDATION_RESOURCE_RESOLVER";
}
