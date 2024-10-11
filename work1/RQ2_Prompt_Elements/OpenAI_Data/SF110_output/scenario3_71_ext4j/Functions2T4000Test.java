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
	 * Test case 1.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds1() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds2() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds3() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds4() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds5() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds6() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds7() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds8() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds9() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds10() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
}

// Functions.java
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

/**
 * @author luc
 */
public class Functions {

    /**
     * Convert a date in milliseconds
     *
     * @param pDateTime the date
     * @return the milliseconds
     */
    public static long dateToMilliseconds(Date pDateTime);
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
	 * Test case 1.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds1() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds2() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds3() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds4() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds5() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds6() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds7() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds8() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds9() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds10() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
}

// Functions.java
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

/**
 * @author luc
 */
public class Functions {

    /**
     * Convert a date in milliseconds
     *
     * @param pDateTime the date
     * @return the milliseconds
     */
    public static long dateToMilliseconds(Date pDateTime);
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
	 * Test case 1.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds1() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds2() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds3() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds4() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds5() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds6() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds7() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds8() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds9() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds10() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
}

// Functions.java
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

/**
 * @author luc
 */
public class Functions {

    /**
     * Convert a date in milliseconds
     *
     * @param pDateTime the date
     * @return the milliseconds
     */
    public static long dateToMilliseconds(Date pDateTime);
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
	 * Test case 1.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds1() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws Exception
	 */
	@Test
	public void testDateToMilliseconds2() throws Exception {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
	
	/**
	 * Test case 3.
	