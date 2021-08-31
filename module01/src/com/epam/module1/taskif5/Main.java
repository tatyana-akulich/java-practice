package com.epam.module1.taskif5;

public class Main {

	public static void main(String[] args) {
		double x = 2;
		System.out.println(countF(x));
	}

	public static double countF(double x) {
		return (x <= 3) ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
	}
}
