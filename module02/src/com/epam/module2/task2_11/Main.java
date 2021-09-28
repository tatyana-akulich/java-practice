package com.epam.module2.task2_11;

/* ћатрицу 10*20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и номера строк, в которых число 5 встречаетс€ 3 и более раз. */

public class Main {
	static int amountOfLines = 10;
	static int amountOfColumns = 20;

	public static void main(String[] args) {

		int[][] array = new int[amountOfLines][amountOfColumns];
		array = generateArrayOfRandomNumbers(array, 16);
		printArray(array);
		System.out.println ("Lines where number 5 was found more than 3 times: ");
		getLinesWith5From3Times(array);
	}

	public static int[][] generateArrayOfRandomNumbers(int[][] array, int range) {
		for (int i = 0; i < amountOfLines; i++) {
			for (int j = 0; j < amountOfColumns; j++) {
				array[i][j] = (int) (Math.random() * range);
			}
		}
		return array;
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < amountOfLines; i++) {
			for (int j = 0; j < amountOfColumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getLinesWith5From3Times(int[][] array) {
		int amountOf5;
		for (int i = 0; i < amountOfLines; i++) {
			amountOf5 = checkLine(array, i);
			if (amountOf5 >= 3) {
				System.out.print(i + " ");
			}
		}
	}

	public static int checkLine(int [][] array, int numberOfLine) {
		int counterOf5 = 0;
		for (int j = 0; j < amountOfColumns; j++) {
			if (array[numberOfLine][j] == 5) {
				counterOf5++;
			}
		}
		return counterOf5;
	}
}
