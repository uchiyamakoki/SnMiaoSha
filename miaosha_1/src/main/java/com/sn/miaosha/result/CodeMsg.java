package com.sn.miaosha.result;

public class CodeMsg {
	private int code;
	private String msg;
	//通用异常
	public static CodeMsg SUCCESS=new CodeMsg(0,"success");
	public static CodeMsg SERVER_ERROR=new CodeMsg(500100, "服务端异常");
	//登录模块
	
	//商品模块
	
	//订单模块
	
	//秒杀模块
	public CodeMsg(int i, String string) {
		this.code=code;
		this.msg=msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
