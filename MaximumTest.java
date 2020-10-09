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
		int a = 5, b = 4, c = 3;

		System.out.println("maximum is " + max(a, b, c));
	}
}
