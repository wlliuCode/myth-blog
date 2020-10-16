package com.myth.pms.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_picture")
public class Picture implements Serializable {
    @TableId(value = "pic_id", type = IdType.ASSIGN_ID)
    private String picId;
    private String oldName;
    private String picName;
    private String picUrl;
    private String summary;
    private String categoryId;
}
