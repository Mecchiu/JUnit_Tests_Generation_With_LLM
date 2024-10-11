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
		/*
		 * Constructor with a few arguments. We are just testing with it.
		 */
	public Functions_0Test() {
	}		
		
	//Methods and constructors -----------------------------------------------------
	/**
     * Tests the method {@link Functions#fixTimeZoneOnDateFormat(Date, String)}
     * @param pDate the date to be fixed
     * @param pFormat a string that contains a date format
     * @return the fixed date
     */
    public static String fixTimeZoneOffDateFormat(Date pDate, String pFormat) {
        return fixTimeZoneOnDateFormat(parseDateToDate(pDate), pFormat);
    }
    
	/**
     * Tests the method {@link Functions#fixTimeZoneOnDateFormat(long, String)}
     * @param pDate the date to be fixed
     * @param pFormat a string that contains a date format
     * @return the fixed date
     */
    public static long fixTimeZoneOffDateFormat(long pDate, String pFormat) {
        return fixTimeZoneOnDateFormat(new Date(round(pDate)), pFormat);
    }
    
	/**
     * Test the constructor with a String and a Number 
     */
    @Test
	public void testConstructor_2_6(String pDate, int pTime) {
        //Fixer for the test is in the method "fixTimeZoneOffDateFormat" but not "fixTimeZoneOnDateFormat"
        assertEquals("testConstructor_2_6_1",pDate,fixTimeZoneOffDateFormat("12:02", "yyyy/MM/dd"));
        //We are not using the string to convert with a Number as this will not work with JDK9
//        assertEquals("testConstructor_2_6_2", pDate,fixTimeZoneOffDateFormat(pTime, "yyyy/MM/dd"));
//        //Test using JDK9 (which needs "Date" to be convert to a String)
//        assertEquals("testConstructor_2_6_2_0", pDate,fixTimeZoneOffDateFormat(new Date( round(pTime) ), "yyyy/MM/dd"));
	}
	
	public static long parseDateToDate(Date pDate) {
		//The second parameter should be a year
		Calendar cal = Calendar.getInstance();
}
}