package com.zhiyou100.service.impl;

import com.zhiyou100.entity.Project;
import com.zhiyou100.entity.ProjectDetail;
import com.zhiyou100.exception.ProjectException;
import com.zhiyou100.repository.ProjectDetailRepository;
import com.zhiyou100.repository.ProjectRepository;
import com.zhiyou100.service.ProjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BianGe
 * @ClassName ProjectDetailServiceImpl
 * @Description TODO
 * @create 2019/3/30 9:38
 * @Version 1.0
 **/
@Service
public class ProjectDetailServiceImpl implements ProjectDetailService {

    @Autowired
    private ProjectDetailRepository projectDetailRepository;

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public ProjectDetail insertProjectDetail(ProjectDetail projectDetail) {

        Project project = projectRepository.findProjectById(projectDetail.getProjectId());

        if (project == null) {

            throw new ProjectException(400306, "该项目不存在");
        }

        return projectDetailRepository.save(projectDetail);
    }

    @Override
    public ProjectDetail updateProjectDetail(ProjectDetail projectDetail) {

        return projectDetailRepository.save(projectDetail);
    }

    @Override
    public ProjectDetail findProjectDetailById(Integer id) {

        return projectDetailRepository.findProjectDetailById(id);
    }
}