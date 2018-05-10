package com.base.cart.dto.request;

import java.io.Serializable;

/**
 * @ClassName QueryCartInfoReq
 * @Description TODO
 * @Autor liaoxiongjian
 * @Date 2018/5/10 14:17
 * @Version 1.0
 */
public class QueryCartInfoRequest implements Serializable {
    /**
     * 用户编码
     */
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
