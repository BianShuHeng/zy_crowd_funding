package com.zhiyou100.repository;

import com.zhiyou100.entity.ProjectProcess;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectProcessRepository
 * @Description TODO
 * @create 2019/3/30 10:06
 * @Version 1.0
 **/
public interface ProjectProcessRepository extends JpaRepository<ProjectProcess, Integer> {


    Page<ProjectProcess> findAllByProjectId(Integer projectId, Pageable pageable);

    /**
     * 根据项目 id 和项目更新 id查询某个项目更新
     * @param projectId
     * @param id
     * @return com.zhiyou100.entity.ProjectProcess
     */
    ProjectProcess findProjectProcessByProjectIdAndId(Integer projectId, Integer id);
}
