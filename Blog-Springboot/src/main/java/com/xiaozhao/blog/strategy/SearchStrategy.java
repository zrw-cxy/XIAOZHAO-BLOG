package com.xiaozhao.blog.strategy;

import com.xiaozhao.blog.dto.ArticleSearchDTO;

import java.util.List;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 16:20
 * 搜索策略
 */

public interface SearchStrategy {

    /**
     * 搜索文章
     *
     * @param keywords 关键字
     * @return {@link List <ArticleSearchDTO>} 文章列表
     */
    List<ArticleSearchDTO> searchArticle(String keywords);

}
