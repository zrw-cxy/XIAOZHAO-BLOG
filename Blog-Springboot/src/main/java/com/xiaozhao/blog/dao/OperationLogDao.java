package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;

/**
 * 操作日志
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 17:40
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {

}
