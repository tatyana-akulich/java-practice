package com.epam.task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = readNumber("a>>");
		b = readNumber("b>>");
		c = readNumber("c>>");
		z = count(a, b, c);
		System.out.println(z);

	}

	public static double readNumber(String invitation) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(invitation);

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println(invitation);
		}
		
		return scanner.nextDouble();
	}

	public static double count(double a, double b, double c) {
		return ((a - 3) * b / 2) + c;
	}

}
