package com.epam.module2.task3_3;

/*���������� �������. ���� ������������������ ����� �, �1, �2, ... ��������� ����������� �������� ���, ����� ��� ���� ����������� �� ��������. 
 * ��� ����� � �������, ������� � �������, ���������� ���������� ������� � �������� �� ������ �����, � ������ - �� ����� �����������. 
 * �����, ������� �� �������, ��� ��������� �����������. �������� �������� ���������� �������. */

public class Main {
	static int[] array = new int[] { 5, 7, -19, 8, 11, 31, -6, 41, 21, 0, 33, 21, 15, -213, 33, 58, 90 };
	static int length = array.length;

	public static void main(String[] args) {
		sortBySelect();
		
		System.out.print("Sorted array: ");
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static void sortBySelect() {
		int indexOfMax = 0;
		int start = 0;
		int change;
		for (int j = start; j < length; j++) {
			for (int i = start; i < length; i++) {
				if (array[i] > array[indexOfMax]) {
					indexOfMax = i;
				}
			}
			change = array[start];
			array[start] = array[indexOfMax];
			array[indexOfMax] = change;
			start++;
			indexOfMax = start;
		}
	}
}
