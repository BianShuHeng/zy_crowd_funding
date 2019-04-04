package com.zhiyou100.service;

import com.zhiyou100.entity.ProjectInfo;
import com.zhiyou100.entity.Start;

import java.util.List;

/**
 * @author BianGe
 * @ClassName StartService
 * @Description TODO
 * @create 2019/3/30 11:20
 * @Version 1.0
 **/
public interface StartService {
    /**
     * 添加收藏
     * @param start 收藏信息
     * @return com.zhiyou100.entity.Start
     */
    Start insetStart(Start start);

    /**
     * 根据id删除收藏
     * @param id 收藏 id
     * @return com.zhiyou100.entity.Start
     */
    Start deleteStart(Integer id);

    /**
     * 根据用户 id 和 项目 id 查询 收藏列表
     * @param userId
     * @return java.util.List<com.zhiyou100.entity.Start>
     */
    List<Object[]> findStartsByUserId(Integer userId);
}
