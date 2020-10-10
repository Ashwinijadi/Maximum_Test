package com.capgemini.maximum_test;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumTest<E extends Comparable<E>> {
	E x, y, z;
	E max;
	public static Scanner input = new Scanner(System.in);

	public MaximumTest() {

	}

	public E printMax() {
		return this.max;
	}

	public E Maximum(E... args) {
		Arrays.sort(args);
		this.max = args[args.length - 1];
		return max;
	}

	public void printMaximum() {
		System.out.println("maximum is:" + max);
	}

	public static void main(String[] args) {

	}

}
