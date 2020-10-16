package com.myth.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myth.cms.entity.Comment;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> getByArticleId(String articleId);
}
