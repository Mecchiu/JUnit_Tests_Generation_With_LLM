// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {
    
  @Test
    public void testFormat() {
        assertNotNull(format(null));
        try {
                format(new Date(), "yyyy-MM-dd");
                fail("Exception expected");
        } catch (IllegalArgumentException ignored) {            
            
        }
        try {
            format(null, "yyyy-MM-dd");
            fail("Exception expected");
        } catch (IllegalArgumentException ignored) {            
            
        }
        try {
            format(new Date(), "yyyy-MM-dd", "yyyy");
            fail("Exception expected");
        } catch (ParseException ignorable) {

        }
        
    }
  @Test
    public void testParse() throws ParseException {
        
        date = new Date();
        assertEquals(date.parse("0000-01-05"), new Date(date.getTime()));
        
        // Make sure this does something sensible...
        try {
         date = new Date(0);
        } catch (IllegalArgumentException e) {
            
        }
        
    }
}

class DateTools_1 {
		
  @Test
    public void testIsValidDate() {
		    
		assertTrue("Should return true when date format is valid.", format(new Date())!=null);
		assertTrue("Should return true when date format is valid.", parse("0000-01-05")!=null);
		assertTrue("Should return true when date format is valid.", parse("yyyy-MM-dd")!=null);
		
	}
	
  @Test
    public void testIsValidDateWithNoFormat() {
		    
		assertTrue("Should return true when no date format is set.", parse("")!=null);
		assertTrue("Should return true when no date format is set.", parse("yyyy-MM-dd")!=null);
		assertTrue("Should return true when no date format is set.", parse("yyyy")!=null);
		
	}
	
	
		
	
	public Date date;
		
}





