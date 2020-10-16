package com.myth.cms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("t_comment")
public class Comment implements Serializable {
    @TableId(value = "comment_id", type = IdType.ASSIGN_ID)
    private String commentId;
    private String articleId;
    private String fromUserId;
    private String toUserId;
    private String commentContent;
    private String topicType;

    @TableField(exist = false)
    private String fromUserName;
    @TableField(exist = false)
    private String fromUserAvatar;
    @TableField(exist = false)
    private String toUserName;
    @TableField(exist = false)
    private String toUserAvatar;

    @TableField(exist = false)
    private List<CommentReply> commentReplies;
}
