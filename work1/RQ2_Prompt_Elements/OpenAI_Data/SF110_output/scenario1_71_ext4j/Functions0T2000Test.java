// FunctionsTest.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class FunctionsTest {

	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code null} date.
	* Expected result: {@code ""} string.
	*/
	@Test
	void testDateFormat_NullDate() {
		assertEquals("", Functions.dateFormat(null, "dd/MM/yyyy"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code null} pattern.
	* Expected result: {@code ""} string.
	*/
	@Test
	void testDateFormat_NullPattern() {
		assertEquals("", Functions.dateFormat(new Date(), null));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code null} date and pattern.
	* Expected result: {@code ""} string.
	*/
	@Test
	void testDateFormat_NullDateAndPattern() {
		assertEquals("", Functions.dateFormat(null, null));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy"} pattern.
	* Expected result: {@code "01/01/1970"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyy() {
		assertEquals("01/01/1970", Functions.dateFormat(new Date(0), "dd/MM/yyyy"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmss() {
		assertEquals("01/01/1970 00:00:00", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern.
	* Expected result: {@code "01/01/1970 00:00:00.000"} string.
	*/
	@Test
	void testDateFormat_Pattern_ddMMyyyyHHmmssSSS() {
		assertEquals("01/01/1970 00:00:00.000", Functions.dateFormat(new Date(0), "dd/MM/yyyy HH:mm:ss.SSS"));
	}
	
	/**
	* Test case for {@link Functions#dateFormat(Date, String)} method.
	* Test data: {@code "dd/MM/yyyy HH:mm:ss.SSS"} pattern