package com.capgemini.maximum_test;

import java.util.Scanner;
	
public class MaximumTest<E extends Comparable<E>> {
E x,y,z,max;

public  MaximumTest(E x, E y, E z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
	public static Scanner input = new Scanner(System.in);

	

	public E maximum() {
		return MaximumTest.maximum(x, y, z);
	}

	public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
	System.out.printf("maximum of %s,%s and %s is %s\n",x,y,z,max);
	}

	public static void main(String[] args) {
		Integer xI = 3, yI = 4, zI = 5;
		float xF=3.3f,yF=4.4f,zF=5.5f;
		String xStr="Peach",yStr="Banana",zStr="Apple";
		MaximumTest.maximum(xI, yI, zI);
		MaximumTest.maximum(xStr, yStr, zStr);
		MaximumTest.maximum(xF, yF, zF);
	}
}
