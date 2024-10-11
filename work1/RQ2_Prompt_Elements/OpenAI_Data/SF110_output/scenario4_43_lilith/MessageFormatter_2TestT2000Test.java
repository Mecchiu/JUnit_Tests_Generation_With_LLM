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
		public void testEvaluateArguments_1() {
				String messagePattern = "";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_2() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_3() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_4() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_5() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_6() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_7() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_8() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_9() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_10() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception(), new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_3Test {
		
		@Test
		public void testEvaluateArguments_1() {
				String messagePattern = "";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_2() {
				String messagePattern = "";
				Object[] arguments = new Object[] { new Exception() };
				MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertNotNull(result);
				assertNull(result.getThrowable());
				assertNotNull(result.getArguments());
				assertEquals(0, result.getArguments().length);
		}
		
		@Test
		public void testEvaluateArguments_3() {
				String messagePattern