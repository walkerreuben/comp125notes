package comp125;

import java.util.Scanner;

public class Week5LectureOne {
	
	/*
	 * Binary Search
	 * 
	 * If the array is sorted, binary search is an option
	 * Look at the mid-point of the array
	 * 	If target equals mid-point element return true
	 * 	If target is greater than mid-point element, it could still be in top half.
	 * 	If target is less than mid-point element, it could still be in bottom half.
	 * Repeat with mid-point of top/bottom half.
	 * 
	 * This method only works with sorted arrays, as otherwise you can't tell where something is.
	 * 
	 * 
	 */

	public static final int MAX_NUM_STUDENTS = 100; // defined constant

	public static class Student {
		private String name;
		private double mark;

		public Student() {
			name = "";
			mark = 0.0;
		}

		public Student(String name, double mark) {
			setName(name);
			setMark(mark);
		}

		public void setMark(double mark2) {
			mark = mark2;
		}

		public void setName(String name2) {
			name = name2;
		}

		public String getName() {
			return name;
		}

		public double getMark() {
			return mark;
		}

	}

	public static int readStudentData(Student[] a) {
		Scanner keyboard = new Scanner(System.in);
		String theName;
		Double theMark;
		Student theStudent;
		System.out.println("Please enter number of students up to "
				+ MAX_NUM_STUDENTS + ".");
		int numStudents = keyboard.nextInt();
		keyboard.nextLine();
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter family name: ");
			theName = keyboard.nextLine();
			System.out.println("Enter student's mark: ");
			theMark = keyboard.nextDouble();
			keyboard.nextLine();
			theStudent = new Student(theName, theMark);
			a[i] = theStudent;
		}
		keyboard.close();
		return numStudents;
	}

	public static void displayAboveAverage(Student[] myArray, int numStudents) {
		// calculate average mark
		double total = 0.0;
		for (int i = 0; i < numStudents; i++) {
			total += myArray[i].getMark();
		}
		double average = total / numStudents;

		for (int i = 0; i < numStudents; i++) {
			if (myArray[i].getMark() > average)
				System.out.print(myArray[i].getName() + ", " + myArray[i].getMark() + "   ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Student Array Above Average Program");
		Student[] myArray = new Student[MAX_NUM_STUDENTS];
		int numStudents = readStudentData(myArray);
		displayAboveAverage(myArray, numStudents);
	}

}
