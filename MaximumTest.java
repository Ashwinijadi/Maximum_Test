package com.capgemini.maximum_test;

	public class MaximumTest<T extends Comparable<T>> {
		T x, y, z;

		public MaximumTest(T x, T y, T z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public T maximum() {
			return MaximumTest.maximum(x, y, z);
		}

		public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			T max = x;
			if (y.compareTo(max) > 0) {
				max = y;
			}
			if (z.compareTo(max) > 0) {
				max = z;
			}
			printMax(x, y, z, max);
			return max;
		}
		
		/*public static String maximumTest(String x,  String y, String z) {
			String max = x;
			if (y.compareTo(max) > 0) {
				max = y;
			}
			if (z.compareTo(max) > 0) {
				max = z;
			}
			printMax(x, y, z, max);
			return max;
		}*/
		public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("maximum is "+max);
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
