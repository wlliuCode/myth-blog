package com.myth.auth.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Oauth2获取Token返回信息封装
 * Created by macro on 2020/7/17.
 */
@Data
@Builder
public class Oauth2TokenDto {
    /**
     * 访问令牌
     */
    private String accessToken;

    private String tokenType;
    /**
     * 刷新令牌
     */
    private String refreshToken;
    private String scope;
    /**
     * 有效时间（秒）
     */
    private int expiresIn;
}
