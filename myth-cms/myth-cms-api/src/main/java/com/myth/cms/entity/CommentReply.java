package com.myth.cms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@TableName("t_comment_reply")
public class CommentReply implements Serializable {
    @TableId(value = "reply_id")
    private String replyId;
    private String commentId;
    private String parentReplyId;
    private String replyType;
    private String replyContent;
    private String fromUserId;
    private String toUserId;

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
