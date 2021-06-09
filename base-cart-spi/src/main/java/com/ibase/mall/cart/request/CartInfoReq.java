package com.ibase.mall.cart.request;

import java.io.Serializable;

/***
 * 添加购物车请求入参
 * @author liaoxiongjian
 */
public class CartInfoReq implements Serializable {
    /**
     * 用户编码
     */
    private Long userId;
    /**
     * 商品编码
     */
    private Long goodsId;

    public CartInfoReq() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}
