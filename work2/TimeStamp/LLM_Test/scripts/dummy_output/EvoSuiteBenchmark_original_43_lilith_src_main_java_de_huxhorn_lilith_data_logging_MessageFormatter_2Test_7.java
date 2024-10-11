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
		
		/**
		 * Test method for 
		 * {@link de.huxhorn.lilith.data.logging.MessageFormatter#evaluateArguments(String, Object[])}. 
		*/
		@Test
		public void testEvaluateArguments() {
	
			assertEquals("First argument should have a String as the first element in a message pattern that starts with 0! (String[])", "0", new String[0], "First argument of message pattern should have a String as the first element in a message pattern with the type String[] as the first element in the message pattern".getValue());
			assertEquals("Second argument should have a Throwable as the second element in a message pattern that must be an instance of Throwable!", null, new Throwable[]{new Throwable()}, "Second argument should have a Throwable as the second element in a message pattern that must be an instance of Throwable! (Throwable[])");

			Object[][] actualPattern = new Object[][]{
                    {"First argument should have a String as the first element in a message pattern that starts with 0! (String[])", 1}, // First argument start with 0
					{"Second argument should have a Throwable as the second element in a message pattern that must be an instance of Throwable!", new Throwable[]{new Throwable()}},
					{"Second argument should not be used after replacing it with the last placeholder! It should only be used if the original content is a Throwable!", null}		
			};
			ArgumentResult actualArgs = MessageFormatter.evaluateArguments(new String[]{"First argument should have a String as the first element in a message pattern that starts with 0! (String[])", 1},{"Second argument should have a Throwable as the second element in a message pattern that must be an instance of Throwable!", new Throwable[]{new Throwable()}}, actualPattern);
			assertArrayEquals(actualPattern, actualArgs.getValues(), new String[]{});
			Set set = new HashSet(Arrays.asList(actualArgs.getThrowablesOrValues()));
			assertEquals(set.size(), 1);
			assertTrue(set.contains(actualArgs.getThrowable()));
		}
}