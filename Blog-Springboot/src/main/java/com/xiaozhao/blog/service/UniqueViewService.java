package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.UniqueViewDTO;
import com.xiaozhao.blog.entity.UniqueView;

import java.util.List;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:30
 * 用户量统计
 */

public interface UniqueViewService extends IService<UniqueView> {

    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();

}
