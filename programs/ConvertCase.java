package com.sweety.programs.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertCase {

	public String convertCase(String string) {
		return Arrays.asList(string.toCharArray()).stream()
				.map(mapper -> new String(mapper).toUpperCase())
				.collect(Collectors.joining(""));
	}

}
