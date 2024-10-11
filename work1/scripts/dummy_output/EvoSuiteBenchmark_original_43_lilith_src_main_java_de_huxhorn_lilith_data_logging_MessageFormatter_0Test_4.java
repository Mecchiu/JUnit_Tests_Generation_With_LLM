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
		/**
		 * Test case for {@link MessageFormatter#format(String, String[], Set, Set)}.
		 */
		@Test
        void testMessageFormatterWithSet(){
				assertEquals("message", 1, MessageFormatter.format(
				         "%s %s",
				         "First",
				         new HashSet<>(Arrays.asList("First", "Second"))));
        }
}