package com.mr.mall.mall_admin.entity;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 品牌传递参数
 */
public class PmsBrandDto {
    @NotNull(message = "名称不能为空")
    private String name;
    @NotNull(message = "首字母不能为空")
    private String firstLetter;
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private String logo;
    private String bigPic;
    private String brandStory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
