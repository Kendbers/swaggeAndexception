package com.example.demo.exception;

import java.util.Locale;

/**
 * @ClassName: AppException
 * @Description: 所有异常类
 * @author: wangyy
 * @date: 2018年5月21日 下午8:19:34
 */
public class AppException extends BaseException {

    private static final long serialVersionUID = -1846968432286788402L;

    public AppException() {
        super();
    }

    /**
     * @param message 错误消息
     */
    public AppException(String message) {
        super(message);
    }

    /**
     * @param message 错误消息
     * @param cause   原始异常
     */
    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause 原始异常
     */
    public AppException(Throwable cause) {
        super(cause);
    }

    /**
     * @param cause        原始异常
     * @param exceptionId  异常编码
     *                     特加了异常描述提示开发者,此异常描述不会展示出来
     * @param arguments    异常信息的替换参数
     */
    public AppException(Throwable cause, String exceptionId, String exceptionDesc, Object... arguments) {
        super(exceptionId, cause);
        super.setExceptionId(exceptionId);
        super.setArguments(arguments);
    }

    /**
     * @param exceptionId  异常编码
     *                     特加了异常描述提示开发者,此异常描述不会展示出来
     * @param arguments    异常信息的替换参数
     */
    public AppException(String exceptionId, String exceptionDesc, Object... arguments) {
        super(exceptionId);
        super.setExceptionId(exceptionId);
        super.setArguments(arguments);
    }

    /**
     * @param exceptionId 异常编码
     * @param arguments   异常信息的替换参数
     */
    public AppException(String exceptionId, Object... arguments) {
        super(exceptionId);
        super.setExceptionId(exceptionId);
        super.setArguments(arguments);
    }

    public AppException(int errorCode, Object... arguments){
        super.setErrorCode(errorCode);
        super.setArguments(arguments);
    }

    @Override
    public String getLocalizedMessage() {
        if (this.getErrorCode() == 0) {
            return AppExceptionUtils.getErrByKeyArgsLocale(this.getExceptionId(), Locale.getDefault(), getArguments());
        }
        return AppExceptionUtils.getErrByKeyArgsLocale("error.code." + this.getErrorCode(), Locale.getDefault(), getArguments());
    }

}
