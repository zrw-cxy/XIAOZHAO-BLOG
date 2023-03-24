package com.xiaozhao.blog.dao;

import com.xiaozhao.blog.dto.ArticleSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * elasticsearch
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 23:08
 */
@Repository
public interface ElasticsearchDao extends ElasticsearchRepository<ArticleSearchDTO,Integer> {
}
