package com.epam.module1.taskcycle6;

public class Main {

	public static void main(String[] args) {
		String symbols = "abcdefghijklmnopqrstuvwxyz";
		int[] numberEquivalents = symbolsToNumbers(symbols);
		print(numberEquivalents);
	}

	public static int[] symbolsToNumbers(String symbols) {
		char[] charVariant = symbols.toCharArray();
		int[] intVariant = new int[26];
		int length = charVariant.length;
		
		for (int i = 0; i < length; i++) {
			intVariant[i] = (int) charVariant[i];
		}
		return intVariant;
	}

	public static void print(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}
