package com.zhiyou100.exception;

/**
 * @author BianGe
 * @ClassName UserException
 * @Description TODO
 * @create 2019/3/27 17:33
 * @Version 1.0
 **/
public class UserException extends RuntimeException {

    private Integer errorCode;

    private String errorMessage;

    public UserException(Integer errorCode, String errorMessage) {

        super(errorMessage);

        this.errorCode =errorCode;

        this.errorMessage = errorMessage;

    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}