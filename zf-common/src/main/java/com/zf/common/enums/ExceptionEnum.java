package com.zf.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/21 22:49
 * @Description:
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    PARAMS_NOT_NULL_QA(400,"bad request"),
    ITEM_PRICE_NOT_NULL(400,"商品价格为空"),
    ;
    private int code;
    private String msg;




}
