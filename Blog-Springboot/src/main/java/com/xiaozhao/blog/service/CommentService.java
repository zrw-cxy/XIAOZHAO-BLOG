package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.CommentBackDTO;
import com.xiaozhao.blog.dto.CommentDTO;
import com.xiaozhao.blog.dto.ReplyDTO;
import com.xiaozhao.blog.entity.Comment;
import com.xiaozhao.blog.vo.CommentVO;
import com.xiaozhao.blog.vo.ConditionVO;
import com.xiaozhao.blog.vo.PageResult;
import com.xiaozhao.blog.vo.ReviewVO;

import java.util.List;

/**
 * 评论服务
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:02
 */

public interface CommentService extends IService<Comment> {

    /**
     * 查看评论
     *
     * @param commentVO 评论信息
     * @return 评论列表
     */
    PageResult<CommentDTO> listComments(CommentVO commentVO);

    /**
     * 查看评论下的回复
     *
     * @param commentId 评论id
     * @return 回复列表
     */
    List<ReplyDTO> listRepliesByCommentId(Integer commentId);

    /**
     * 添加评论
     *
     * @param commentVO 评论对象
     */
    void saveComment(CommentVO commentVO);

    /**
     * 点赞评论
     *
     * @param commentId 评论id
     */
    void saveCommentLike(Integer commentId);

    /**
     * 审核评论
     *
     * @param reviewVO 审核信息
     */
    void updateCommentsReview(ReviewVO reviewVO);

    /**
     * 查询后台评论
     *
     * @param condition 条件
     * @return 评论列表
     */
    PageResult<CommentBackDTO> listCommentBackDTO(ConditionVO condition);

}