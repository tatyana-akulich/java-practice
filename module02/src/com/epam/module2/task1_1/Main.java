package com.epam.module2.task1_1;

import java.util.Arrays;
import java.util.Scanner;

/* В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. */

public class Main {

	public static void main(String[] args) {
		int [] array  = createArray();
		int multiplicity = enterNaturalNumber ("Element for checking of multiplicity >>");
		int [] multipleElements = chooseMultipleElements(array, multiplicity);
		int sumOfMultipleElements = countSumOfMultipleElements(multipleElements);	
		System.out.println(sumOfMultipleElements);

	}
	
	public static int countSumOfMultipleElements(int[] multipleElements) {
		int sum = 0;
		for (int element: multipleElements) {
			sum = sum + element;
		}
		return sum;
	}

	public static int [] createArray() {
		int [] array = new int [enterNaturalNumber("Length of massive >>")]; 
		int length = array.length;
		for (int i = 0; i < length; i++) {
			array[i] = enterNaturalNumber ("Element " + i);
		}
		
		return array;	
	}
	
	public static int enterNaturalNumber (String invitation) {
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
		} while (number <= 0);

		return number;		
	}
	
	public static int [] chooseMultipleElements (int [] array, int multiplicity) {
		int length = array.length;
		int [] array1 = new int [length];
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			if (array[i] % multiplicity == 0) {
				array1[count] = array[i];
				count++;
			}
		}
		int [] array2 = new int [count];
		array2 = Arrays.copyOf(array1, count);
		
		return array2;		
	}
	

}
