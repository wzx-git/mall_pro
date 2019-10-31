package com.mr.mall.mall_promotion.entity;

import java.io.Serializable;

public class SmsFlashProduct extends SmsFlashPromotionProductRelation implements Serializable {

    private PmsProduct pmsProduct;

    public PmsProduct getPmsProduct() {
        return pmsProduct;
    }

    public void setPmsProduct(PmsProduct pmsProduct) {
        this.pmsProduct = pmsProduct;
    }
}
