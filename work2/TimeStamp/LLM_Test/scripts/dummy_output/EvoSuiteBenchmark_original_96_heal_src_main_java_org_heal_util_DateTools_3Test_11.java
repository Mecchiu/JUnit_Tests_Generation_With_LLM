// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {
		
    private final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * This is a simple test case for the
     * {@link DateTools#parse(String, String)} method.
     */
    @Test
    public void testParse() {
    	System.out.println("DateTools_3Test.testParse method");
    	
    	String dateString = "14-Aug-2013";
    	Date resultDate = parse(DEFAULT_DATE_FORMAT.parse(dateString));
    	
		System.out.println("testParse result = " + resultDate);
    	assertEquals("Date should be a year in the past", 
            		DEFAULT_DATE_FORMAT.parse(dateString), 
            		new Date().setTime( resultDate.getTime() ));

    	System.out.println("testParse a dateString of format "+ LONG_DATE_FORMAT);
    	dateString = "yyyy-MM-dd";
    	resultDate = parse(DEFAULT_DATE_FORMAT.parse(dateString));
    	System.out.printf("testParse a resultDate of format %s %s\t return date %s\n",
    			LONG_DATE_FORMAT,
    			DEFAULT_DATE_FORMAT,
    			resultDate);
    	assertEquals("Date should be a long year in the past",
    			DEFAULT_DATE_FORMAT.parse(dateString), 
    			new Date().setTime( resultDate.getTime() ));

    	System.out.println("testParse a dateString of format "+ DEFAULT_DATE_FORMAT);
    	dateString = "yyyy-MM-dd";
    	resultDate = parse(DEFAULT_DATE_FORMAT.parse(dateString));
    	System.out.printf("testParse a resultDate of format %s %s\t return date %s\n",
    			DEFAULT_DATE_FORMAT,
    			DEFAULT_DATE_FORMAT,
    			resultDate);
    	assertEquals("Date should be a long year in the past.",
    			DEFAULT_DATE_FORMAT,
    			resultDate);

    }
    
    /**
     * This is a simple test case for the
     * {@link DateTools#parse(String, String)} method containing
     * more than one pattern.  These patterns will only be recognized
     * with the {@link SimpleDateFormat} class, not
     * with any other {@link SimpleDateFormat}.  
     *   
     */
    @Test
    public void testParsePossiblily() throws ParseException{
    	System.out.println("Test parsing options like a year of one date string, " +
    		        "one month string, one day of month string, one day of week " +
    		        "of the date string, one day of month of the date string, ");
    	
		String[] datePatternStringList = {"yyyy-MM-dd", "yyyy", "MM", "dd", "d"};

}
}