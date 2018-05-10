package com.ibase.mall.cart.response;

import java.io.Serializable;

/**
 * @ClassName QueryCartInforResponse
 * @Description TODO
 * @Autor liaoxiongjian
 * @Date 2018/5/10 14:18
 * @Version 1.0
 */
public class QueryCartInforResp implements Serializable {
    // 用户编码
    private Long userId;

    // 商品编码
    private Long skuId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
