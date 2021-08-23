package com.epam.taskcycle1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = readNumber("x>>");
		int sum = countSumma (x);
		System.out.println(sum);

	}

	public static int readNumber(String invitation) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number;

		do {
			System.out.println(invitation);
			while(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println(invitation);
			}
			number = scanner.nextInt();
		} while (number < 0);

		return number;
	}
	public static int countSumma (int x) {
		int summa = 0;
		for (int i = 0; i <= x; i++) {
			summa += i;
		}
		return summa;
	}

}
