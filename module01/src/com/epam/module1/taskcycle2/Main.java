package com.epam.module1.taskcycle2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		double firstNumber = -67.73;
		double lastNumber = 136.4;
		double step = 25.587;
		
		ArrayList<Double> answers = countFunction(firstNumber, lastNumber, step);
		printArray(answers);
	}

	public static ArrayList<Double> countFunction(double a, double b, double h) {
		
		ArrayList<Double> results = new ArrayList<>();
		double res = 0;
		for (double i = a; i <= b; i += h) {
			res = (i > 2)? i : -i;
			results.add(res);
		}
		return results;
	}

	public static void printArray(ArrayList<Double> results) {
		for (Double element : results) {
			System.out.println(element);
		}
	}
}
