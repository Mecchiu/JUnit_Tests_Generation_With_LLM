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
private final String strDate = "2038-05-10";
    @Test
    public void testDateFormatI() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM-dd"));
    }
		@Test
    public void testDateFormatJ() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MMMM-dd"));
    }
		@Test
    public void testDateFormatK() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyyMMdd"));
    }
        @Test
    public void testDateFormatL() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-M-d"));
    }
		@Test
    public void testDateFormatM() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM"));
    }
		@Test
			public void testDateFormatN() {
				assertEquals(strDate, Functions.dateFormat(new Date(), "yyyyMM"));
			}
		@Test
    public void testDateFormatO() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyyMMdd"));
    }
		@Test
    public void testDateFormatP() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-M-d"));
    }
		@Test
    public void testDateFormatQ() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyyMMdd"));
    }
		@Test
    public void testDateFormatR() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyyMM"));
    }
		@Test
    public void testDateFormatS() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-M"));
    }
		@Test
    public void testDateFormatT() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM"));
    }
		@Test
    public void testDateFormatU() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyy-MM-dd"));
    }
		@Test
    public void testDateFormatV() {
        assertEquals(0, Functions.dateFormat(new Date(), "M"));
    }
		@Test
    public void testDateFormatW() {
        assertEquals(0, Functions.dateFormat(new Date(), "MMM-yy"));
    }
		@Test
			public void testDateFormatX() {
				assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM-dd"));
			}
		@Test
    public void testDateFormatY() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM-dd"));
    }
		@Test
    public void testDateFormatZ() {
        assertEquals(strDate, Functions.dateFormat(new Date(), "yyyy-MM-dd"));
    }
		@Test
    public void testDateFormatAA() throws JspTagException {
        assertEquals(strDate, Functions.dateFormat((Date)null, "yyyy-MM-dd"));
    }
		@Test
			public void testDateFormatBB() throws JspTagException {
				assertEquals(strDate, Functions.dateFormat((Date)null, "yyyy-MM-dd"));
			}
		@Test
    public void testDateFormatCC() throws JspTagException {
		Map<String, Object> map = new HashMap<String, Object>(0);
		StringBuffer sb = new StringBuffer();
		JspTagException jspTagException = new JspTagException("testException", sb, map);
		Map<String, String> messages = (Map<String, String>)jspTagException.getMessage();
		assertTrue(messages.get("testException")!= null);
		assertNull(messages.get("testException"));
		StringTokenizer st = new StringTokenizer(sb.toString(), "yyyy/MM/dd", 3);
		String strDate = st.nextToken();
		assertEquals(1801, Integer.valueOf(strDate).intValue());
		assertNull(messages.get("testException"));
		//System.out.println(sb.toString());
		}

	// Functions_1Test.java
	// 1.10-0_3 TestMethods 
	@Test
	public void testMethod1() {
		IRequest request = new RequestI("GET", "/testMethod1Action");
		request.setParameter("dateFormat", "yyyy/MM/dd");
	}

	@Test
	public void testMethod2() {
		IRequest request = new RequestI("POST", "/testMethod2Action");
		request.setParameter("Date", Arrays.asList("yyyy/MM/dd"));
	}

	@Test
	public void testMethod3() {
		IRequest request = new RequestI("GET", "/testMethod3Action");
		request.setParameter("Date", Arrays.asList("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"));
	}

	@Test
	public void testMethod4() {
		IRequest request = new RequestI("POST", "/testMethod4Action");
		request.setParameter("Date", Arrays.asList("yyyy/MM/dd"));
	}

	@Test
	public void testMethod5() {
		IRequest request = new RequestI("GET", "/testMethod5Action");
		request.setParameter("Date", Arrays.asList("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"));
	}

	@Test
	public void testMethod6() {
		IRequest request = new RequestI("GET", "/testMethod6Action");
		request.setParameter("Date", Arrays.asList("yyyy-MM-dd"));
	}

	@Test
	public void testMethod7() {
		IRequest request = new RequestI("GET", "/testMethod7Action");
		request.setParameter("Date", null);
	}

	@Test
	public void testMethod8() {
		IRequest request = new RequestI("GET", "/testMethod8Action");
		request.setParameter("Date", Arrays.asList("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"));
	}

	@Test
	public void testMethod9() {
		IRequest request = new RequestI("GET", "/testMethod9Action");
		request