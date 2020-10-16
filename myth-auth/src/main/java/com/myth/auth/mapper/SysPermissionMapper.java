package com.myth.auth.mapper;

import com.myth.auth.entity.SysPermission;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysPermissionMapper {

    @Select("select * from sys_user where username")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.myth.auth.mapper.SysRoleMapper.findByPid"))
    })
    List<SysPermission> findAllPermissionWithRoles();
}
