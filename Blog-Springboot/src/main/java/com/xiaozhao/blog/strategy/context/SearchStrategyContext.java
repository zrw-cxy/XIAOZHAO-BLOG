package com.xiaozhao.blog.strategy.context;

import com.xiaozhao.blog.dto.ArticleSearchDTO;
import com.xiaozhao.blog.strategy.SearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


import static com.xiaozhao.blog.enums.SearchModeEnum.getStrategy;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 16:18
 * 搜索上下文策略
 */

@Service
public class SearchStrategyContext {
    /**
     * 搜索模式
     */
    @Value("${search.mode}")
    private String searchMode;

    @Autowired
    private Map<String, SearchStrategy> searchStrategyMap;

    /**
     * 执行搜索策略
     *
     * @param keywords 关键字
     * @return {@link List <ArticleSearchDTO>} 搜索文章
     */
    public List<ArticleSearchDTO> executeSearchStrategy(String keywords) {
        return searchStrategyMap.get(getStrategy(searchMode)).searchArticle(keywords);
    }

}
