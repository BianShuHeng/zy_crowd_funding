package com.zhiyou100.entity;

import javax.persistence.*;

/**
 * @author BianGe
 * @ClassName Start
 * @Description TODO
 * @create 2019/3/29 17:48
 * @Version 1.0
 **/
@Entity
@Table(name = "start")
public class Start {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private Integer projectId;

    @Override
    public String toString() {
        return "Start{" +
                "id=" + id +
                ", userId=" + userId +
                ", projectId=" + projectId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}