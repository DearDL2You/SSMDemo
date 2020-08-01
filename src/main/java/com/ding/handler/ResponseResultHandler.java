package com.ding.handler;

import com.ding.utils.ExceptionResult;
import com.ding.utils.ResponseResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.apache.log4j.Logger;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Spring全局返回统一结果信息
 */
@RestControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {

    private static final Logger logger = Logger.getLogger(BaseExceptionhandler.class);

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        ResponseResult responseResult = new ResponseResult(body);
        ObjectMapper objectMapper = new ObjectMapper();
        if(body instanceof ExceptionResult){
            logger.info("beforeBodyWrite=Json---不转换---ExceptionResult");
            return  body;
        }


        try {
            logger.info("beforeBodyWrite=Json---转换---ResponseResult");
            return objectMapper.writeValueAsString(responseResult);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("responseResult");

        return responseResult;
    }
}
