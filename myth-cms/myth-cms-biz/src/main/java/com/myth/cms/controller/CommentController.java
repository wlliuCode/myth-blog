package com.myth.cms.controller;

import com.myth.cms.service.CommentService;
import com.myth.cms.entity.Comment;
import com.myth.common.core.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "评论管理接口")
@RestController
@RequestMapping("comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @ApiOperation(value = "新增评论", httpMethod = "POST")
    @PostMapping("add")
    public Result saveComment(@RequestBody Comment comment) {
        boolean save = commentService.save(comment);
        return save ? Result.success() : Result.error("评论失败");
    }

    @ApiOperation(value = "根据文章ID获取评论信息", httpMethod = "POST")
    @PostMapping("comment/{articleId}")
    public Result getCommentByArticleId(@PathVariable String articleId) {
        List<Comment> comments = commentService.getByArticleId(articleId);
        return Result.success(comments);
    }

}
