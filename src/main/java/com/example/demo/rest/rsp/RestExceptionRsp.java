package com.example.demo.rest.rsp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author YLH
 * @date 2021/8/30 10:50
 */
@ApiModel(value = "RestExceptionRsp", description = "异常信息类")
public class RestExceptionRsp implements Serializable {
    private static final long serialVersionUID = -682441163250651106L;

    @ApiModelProperty(value = "错误码")
    private int errorCode;

    @ApiModelProperty(value = "异常类型")
    private String exception;

    @ApiModelProperty(value = "异常信息提示")
    private String message;

    public RestExceptionRsp() {
    }

    public RestExceptionRsp(int errorCode, String exception, String message) {
        this.errorCode = errorCode;
        this.exception = exception;
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
