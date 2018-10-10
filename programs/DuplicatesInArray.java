package com.sweety.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicatesInArray {

	public static void listAllDuplicatesInArray() {
		List<String> list = Arrays.asList("a", "a", "a", "b", "b", "c");
		list.stream().filter(i -> (Collections.frequency(list, i) > 1)).distinct().collect(Collectors.toList())
				.forEach(action -> System.out.println(action));
	}

	public static int findFirstNonRepeatedElementsInArray(int[] array) {
		return Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
				.stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).findFirst().get().getKey()
				.intValue();

	}

	public static int findNthNonRepeatedElementInArray(int[] array, int n) {
		return Arrays.stream(array).boxed()
					 .collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
					 .stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
					 .filter(i -> i.getValue().intValue() == 1)
					 .collect(Collectors.mapping(Map.Entry::getKey, Collectors.toList())).get(n - 1);
	}

	public static  Integer[] removeDuplicatesInArray(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
				.stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.filter(i -> i.getValue().intValue() == 1)
				.collect(Collectors.mapping(Map.Entry::getKey, Collectors.toList()));
		
		return list.stream().collect(convertToArray(Integer[]::new));
		
	}
	
	public static <T> Collector<T, ?, T[]> convertToArray(IntFunction<T[]> converter) {
		return Collectors.collectingAndThen(Collectors.toList(), list -> list.toArray(converter.apply(list.size())));
	}

}
