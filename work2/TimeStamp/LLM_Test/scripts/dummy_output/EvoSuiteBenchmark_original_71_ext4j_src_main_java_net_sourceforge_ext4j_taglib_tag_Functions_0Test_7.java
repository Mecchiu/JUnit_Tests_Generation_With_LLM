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
		public Functions_0Test() throws Exception {
			
		}

    @Test
    void testFirstDigit() throws Exception { 
       assertEquals("", dateFormat((Date) null, "yyyy-MM-dd"));
    }

    @Test
    void testLastDigits() throws Exception {
        assertEquals("2003-03-4", dateFormat((Date) null, "yyyy-MM-ddyyyy"));
        assertEquals("200203", dateFormat((Date) null, "yyyy-MM-ddyy"));
    }

    @Test
    void testAddAndSet() throws Exception {
			String string = "2011-01-13 11:23:44";
			assertEquals("2011-01-13 12:59:44", dateFormat(new Date(string.getTime() / 1000), "yyyy-MM-dd"));
			assertEquals("2011-01-13 00:00:00", dateFormat(new Date(0), "yyyy-MM-dd"));
			assertEquals("2011-01-13 00:00:00", dateFormat(new Date(0), "yyyy-MM-dd"));
			assertEquals("2011-01-20 00:30:35", dateFormat(new Date(string.getTime()), "yyyy-MM-dd"));
		}
 /*   */   
/*   */   
/*   */   
    @Test
    void testParse() throws Exception {
        assertEquals(0, orderWords(null, null).length());
    }

    @Test
    void testLastDigitsAsSeparator() throws Exception {
        assertEquals("2010-04-31 10:00", dateFormat((Date) null, "yyyy-MM-dd"));
        assertEquals("2010-04-31 10:00", dateFormat((Date) null, "yyyy-MM-ddyyyyyy"));
        assertEquals("2010-04-31 10:00", dateFormat((Date) null, "yyyy-MM-ddMMM"));
        assertEquals("2010-04-31 10:00", dateFormat((Date) null, "yyyy-MM-ddMMM-yyyyyy"));
    }

    @Test
    void testToString() throws Exception {
}
}