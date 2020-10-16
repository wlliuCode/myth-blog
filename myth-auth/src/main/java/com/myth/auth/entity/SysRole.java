package com.myth.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myth.common.core.base.BaseEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class SysRole implements GrantedAuthority {

    private static final long serialVersionUID = 6372259648636691186L;
    private Integer id;
    private String roleName;
    private String roleDesc;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return roleName;
    }
}
