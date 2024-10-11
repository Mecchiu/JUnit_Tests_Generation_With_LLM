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
* It contains ten unit test cases for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {

		@Test
		public void testCountArgumentPlaceholders_1() {
				String messagePattern = "";
				int expected = 0;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_2() {
				String messagePattern = "This is a test.";
				int expected = 0;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_3() {
				String messagePattern = "This is a test. {}";
				int expected = 1;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_4() {
				String messagePattern = "This is a test. {}{}";
				int expected = 2;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_5() {
				String messagePattern = "This is a test. {}{}{}";
				int expected = 3;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_6() {
				String messagePattern = "This is a test. {}{}{}{}";
				int expected = 4;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_7() {
				String messagePattern = "This is a test. {}{}{}{}{}";
				int expected = 5;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_8() {
				String messagePattern = "This is a test. {}{}{}{}{}{}";
				int expected = 6;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_9() {
				String messagePattern = "This is a test. {}{}{}{}{}{}{}";
				int expected = 7;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testCountArgumentPlaceholders_10() {
				String messagePattern = "This is a test. {}{}{}{}{}{}{}{}";
				int expected = 8;
				int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
				assertEquals(expected, actual);
		}
}

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
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_2() {
				String messagePattern = "This is a test.";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_3() {
				String messagePattern = "This is a test. {}";
				Object[] arguments = new Object[] {};
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] {}, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_4() {
				String messagePattern = "This is a test. {}";
				Object[] arguments = new Object[] { "test" };
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] { "test" }, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_5() {
				String messagePattern = "This is a test. {}";
				Object[] arguments = new Object[] { "test", "test2" };
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] { "test" }, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_6() {
				String messagePattern = "This is a test. {}";
				Object[] arguments = new Object[] { "test", "test2", "test3" };
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] { "test" }, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
				assertEquals(expected, actual);
		}
		
		@Test
		public void testEvaluateArguments_7() {
				String messagePattern = "This is a test. {}";
				Object[] arguments = new Object[] { "test", "test2", "test3", "test4" };
				MessageFormatter.ArgumentResult expected = new MessageFormatter.ArgumentResult(new String[] { "test" }, null);
				MessageFormatter.ArgumentResult actual = MessageFormatter.evaluateArguments(messagePattern