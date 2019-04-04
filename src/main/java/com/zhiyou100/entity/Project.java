package com.zhiyou100.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author BianGe
 * @ClassName Project
 * @Description TODO
 * @create 2019/3/29 17:32
 * @Version 1.0
 **/
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pcImage;
    private String appImage;
    private String title;
    private String shortTitle;
    private String introduction;
    private Integer type;
    private Date startTime;
    private Date endTime;
    private Integer expectMoney;
    private Integer collectMoney;
    private Integer status;
    private Integer discussCount;
    private Integer userId;

 /*   @ManyToOne
    @JoinTable(name = "user",joinColumns = {@JoinColumn(name = "id")},inverseJoinColumns ={@JoinColumn(name = "userId")})
    private User user;*/

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", pcImage='" + pcImage + '\'' +
                ", appImage='" + appImage + '\'' +
                ", title='" + title + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", introduction='" + introduction + '\'' +
                ", type=" + type +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", expectMoney=" + expectMoney +
                ", collectMoney=" + collectMoney +
                ", status=" + status +
                ", discussCount=" + discussCount +
                ", userId=" + userId +
/*                ", user=" + user +*/
                '}';
    }

/*
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPcImage() {
        return pcImage;
    }

    public void setPcImage(String pcImage) {
        this.pcImage = pcImage;
    }

    public String getAppImage() {
        return appImage;
    }

    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Integer getDiscussCount() {
        return discussCount;
    }

    public void setDiscussCount(Integer discussCount) {
        this.discussCount = discussCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}