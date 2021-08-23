package com.epam.task5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int timeInSeconds = 738492;
		String formatedTime = changeToHoursMinutesSeconds (timeInSeconds);
		System.out.println(formatedTime);

	}
	static String changeToHoursMinutesSeconds (int a) {
		return String.format("%d÷ %dìèí %dñ", a / 360, a % 360 / 60, a % 60);
	}

}
