package com.epam.taskif2;

public class Main {
	static double a = 74.5;
	static double b = 210.9;
	static double c = 0.74;
	static double d = -284;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res1 = min(a, b);
		double res2 = min(c, d);
		System.out.println("Result is " + max(res1, res2));
	}

	static double min(double a, double b) {
		if (a < b) {
			return a;
		} else
			return b;
	}

	static double max(double a, double b) {
		if (a > b) {
			return a;
		} else
			return b;
	}
}
