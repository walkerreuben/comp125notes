package comp125;
import static org.junit.Assert.*;
import org.junit.Test;

public class Date2014V2Test {
	
	@Test
	public void testGetSet() {
		Date2014V2 myDate;
		myDate = new Date2014V2();
		myDate.setDate(31, 10);
		assertEquals(31, myDate.getDay());
		assertEquals(10, myDate.getMonth());
	}
	
	@Test
	public void testIsValid() {
		Date2014V2 myDate;
		myDate = new Date2014V2();
		myDate.setDate(31, 10);
		assertEquals(true, myDate.isValid());
	}
	
	@Test
	public void testNumDays() {
		assertEquals(31, Date2014V2.numDays(10));
	}

}