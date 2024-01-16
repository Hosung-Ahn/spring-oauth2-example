package com.example.oauth2demo.oauth2.controller;

import com.example.oauth2demo.oauth2.service.OAuth2UserProfileService;
import com.example.oauth2demo.oauth2.util.OAuth2Provider;
import com.example.oauth2demo.oauth2.util.userprofile.UserProfileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final OAuth2UserProfileService oAuth2UserProfileService;
    @GetMapping("/user-profile")
    public ResponseEntity<UserProfileDto> getUserProfile(
            @RequestParam String code,
            @RequestParam OAuth2Provider provider) {
        UserProfileDto userProfileDto = oAuth2UserProfileService.getUserProfile(code, provider);
        return ResponseEntity.ok(userProfileDto);
    }
}
