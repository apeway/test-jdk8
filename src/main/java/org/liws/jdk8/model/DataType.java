package org.liws.jdk8.model;

public enum DataType {
	
	STRING("字符串"), INTEGER("整数"), DECIMAL("十进制数"), DATE("日期"), TIMESTAMP("日期时间");

	private String msg;
	public String getMsg() {
		return msg;
	}

	private DataType(String msg) {
		this.msg = msg;
	}
}