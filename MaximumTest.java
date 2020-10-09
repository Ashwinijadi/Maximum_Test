package com.capgemini.maximum_test;

public class MaximumTest {

	public static int max(int x, int y, int z) {
		int max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		int a = 3, b = 5, c = 4;

		System.out.println("maximum is " + max(a, b, c));
	}
}
