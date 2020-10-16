package com.myth.mapper;

import com.myth.entity.SysPermission;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysPermissionMapper {

    @Select("select * from sys_permission")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.myth.mapper.SysRoleMapper.findByPid"))
    })
    List<SysPermission> findAllPermissionWithRoles();


    @Select("select * from sys_permission")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleNames", column = "id", javaType = List.class,
                    many = @Many(select = "com.myth.mapper.SysRoleMapper.findRoleNamesByPid"))
    })
    List<SysPermission> findAllPermissionWithRoleNames();
}
