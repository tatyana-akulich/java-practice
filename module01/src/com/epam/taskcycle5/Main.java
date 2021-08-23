package com.epam.taskcycle5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 0.15;
		double sumOfParts = countSum(e);
		System.out.println(sumOfParts);

	}

	public static double countSum(double e) {
		int n = 1;
		double sum = 0;
		while (Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n)) >= e) {
			sum += Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
			n++;

		}
		return sum;
	}

}
