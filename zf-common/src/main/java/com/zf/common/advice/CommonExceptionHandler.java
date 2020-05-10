package com.zf.common.advice;

import com.zf.common.enums.ExceptionEnum;
import com.zf.common.vo.ExceptionResult;
import com.zf.common.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Auther: zhifeng
 * @Date: 2020/4/21 22:34
 * @Description:
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionResult> handleException(BusinessException e){
        ExceptionEnum ee = e.getExceptionEnum();

        return ResponseEntity.status(ee.getCode()).body(new ExceptionResult(ee));
    }
}
