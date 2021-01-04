package com.ryh.demo.utils.response;

/**
 * 返回没有数据
 *
 * @author Administrator
 * @date 2020/12/12
 */
public class ResponseNoData extends  ResponseVO{

    /**
     * 代码
     */
    private int code;

    /**
     * 味精
     */
    private String msg;


    /**
     * 返回没有数据
     * Instantiates a new Response no data.
     *
     * @param code the code
     * @param msg  the msg
     */
    public ResponseNoData(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
     * 得到味精
     *
     * @return {@link String}
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置味精
     *
     * @param msg 味精
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
