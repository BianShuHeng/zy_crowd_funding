package com.zhiyou100.service;

import com.zhiyou100.entity.Project;
import com.zhiyou100.entity.ProjectPageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectService
 * @Description
 * 项目：
 * 1.发布		插入数据
 * 2.编辑		更新数据
 * 3.提交审核	更新status 字段
 * 4.全部项目列表	查询所有项目
 * 5.个人项目列表	根据id查询项目
 * @create 2019/3/29 20:09
 * @Version 1.0
 **/
public interface ProjectService{

    /**
     * 1.发布		插入数据
     * @param project
     * @return com.zhiyou100.entity.Project
     */
    Project insertProject(Project project);

    /**
     * 2.编辑		更新数据
     * @param project
     * @return com.zhiyou100.entity.Project
     */
    Project updateProject(Project project);

    /**
     * 3.提交审核	更新status 字段
     * @param id 提交状态
     * @return com.zhiyou100.entity.Project
     */
    Project updateStatus(Integer id);

    /**
     * 功能描述: 多条件查询并分页
     * @param pageInfo :
     * @return : org.springframework.data.domain.Page<com.zhiyou100.entity.Project>
     */
    Page<Project> findAll(ProjectPageInfo pageInfo);

    /**
     * 5.个人项目列表	根据id查询项目
     * @param id
     * @return java.util.List<com.zhiyou100.entity.Project>
     */
    List<Project> findAllById(Integer id);

}
