package com.epam.module1.task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x = readNumber("x>>");
		double y = readNumber("y>>");
		double z = count(x, y);
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

	public static double count(double x, double y) {

		return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
	}
}
