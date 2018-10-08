package com.sweety.programs.java8;

import java.util.Arrays;
import java.util.Collections;

public class LargestIntegerInList {

	public int findMaxInList(Integer[] array) {
		return Collections.max(Arrays.asList(array)).intValue();
	}
	
	public static int largestElementInArray(Integer[] array) {
		return Arrays.asList(array).stream().mapToInt(Integer::intValue).max().getAsInt();
	}

}
