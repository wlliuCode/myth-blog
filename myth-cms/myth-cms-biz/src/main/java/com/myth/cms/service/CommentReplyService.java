package com.myth.cms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.cms.entity.CommentReply;

import java.util.List;

public interface CommentReplyService extends IService<CommentReply> {
    List<CommentReply> getByCommentId(String commentId);
}
