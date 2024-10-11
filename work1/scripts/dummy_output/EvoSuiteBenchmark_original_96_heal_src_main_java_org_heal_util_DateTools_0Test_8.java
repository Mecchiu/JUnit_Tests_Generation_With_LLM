// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {
		
    /**
     * Tests the method {@link DateTools#format(Date)} properly.
     */	
    @Test
    public void testFormat() {
        assertEquals("A date in January 2006 can be parsed correctly using a variety of formats", 'a', DateTools.format("January 2006"));
        assertEquals("A date in January 2001 can be parsed correctly using a variety of formats", 'A', DateTools.format("January 2001"));
        assertEquals("A date in January 1997 can be parsed correctly using a variety of formats", 'a', DateTools.format("january 2001"));
        assertEquals("A date in February can be parsed correctly using a variety of formats", 'A', DateTools.format("February 2001"));
        assertEquals("A date in February 2000 can be parsed correctly using a variety of formats", 'a', DateTools.format("February 2000"));
        assertEquals("A date in March can be parsed correctly using a variety of formats", 'A', DateTools.format("March 2001"));
        assertEquals("A date in July can be parsed correctly using a variety of formats", 'A', 
            DateTools.format("July 2001"));
        assertEquals("A date in October can be parsed correctly using a variety of formats", 'A', 
            DateTools.format("October 2001"));
        assertEquals("A date in August can be parsed correctly using a variety of formats", 'A', 
            DateTools.format("August 2001"));
        assertEquals("E years can be parsed correctly using a variety of format", 'E', 
            DateTools.format("2006-07-12"));
    }
    
    /**
     * Tests the method {@link DateTools#parse(String,String)} properly.
     */	
    @Test
    public void testParse() {
        assertEquals("A date in January 2006 can be parsed correctly using a variety of formats", 'a', DateTools.parse("month 12. January 2006"));
        System.out.println("DateTools.parse: testParse");
    }    
						
}