package com.epam.module1.taskif4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(315.5, 128.0);
		Brick brick = new Brick(0.26, 215, 182);
		ArrayList<Double> forBrick = new ArrayList<>();
		forBrick.add(brick.x);
		forBrick.add(brick.y);
		forBrick.add(brick.z);
		Collections.sort(forBrick);

		ArrayList<Double> forRect = new ArrayList<>();
		forRect.add(rect.A);
		forRect.add(rect.B);
		Collections.sort(forRect);

		if (compare(forBrick, forRect)) {
			System.out.println("Brick will pass the rectangle");
		} else {
			System.out.println("Brick will not pass the rectangle");
		}
	}

	public static boolean compare(ArrayList<Double> a, ArrayList<Double> b) {
		return ((a.get(0) < b.get(0)) && (a.get(1) < b.get(1))) ? true : false;
	}
}
