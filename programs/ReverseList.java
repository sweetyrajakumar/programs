package com.sweety.programs.java8;

import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseList {

	public <T> List<T> reverseList(List<T> list) {
		int size = list.size();

		IntStream.iterate(size - 1, e -> e - 1).limit(list.size()).mapToObj(mapper -> new SimpleEntry<>(list.get(mapper), mapper))
				.map(SimpleEntry::getKey).collect(Collectors.toList()).forEach(item -> System.out.print(item));
		
		return IntStream.iterate(list.size() - 1, e -> e - 1).limit(list.size()).mapToObj(list::get)
				.collect(Collectors.toList());
	}
}
