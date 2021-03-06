package it.cnr.iit.peprest.messagetrack;

public enum PEP_STATUS {
    TRYACCESS_SENT,
    TRYACCESS_PERMIT,
    TRYACCESS_DENY,
    STARTACCESS_SENT,
    STARTACCESS_PERMIT,
    STARTACCESS_DENY,
    ENDACCESS_SENT,
    ENDACCESS_PERMIT,
    ENDACCESS_DENY,
    REVOKED,
    SESSION_RESUMED;
}
