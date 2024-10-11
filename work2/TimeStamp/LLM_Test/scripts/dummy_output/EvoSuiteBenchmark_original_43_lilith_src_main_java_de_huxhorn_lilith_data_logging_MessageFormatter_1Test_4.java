// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains one unit test case for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {
		
    /**
     * Test method for {@link de.huxhorn.lilith.data.logging.MessageFormatter#MessageFormatter()}.
     */
    @Test
    public void testMessageFormatter_1() {
                        
		String[] arguments = {
                "Date=2013 1 1 10:15,12",
                "Date=2013 Apr 1 11 15:35,14",
		};
		
		String result = MessageFormatter.format(arguments, null);                 
		
		assertEquals(new SimpleDateFormat("<2013-01-01T00:15:00-13:00>").format(new Date()), result);
              
	}             
       

}