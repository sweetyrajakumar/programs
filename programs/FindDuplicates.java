package com.sweety.programs.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public <T> List<T> findDuplicates(List<T> list) {
		Set<T> set = new HashSet<>();
		return (List<T>) list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
	}
		
	public static List<Character> duplicateCharInString(String string) {
		List<Character> list = string.chars().mapToObj(mapper -> (char) mapper).collect(Collectors.toList());
		return list.stream()
				.filter(e -> Collections.frequency(list, e) > 1)
				.distinct()
				.collect(Collectors.toList());
	}

}
