package com.zhiyou100.repository;

import com.zhiyou100.entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author BianGe
 * @ClassName ProjectRepositoryTest
 * @Description TODO
 * @create 2019/3/29 21:27
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;
    @Test
    public void test() {

        Project project = new Project();

        project.setId(2);
        project.setStatus(2);
        project.setPcImage("1");
        project.setAppImage("1");
        project.setTitle("1");
        project.setShortTitle("1");
        project.setIntroduction("1");
        project.setType(1);
        project.setStartTime(new Date());
        project.setEndTime(new Date());
        project.setExpectMoney(1);
        project.setCollectMoney(1);
        project.setDiscussCount(1);
        project.setUserId(1);
        projectRepository.save(project);
    }



}