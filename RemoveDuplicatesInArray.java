package com.sweety.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
	
	public static Integer[] removeDuplicatesInArray(Integer[] array) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.stream(array).collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).filter(i -> i.getValue().intValue() == 1)
				.collect(Collectors.mapping(Map.Entry::getKey, Collectors.toList()));

		return list.stream().toArray(Integer[]::new);
	}

	public static <T> Collector<T, ?, T[]> convertToArray(IntFunction<T[]> converter) {
		return Collectors.collectingAndThen(Collectors.toList(), list -> list.toArray(converter.apply(list.size())));
	}

	public static int[] removeDuplicatesInArrayInPlace(int[] arr) {

		int j = 0;
		int i = 1;

		while (i < arr.length) {
			if (arr[i] == arr[j]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}
		return Arrays.copyOf(arr, j + 1);
	}

}
