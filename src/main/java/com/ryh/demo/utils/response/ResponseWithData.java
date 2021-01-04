package com.ryh.demo.utils.response;


/**
 * 返回数据
 *
 * @author Administrator
 * @date 2020/12/12
 */
public class ResponseWithData extends ResponseVO {

    /**
     * 代码
     */
    private int code;

    /**
     * 错误消息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;


    /**
     * 返回与数据
     * Instantiates a new Response with data.
     *
     * @param code the code
     * @param msg  the msg
     * @param data the data
     */
    public ResponseWithData(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 得到代码
     *
     * @return int
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置代码
     *
     * @param code 代码
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 得到错误消息
     *
     * @return {@link String}
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置错误消息
     *
     * @param msg 错误消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 得到数据
     *
     * @return {@link Object}
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置数据
     *
     * @param data 数据
     */
    public void setData(Object data) {
        this.data = data;
    }
}
