package com.sweety.programs.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNTimes {

	public <T> List<T> duplicateNTimes(List<T> list, int n) {
		return list.stream()
				.flatMap(mapper -> Collections.nCopies(n, mapper).stream())
				.collect(Collectors.toList());
	}
}
