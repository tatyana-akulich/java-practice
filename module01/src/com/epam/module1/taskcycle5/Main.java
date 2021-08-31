package com.epam.module1.taskcycle5;

public class Main {

	public static void main(String[] args) {

		double e = 0.15;
		double sumOfParts = countSum(e);
		System.out.println(sumOfParts);
	}

	public static double countSum(double e) {
		int n = 1;
		double sum = 0;
		double expression = 0;

		while ((expression = countExpression(n)) >= e) {
			sum += expression;
			n++;
		}
		return sum;
	}

	public static double countExpression(int n) {
		return Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
	}
}
