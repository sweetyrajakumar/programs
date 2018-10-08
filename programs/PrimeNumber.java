package com.sweety.programs.java8;

import java.util.stream.LongStream;

public class PrimeNumber {

	public boolean isPrime(long number) {
		return LongStream.rangeClosed(2, 
				Math.round(Math.sqrt(number))).anyMatch(n -> number % n != 0);

	}

}
