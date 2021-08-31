package com.epam.module1.taskif2;

public class Main {
	static double a = 74.5;
	static double b = 210.9;
	static double c = 0.74;
	static double d = -284;

	public static void main(String[] args) {
		double res1 = min(a, b);
		double res2 = min(c, d);
		System.out.println("Result is " + max(res1, res2));
	}

	static double min(double a, double b) {
		return (a < b) ? a : b; 
	}

	static double max(double a, double b) {
		return (a > b) ? a : b;			
	}
}
