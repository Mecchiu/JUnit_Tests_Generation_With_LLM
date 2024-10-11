// MessageFormatterTest.java
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
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatterTest {

	@Test
	public void testFormat() {
		String messagePattern = "";
		String[] arguments = new String[] {};
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "";
		arguments = new String[] {"a"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"};
		result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
		
		messagePattern = "abc";
		arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"};
		result