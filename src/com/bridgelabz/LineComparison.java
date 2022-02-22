package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

class CoOrdinates {
	// initialization
	public double x1;
	public double x2;
	public double y1;
	public double y2;

	// creating a parameterized constructor for line 1
	public CoOrdinates(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
}

class CoOrdinates2 {
	// initialization
	public double x3;
	public double x4;
	public double y3;
	public double y4;

	// creating a parameterized constructor for line 2
	public CoOrdinates2(double x3, double x4, double y3, double y4) {
		super();
		this.x3 = x3;
		this.x4 = x4;
		this.y3 = y3;
		this.y4 = y4;
	}
}

public class LineComparison {
	static double LengthOfLine1;
	static double LengthOfLine2;
	static Scanner sc = new Scanner(System.in);

	// calculating length of line 1
	public double lengthOfLine1(double x1, double x2, double y1, double y2) {
		LengthOfLine1 = (double) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return LengthOfLine1;
	}

	// calculating length of line 2
	public double lengthOfLine2(double x3, double x4, double y3, double y4) {
		LengthOfLine2 = (double) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		return LengthOfLine2;
	}

	/*
	 * This method is used to check equality of two lines
	 */
	public void checkEqualityOfLines(double LengthOfLine1, double LengthOfLine2) {
		if (Objects.equals(LengthOfLine1, LengthOfLine2))
			System.out.println("Two lines are equal");
		else
			System.out.println("Two lines are not equal");
	}

	/*
	 * This method is used to compare two lines To check one line is equal, greater
	 * or less than the other line.
	 */
	public void compareTo(double LengthOfLine1, double LengthOfLine2) {
		if (LengthOfLine1 > LengthOfLine2)
			System.out.println("Line1 is greater than line2");

		else if (LengthOfLine1 < LengthOfLine2)
			System.out.println("Line2 is greater than line1");

		else
			System.out.println("Both lines are equal");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using Oops concepts");
		// creating objects and passing values
		CoOrdinates a = new CoOrdinates(4.1, 5.6, 6.3, 1.0);
		CoOrdinates2 b = new CoOrdinates2(1.8, 2.0, 3, 4.5);
		// Creating the object of the class
		LineComparison lineComp = new LineComparison();
		// calling method
		lineComp.lengthOfLine1(a.x1, a.x2, a.y1, a.y2);
		System.out.println("Lenght of line1 is: " + LengthOfLine1);
		lineComp.lengthOfLine2(b.x3, b.x4, b.y3, b.y4);
		System.out.println("Lenght of line2 is: " + LengthOfLine2);
		lineComp.checkEqualityOfLines(LengthOfLine1, LengthOfLine2);
		lineComp.compareTo(LengthOfLine1, LengthOfLine2);
	}
}
