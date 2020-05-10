package com.zf.common.exception;

import com.zf.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/21 22:47
 * @Description:
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends RuntimeException {

    private ExceptionEnum exceptionEnum;


}
