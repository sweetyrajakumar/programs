package com.sweety.programs.java8;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {

	public int linearSearch(int[] items, int key) {
		// if the value is not existing then the method should return -1;
		int index = -1;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == key) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int linearSearchUsingStream(Integer n, Integer[] array) {

		List<Integer> list = Arrays.asList(array);
		return list.stream().filter(i -> list.get(i).intValue() == n.intValue()).findFirst().get().intValue();

	}
}
