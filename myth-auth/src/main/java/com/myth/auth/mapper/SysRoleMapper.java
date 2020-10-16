package com.myth.auth.mapper;

import com.myth.auth.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysRoleMapper {

    @Select("SELECT r.id, r.role_name, r.role_desc " +
            "FROM sys_role r, sys_user_role ur " +
            "WHERE r.id=ur.rid AND ur.uid=#{uid}")
    List<SysRole> findByUid(Integer uid);

    @Select("SELECT r.id, r.role_name, r.role_desc " +
            "FROM sys_role r, sys_role_permission rp " +
            "WHERE r.id=rp.rid AND rp.PID=#{pid}")
    List<SysRole> findByPid(Integer pid);
}
