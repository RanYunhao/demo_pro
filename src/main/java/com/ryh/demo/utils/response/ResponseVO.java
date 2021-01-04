package com.ryh.demo.utils.response;

/**
 * 返回签证官
 *
 * @author Administrator
 * @date 2020/12/12
 */
public class ResponseVO {

	/**
	 * 代码
	 */
	private int code;

	/**
	 * 味精
	 */
	private String msg;

	/**
	 * 数据
	 * des:数据
	 */
	private Object data;
	/**
	 * 丙氨酸味精
	 * des:附加说明
	 */
	private String attMsg;

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

	/**
	 * 得到味精
	 * Gets msg.
	 *
	 * @return the msg
	 */
	public String getMsg() {
        return msg;
    }

	/**
	 * 设置味精
	 * Sets msg.
	 *
	 * @param msg the msg
	 */
	public void setMsg(String msg) {
        this.msg = msg;
    }

	/**
	 * 得到数据
	 * Gets data.
	 *
	 * @return the data
	 */
	public Object getData() {
        return data;
    }

	/**
	 * 设置数据
	 * Sets data.
	 *
	 * @param data the data to set
	 */
	public void setData(Object data) {
        this.data = data;
    }

	/**
	 * 得到丙氨酸味精
	 * Gets att msg.
	 *
	 * @return the attMsg
	 */
	public String getAttMsg() {
        return attMsg;
    }

	/**
	 * 设置丙氨酸味精
	 * Sets att msg.
	 *
	 * @param attMsg the attMsg to set
	 */
	public void setAttMsg(String attMsg) {
        this.attMsg = attMsg;
    }

}
