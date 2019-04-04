package com.zhiyou100.service.impl;

import com.zhiyou100.entity.ProjectInfo;
import com.zhiyou100.entity.Start;
import com.zhiyou100.repository.StartRepository;
import com.zhiyou100.service.StartService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BianGe
 * @ClassName StartServiceImpl
 * @Description TODO
 * @create 2019/3/30 11:30
 * @Version 1.0
 **/
@Service
public class StartServiceImpl implements StartService {

    @Autowired
    private StartRepository startRepository;

    @Override
    public Start insetStart(Start start) {

        return startRepository.save(start);
    }

    @Override
    public Start deleteStart(Integer id) {

        startRepository.deleteById(id);

        return null;
    }

    @Override
    public List<Object[]> findStartsByUserId(Integer userId) {

        return startRepository.findStartsByUserId(userId);
    }
}