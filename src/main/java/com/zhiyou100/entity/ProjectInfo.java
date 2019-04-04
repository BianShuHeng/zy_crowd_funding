package com.zhiyou100.entity;

/**
 * @author BianGe
 * @ClassName ProjectInfo
 * @Description TODO
 * @create 2019/4/2 20:25
 * @Version 1.0
 **/
public class ProjectInfo {

    private Integer startId;
    private Integer projectId;
    private Integer userId;
    private String pcImage;
    private String title;
    private Integer expectMoney;
    private Integer collectMoney;
    private Integer status;
    private Integer nickname;

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "startId=" + startId +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", pcImage='" + pcImage + '\'' +
                ", title='" + title + '\'' +
                ", expectMoney=" + expectMoney +
                ", collectMoney=" + collectMoney +
                ", status=" + status +
                ", nickname=" + nickname +
                '}';
    }

    public Integer getStartId() {
        return startId;
    }

    public void setStartId(Integer startId) {
        this.startId = startId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPcImage() {
        return pcImage;
    }

    public void setPcImage(String pcImage) {
        this.pcImage = pcImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getExpectMoney() {
        return expectMoney;
    }

    public void setExpectMoney(Integer expectMoney) {
        this.expectMoney = expectMoney;
    }

    public Integer getCollectMoney() {
        return collectMoney;
    }

    public void setCollectMoney(Integer collectMoney) {
        this.collectMoney = collectMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNickname() {
        return nickname;
    }

    public void setNickname(Integer nickname) {
        this.nickname = nickname;
    }
}