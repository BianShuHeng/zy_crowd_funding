package com.zhiyou100.service;

import com.zhiyou100.entity.ProjectProcess;
import org.springframework.data.domain.Page;
/**
 * @author BianGe
 * @ClassName ProjectProcessService
 * @Description TODO
 * @create 2019/3/30 10:12
 * @Version 1.0
 **/
public interface ProjectProcessService {

    /**
     * 发布项目更新
     * @param projectProcess
     * @return com.zhiyou100.entity.ProjectProcess
     */
    ProjectProcess insertProjectProcess(ProjectProcess projectProcess);

    /**
     * 根据项目更新 id 查询所有 项目记录
     * @param projectId
     * @param page
     * @param size
     * @return java.util.List<com.zhiyou100.entity.ProjectProcess>
     */
    Page<ProjectProcess> findAllByProjectId(Integer page, Integer size, Integer projectId);

    /**
     * 根据项目 id 和项目更新 id查询某个项目更新
     * @param projectId
     * @param id
     * @return com.zhiyou100.entity.ProjectProcess
     */
    ProjectProcess findProjectProcessByProjectIdAndId(Integer projectId, Integer id);


}