package com.example.oauth2demo.oauth2.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class OAuth2AccessTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;
}
