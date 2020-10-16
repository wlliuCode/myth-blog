package com.myth.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myth.cms.mapper.CommentReplyMapper;
import com.myth.cms.service.CommentReplyService;
import com.myth.cms.entity.CommentReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements CommentReplyService {

    @Autowired
    private CommentReplyMapper commentReplyMapper;
    @Override
    public List<CommentReply> getByCommentId(String commentId) {
        return commentReplyMapper.getByCommentId(commentId);
    }
}
