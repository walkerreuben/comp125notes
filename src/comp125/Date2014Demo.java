package comp125;

public class Date2014Demo {

	public static void main(String[] args) {
		Date2014 myDate = new Date2014();				//object created here
		myDate.day = 31;								//There are two instance variables here, day and month.
		myDate.month = "December";						//They had default values given in the line 7, and then proper values here.
		System.out.println("A date this year: ");
		myDate.writeOutput();							//Calls the writeOutput method found in the myDate object. Object.method(arguments);
	}
}
