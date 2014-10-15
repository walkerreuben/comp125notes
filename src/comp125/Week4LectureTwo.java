package comp125;

public class Week4LectureTwo {
	
	public static void main(String[] args) {
		/*
		 * How does Eclipse know about the class definition sitting in the other file?
		 * 
		 * Eclipse is clever enough to look for the definition in any file that is in the same source code folder.
		 * So my writing in here is potentially slowing down the process ever so slightly. But only a tiny bit.
		 * 
		 * The assigning of variables in the way we did in lecture one is not the way we usually do it. It worked because they were both public variables.
		 * 
		 * Suppose a client wishes us to write a program which will inform her whether or not a date she enters is really a valid 2014 date.
		 * The client prefers to enter the date in numeric form - that is, to enter the month as an integer. (As well as the day as an integer.)
		 * 
		 * Our goal is to improve our little program to add this functionality.
		 * 
		 * Given the client's wish to enter the date in numeric form, and the fact that date validity checking is probably easier with month numbers rather than month names,
		 * it makes sense to store both day and month as integer instance variables.
		 * 
		 * It is more usual to label all the instance variables of a class as private instead f public.
		 * This practice is called information hiding.
		 * 
		 * Methods are usually labeled public, unless we want to keep it private.
		 * 
		 * If the variables are private, how can we access them and change them?
		 * 
		 * Since our instance variables day and month are private, it is appropriate to provide access to them by accessor methods:
		 * 	public int getDay()
		 * 	public int getMonth()
		 * 
		 * A constructor is a special kind of method that is designed to initialize the instance variables for an object created by new.
		 * We have been sing the default constructor (no params)
		 * A constructor must have the same name as the class
		 * A constructor has no type returned, not even void
		 * Constructors are typically overloaded, which means more than one with the same name but different parameter lists.
		 * It's a good idea to include a no-parameter constructor in class def, even though it is provided by default.
		 */
	}
}
