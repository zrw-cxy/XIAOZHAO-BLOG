package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.dto.UserBackDTO;
import com.xiaozhao.blog.entity.UserAuth;
import com.xiaozhao.blog.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户账号
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 22:24
 */
@Repository
public interface UserAuthDao extends BaseMapper<UserAuth> {

    /**
     * 查询后台用户列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List <UserBackDTO>} 用户列表
     */
    List<UserBackDTO> listUsers(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

    /**
     * 查询后台用户数量
     *
     * @param condition 条件
     * @return 用户数量
     */
    Integer countUser(@Param("condition") ConditionVO condition);

}
