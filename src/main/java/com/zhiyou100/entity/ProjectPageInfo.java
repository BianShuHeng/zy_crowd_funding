package com.zhiyou100.entity;

/**
 * @author BianGe
 * @ClassName ProjectPageInfo
 * @Description TODO
 * @create 2019/3/30 17:37
 * @Version 1.0
 **/
public class ProjectPageInfo {

    private Integer sort;
    private Integer page;
    private Integer type;
    private Integer status;

    @Override
    public String toString() {
        return "ProjectPageInfo{" +
                "sort=" + sort +
                ", page=" + page +
                ", type=" + type +
                ", status=" + status +
                '}';
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}