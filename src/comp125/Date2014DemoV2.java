package comp125;

import java.util.Scanner;

public class Date2014DemoV2 {

	public static void main(String[] args) {
		Date2014V2 myDate = new Date2014V2();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the date in DD MM format: ");
		int theDay = keyboard.nextInt();
		int theMonth = keyboard.nextInt();
		keyboard.close();
		myDate.setDate(theDay, theMonth);
		myDate.writeOutput();
	}
	
}
