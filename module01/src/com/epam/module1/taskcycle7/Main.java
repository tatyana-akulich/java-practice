package com.epam.module1.taskcycle7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int firstElement = getNumber("firstElement>>");
		int lastElement = getNumber("lastElement>>");
		findDenominatorsForInterval(firstElement, lastElement);
	}

	public static int getNumber(String invitation) {
		int number = -1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println(invitation);
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
			}
		} while (number < 0);

		return number;
	}

	public static void findDenominatorsForInterval(int m, int n) {
		for (int i = m; i <= n; i++) {
			System.out.println();
			System.out.print(i + ": ");
			findDenominatorsForNumber(i);
		}
	}

	public static void findDenominatorsForNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
