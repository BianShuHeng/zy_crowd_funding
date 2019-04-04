package com.zhiyou100.service.impl;

import com.zhiyou100.entity.ProjectInfo;
import com.zhiyou100.repository.StartRepository;
import com.zhiyou100.service.StartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author BianGe
 * @ClassName StartServiceImplTest
 * @Description TODO
 * @create 2019/4/1 21:05
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StartServiceImplTest {

    @Autowired
    private StartService startService;

    @Autowired StartRepository startRepository;
    @Test
    public void findStartsByUserId() {

        List<Object[]> starts = startRepository.findStartsByUserId(1);

        System.out.println(starts);

    }
}