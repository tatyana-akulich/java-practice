package com.epam.module1.taskcycle1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x = readNumber("x>>");
		int sum = countSum (x);
		
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
	
	public static int countSum (int x) {
		int sum = 0;
		for (int i = 0; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
}
