package com.zhiyou100.service.impl;

import com.zhiyou100.entity.Project;
import com.zhiyou100.entity.ProjectPageInfo;
import com.zhiyou100.repository.ProjectRepository;
import com.zhiyou100.service.ProjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author BianGe
 * @ClassName ProjectServiceImplTest
 * @Description TODO
 * @create 2019/4/1 17:15
 * @Version  1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProjectServiceImplTest {

    @Autowired
    private ProjectService projectService;

    @Test
    public void findAll() {
        ProjectPageInfo pageInfo = new ProjectPageInfo();
        pageInfo.setPage(1);
        pageInfo.setSort(1);
        pageInfo.setStatus(1);
        pageInfo.setType(1);
        Page<Project> all = projectService.findAll(pageInfo);

        System.out.println("all : " + all);

    }
}