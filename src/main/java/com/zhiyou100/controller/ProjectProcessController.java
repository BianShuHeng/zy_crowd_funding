package com.zhiyou100.controller;

import com.zhiyou100.entity.ProjectProcess;
import com.zhiyou100.service.ProjectProcessService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author BianGe
 * @ClassName ProjectProcessController
 * @Description TODO
 * @create 2019/3/30 10:19
 * @Version 1.0
 **/
@Api
@RestController
public class ProjectProcessController {

    @Autowired
    private ProjectProcessService projectProcessService;

    @PostMapping("/projects/project_process")
    public ResponseVo publish(@RequestBody ProjectProcess projectProcess) {

        return new ResponseVo(projectProcessService.insertProjectProcess(projectProcess));

    }

    @GetMapping("/projects/{projectId}/project_process")
    public Page<ProjectProcess> findProjectProcessById(Integer page, Integer size, @PathVariable Integer projectId){

        return projectProcessService.findAllByProjectId(page, size, projectId);
    }

    @GetMapping("/projects/{projectId}/project_process/{id}")
    public ResponseVo findProjectProcessById(@PathVariable Integer projectId, @PathVariable Integer id){

        return new ResponseVo(projectProcessService.findProjectProcessByProjectIdAndId(projectId, id));
    }

}