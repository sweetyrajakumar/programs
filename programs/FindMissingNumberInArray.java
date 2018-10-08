package com.sweety.array;

import java.util.BitSet;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 3 };
		int count = 3;
		int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int missingCount = count - array1.length;
		BitSet bitSet = new BitSet(count);

		for (int number : array1) {
			bitSet.set(number - 1);
		}

		int lastMissingIndex = 0;

		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}

}
