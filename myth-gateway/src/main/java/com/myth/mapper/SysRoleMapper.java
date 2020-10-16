package com.myth.mapper;

import com.myth.entity.SysRole;
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

    @Select("SELECT role_name " +
            "FROM sys_role r, sys_role_permission rp " +
            "WHERE r.id=rp.rid AND rp.PID=#{pid}")
    List<String> findRoleNamesByPid(Integer pid);


    @Select("select r.role_name from sys_role r," +
            "sys_role_permission rp,sys_permission p " +
            "where r.ID = rp.RID and p.ID = rp.PID and " +
            "p.permission_url =#{permissionUrl}")
    List<String> findByPermissionUrl(String permissionUrl);

}
