package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.MessageBackDTO;
import com.xiaozhao.blog.dto.MessageDTO;
import com.xiaozhao.blog.entity.Message;
import com.xiaozhao.blog.vo.ConditionVO;
import com.xiaozhao.blog.vo.MessageVO;
import com.xiaozhao.blog.vo.PageResult;
import com.xiaozhao.blog.vo.ReviewVO;

import java.util.List;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:26
 */

public interface MessageService extends IService<Message> {

    /**
     * 添加留言弹幕
     *
     * @param messageVO 留言对象
     */
    void saveMessage(MessageVO messageVO);

    /**
     * 查看留言弹幕
     *
     * @return 留言列表
     */
    List<MessageDTO> listMessages();

    /**
     * 审核留言
     *
     * @param reviewVO 审查签证官
     */
    void updateMessagesReview(ReviewVO reviewVO);

    /**
     * 查看后台留言
     *
     * @param condition 条件
     * @return 留言列表
     */
    PageResult<MessageBackDTO> listMessageBackDTO(ConditionVO condition);

}
