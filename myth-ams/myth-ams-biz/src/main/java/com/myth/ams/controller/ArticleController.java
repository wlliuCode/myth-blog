package com.myth.ams.controller;

import com.myth.ams.service.ArticleService;
import com.myth.cms.entity.Article;
import com.myth.common.core.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "文章管理接口")
@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "获取文章列表", httpMethod = "POST")
    @PostMapping("list")
    public Result getArticleList() {
        List<Article> articleList = articleService.list();
        return Result.success(articleList);
    }

    @ApiOperation(value = "根据文章ID获取文章信息", httpMethod = "POST")
    @PostMapping("article/{id}")
    public Result getArticleById(@PathVariable String id) {
        Article article = articleService.getById(id);
        return Result.success(article);
    }

    @GetMapping("add")
    public Result add() {
        Article article = new Article();
        article.setTitle("66666666");
        article.setSummary("66666666");
        article.setContent("66666666");
        article.setImageId("66666666");
        article.setAuthorId("66666666");
        boolean save = articleService.save(article);
        return Result.success(save);
    }

}
