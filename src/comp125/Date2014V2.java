package comp125;

public class Date2014V2 {

	private int day;
	private int month;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public void setDate(int aDay, int aMonth) {
		day = aDay;
		month = aMonth;
	}

	public void writeOutput() {
		System.out.print(day + "/" + month + "/2014");
		if (isValid())
			System.out.println(" is a date in 2014.");
		else
			System.out.println(" is not a date in 2014");
	}

	private boolean isValid() {
		if (month < 0 || month > 12) 									// Check if it's a valid month.
			return false;
		if (day < 1 || day > 31) 										// If day is greater or less than any possible date. Covers 31 day months.
			return false;
		if (month == 2) 												// If month is February
			return day <= 28;											// If valid day, return true, otherwise false.
		if (month == 4 || month == 6 || month == 9 || month == 11) 		// If month has 30 days
			return day <= 30;											// If valid day, return true, otherwise false.
		return true;
	}
}