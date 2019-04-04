package com.zhiyou100.controller;

import com.zhiyou100.entity.Start;
import com.zhiyou100.service.StartService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

/**
 * @author BianGe
 * @ClassName StartController
 * @Description TODO
 * @create 2019/3/30 11:37
 * @Version 1.0
 **/
@Api
@RestController
public class StartController {

    @Autowired
    private StartService startService;

    @PostMapping("/projects/starts")
    public ResponseVo publish(@RequestBody Start start) {

        return new ResponseVo(startService.insetStart(start));

    }

    @DeleteMapping("/projects/starts/{id}")
    public ResponseVo remove(@PathVariable Integer id) {

        return new ResponseVo(startService.deleteStart(id));

    }

    @GetMapping("/starts/{userId}/projects/")
    public ResponseVo findProjectProcessById(@PathVariable Integer userId){

        System.out.println(userId);
        return new ResponseVo(startService.findStartsByUserId(userId));
    }


}