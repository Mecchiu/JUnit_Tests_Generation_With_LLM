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
		 * Tests if the message pattern contains only one placeholders, i.e. countArgumentPlaceholders() returns not'more than one'.
		 */
@Test
	public void testMessageFormatter_1(){

		//given
		String pattern = "message pattern";
		Collection<String> args = new HashSet<>();
		
		//when
		boolean result = MessageFormatter.countArgumentPlaceholders(pattern) == 0;
		
		//then
		assertFalse(result);
	}
}