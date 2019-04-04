package com.zhiyou100.service;


import com.zhiyou100.entity.User;

/**
 * @author BianGe
 * @ClassName UserService
 * @Description TODO
 * @create 2019/3/27 17:26
 * @Version 1.0
 *
 */
public interface UserService {

    /**
     * 登录业务逻辑
     * @param user 用户输入的账号信息
     * @return Account 登录成功的用户信息
     */
    User login(User user);

    /**
     *  注册
     * @param user 用户输入的账号信息
     * @return 注册成功的用户信息
     */
    User register(User user);

    /**
     * 根据id 获取个人信息
     * @param id
     * @return com.zhiyou100.entity.User
     */
    User findUserById(Integer id);

    /**
     * 更新用户信息
     * @param user
     * @return com.zhiyou100.entity.User
     */
    User updateUser(User user);


}
