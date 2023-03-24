package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.dto.TalkBackDTO;
import com.xiaozhao.blog.dto.TalkDTO;
import com.xiaozhao.blog.entity.Talk;
import com.xiaozhao.blog.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 说说
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:06
 */

@Repository
public interface TalkDao extends BaseMapper<Talk> {

    /**
     * 获取说说列表
     *
     * @param current 页码
     * @param size    大小
     * @return {@link List <TalkDTO>}
     */
    List<TalkDTO> listTalks(@Param("current") Long current, @Param("size") Long size);

    /**
     * 查看后台说说
     *
     * @param current 页码
     * @param size    大小
     * @return {@link List<TalkBackDTO>}
     */
    List<TalkBackDTO> listBackTalks(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);


    /**
     * 根据id查看说说
     *
     * @param talkId 说说id
     * @return {@link TalkDTO} 说说信息
     */
    TalkDTO getTalkById(@Param("talkId") Integer talkId);


    /**
     * 根据id查看后台说说
     *
     * @param talkId 说说id
     * @return {@link TalkBackDTO} 说说信息
     */
    TalkBackDTO getBackTalkById(@Param("talkId") Integer talkId);

}




