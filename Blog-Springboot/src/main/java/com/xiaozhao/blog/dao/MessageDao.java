package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.entity.Message;
import org.springframework.stereotype.Repository;

/**
 * 留言
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:25
 */

@Repository
public interface MessageDao extends BaseMapper<Message> {

}
