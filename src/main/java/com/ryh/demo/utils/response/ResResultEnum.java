package com.ryh.demo.utils.response;

/**
 * 返回结果枚举
 *
 * @author Administrator
 * @date 2020/12/12
 */
public enum ResResultEnum {
	/**
	 * Success res result enum.
	 */
	SUCCESS(0, "成功"),
	/**
	 * Error res result enum.
	 */
	ERROR(1, "失败"),
	/**
	 * Parms err res result enum.
	 */
	PARMS_ERR(101, "参数异常"),
	/**
	 * No data res result enum.
	 */
	NO_DATA(102, "查无记录"),
	/**
	 * No user res result enum.
	 */
	NO_USER(103, "用户不存在"),
	/**
	 * Ftp err res result enum.
	 */
	FTP_ERR(201, "FTP上传错误"),
	/**
	 * Interface err res result enum.
	 */
	INTERFACE_ERR(202, "接口返回失败"),
	/**
	 * Service err res result enum.
	 */
	SERVICE_ERR(500, "服务异常");

	/**
	 * 返回结果枚举
	 *
	 * @param code 代码
	 * @param msg  错误消息
	 */
	ResResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

	/**
	 * 代码
	 */
	private int code;

	/**
	 * 错误消息
	 */
	private String msg;

	/**
	 * 得到错误消息
	 * Gets msg.
	 *
	 * @return the msg
	 */
	public String getMsg() {
        return msg;
    }

	/**
	 * 设置错误消息
	 * Sets msg.
	 *
	 * @param msg the msg
	 */
	public void setMsg(String msg) {
        this.msg = msg;
    }

	/**
	 * 得到代码
	 * Gets code.
	 *
	 * @return the code
	 */
	public int getCode() {
        return code;
    }

	/**
	 * 设置代码
	 * Sets code.
	 *
	 * @param code the code
	 */
	public void setCode(int code) {
        this.code = code;
    }

}
