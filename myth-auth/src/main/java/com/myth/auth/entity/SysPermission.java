package com.myth.auth.entity;

import com.myth.common.core.base.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
public class SysPermission {
    private static final long serialVersionUID = 8197268080561607208L;
    private Integer id;
    private String permissionName;
    private String permissionUrl;
    private Integer parentId;
    private List<SysRole> roles;
}
