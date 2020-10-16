package com.myth.cms.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.myth.common.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_article")
public class Article extends BaseEntity implements Serializable {

    @TableId(value = "article_id", type = IdType.ASSIGN_ID)
    private String articleId;
    private String title;
    private String summary;
    private String content;
    private String imageId;
    private String authorId;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
