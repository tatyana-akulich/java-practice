package com.epam.task4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = getNumber("a>>");
		double b = changeNumber(a);
		System.out.println("New number is " + b);
	}

	public static String getNumber(String invitation) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(invitation);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println(invitation);
		}
		return scanner.next();
	}

	public static double changeNumber(String a) {

		String[] parts = a.split(",");
		return Double.parseDouble(parts[1] + "." + parts[0]);
	}
}
