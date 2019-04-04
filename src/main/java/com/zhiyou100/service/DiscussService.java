package com.zhiyou100.service;

import com.zhiyou100.entity.Discuss;

import java.util.List;

/**
 * @author BianGe
 * @ClassName DiscussService
 * @Description TODO
 * @create 2019/3/30 10:59
 * @Version 1.0
 **/
public interface DiscussService {

    /**
     * 发布评论
     * @param discuss
     * @return com.zhiyou100.entity.Discuss
     */
    Discuss insertDiscuss(Discuss discuss);

    /**
     * 根据 项目 id 查询所有评论
     * @param projectId
     * @return java.util.List<com.zhiyou100.entity.Discuss>
     */
    List<Discuss> findAllByProjectId(Integer projectId);

    /**
     * 根据项目详情 id 查询所有评论
     * @param projectProcessId
     * @return java.util.List<com.zhiyou100.entity.Discuss>
     */
    List<Discuss> findAllByProjectProcessId(Integer projectProcessId);
}
