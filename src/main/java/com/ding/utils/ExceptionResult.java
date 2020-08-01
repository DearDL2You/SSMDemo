package com.ding.utils;

/**
 * 统一返回异常常数据的JSON信息
 */
public class ExceptionResult {
    private static final long serialVersionUID = -337765172229791252L;
    private Integer error_code;
    private String error_message;
    private Object reference;

    public ExceptionResult() {

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
