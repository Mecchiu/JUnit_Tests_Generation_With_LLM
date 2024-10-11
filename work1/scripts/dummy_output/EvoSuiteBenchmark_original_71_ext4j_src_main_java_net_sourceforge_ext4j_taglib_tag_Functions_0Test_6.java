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
* It contains one unit test case for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {
		
	/**
	 * Test method for {@link Functions#dateFormat(Date, String)}.
	 * @throws Exception
	 */
	@Test
	public void test_dateFormat() throws Exception {
		int year;
		int month;
		int day;
		int hour;
		int minute;
		int second;
		String format;

		year = year(0);
		month = 1;
		day = 1;
		hour = 30;
		minute = 3;
		second = 0;
		format = "EEE MMM d HH:mm:ss z yyyy";
		//mgr.pageContext!= javax.servlet.jsp.PageContext.PAGE_SCOPE;
		assertEquals(year + year = 1, year(1));
		assertEquals(month + month = 1, month(1));
		assertEquals(day + day = 1, day(1));
		assertEquals(hour + hour = 30, hour(30));
		assertEquals(minute + minute = 3, minute(3));
		assertEquals(second + second = 0, second(0));	
		assertEquals(format, dateFormat(new Date(), format));
  }

  /**
   * Test method for {@link Functions#addParam(String, IRequest)}.
   * @throws Exception If failed.
   */
  @Test
  public void testAddParam__noRequest() throws Exception {
    String text = "1234567890123456";
    IRequest pRequest = new JspTagContext(IRequest.PAGE, Arrays.<String>asList( text ), Collections.<Tag>concat( null, null ), null);
	  assertEquals(text, Functions.addParam( text, pRequest ));
    assertNull(Functions.addParam( text, null ));
  }

  /**
   * Test method for {@link Functions#addParam(String, IRequest)}.
   * @throws Exception If failed.
   */
  @Test
  public void testAddParam__Request() throws Exception {
    String text = "1234567890123456";
    IRequest pRequest = new JspTagContext(IRequest.PAGE, Arrays.<String>asList( text ), Collections.<Tag>concat( null, null, null, null, null ), null);
}
}