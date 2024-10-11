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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatterTest {

		@Test
		public void testEvaluateArguments() {
				String messagePattern = "";
				Object[] arguments = null;
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNull(result);
				
				messagePattern = "";
				arguments = new Object[0];
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNull(result.getThrowable());
				
				messagePattern = "";
				arguments = new Object[] { "foo" };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNull(result.getThrowable());
				
				messagePattern = "";
				arguments = new Object[] { "foo", new Throwable() };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNotNull(result.getThrowable());
				
				messagePattern = "foo";
				arguments = null;
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNull(result);
				
				messagePattern = "foo";
				arguments = new Object[0];
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNull(result.getThrowable());
				
				messagePattern = "foo";
				arguments = new Object[] { "foo" };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getThrowable());
				
				messagePattern = "foo";
				arguments = new Object[] { "foo", new Throwable() };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNotNull(result.getThrowable());
				
				messagePattern = "{}";
				arguments = null;
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNull(result);
				
				messagePattern = "{}";
				arguments = new Object[0];
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNull(result.getThrowable());
				
				messagePattern = "{}";
				arguments = new Object[] { "foo" };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getThrowable());
				
				messagePattern = "{}";
				arguments = new Object[] { "foo", new Throwable() };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getThrowable());
				
				messagePattern = "{}";
				arguments = new Object[] { "foo", "bar" };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getThrowable());
				
				messagePattern = "{}";
				arguments = new Object[] { "foo", "bar", new Throwable() };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(1, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getThrowable());
				
				messagePattern = "{}{}";
				arguments = null;
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNull(result);
				
				messagePattern = "{}{}";
				arguments = new Object[0];
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
				assertNull(result.getThrowable());
				
				messagePattern = "{}{}";
				arguments = new Object[] { "foo" };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(2, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getArguments()[1]);
				assertNull(result.getThrowable());
				
				messagePattern = "{}{}";
				arguments = new Object[] { "foo", new Throwable() };
				result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getArguments());
				assertEquals(2, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertNull(result.getArguments()[1]);
			