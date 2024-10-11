// Functions_0Test.java
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
class Functions_0Test {

	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_0() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_1() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_2() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_3() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS z";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_4() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_5() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz G";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_6() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz G 'at' HH:mm:ss";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_7() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz G 'at' HH:mm:ss z";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_8() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz G 'at' HH:mm:ss zzzz";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_9() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS zzzz G 'at' HH:mm:ss zzzz '('Z')'";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
}

// Functions_1Test.java
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
class Functions_1Test {
		
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_0() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_1() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_2() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_3() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS z";
		String result = Functions.dateFormat(date, pattern);
		assertEquals(new SimpleDateFormat(pattern).format(date), result);
	}
	
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	void testDateFormat_4() throws Exception {
		Date date = new Date();
		String pattern = "yyyy-MM-