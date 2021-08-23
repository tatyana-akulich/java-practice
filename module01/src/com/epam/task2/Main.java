package com.epam.task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a = readNumber("a>>");
		double b = readNumber("b>>");
		double c = readNumber("c>>");
		double z = count(a, b, c);
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
		
		return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2); 
	}

}
