package com.ding.enums;

public enum  BaseExceptionEnum {
    SUCESS(0,"请求成功！"),

    SYSTEM_BUSY(100,"系统繁忙！"),

    REQUEST_TIME_OUT(300,"请求超时！"),

    PAPAMETER_ERROR(400,"参数错误！"),

    NETWORK_ERROR(404,"网络异常！"),

    DATA_NOT_EXISTS(600,"数据不存在！"),

    FAILER(999,"未知错误！");

    private Integer err_code;
    private String err_msg;

    BaseExceptionEnum(Integer err_code, String err_msg) {
        this.err_code = err_code;
        this.err_msg = err_msg;
    }

    public Integer getErr_code() {
        return err_code;
    }

    public void setErr_code(Integer err_code) {
        this.err_code = err_code;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
