package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.OperationLogDTO;
import com.xiaozhao.blog.entity.OperationLog;
import com.xiaozhao.blog.vo.ConditionVO;
import com.xiaozhao.blog.vo.PageResult;

/**
 * 操作日志服务
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:30
 */

public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
