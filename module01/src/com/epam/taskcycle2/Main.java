package com.epam.taskcycle2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -67.73;
		double b = 136.4;
		double h = 25.587;
		ArrayList<Double> answers = countFunction(a, b, h);
		printArray(answers);

	}

	public static ArrayList<Double> countFunction(double a, double b, double h) {
		ArrayList<Double> results = new ArrayList<>();
		double res = 0;
		for (double i = a; i <= b; i += h) {
			if (i > 2) {
				res = i;
			} else {
				res = -i;
			}
			results.add(res);
		}
		return results;

	}

	public static void printArray(ArrayList<Double> results) {
		for (Double i : results) {
			System.out.println(i);
		}
	}
}
