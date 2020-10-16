package com.myth.cms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.cms.entity.Comment;

import java.util.List;

public interface CommentService extends IService<Comment> {
    List<Comment> getByArticleId(String articleId);
}
