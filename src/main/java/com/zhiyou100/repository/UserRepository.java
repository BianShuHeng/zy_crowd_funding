package com.zhiyou100.repository;

import com.zhiyou100.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author BianGe
 * @ClassName UserRepository
 * @Description 用户的登录与注册功能
 * 两个泛型： account 需要操作的实体类 ， Integer 主键的数据类型
 * @create 2019/3/27 19:18
 * @Version 1.0
 **/
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     *  根据用户输入的账号查询 用户信息
     * @param email 将用户输入的账号
     * @return Account 返回用户信息
     */
    User findByEmail(String email);

    /**
     * 根据id查询用户
     * @param id
     * @return com.zhiyou100.entity.User
     */
    User findUserById(Integer id);

}
