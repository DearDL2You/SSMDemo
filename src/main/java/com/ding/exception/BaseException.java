package com.ding.exception;


import com.ding.enums.BaseExceptionEnum;

import java.io.Serializable;

public class BaseException extends RuntimeException  implements Serializable {


    private static final long serialVersionUID = 7429296970072898028L;

    /*
     *错误编码
     */
    private int err_code;

    /*
     * 错误描述
     * */
    private String err_msg;

    public BaseException(String err_msg ) {
       super(err_msg);
    }

    public BaseException(String message, int err_code, String err_msg) {
        super(message);
        this.err_code = err_code;
        this.err_msg = err_msg;
    }

    public BaseException(BaseExceptionEnum baseExceptionEnum){
        super(baseExceptionEnum.getErr_msg());
        this.err_code = baseExceptionEnum.getErr_code();
        this.err_msg = baseExceptionEnum.getErr_msg();
    }

    public int getErr_code() {
        return err_code;
    }

    public void setErr_code(int err_code) {
        this.err_code = err_code;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
