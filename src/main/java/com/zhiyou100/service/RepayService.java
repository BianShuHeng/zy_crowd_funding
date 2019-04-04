package com.zhiyou100.service;

import com.zhiyou100.entity.Repay;

import java.util.List;

/**
 * @author BianGe
 * @ClassName RepayService
 * @Description TODO
 * @create 2019/3/30 10:37
 * @Version 1.0
 **/
public interface RepayService {

    /**
     * 功能描述: 
     * @param  : repay
     * @return : com.zhiyou100.entity.Repay
     */
    Repay insertRepay(Repay repay);

    /**
     * 修改 回报信息
     * @param repay 修改后的回报信息
     * @return com.zhiyou100.entity.Repay
     */
    Repay updateRepay(Repay repay);

    /**
     * 根据项目 id 查询所有 回报信息
     * @param projectId
     * @return java.util.List<com.zhiyou100.entity.Repay>
     */
    List<Repay> findAllByProjectId(Integer projectId);
}
