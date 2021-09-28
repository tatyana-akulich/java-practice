package com.epam.module2.task3_6;

/*Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента а1 и а2. Если а1 < а2, то продвигаются на один элемент вперед. 
 * Если а2 > а1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.*/

public class Main {
	static double[] array = new double[] { 5.2, 7.3, -19.1, 8.3, 11.04, 31.02, -6.41, 8.21, 1, 0, 3.5, 21, 15, 7,
			-21.33, 3, 58.7, 90.78 };
	static int length = array.length;

	public static void main(String[] args) {
		sortByShell();

		System.out.print("Sorted array: ");
		for (double element : array) {
			System.out.print(element + " ");
		}
	}

	public static void sortByShell() {
		double change;
		for (int i = 0; i < length - 1; i++) {
			if (array[i] > array[i + 1]) {
				do {
					change = array[i];
					array[i] = array[i + 1];
					array[i + 1] = change;
					if (i > 0) {
					i--;
					}
				} while ((array[i] > array[i + 1]) && (i >= 0));
			}
		}
	}
}