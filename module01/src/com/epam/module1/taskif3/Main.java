package com.epam.module1.taskif3;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(3, 2.75);
		Point b = new Point(15.18, 15);
		Point c = new Point(0, -35);
		double[] abc = new double[2];
		abc = variablesForLineExpression(a, b);
		System.out.println("Does 3 points lye on one line? - " + checkPoint3(abc, c));
	}

	static double[] variablesForLineExpression(Point a, Point b) { // y = kx + b
		double[] abc = new double[2];
		abc[0] = (a.x - b.x) / (a.y - b.y);
		abc[1] = b.x - abc[0] * b.y;
		return abc;
	}

	static boolean checkPoint3(double[] abc, Point c) {
		return (c.y == abc[0] * c.x + abc[1]) ? true : false;
	}
}
