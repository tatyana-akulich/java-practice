package com.epam.taskcycle8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 748.305;
		double b = 16273.949;
		char[] array1 = convertingFromDoublToCharArray(a);
		char[] array2 = convertingFromDoublToCharArray(b);
		System.out.print("Similar numbers: ");
		findSimilarNumbers(array1, array2);

	}

	public static char[] convertingFromDoublToCharArray(double a) {
		String number = Double.toString(a);
		char[] fromDouble = number.toCharArray();
		return fromDouble;
	}

	public static void findSimilarNumbers(char[] array1, char[] array2) {
		for (int i = 0; i <= 9; i++) {
			if (checkNumber(array1, i) && checkNumber(array2, i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean checkNumber(char[] a, int i) {
		for (char c : a) {
			if (Character.getNumericValue(c) == i) {
				return true;

			}
		}
		return false;

	}
}