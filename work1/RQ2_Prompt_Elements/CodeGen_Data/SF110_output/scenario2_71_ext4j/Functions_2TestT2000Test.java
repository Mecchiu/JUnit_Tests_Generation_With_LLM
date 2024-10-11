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

	@Test
	public void testdateToMilliseconds() {
		
		// set date_time param
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 3);
		cal.set(Calendar.YEAR, 2014);
//		Date tmpDateTime = cal.getTime();
		Date tmpDateTime = new Date();
		tmpDateTime = new Date(dateToMilliseconds(tmpDateTime) * 1000l);
		cal.setTime(tmpDateTime);
		
		// set date
	cal.set(1, 18, 18, 12, 12, 12);
	Date date = cal.getTime();
	
	assertEquals(2000, dateToMilliseconds(date));
	
	
	}
	

    @Test
    public void testdateToMilliseconds2() throws Exception {
        // Set date
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DATE, 13);
        cal.set(Calendar.YEAR, 2014);
        Date tmpDateTime = cal.getTime();
        
        int milliseconds = dateToMilliseconds(tmpDateTime) * 10 ;
        
        cal.setTime(tmpDateTime);

        assertEquals(1970, calculateDayNumberToMillisecond(cal.getTime()));

        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DATE, 20);

        cal.set(Calendar.YEAR, 2014);

//        Calendar c = Calendar.getInstance();
//        c.setTime(timeStamp);
//        
//        Date date = c.getTime();
//        int day =  calendarToDayNumber(calendarToDateTime(date));
//        calendarToDateTime(calendarToDate(date));
//        
//        calendarToDayNumber(calendarToDateTime(date));
        
        
        cal.setTime(tmpDateTime);
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 12);
        cal.set(Calendar.SECOND, 12);
        cal.set(Calendar.MILLISECOND, 12);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        cal.set(Calendar.WEEK_OF_MONTH, 6);
        cal.set(Calendar.MONTH, 12);
        System.out.println(cal);

        int d;
        d = dateToDayNumber("2000-12-30 12");

        cal.set(Calendar.DAY_OF_MONTH, d);
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 12);
        cal.set(Calendar.SECOND, 7);
        cal.set(Calendar.MILLISECOND, 158600000L);

        cal.set(Calendar.DATE, 12);
        
        assertEquals(d, calculateDayNumberToMillisecond(cal.getTime()));
        
    
		Date date1 = new SimpleDateFormat("HH:mm:ss:SSS").parse("02:06:11:14");
        Calendar date2 = new SimpleDateFormat("HH:mm:ss:SSS").parse("05:06:11:14");
		System.out.println(dateToString(date1));
		System.out.println(dateToString(date2));
		
*/

        }

	
		

	
	

}
