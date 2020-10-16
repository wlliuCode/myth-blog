package com.myth.cms.feign;

import com.myth.cms.entity.Article;
import com.myth.cms.feign.fallback.RemoteArticleServiceFallabckFactory;
import com.myth.common.core.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "myth-ams",
        fallbackFactory = RemoteArticleServiceFallabckFactory.class)
public interface RemoteArticleService {
    @GetMapping("article/{id}")
    Result<Article> getArticleById(@PathVariable String id);
}
