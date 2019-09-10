package org.liws.test_jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

public class App {
	public static void main(String[] args) {
		List<CodeNameBag> dataTypes = Arrays.stream(DataType.values())
				.map(e -> new CodeNameBag(e.toString(), e.getMsg())).collect(Collectors.toList());
		System.out.println(dataTypes);
	}
}

enum DataType {
	
	STRING("字符串"), INTEGER("整数"), DECIMAL("十进制数"), DATE("日期"), TIMESTAMP("日期时间");

	private String msg;

	public String getMsg() {
		return msg;
	}

	private DataType(String msg) {
		this.msg = msg;
	}
}

@Setter
@Getter
class CodeNameBag {
	private String code;
	private String name;
	public CodeNameBag(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public CodeNameBag() {
		super();
	}
	@Override
	public String toString() {
		return "CodeNameBag [code=" + code + ", name=" + name + "]";
	}
}
