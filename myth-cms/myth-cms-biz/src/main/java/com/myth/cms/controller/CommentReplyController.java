package com.myth.cms.controller;

import com.myth.cms.entity.CommentReply;
import com.myth.cms.service.CommentReplyService;
import com.myth.common.core.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "回复管理接口")
@RestController
@RequestMapping("replys")
public class CommentReplyController {
    @Autowired
    private CommentReplyService commentReplyService;

    @ApiOperation(value = "新增回复", httpMethod = "POST")
    @PostMapping("add")
    public Result addReply(@RequestBody CommentReply commentReply) {
        boolean save = commentReplyService.save(commentReply);
        return save ? Result.success() : Result.error("回复失败");
    }

    @ApiOperation(value = "根据评论ID获取回复信息", httpMethod = "POST")
    @PostMapping("reply/{commentId}")
    public Result getByCommentId(@PathVariable("commentId") String commentId) {
        return Result.success(commentReplyService.getByCommentId(commentId));
    }


}
