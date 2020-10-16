package com.myth.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myth.cms.entity.CommentReply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentReplyMapper extends BaseMapper<CommentReply> {
    List<CommentReply> getByCommentId(String commentId);
    List<CommentReply> getByParentReplyId(String parentReplyId);
}
