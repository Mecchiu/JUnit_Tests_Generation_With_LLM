// Functions_2Test.java
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
* It contains one unit test case for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class Functions_2Test {
		
	private String toTens(int pInt) {
		return pInt + "TENS";
	}
	
	private String getBlurb(String pString, int pMaxLength) {
		java.util.Formatter tf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return tf.format(new Date(System.currentTimeMillis())) + EOL_LINUX + BLURB_SUFFIX + EOL_MAC_LEGACY + BLURB_SUFFIX;
	}
	
	@Test
    public void testCalendarFormat() throws Exception {
    	
		String s = "2016/11/16 23:59:00";
		int year = Integer.valueOf(s);
		assertEquals(year, Functions.dateToMilliseconds(s).get(Calendar.YEAR));
		assertEquals("June 23, 2016", Functions.dateToHtml(s).toString());
    
    		
		String sLastMonth = "2016/08/16 23:59:00";
		int lastMonth = Integer.valueOf(sLastMonth);
		assertEquals(lastMonth, Functions.dateToMilliseconds(sLastMonth).get(Calendar.MONTH));
        
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.YEAR, year);
    	calendar.set(Calendar.MONTH, lastMonth);
    	calendar.set(Calendar.DAY_OF_MONTH, 23);
    	calendar.add(Calendar.DATE, 1);
        
    	String sFirstDay = Functions.dateToHtml(calendar.getTime());
    	
    	String sMonth = Functions.dateToHtml(sLastMonth);
    	String sDays = Functions.dateToHtml(calendar.getTime());
        
    	assertEquals(sMonth + " - Last Month", Functions.dateToHtml(sLastMonth).toString());
        
    	assertEquals(sMonth + " - Last Day", Functions.dateToHtml(calendar.getTime()).toString());
    }
	
	@Test
    public void testNumber() throws Exception {
    	
		String s = "01 1234";
}
}