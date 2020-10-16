package com.myth.ams.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myth.ams.service.ArticleService;
import com.myth.cms.entity.Article;
import com.myth.ams.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleService {

}
