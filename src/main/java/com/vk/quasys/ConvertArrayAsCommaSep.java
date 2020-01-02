package com.vk.quasys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ConvertArrayAsCommaSep {

	public static void main(String[] args) {
		
		String[] nameArray = new String[] {"first", "second", "third"};

		List<String> nameList = Arrays.asList(nameArray);
		
		System.out.println(nameList.stream().map(Object::toString).collect(Collectors.joining(",")));

	}

}
