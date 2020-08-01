package com.ding.handler;

import com.ding.controller.UserController;
import com.ding.enums.BaseExceptionEnum;
import com.ding.exception.BaseException;
import com.ding.utils.ExceptionResult;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Spring全局返回统一异常结果信息
 */
@ControllerAdvice
@ResponseBody
public class BaseExceptionhandler {

    private static final Logger logger = Logger.getLogger(BaseExceptionhandler.class);

    @ExceptionHandler(Exception.class)
    public ExceptionResult BaseExceptionResulthandler(Exception exception){
        ExceptionResult exceptionResult = new ExceptionResult();
        if(exception instanceof BaseException){
            logger.info("返回自定义异常处理类BaseException");
            exceptionResult.setError_code(((BaseException) exception).getErr_code());
            exceptionResult.setError_message(((BaseException) exception).getErr_msg());
        }else {
            logger.info("---返回非自定义异常处理类");
            exceptionResult.setError_code(BaseExceptionEnum.PAPAMETER_ERROR.getErr_code());
            exceptionResult.setError_message(BaseExceptionEnum.PAPAMETER_ERROR.getErr_msg());
        }
        return exceptionResult;
    }
}
