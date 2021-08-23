package com.epam.taskif5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;
		System.out.println(countF(x));

	}

	public static double countF(double x) {
		double f;
		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		return f;
	}

}
