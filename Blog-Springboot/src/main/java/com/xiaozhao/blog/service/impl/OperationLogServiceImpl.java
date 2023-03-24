package com.xiaozhao.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaozhao.blog.dao.OperationLogDao;
import com.xiaozhao.blog.dto.OperationLogDTO;
import com.xiaozhao.blog.entity.OperationLog;
import com.xiaozhao.blog.service.OperationLogService;
import com.xiaozhao.blog.util.BeanCopyUtils;
import com.xiaozhao.blog.util.PageUtils;
import com.xiaozhao.blog.vo.ConditionVO;
import com.xiaozhao.blog.vo.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作日志服务
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:30
 */

@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {

    @Override
    public PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO) {
        Page<OperationLog> page = new Page<>(PageUtils.getCurrent(), PageUtils.getSize());
        // 查询日志列表
        Page<OperationLog> operationLogPage = this.page(page, new LambdaQueryWrapper<OperationLog>()
                .like(StringUtils.isNotBlank(conditionVO.getKeywords()), OperationLog::getOptModule, conditionVO.getKeywords())
                .or()
                .like(StringUtils.isNotBlank(conditionVO.getKeywords()), OperationLog::getOptDesc, conditionVO.getKeywords())
                .orderByDesc(OperationLog::getId));
        List<OperationLogDTO> operationLogDTOList = BeanCopyUtils.copyList(operationLogPage.getRecords(), OperationLogDTO.class);
        return new PageResult<>(operationLogDTOList, (int) operationLogPage.getTotal());
    }

}
