package com.epam.taskcycle7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = getNumber("m>>");
		int n = getNumber("n>>");
		findDenominatorsForInterval(m, n);

	}

	public static int getNumber(String invitation) {
		int a = -1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(invitation);
			if (scanner.hasNextInt()) {
				a = scanner.nextInt();
			}
		} while (a < 0);
		return a;
	}

	public static void findDenominatorsForInterval(int m, int n) {
		for (int i = m; i <= n; i++) {
			System.out.println();
			System.out.print(i + ": ");
			findDenominatorsForNumber(i);
		}

	}

	public static void findDenominatorsForNumber(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");

			}

		}
	}

}
