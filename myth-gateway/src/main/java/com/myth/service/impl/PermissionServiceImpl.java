package com.myth.service.impl;

import com.myth.entity.SysPermission;
import com.myth.mapper.SysPermissionMapper;
import com.myth.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public List<SysPermission> findAllPermissionWithRoles() {
        return sysPermissionMapper.findAllPermissionWithRoles();
    }

    @Override
    public List<SysPermission> findAllPermissionWithRoleNames() {
        return sysPermissionMapper.findAllPermissionWithRoleNames();
    }
}
