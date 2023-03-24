package com.xiaozhao.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaozhao.blog.dao.ArticleTagDao;
import com.xiaozhao.blog.entity.ArticleTag;
import com.xiaozhao.blog.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 17:26
 * 文章标签服务
 */

@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
