package com.epam.module1.taskcycle3;

public class Main {

	public static void main(String[] args) {
		
		int start = 1;
		int finish = 100;
		int sumOfDegree2 = countSumOfDegrees(start, finish);
		System.out.println(sumOfDegree2);
	}

	public static int countSumOfDegrees(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
}
