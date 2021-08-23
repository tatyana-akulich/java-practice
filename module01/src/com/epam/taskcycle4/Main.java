package com.epam.taskcycle4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int finish = 200;
		int productOfDegree2 = countProductOfDegrees(start, finish);
		System.out.println(productOfDegree2);

	}

	public static int countProductOfDegrees(int a, int b) {
		int product = 1;
		for (int i = a; i <= b; i++) {
			product *= Math.pow(i, 2);
		}
		return product;

	}

}
