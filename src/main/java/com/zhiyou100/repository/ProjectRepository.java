package com.zhiyou100.repository;

import com.zhiyou100.entity.Project;
import javafx.print.PageRange;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author BianGe
 * @ClassName ProjectRepository
 * @Description TODO
 * @create 2019/3/29 21:01
 * @Version 1.0
 **/
public interface ProjectRepository extends JpaRepository<Project, Integer> {

  /*  @Query("Update from Project set status = :status where id = :id ")*/

    /**
     * 5.个人项目列表	根据用户id查询项目
     * @param userId
     * @return java.util.List<com.zhiyou100.entity.Project>
     */
    List<Project> findAllByUserId(Integer userId);

    /**
     * 根据 id 查询项目
     * @param id
     * @return com.zhiyou100.entity.Project
     */
    Project findProjectById(Integer id);

}
