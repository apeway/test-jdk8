package org.liws.jdk8.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.liws.jdk8.model.CodeNameBag;
import org.liws.jdk8.model.DataType;

public class T1_Stream {
	
	@Test
	public void test_map() {
		DataType[] values = DataType.values();
		Stream<DataType> dataTypeStream = Arrays.stream(values);
		Stream<CodeNameBag> codeNameMapStream = dataTypeStream
				.map(e -> new CodeNameBag(e.toString(), e.getMsg()));
		List<CodeNameBag> codeNameBagList = codeNameMapStream.collect(Collectors.toList());
		System.out.println(codeNameBagList);
	}
	
	
}




