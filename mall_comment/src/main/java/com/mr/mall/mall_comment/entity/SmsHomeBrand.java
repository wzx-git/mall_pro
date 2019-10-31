package com.mr.mall.mall_comment.entity;


public class SmsHomeBrand{
    private Long id;

    private Long brandId;

    private String brandName;

    private Integer recommendStatus;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }





    @Override
    public String toString() {
        return "SmsHomeBrand{" +
                "id=" + id +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", recommendStatus=" + recommendStatus +
                '}';
    }
}