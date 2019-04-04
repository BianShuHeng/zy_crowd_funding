package com.zhiyou100.controller;

import com.zhiyou100.entity.ProjectDetail;
import com.zhiyou100.service.ProjectDetailService;
import com.zhiyou100.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author BianGe
 * @ClassName projectDetailController
 * @Description TODO
 * @create 2019/3/30 9:41
 * @Version 1.0
 **/
@RestController
public class ProjectDetailController {

    @Autowired
    private ProjectDetailService projectDetailService;

    @PostMapping("/projects/project_details")
    public ResponseVo publish(@RequestBody ProjectDetail projectDetail) {

        return new ResponseVo(projectDetailService.insertProjectDetail(projectDetail));

    }

    @PutMapping("/projects/project_details")
    public ResponseVo update(@RequestBody ProjectDetail projectDetail ) {

        return new ResponseVo(projectDetailService.updateProjectDetail(projectDetail));
    }
    @GetMapping("/projects/{projectId}/project_details")
    public ResponseVo findProjectDetailById(@PathVariable Integer projectId){

        return new ResponseVo(projectDetailService.findProjectDetailById(projectId));
    }


}
