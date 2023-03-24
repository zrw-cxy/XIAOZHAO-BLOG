package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.FriendLinkBackDTO;
import com.xiaozhao.blog.dto.FriendLinkDTO;
import com.xiaozhao.blog.entity.FriendLink;
import com.xiaozhao.blog.vo.ConditionVO;
import com.xiaozhao.blog.vo.FriendLinkVO;
import com.xiaozhao.blog.vo.PageResult;

import java.util.List;

/**
 * 链服务
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:18
 */

public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
