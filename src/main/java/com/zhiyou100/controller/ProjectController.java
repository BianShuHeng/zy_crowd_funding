package com.zhiyou100.controller;

import com.zhiyou100.entity.Project;
import com.zhiyou100.entity.ProjectPageInfo;
import com.zhiyou100.service.ProjectService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author BianGe
 * @ClassName ProjectController
 * @Description TODO
 * @create 2019/3/29 22:05
 * @Version 1.0
 **/
@Api
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/projects")
    public ResponseVo publish(@RequestBody Project project) {

        return new ResponseVo(projectService.insertProject(project));

    }

    @PutMapping("/projects")
    public ResponseVo update(Project project) {

        return new ResponseVo(projectService.updateProject(project));
    }

    @PutMapping("/projects/{id}/submit")
    public ResponseVo updateStatus(@PathVariable Integer id) {

        return new ResponseVo(projectService.updateStatus(id));
    }

    @GetMapping("/projects/all")
    public Page<Project> findAll(ProjectPageInfo pageInfo) {

        return projectService.findAll(pageInfo);
    }

    @GetMapping("/projects/{userId}")
    public ResponseVo findAllById(@PathVariable Integer userId) {

        return new ResponseVo(projectService.findAllById(userId));
    }


}