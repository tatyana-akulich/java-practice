package com.epam.module1.task4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String number = getNumber("a>>");
		double changedNumber = changeNumber(number);
		System.out.println("New number is " + changedNumber);
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
