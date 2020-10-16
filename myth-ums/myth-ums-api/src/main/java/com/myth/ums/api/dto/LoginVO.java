package com.myth.ums.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginVO implements Serializable {
    private static final long serialVersionUID = 8610689399120231988L;
    private String mobileOrEmail;
    private String password;
}
