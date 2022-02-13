package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

/* Line Comparison Computation Program
 * Used Java Object Oriented Programming Concepts 
 * Used equals and compareTo methods.
*/
public class LineComparison {
	// initialization
	static double x1, x2, y1, y2, x3, x4, y3, y4;
	static double LengthOfLine1;
	static double LengthOfLine2;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using Oops concepts");
		lengthOfLine1();
		lengthOfLine2();
		checkEqualityOfLines();
		compareTo(); // calling method
	}

	public static void lengthOfLine1() {
		// user inputs for line 1
		System.out.println("Enter co-ordinates for X axis for line1");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		System.out.println("Enter co-ordinates for y axis for line1");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();

		// calculating length of line 1
		LengthOfLine1 = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Lenght of line1 is: " + LengthOfLine1);
	}

	public static void lengthOfLine2() {
		// user inputs for line 2
		System.out.println("Enter co-ordinates for X axis for line2");
		x3 = sc.nextDouble();
		x4 = sc.nextDouble();
		System.out.println("Enter co-ordinates for y axis for line2");
		y3 = sc.nextDouble();
		y4 = sc.nextDouble();

		// calculating length of line 2
		LengthOfLine2 = (double) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Lenght of line2 is: " + LengthOfLine2);
	}

	/*
	 * This method is used to check equality of two lines
	 */
	public static void checkEqualityOfLines() {
		if (Objects.equals(LengthOfLine1, LengthOfLine2))
			System.out.println("Two lines are equal");
		else
			System.out.println("Two lines are not equal");
	}

	/*
	 * This method is used to compare two lines To check one line is equal, greater
	 * or less than the other line.
	 */
	public static void compareTo() {
		if (LengthOfLine1 > LengthOfLine2)
			System.out.println("Line1 is greater than line2");

		else if (LengthOfLine1 < LengthOfLine2)
			System.out.println("Line2 is greater than line1");

		else
			System.out.println("Both lines are equal");
	}
}
