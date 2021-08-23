package com.epam.taskif1;

public class Main {
	static double angle1 = 15;
	static double angle2 = 90.0;
	static double angle3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean triangle = isTriangle(angle1, angle2);
		System.out.println("Does such a triangle exist? - " + triangle);

		if (triangle) {
			angle3 = countAngle3(angle1, angle2);
			boolean type = isRightTriangle(angle1, angle2, angle3);
			System.out.println("Is the triangle right? - " + type);
		}

	}

	static boolean isTriangle(double a, double b) {
		if ((a + b) > 0 && (a + b) < 180) {
			return true;
		} else
			return false;
	}

	static double countAngle3(double a, double b) {
		return 180 - a - b;

	}

	static boolean isRightTriangle(double a, double b, double c) {
		if (a == 90 || b == 90 || c == 90) {
			return true;
		} else
			return false;
	}

}
