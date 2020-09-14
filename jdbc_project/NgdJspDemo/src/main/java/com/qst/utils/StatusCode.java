package com.qst.utils;

/**
 * dao层异常处理
 */
public enum StatusCode {

    SUCCESS(1000,"成功"),
    FAIL_GAIN_DRIVER(10001,"数据库驱动获取失败"),
    FAIL_GAIN_CONN(1002,"连接数据库异常"),
    FAIL_GAIN_SQL(1003,"占位符传sql语句异常"),
    FAIL_GAIN_PREPAER(1004,"占位符传参数语句异常"),
    FAIL_GAIN_GETRESPONSE(1005,"获取返回值结果异常"),
    FAIL_CLOSE_SET(2001,"返回值结果关闭异常"),
    FAIL_CLOSE_STATEMENT(2002,"占位符关闭异常"),
    FAIL_CLOSE_CONNECTION(2003,"连接关闭异常"),
    FAIL_GET_SET(3001,"返回值与期望参数不匹配");

    private int code;
    private String message;
    private Object data;

    StatusCode(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        return;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StatusCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
