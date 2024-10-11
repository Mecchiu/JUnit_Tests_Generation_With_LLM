// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {
		
	@Test
	void shouldBeValidDate() {
		assertTrue(DateTools.isValidDate("123456", DEFAULT_DATE_FORMAT));
	}
	
	@Test
	@java.lang.SuppressWarnings("all")
	void shouldBeValidDate_String() throws ParseException{
		Date date = SimpleDateFormat.getDateInstance().parse("123456");
		assertTrue(DateTools.isValidDate(date.toString(), DEFAULT_DATE_FORMAT));
	}
	
	@Test
	@java.lang.SuppressWarnings("all")
	void shouldBeValidDate_Format() throws ParseException{
		assertTrue(DateTools.isValidDate("123456", LONG_DATE_FORMAT));
	}

}

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_3Test {
		
	@Test
	void shouldBeValidDate() throws ParseException{
		assertEquals("12345", DateTools.parse("12345", DEFAULT_DATE_FORMAT));
	}
	
	@Test(expected=ParseException.class)
	void shouldNotBeValidString() throws ParseException{
		assertEquals("1234567890", DateTools.parse("1234567890", DEFAULT_DATE_FORMAT));
	}
}

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String)} method.
*/
class DateTools_4Test {
	
	@Test
	public void shouldBeValidDate(){
		assertEquals("1970-01-01", DateTools.parse("1970-01-01", DEFAULT_DATE_FORMAT));
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldNotBeValidNull(){
		DateTools.parse((String) null);
	}
	
	@Test
	@java.lang.SuppressWarnings("all")
	void shouldBeValidNull(){
		DateTools.parse("");
	}

}