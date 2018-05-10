package com.ibase.mall.cart.dto;

/**
 * @ClassName CartInfoDto
 * @Description TODO
 * @Autor liaoxiongjian
 * @Date 2018/5/10 14:31
 * @Version 1.0
 */
public class CartInfoDto {

    // 用户编码
    private Long userId;
    // 商品编码
    private Long skuId;
    // 创建时间
    private Long createTime;

    public CartInfoDto(Long userId, Long skuId, Long createTime) {
        this.userId = userId;
        this.skuId = skuId;
        this.createTime = createTime;
    }


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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
