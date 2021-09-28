package com.epam.module2.task3_6;

/*���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������. 
 * �������� ��� ��������� �������: ������������ ��� �������� �������� �1 � �2. ���� �1 < �2, �� ������������ �� ���� ������� ������. 
 * ���� �2 > �1, �� ������������ ������������ � ���������� �� ���� ������� �����. ��������� �������� ���� ����������.*/

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