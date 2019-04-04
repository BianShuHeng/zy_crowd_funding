package com.zhiyou100.service;

import com.zhiyou100.entity.ProjectDetail;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectDetailService
 * @Description TODO
 * @create 2019/3/30 9:33
 * @Version 1.0
 **/
public interface ProjectDetailService {

    /**
     * 1.发布		插入数据
     * @param project
     * @return com.zhiyou100.entity.Project
     */
    ProjectDetail insertProjectDetail(ProjectDetail project);

    /**
     * 2.编辑		更新数据
     * @param project
     * @return com.zhiyou100.entity.Project
     */
    ProjectDetail updateProjectDetail(ProjectDetail project);

    /**
     * 根据id 查询 某个项目详情
     * @param id
     * @return com.zhiyou100.entity.ProjectDetail
     */
    ProjectDetail findProjectDetailById(Integer id);

}
