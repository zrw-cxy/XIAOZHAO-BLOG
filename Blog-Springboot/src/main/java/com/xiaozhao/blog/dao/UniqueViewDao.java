package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.dto.UniqueViewDTO;
import com.xiaozhao.blog.entity.UniqueView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 访问量
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:37
 */

@Repository
public interface UniqueViewDao extends BaseMapper<UniqueView> {

    /**
     * 获取7天用户量
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

}
