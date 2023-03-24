package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.dto.CategoryBackDTO;
import com.xiaozhao.blog.dto.CategoryDTO;
import com.xiaozhao.blog.entity.Category;
import com.xiaozhao.blog.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类
 * @Author: XIAO ZHAO
 * @Date: 2022/5/20 11:52
 */
@Repository
public interface CategoryDao extends BaseMapper<Category> {

    /**
     * 查询分类和对应文章数量
     *
     * @return 分类列表
     */
    List<CategoryDTO> listCategoryDTO();

    /**
     * 查询后台分类列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List <CategoryBackDTO>} 分类列表
     */
    List<CategoryBackDTO> listCategoryBackDTO(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

}
