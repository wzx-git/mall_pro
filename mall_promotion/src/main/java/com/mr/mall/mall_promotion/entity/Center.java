package com.mr.mall.mall_promotion.entity;

import java.sql.Timestamp;

/**
 * Created by Happy on 2019/10/28.
 */


public class Center {

        private Long id;
        private Long subjectId;
        private String subjectName;
        private Integer recommendStatus;
        private Integer sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    @Override
    public String toString() {
        return "Center{" +
                "id=" + id +
                ", subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", recommendStatus=" + recommendStatus +
                ", sort=" + sort +
                '}';
    }
}

