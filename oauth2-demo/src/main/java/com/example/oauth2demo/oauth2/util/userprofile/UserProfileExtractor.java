package com.example.oauth2demo.oauth2.util.userprofile;

import java.util.Map;

public interface UserProfileExtractor {
    UserProfileDto extract(Map<String, Object> attributes);
}
