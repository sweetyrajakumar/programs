package com.sweety.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfArrays {

	public static int[] intersection(int[] a, int[] b) {
		return Arrays.stream(a).distinct().filter(x -> Arrays.stream(b).anyMatch(y -> y == x)).toArray();
	}

	public static List<String> intersection2(String[] a, String[] b) {
		return Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> x.equals(y))).sorted()
				.collect(Collectors.toList());
	}

	public static List<String> intersection3(List<String> a, List<String> b) {
		return a.stream().filter(x -> b.stream().anyMatch(y -> isAnagram(y, x))).collect(Collectors.toList());
	}
	
	private static boolean isAnagram(String a, String b) {
		String result1 = a.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		String result2 = b.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		return result1.equals(result2);
	}

}
