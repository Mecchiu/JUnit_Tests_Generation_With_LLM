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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {

		@Test
		public void testEvaluateArguments() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(2, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
		}
		
		@Test
		public void testEvaluateArguments_2() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(2, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
		}
		
		@Test
		public void testEvaluateArguments_3() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_4() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_5() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam", "bim" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_6() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam", "bim", "bop" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_7() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam", "bim", "bop", "bap" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_8() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam", "bim", "bop", "bap", "bup" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNotNull(result.getThrowable());
				assertEquals("Test", result.getThrowable().getMessage());
				assertNotNull(result.getArguments());
				assertEquals(3, result.getArguments().length);
				assertEquals("foo", result.getArguments()[0]);
				assertEquals("bar", result.getArguments()[1]);
				assertEquals("baz", result.getArguments()[2]);
		}
		
		@Test
		public void testEvaluateArguments_9() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test"), "baz", "bam", "bim", "bop", "bap", "bup", "bip" };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(