package com.zhiyou100.repository;

import com.zhiyou100.entity.Discuss;
import com.zhiyou100.entity.ProjectInfo;
import com.zhiyou100.entity.Start;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author BianGe
 * @ClassName startRepository
 * @Description TODO
 * @create 2019/3/30 11:11
 * @Version 1.0
 **/
public interface StartRepository extends JpaRepository<Start, Integer> {

    /**
     * 根据用户 id 和 查询 收藏列表
     * @param userId
     * @return java.util.List<com.zhiyou100.entity.Start>
     */
    @Query(nativeQuery = true, value = "SELECT\n" +
            "\ts.id AS startId,\n" +
            "\tp.id AS projectId,\n" +
            "\tp.pc_image,\n" +
            "\tp.title,\n" +
            "\tp.expect_money,\n" +
            "\tp.collect_money,\n" +
            "\tp.status,\n" +
            "\tu.id AS userId,\n" +
            "\tu.nickname \n" +
            "FROM\n" +
            "\tSTART s\n" +
            "\tINNER JOIN project p ON s.project_id = p.id\n" +
            "\tINNER JOIN USER u ON s.user_id = u.id\n" +
            "\twhere s.user_id = :userId")
    List<Object[]> findStartsByUserId(@Param("userId") Integer userId);

}
