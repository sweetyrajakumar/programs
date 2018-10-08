package com.sweety.programs.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerListAverage {

	public double calculateAverageUsingStream(Integer[] array) {
		return Arrays.asList(array).stream().mapToInt(mapper -> mapper).average().orElse(0.0);
	}

	public double calculateAverageUsingIntStream(Integer[] array) {
		int size = array.length;
		int result = IntStream.range(0, size + 1).sum();
		return result / size;
	}

}
