package com.zhiyou100.repository;

import com.zhiyou100.entity.Repay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author BianGe
 * @ClassName RepayRepository
 * @Description TODO
 * @create 2019/3/30 10:34
 * @Version 1.0
 **/
public interface RepayRepository extends JpaRepository<Repay, Integer> {

    
    /**
     * 功能描述 :
     * @param : projectId
     * @return : java.util.List<com.zhiyou100.entity.Repay>
     */
    List<Repay> findAllByProjectId(Integer projectId);

}
