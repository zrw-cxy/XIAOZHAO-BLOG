package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:47
 */

@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
