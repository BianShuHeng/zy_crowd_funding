package com.zhiyou100.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author BianGe
 * @ClassName Discuss
 * @Description TODO
 * @create 2019/3/29 17:28
 * @Version 1.0
 **/
@Entity
@Table(name = "discuss")
public class Discuss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer projectId;
    private Integer projectProcessId;
    private Integer userId;
    private String  content;
    private Date createTime;

    @Override
    public String toString() {
        return "Discuss{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", projectProcessId=" + projectProcessId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectProcessId() {
        return projectProcessId;
    }

    public void setProjectProcessId(Integer projectProcessId) {
        this.projectProcessId = projectProcessId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}