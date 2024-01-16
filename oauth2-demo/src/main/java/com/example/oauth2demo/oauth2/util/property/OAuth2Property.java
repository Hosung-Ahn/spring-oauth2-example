package com.example.oauth2demo.oauth2.util.property;

public interface OAuth2Property {
    String getClientId();
    String getClientSecret();
    String getRedirectUri();
    String getTokenUri();
    String getUserInfoUri();
}
