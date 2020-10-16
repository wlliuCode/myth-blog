package com.myth.cms.feign.fallback;

import com.myth.cms.entity.Article;
import com.myth.cms.feign.RemoteArticleService;
import com.myth.common.core.result.Result;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

@Service
public class RemoteArticleServiceFallabckFactory implements FallbackFactory<RemoteArticleService> {
    @Override
    public RemoteArticleService create(Throwable throwable) {
        return id -> Result.success(new Article());
    }
}
