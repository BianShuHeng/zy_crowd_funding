package com.zhiyou100.controller;

import com.zhiyou100.entity.User;
import com.zhiyou100.service.UserService;
import com.zhiyou100.vo.ResponseVo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author BianGe
 * @ClassName UserController
 * @Description TODO
 * @create 2019/3/29 19:11
 * @Version 1.0
 **/
@Api(value = "UserController",description = "用户登录，注册 和查询等功能")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录验证", response = ResponseVo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "请求成功"),
            @ApiResponse(code = 400301,message = "账号不存在"),
            @ApiResponse(code = 400302,message = "密码错误")
    })

    @PostMapping("/login")
    public ResponseVo login(@RequestBody User user, @ApiParam(hidden = true) HttpSession session) {

        User oldUser = userService.login(user);

        session.setAttribute("User", oldUser);

        return new ResponseVo(oldUser);
    }

    @ApiOperation(value = "注册账号", response = ResponseVo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "请求成功"),
            @ApiResponse(code = 400303,message = "邮箱已存在")
    })
    @PostMapping("/register")
    public ResponseVo register(@RequestBody User user, HttpSession session) {

        User oldUser = userService.register(user);

        session.setAttribute("User", oldUser);

        return new ResponseVo(oldUser);
    }

    @ApiOperation(value = "通过id查找用户", response = ResponseVo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "请求成功"),
    })

    @GetMapping("/users/{id}")
    public ResponseVo findUserById(@PathVariable Integer id) {

        User user = userService.findUserById(id);

        return new ResponseVo(user);
    }

    @ApiOperation(value = "更新用户信息", response = ResponseVo.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "请求成功"),
            @ApiResponse(code = 400303,message = "邮箱已存在")
    })

    @PutMapping("/users")
    public ResponseVo updateUser(@RequestBody User user) {

        User oldUser = userService.updateUser(user);

        return new ResponseVo(oldUser);
    }
}