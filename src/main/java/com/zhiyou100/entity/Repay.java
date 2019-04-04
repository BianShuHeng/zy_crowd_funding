package com.zhiyou100.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author BianGe
 * @ClassName Repay
 * @Description TODO
 * @create 2019/3/29 17:45
 * @Version 1.0
 **/
@Entity
@Table(name = "repay")
public class Repay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer projectId;
    private Integer money;
    private String title;
    private String detail;
    private Date repayDate;
    private Integer type;

    @Override
    public String toString() {
        return "Repay{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", money=" + money +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", repayDate=" + repayDate +
                ", type=" + type +
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}