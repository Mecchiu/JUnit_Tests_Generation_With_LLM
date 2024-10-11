// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains one unit test case for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {

    /**
     * The test unit.
     */
    @Test
    void testIsValidDate() {
        // setup
        Date date = null;
        String format = null;
        
        // test
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        fail();
        
        /**
		        test case that parses the same but can't be found
         * If the test is passed, the caller is responsible for closing the parser
		     */
        date = sdf.parse("2014/05/01");
        fail();
    }
}
