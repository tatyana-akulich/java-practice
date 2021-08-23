package com.epam.task6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.75;
		double y = 1.35;
		System.out.println(checkCoordinates(x, y));
	}
	static boolean checkCoordinates(double x, double y) {
		return ((x >= -2 && x <= 2 && y >= -1.5 && y <= 0) || (x >= -1 && x <= 1 && y >= -0 && y <= 2)) ? true : false;
	}

}
