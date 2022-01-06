package com.example.demo.exception;

import java.util.List;

/**
 * 基础异常类
 *
 * @author wangyy
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -6765360320533958383L;

    private int errorCode;
    private String exceptionId;
    private Object[] arguments;
    private List<BaseException> throwsList;

    public BaseException(List<BaseException> lst) {
        super();
        this.throwsList = lst;
    }

    public List<BaseException> getThrowsList() {
        return throwsList;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String exceptionId, String message) {
        super(message);
        setExceptionId(exceptionId);

    }

    public BaseException(String exceptionId, String message, Throwable cause) {
        super(message, cause);
        setExceptionId(exceptionId);
    }

    public String getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(String exceptionId) {
        this.exceptionId = exceptionId;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object... arguments) {
        this.arguments = arguments;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
