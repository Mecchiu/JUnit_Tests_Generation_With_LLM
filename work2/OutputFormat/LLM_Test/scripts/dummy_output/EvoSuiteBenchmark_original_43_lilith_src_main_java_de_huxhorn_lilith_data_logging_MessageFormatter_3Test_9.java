// MessageFormatter_3Test.java
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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		

	/**
	 * This method creates a new instance of the class {@link MessageFormatter} and is
	 * called once before all test cases of the {@link MessageFormatter} class.
	 */
	@Test
	void testCtor() {
		
		MessageFormatter formatter = new MessageFormatter();
		formatter.setDebugEnabled(false);

		formatter.debug(new String[] {"", "", "", "", "", ""});
		
		assertEquals("MessageFormatter.identityToString(obj) does not return the identity string!", identToString(new Object()), identToString(formatter.toString(new Object())));
		
		formatter.debug(new String[] {"hello", "", "", "", "", ""});
		assertEquals("", identToString(new Object()));
		
		Set<String> set = new HashSet<>(Arrays.asList("hello", "", "", "", "", ""));

		String result = formatter.identityToString(set);

		assertTrue("MessageFormatter.identityToString(obj) does not return a set with all elements!", result.toLowerCase().equals("hello hello hello hello"));

		formatter.debug(new String[] {"", "", "", "", "hello", "[]"});
		assertEquals("", result);
	}
}