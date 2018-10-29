package com.sweety.strings;

import java.util.HashSet;
import java.util.Set;

public class PrintLongestPalindrome {

	public String printLongestPallindromeFromString(String value) {
		Set<String> list = new HashSet<>();
		int l = value.length();
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l - j; j++) {
				String subString = value.substring(i, j + 1);
				if (isPallindrome(subString)) {
					list.add(subString);
				}
			}
		}

		String longestPallindrom = findLongestPallindorm(list);
		return longestPallindrom;
	}

	public static boolean isPallindrome(String value) {
		StringBuilder sb = new StringBuilder(value);
		if (value.equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}

	public static String findLongestPallindorm(Set<String> set) {
		int longest = 0;
		String longestString = "";
		for (String value : set) {
			if (value.length() > longest) {
				longest = value.length();
				longestString = value;
			}
		}
		return longestString;
	}

}
