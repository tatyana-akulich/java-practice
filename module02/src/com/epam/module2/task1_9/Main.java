package com.epam.module2.task1_9;

import java.util.Arrays;
import java.util.Scanner;

/* ¬ массиве целых чисел с количеством элементов ’ найти наиболее часто встречающеес€ число. ≈сли таких чисел несколько, то определить наименьшее из них. */

public class Main {

	public static void main(String[] args) {
		int[] array = createArray();
		Arrays.sort(array);
		int mostCommonElement = findMostCommonElement(array);
		System.out.println("The most common element is " + mostCommonElement);
	}

	public static int[] createArray() {
		int[] array = new int[enterNaturalNumber("Length of array >>")];
		int length = array.length;
		for (int i = 0; i < length; i++) {
			array[i] = enterInteger("Element " + i);
		}

		return array;
	}

	public static int enterNaturalNumber(String invitation) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number;
		do {
			System.out.println(invitation);
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println(invitation);
			}
			number = scanner.nextInt();
		} while (number <= 0);

		return number;
	}

	public static int enterInteger(String invitation) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println(invitation);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println(invitation);
		}
		number = scanner.nextInt();

		return number;
	}

	public static int findMostCommonElement(int[] array) {
		int mostCommonElement = array[0];
		int numberOfRepetitions = 1;
		int largestNumberOfRepetitions = 1;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				numberOfRepetitions++;
			} else {
				if (numberOfRepetitions > largestNumberOfRepetitions) {
					largestNumberOfRepetitions = numberOfRepetitions;
					mostCommonElement = array[i];
				}
				numberOfRepetitions = 1;
			}
		}
		return mostCommonElement;
	}
}
