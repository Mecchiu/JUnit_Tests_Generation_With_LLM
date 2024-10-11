// MessageFormatter_0Test.java
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
* It contains one unit test case for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_0Test {
		// String format (String[] arguments)...
		@Test
		public void test() {
	    	Set<String> messagePatternSet = new HashSet<>();
	    	messagePatternSet.add("foo{}bar{{}baz");
	    	String messagePattern =
	    		"Test {1} {2}";
	    	// Convert argument array to argumentString, so the first level of the string should be used again.
	    	String[] arguments =
	    		{ "foo{1}",
	    		 "bar{2}",
	    		 "baz" };
			String formattedMessage =
	    		MessageFormatter.format(
				  messagePattern,
				  arguments);
			assertEquals("Replace first placeholders in the " + "messagePattern" + " with args.",
				 messagePatternSet.toString(),
				 formattedMessage);
		}
}

// Class for counting times how many parameters are given in a method.
// Note that the parameters must be converted to String[] (see MessageFormatter_0Test.test above).
class ParameterCount {
	int count;

	ParameterCount() {
	  int i = MessageFormatter_0Test.count;
		while (i-- > 0);
	}

}

class ParameterCountTest {

    @Test
    public void count() {
        ParameterCount result = new ParameterCount();
        ParameterCount.count++;
        assertEquals(result.count, 1);
    }

}