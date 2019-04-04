package com.zhiyou100.service.impl;

import com.zhiyou100.entity.User;
import com.zhiyou100.exception.UserException;
import com.zhiyou100.repository.UserRepository;
import com.zhiyou100.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author BianGe
 * @ClassName UserServiceImpl
 * @Description TODO
 * @create 2019/3/29 17:58
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(User user) {

        User oldUser = userRepository.findByEmail(user.getEmail());

        if (oldUser == null) {

            throw new UserException(400301, "账号不存在");
        }

        if (!oldUser.getPassword().equals(oldUser.getPassword())) {

            throw new UserException(400302, "密码错误");
        }

        return oldUser;
    }

    @Override
    public User register(User user) {

        User oldUser = userRepository.findByEmail(user.getEmail());

        if (oldUser != null) {

            throw new UserException(400303, "邮箱已存在");
        }

        userRepository.save(user);

        return user;
    }

    @Override
    public User findUserById(Integer id) {

        return userRepository.findUserById(id);
    }

    @Override
    public User updateUser(User user) {

        return userRepository.save(user);
    }
}