package com.example.demo.exception;

import org.springframework.context.MessageSource;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/**
 * @author wangyy
 * @ClassName: ExceptionUtils
 * @Description: 异常处理工具
 * @date Jul 30, 2019
 */
public class AppExceptionUtils {

    private static MessageSource msgSource = SpringUtils.getBean(MessageSource.class);

    public AppExceptionUtils() {

    }

    /**
     * 根据异常KEY获取信息
     *
     * @param errKey
     * @return
     */
    public static String getErrByKey(String errKey) {
        return msgSource.getMessage(errKey, null, Locale.getDefault());
    }

    /**
     * 根据key以及参数获取配置的信息
     *
     * @param key
     * @param args
     * @return
     */
    public static String getErrByKeyArgs(String key, Object... args) {
        return msgSource.getMessage(key, args, Locale.getDefault());
    }

    /**
     * 根据KEY，以及参数信息，语言获取信息
     *
     * @param key
     * @param locale
     * @param args
     * @return
     */
    public static String getErrByKeyArgsLocale(String key, Locale locale, Object... args) {
        String message = msgSource.getMessage(key, args, locale);
        return message;
    }

    /**
     * 获取所有堆栈的错误信息
     *
     * @param e
     * @return
     */
    public static String getStackErrorInfo(Exception e) {
        return getThrowableStackErrorInfo(e);
    }

    /**
     * 异常堆栈转换
     *
     * @param e
     * @return
     */
    public static String getThrowableStackErrorInfo(Throwable e) {
        Writer writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));
        return writer.toString();
    }

}
