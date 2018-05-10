package com.ibase.mall.cart.api;
import com.ibase.mall.cart.request.QueryCartInfoReq;
import com.ibase.mall.cart.response.QueryCartInforResp;

/**
 * @ClassName CartQueryService
 * @Description 购物袋对外接口信息
 * @Autor liaoxiongjian
 * @Date 2018/5/10 14:16
 * @Version 1.0
 */
public interface CartQueryService {

    /**
     * @Description:查询用户购物袋列表
     * @Author:liaoxiongjian
     * @Date: 2018/5/10 14:19
     * @param request
     * @return:com.base.cart.dto.response.QueryCartInforResponse
     * @Version 1.0
     */
     QueryCartInforResp queryCartInfoList(QueryCartInfoReq request);
}
