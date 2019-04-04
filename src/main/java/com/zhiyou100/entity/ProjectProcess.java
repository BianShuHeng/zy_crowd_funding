package com.zhiyou100.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author BianGe
 * @ClassName ProjectProcess
 * @Description TODO
 * @create 2019/3/29 17:42
 * @Version 1.0
 **/
@Entity
@Table(name = "project_process")
public class ProjectProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date updateTime;
    private String title;
    private String content;
    private Integer userId;
    private Integer projectId;

    @Override
    public String toString() {
        return "ProjectProcess" +
                "id=" + id +
                ", updateTime=" + updateTime +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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