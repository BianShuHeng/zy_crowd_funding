package com.zhiyou100.controller;

import com.zhiyou100.entity.Discuss;
import com.zhiyou100.service.DiscussService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author BianGe
 * @ClassName DiscussController
 * @Description TODO
 * @create 2019/3/30 11:02
 * @Version 1.0
 **/
@Api
@RestController
public class DiscussController {

    @Autowired
    private DiscussService  discussService;

    @PostMapping("/projects/discusses")
    public ResponseVo publish(@RequestBody Discuss discuss) {

        return new ResponseVo(discussService.insertDiscuss(discuss));

    }

    @GetMapping("/projects/{projectId}/discusses")
    public ResponseVo findAllByProjectId(@PathVariable Integer projectId){

        return new ResponseVo(discussService.findAllByProjectId(projectId));
    }

    @GetMapping("/project_process/{projectProcessId}/discuss")
    public ResponseVo findAllByProjectProcessId(@PathVariable Integer projectProcessId){

        return new ResponseVo(discussService.findAllByProjectProcessId(projectProcessId));
    }
}
