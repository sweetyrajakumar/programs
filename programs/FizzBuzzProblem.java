package com.sweety.strings;

import java.util.Optional;

import org.junit.platform.commons.util.StringUtils;

public class FizzBuzzProblem {

	public static String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "fizzbuzz";
		} else if (number % 3 == 0) {
			return "fizz";
		} else if (number % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(number);
	}

	public static String fizzBuzz8(int number) {

		return Optional.of(number).map(i -> {
			if (number % 3 == 0 && number % 5 == 0) {
				return "fizzbuzz";
			} else if (number % 3 == 0) {
				return "fizz";
			} else if (number % 5 == 0) {
				return "buzz";
			}
			return String.valueOf(number);
		}).get();

	}

	public static String fizzBuzz8_1(int number) {
		String result = Optional.of(number).map(i -> (i % 3 == 0 ? "fizz" : "") + (i % 5 == 0 ? "buzz" : "")).get();
		return StringUtils.isBlank(result) ? String.valueOf(number) : result;
	}

}
