package com.capgemini.maximum_test;

public class MaximumTest {

	public static float max(float x, float y, float z) {
		float max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		float a = 4.4f, b = 2.2f, c=3.3f;		
		System.out.println("maximum is " + max(a, b, c));
	}
}
