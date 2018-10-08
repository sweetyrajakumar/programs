package com.sweety.programs.java8;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DropNthElement {

	public List<String> dropNthElement(List<String> list, int n) {
		return IntStream.range(0, list.size()).mapToObj(mapper -> new SimpleEntry<>(list.get(mapper), mapper))
				.filter(i -> (i.getValue() + 1) % n != 0).map(SimpleEntry::getKey).collect(Collectors.toList());
	}

}
