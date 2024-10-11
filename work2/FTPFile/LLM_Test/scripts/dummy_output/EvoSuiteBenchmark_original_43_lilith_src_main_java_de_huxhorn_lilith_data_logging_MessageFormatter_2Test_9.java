// MessageFormatter_2Test.java
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
* It contains one unit test case for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {
		
    @Test
    public void test_two_placeholders() {
    	String s = "hello, \"%arg1%\" %arg2%";
        Logger logger = new ConsoleLogger(true);
		MessageFormatter formatter = new MessageFormatter(Arrays.asList("%arg1%", "%arg2%"));
		logger.debug(formatter.apply(s));
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals("0a07e7a6", simpleFormat.format(new Date()));
    }

}