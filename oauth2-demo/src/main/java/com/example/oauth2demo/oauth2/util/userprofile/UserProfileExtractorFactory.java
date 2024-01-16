package com.example.oauth2demo.oauth2.util.userprofile;


import com.example.oauth2demo.oauth2.util.OAuth2Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserProfileExtractorFactory {
    private final GitHubUserProfileExtractor gitHubUserProfileExtractor;
    private final GoogleUserProfileExtractor googleUserProfileExtractor;
    private final NaverUserProfileExtractor naverUserProfileExtractor;

    public UserProfileExtractor get(OAuth2Provider oAuth2Provider) {
        switch (oAuth2Provider) {
            case GOOGLE:
                return googleUserProfileExtractor;
            case NAVER:
                return naverUserProfileExtractor;
            case GITHUB:
                return gitHubUserProfileExtractor;
            default:
                throw new IllegalArgumentException("Invalid OAuth2 Provider");
        }
    }
}
