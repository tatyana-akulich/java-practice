package com.epam.taskcycle6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String symbols = "abcdefghijklmnopqrstuvwxyz";
		int[] numberEquivalents = symbolsToNumbers(symbols);
		print(numberEquivalents);

	}

	public static int[] symbolsToNumbers(String symbols) {
		char[] charVariant = symbols.toCharArray();
		int[] intVariant = new int[26];
		for (int i = 0; i < charVariant.length; i++) {
			intVariant[i] = (int) charVariant[i];
		}
		return intVariant;
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

}
