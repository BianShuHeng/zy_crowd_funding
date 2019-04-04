package com.zhiyou100.entity;

import javax.persistence.*;

/**
 * @author BianGe
 * @ClassName ProjectDetail
 * @Description TODO
 * @create 2019/3/29 17:38
 * @Version 1.0
 **/
@Entity
@Table(name = "project_detail")
public class ProjectDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer projectId;

    private String video;

    private String content;

    @Override
    public String toString() {
        return "ProjectDetail{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", video='" + video + '\'' +
                ", content='" + content + '\'' +
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}