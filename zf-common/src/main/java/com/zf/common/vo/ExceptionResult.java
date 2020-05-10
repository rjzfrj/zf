package com.zf.common.vo;

import com.zf.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/22 21:46
 * @Description:
 */

@Data
public class ExceptionResult {

    private int status;
    private String message;
    private long currentTime;


    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message=em.getMsg();
        currentTime=System.currentTimeMillis();
    }
}
