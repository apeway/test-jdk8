package org.liws.jdk8.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CodeNameBag {
	
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