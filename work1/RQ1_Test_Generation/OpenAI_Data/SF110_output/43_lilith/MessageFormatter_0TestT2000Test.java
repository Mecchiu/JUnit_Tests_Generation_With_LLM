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
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_0Test {

		@Test
		public void testFormat_0() {
				String messagePattern = "";
				String[] arguments = new String[] {};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_1() {
				String messagePattern = "";
				String[] arguments = new String[] {"a"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_2() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_3() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_4() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_5() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d", "e"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_6() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d", "e", "f"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_7() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d", "e", "f", "g"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_8() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
		@Test
		public void testFormat_9() {
				String messagePattern = "";
				String[] arguments = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("", result);
		}
		
}

// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_1Test {
		
		@Test
		public void testFormat_0() {
				String messagePattern = "a";
				String[] arguments = new String[] {};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_1() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_2() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_3() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_4() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_5() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e", "f"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_6() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e", "f", "g"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_7() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e", "f", "g", "h"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_8() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e", "f", "g", "h", "i"};
				String result = MessageFormatter.format(messagePattern, arguments);
				assertEquals("a", result);
		}
		
		@Test
		public void testFormat_9() {
				String messagePattern = "a";
				String[] arguments = new String[] {"b", "c", "d", "e", "f", "g", "h", "i", "j"};
				String result = MessageFormatter.format(messagePattern