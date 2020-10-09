package com.capgemini.maximum_test;

public class MaximumTest {

	public static String max(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		String str1="Apple",str2="Banana",str3="Peach";
		System.out.println("maximum is " + max(str1,str2,str3));
	}
}
