package com.epam.module1.taskif1;

public class Main {
	static double angle1 = 15;
	static double angle2 = 90.0;
	static double angle3;

	public static void main(String[] args) {
		boolean triangle = isTriangle(angle1, angle2);
		System.out.println("Does such a triangle exist? - " + triangle);

		if (triangle) {
			angle3 = countAngle3(angle1, angle2);
			boolean type = isRightTriangle(angle1, angle2, angle3);
			System.out.println("Is the triangle right? - " + type);
		}
	}

	static boolean isTriangle(double a, double b) {
		return ((a + b) > 0 && (a + b) < 180) ? true : false; 
	}

	static double countAngle3(double angel1, double angel2) {
		return 180 - angel1 - angel2;
	}

	static boolean isRightTriangle(double angel1, double angel2, double angel3) {
		return (angel1 == 90 || angel2 == 90 || angel3 == 90) ? true : false;
	}
}
