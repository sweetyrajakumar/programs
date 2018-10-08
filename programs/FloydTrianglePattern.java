package com.sweety.programs;

public class FloydTrianglePattern {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%"+ (5 -i) * 2+ "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d" , j);
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("%" + (6 - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4s", "*");
			}
			System.out.println();
		}

		int k = 0;
		for (int i = 1; i < 6; i++) {
			System.out.printf("%" + (6 - i) * 2 + "s", "");
			for (int j = 1; j < i + 1; j++) {
				System.out.printf("%4d", k++);
			}
			System.out.println();
		}

	}

}
