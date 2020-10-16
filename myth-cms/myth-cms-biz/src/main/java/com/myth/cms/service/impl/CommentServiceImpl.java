package com.myth.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myth.cms.mapper.CommentMapper;
import com.myth.cms.service.CommentService;
import com.myth.cms.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getByArticleId(String articleId) {
        return commentMapper.getByArticleId(articleId);
    }
}
