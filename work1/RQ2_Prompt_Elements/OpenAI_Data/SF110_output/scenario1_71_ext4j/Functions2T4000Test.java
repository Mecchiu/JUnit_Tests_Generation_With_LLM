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
* It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class FunctionsTest {

	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code null}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Null() {
		Date date = null;
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(0)}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Zero() {
		Date date = new Date(0);
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1)}.
	* Expected result: {@code 1}.
	*/
	@Test
	void testDateToMilliseconds_One() {
		Date date = new Date(1);
		long expected = 1;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1000)}.
	* Expected result: {@code 1000}.
	*/
	@Test
	void testDateToMilliseconds_OneThousand() {
		Date date = new Date(1000);
		long expected = 1000;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1001)}.
	* Expected result: {@code 1001}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandOne() {
		Date date = new Date(1001);
		long expected = 1001;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1002)}.
	* Expected result: {@code 1002}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandTwo() {
		Date date = new Date(1002);
		long expected = 1002;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1003)}.
	* Expected result: {@code 1003}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandThree() {
		Date date = new Date(1003);
		long expected = 1003;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1004)}.
	* Expected result: {@code 1004}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandFour() {
		Date date = new Date(1004);
		long expected = 1004;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1005)}.
	* Expected result: {@code 1005}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandFive() {
		Date date = new Date(1005);
		long expected = 1005;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1006)}.
	* Expected result: {@code 1006}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandSix() {
		Date date = new Date(1006);
		long expected = 1006;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
}

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
* It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class FunctionsTest {
		
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code null}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Null() {
		Date date = null;
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(0)}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Zero() {
		Date date = new Date(0);
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1)}.
	* Expected result: {@code 1}.
	*/
	@Test
	void testDateToMilliseconds_One() {
		Date date = new Date(1);
		long expected = 1;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1000)}.
	* Expected result: {@code 1000}.
	*/
	@Test
	void testDateToMilliseconds_OneThousand() {
		Date date = new Date(1000);
		long expected = 1000;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1001)}.
	* Expected result: {@code 1001}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandOne() {
		Date date = new Date(1001);
		long expected = 1001;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1002)}.
	* Expected result: {@code 1002}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandTwo() {
		Date date = new Date(1002);
		long expected = 1002;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1003)}.
	* Expected result: {@code 1003}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandThree() {
		Date date = new Date(1003);
		long expected = 1003;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1004)}.
	* Expected result: {@code 1004}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandFour() {
		Date date = new Date(1004);
		long expected = 1004;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1005)}.
	* Expected result: {@code 1005}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandFive() {
		Date date = new Date(1005);
		long expected = 1005;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1006)}.
	* Expected result: {@code 1006}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandSix() {
		Date date = new Date(1006);
		long expected = 1006;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
}

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
* It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class FunctionsTest {
		
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code null}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Null() {
		Date date = null;
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(0)}.
	* Expected result: {@code 0}.
	*/
	@Test
	void testDateToMilliseconds_Zero() {
		Date date = new Date(0);
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1)}.
	* Expected result: {@code 1}.
	*/
	@Test
	void testDateToMilliseconds_One() {
		Date date = new Date(1);
		long expected = 1;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1000)}.
	* Expected result: {@code 1000}.
	*/
	@Test
	void testDateToMilliseconds_OneThousand() {
		Date date = new Date(1000);
		long expected = 1000;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1001)}.
	* Expected result: {@code 1001}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandOne() {
		Date date = new Date(1001);
		long expected = 1001;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1002)}.
	* Expected result: {@code 1002}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandTwo() {
		Date date = new Date(1002);
		long expected = 1002;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1003)}.
	* Expected result: {@code 1003}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandThree() {
		Date date = new Date(1003);
		long expected = 1003;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1004)}.
	* Expected result: {@code 1004}.
	*/
	@Test
	void testDateToMilliseconds_OneThousandFour() {
		Date date = new Date(1004);
		long expected = 1004;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: {@code new Date(1005)}.
	* Expected result: {@code 1005}.
	*/
	@Test
	void