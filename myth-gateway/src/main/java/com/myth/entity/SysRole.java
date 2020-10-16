package com.myth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myth.common.core.base.BaseEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class SysRole implements GrantedAuthority {

    private static final long serialVersionUID = 5538379147288718862L;
    private Integer id;
    private String roleName;
    private String roleDesc;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return roleName;
    }
}
