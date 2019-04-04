package com.zhiyou100.service.impl;

import com.zhiyou100.entity.Project;
import com.zhiyou100.entity.ProjectPageInfo;
import com.zhiyou100.repository.ProjectRepository;
import com.zhiyou100.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectServiceImpl
 * @Description TODO
 * @create 2019/3/29 21:03
 * @Version 1.0
 **/
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project insertProject(Project project) {

        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project) {

        return projectRepository.save(project);
    }

    @Override
    public Project updateStatus(Integer id) {

        Project project = projectRepository.findProjectById(id);

        project.setStatus(1);

        return projectRepository.save(project);
    }

    @Override
    public Page<Project> findAll(ProjectPageInfo pageInfo) {

        int page = pageInfo.getPage();

        String sorts;

        Project project = new Project();

        project.setType(pageInfo.getType());

        project.setStatus(pageInfo.getStatus());

        System.out.println(project);
        Example<Project> example = Example.of(project);

        switch (pageInfo.getSort()) {
            case 1:
                sorts = "expectMoney";
                break;
            case 2:
                sorts = "discussCount";
                break;
            default:
                sorts = "startTime";
                break;
        }

        Sort sort = new Sort(Sort.Direction.DESC, sorts);

        Pageable pageable = PageRequest.of(page - 1, 4, sort);

        return projectRepository.findAll(example, pageable);
    }

    @Override
    public List<Project> findAllById(Integer userId) {

        return projectRepository.findAllByUserId(userId);
    }
}