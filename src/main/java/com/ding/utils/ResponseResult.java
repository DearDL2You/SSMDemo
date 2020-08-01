package com.ding.utils;


import com.ding.enums.BaseExceptionEnum;

import java.io.Serializable;

/**
 * 统一返回正常数据的JSON信息
 */
public class ResponseResult implements Serializable {

    private static final long serialVersionUID = -3377651731297917992L;
    private Integer error_code;
    private String error_message;
    private Object reference;

    public ResponseResult() {

    }

    public ResponseResult(Object reference) {
        this.error_code = BaseExceptionEnum.SUCESS.getErr_code();
        this.error_message = BaseExceptionEnum.SUCESS.getErr_msg();
        this.reference = reference;
    }

    public Integer getError_code() {
        return error_code;
    }

    public void setError_code(Integer error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public Object getReference() {
        return reference;
    }

    public void setReference(Object reference) {
        this.reference = reference;
    }
}
