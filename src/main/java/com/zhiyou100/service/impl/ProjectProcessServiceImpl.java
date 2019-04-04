package com.zhiyou100.service.impl;

import com.zhiyou100.entity.ProjectProcess;
import com.zhiyou100.repository.ProjectProcessRepository;
import com.zhiyou100.service.ProjectProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectProcessServiceImpl
 * @Description TODO
 * @create 2019/3/30 10:15
 * @Version 1.0
 **/
@Service
public class ProjectProcessServiceImpl implements ProjectProcessService {

    @Autowired
    private ProjectProcessRepository projectProcessRepository;

    @Override
    public ProjectProcess insertProjectProcess(ProjectProcess projectProcess) {

        return projectProcessRepository.save(projectProcess);
    }

    @Override
    public Page<ProjectProcess> findAllByProjectId(Integer page, Integer size, Integer projectId) {

        return projectProcessRepository.findAllByProjectId(projectId, PageRequest.of(page - 1, size));
    }

    @Override
    public ProjectProcess findProjectProcessByProjectIdAndId(Integer projectId, Integer id) {

        return projectProcessRepository.findProjectProcessByProjectIdAndId(projectId, id);
    }
}