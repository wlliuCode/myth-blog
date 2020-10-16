package com.myth.auth.mapper;

import com.myth.auth.entity.SysUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysUserMapper {

    @Select("select * from sys_user where username = #{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                many = @Many(select = "com.myth.auth.mapper.SysRoleMapper.findByUid"))
    })
    SysUser findByName(String username);

}
