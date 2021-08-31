package com.epam.module1.task5;

public class Main {

	public static void main(String[] args) {
		
		int timeInSeconds = 738492;
		String formatedTime = changeToHoursMinutesSeconds (timeInSeconds);
		System.out.println(formatedTime);
	}
	
	static String changeToHoursMinutesSeconds (int a) {
		return String.format("%dh %dmin %ds", a / 360, a % 360 / 60, a % 60);
	}
}
