package com.zhiyou100.repository;

import com.zhiyou100.entity.ProjectDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BianGe
 * @ClassName ProjectDetailRepository
 * @Description TODO
 * @create 2019/3/30 9:31
 * @Version 1.0
 **/
public interface ProjectDetailRepository extends JpaRepository<ProjectDetail, Integer> {

    /**
     * 根据 id 查找 ProjectDetails
     * @param id
     * @return com.zhiyou100.entity.ProjectDetail
     */
    ProjectDetail findProjectDetailById(Integer id);
}
