package com.zhiyou100.repository;

import com.zhiyou100.entity.Discuss;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author BianGe
 * @ClassName DiscussRepository
 * @Description TODO
 * @create 2019/3/30 10:52
 * @Version 1.0
 **/
public interface DiscussRepository extends JpaRepository<Discuss, Integer> {

    /**
     * 根据项目 id 查询所有 评论
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
