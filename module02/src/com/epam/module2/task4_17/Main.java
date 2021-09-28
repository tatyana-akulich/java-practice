package com.epam.module2.task4_17;

/*�� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. ������� ����� �������� ����� ����������, ����� ��������� ����? ��� ������� ������ ������������ ������������.*/

public class Main {

	public static void main(String[] args) {
		int number = 8975340;
		System.out.println ("Amount of deductions - " + countDeductions(number));
	}

	public static int countSumOfDigits(int number) {
		int sumOfDigits = 0;
		do {
			sumOfDigits += number % 10;
			number /= 10;
		} while (number > 9);
		sumOfDigits += number;

		return sumOfDigits;
	}

	public static int countDeductions(int number) {
		int amountOfDeductions = 0;
		do {
			number -= countSumOfDigits(number);
			amountOfDeductions++;
		} while (number != 0);

		return amountOfDeductions;
	}
}
