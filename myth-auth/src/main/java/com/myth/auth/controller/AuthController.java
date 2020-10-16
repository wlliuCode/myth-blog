package com.myth.auth.controller;

import com.myth.auth.entity.Oauth2TokenDto;
import com.myth.common.core.result.Result;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

/**
 * 自定义Oauth2获取令牌接口
 * Created by macro on 2020/7/17.
 */
@RestController
@RequestMapping("oauth")
public class AuthController {

    @Autowired
    private TokenEndpoint tokenEndpoint;

    /**
     * Oauth2登录认证
     */

    @PostMapping("token")
    public Result postAccessToken(
            Principal principal,
            @RequestParam Map<String, String> parameters) throws HttpRequestMethodNotSupportedException {
        OAuth2AccessToken oAuth2AccessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        Oauth2TokenDto oauth2TokenDto = Oauth2TokenDto.builder()
                .accessToken(oAuth2AccessToken.getValue())
                .refreshToken(oAuth2AccessToken.getRefreshToken().getValue())
                .expiresIn(oAuth2AccessToken.getExpiresIn())
                .tokenType("bearer").build();
        return Result.success(oAuth2AccessToken);
    }

    @GetMapping("code")
    public void getCode(@Param("code") String code) {
        System.out.println(code);
    }
}
