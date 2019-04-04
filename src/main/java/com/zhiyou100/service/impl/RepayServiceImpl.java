package com.zhiyou100.service.impl;

import com.zhiyou100.entity.Repay;
import com.zhiyou100.repository.RepayRepository;
import com.zhiyou100.service.RepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BianGe
 * @ClassName RepayServiceImpl
 * @Description TODO
 * @create 2019/3/30 10:41
 * @Version 1.0
 **/
@Service
public class RepayServiceImpl implements RepayService {

    @Autowired
    private RepayRepository repayRepository;

    @Override
    public Repay insertRepay(Repay repay) {

        return repayRepository.save(repay);
    }

    @Override
    public Repay updateRepay(Repay repay) {

        return repayRepository.save(repay);
    }

    @Override
    public List<Repay> findAllByProjectId(Integer projectId) {

        return repayRepository.findAllByProjectId(projectId);
    }
}