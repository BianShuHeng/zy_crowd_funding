package com.zhiyou100.service.impl;

import com.zhiyou100.entity.Discuss;
import com.zhiyou100.repository.DiscussRepository;
import com.zhiyou100.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BianGe
 * @ClassName DiscussServiceImpl
 * @Description TODO
 * @create 2019/3/30 11:00
 * @Version 1.0
 **/
@Service
public class DiscussServiceImpl implements DiscussService {

    @Autowired
    private DiscussRepository discussRepository;

    @Override
    public Discuss insertDiscuss(Discuss discuss) {

        return discussRepository.save(discuss);
    }

    @Override
    public List<Discuss> findAllByProjectId(Integer projectId) {

        return discussRepository.findAllByProjectId(projectId);
    }

    @Override
    public List<Discuss> findAllByProjectProcessId(Integer projectProcessId) {

        return discussRepository.findAllByProjectProcessId(projectProcessId);
    }
}