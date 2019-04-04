package com.zhiyou100.controller;

import com.zhiyou100.entity.Repay;
import com.zhiyou100.service.RepayService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author BianGe
 * @ClassName RepayController
 * @Description TODO
 * @create 2019/3/30 10:46
 * @Version 1.0
 **/
@Api
@RestController
public class RepayController {

    @Autowired
    private RepayService repayService;

    @PostMapping("/projects/repays")
    public ResponseVo publish(@RequestBody Repay repay) {

        return new ResponseVo(repayService.insertRepay(repay));

    }
    @PutMapping("/projects/repays")
    public ResponseVo editor(@RequestBody Repay repay) {

        return new ResponseVo(repayService.updateRepay(repay));

    }


    @GetMapping("/projects/{projectId}/repays")
    public ResponseVo findProjectProcessById(@PathVariable Integer projectId){

        return new ResponseVo(repayService.findAllByProjectId(projectId));
    }



}

