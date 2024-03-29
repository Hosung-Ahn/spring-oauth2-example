package com.example.oauth2demo.oauth2.util.userprofile;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class GoogleUserProfileExtractor implements UserProfileExtractor{
    @Override
    public UserProfileDto extract(Map<String, Object> attributes) {
        String name = (String) attributes.get("name");
        String email = (String) attributes.get("email");
        String imageUrl = (String) attributes.get("picture");

        return new UserProfileDto(name, email, imageUrl);
    }
}
