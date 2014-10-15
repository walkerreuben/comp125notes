package comp125;

public class Date2014 {
	
	public int day;
	public String month;
	
	public void writeOutput() {									//No longer has static. Static means it doesn't require a calling object.
		System.out.println(day + " " + month + " 2014");
	}
}