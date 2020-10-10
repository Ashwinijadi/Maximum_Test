package com.capgemini.maximum_test;

import org.junit.Assert;
import org.junit.Test;

public class ExtendParameters_MaximumTest {

	MaximumTest userInt = new MaximumTest<Integer>();
	MaximumTest userF = new MaximumTest<Float>();
	MaximumTest userStr = new MaximumTest<String>();

	@Test
	public void testIntegerMaximumWithFour_args() {
		userInt.Maximum(20, 40, 60, 80);
		Assert.assertEquals(80, userInt.printMax());
		userInt.printMaximum();
	}

	@Test
	public void testIntegerMaximumWithFive_args() {
		userInt.Maximum(20, 100, 40, 60, 80);
		Assert.assertEquals(100, userInt.printMax());
		userInt.printMaximum();
	}

	@Test
	public void testFloatMaximumwithFour_args() {
		userF.Maximum(20.2f, 80.8f, 40.4f, 60.6f);
		Assert.assertEquals(80.8f, userF.printMax());
		userF.printMaximum();
	}

	@Test
	public void testFloatMaximumWithFive_args() {
		userF.Maximum(20.2f, 100.1f, 40.4f, 60.6f, 80.8f);
		Assert.assertEquals(100.1f, userF.printMax());
		userF.printMaximum();
	}

	@Test
	public void testStringMaximum() {
		userStr.Maximum("Apple", "Peach", "Banana", "Orange");
		Assert.assertEquals("Peach", userStr.printMax());
		userStr.printMaximum();
	}

	@Test
	public void testStringMaximumWithFive_args() {
		userStr.Maximum("Apple", "Peach", "Banana", "Orange", "Mango");
		Assert.assertEquals("Peach", userStr.printMax());
		userStr.printMaximum();
	}
}
