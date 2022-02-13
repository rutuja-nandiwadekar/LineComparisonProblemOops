package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	// initialization
	static double x1, x2, y1, y2;
	static double LengthOfLine;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using Oops concepts");
		// user inputs for X co-ordinate values
		System.out.println("Enter co-ordinates for X axis");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		// user inputs for Y co-ordinate values
		System.out.println("" + "Enter co-ordinates for y axis");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();

		lengthOfLine(); // calling method
	}

	/*
	 * This method is used to Calculate length of line
	 */
	public static void lengthOfLine() {
		LengthOfLine = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Lenght of line is: " + LengthOfLine);
	}
}
