package com.sweety.programs.java8;

public class Factorial {

	public int factorialWithRecursion(int n) {
		if (n == 1) {
			return 1;
		} 
		n = n * factorialWithRecursion(n - 1);
		return n;
	}

	public int factorialWithoutRecursion(int n) {
		int result = 1;
		for (int i = n; i > 0; i--) {
			result = result * i;
		}
		return result;

	}

}
