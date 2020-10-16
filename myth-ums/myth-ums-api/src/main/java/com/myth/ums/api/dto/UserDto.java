package com.myth.ums.api.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.myth.common.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_user")
public class UserDto extends BaseEntity implements Serializable {
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private String userId;
    private String username;
    private String avatarId;
    private String avatarUrl;
    private String gender;
    private Date birthday;
    private String email;
    private String address;
    private String mobile;
    private String isDisabled;


}
