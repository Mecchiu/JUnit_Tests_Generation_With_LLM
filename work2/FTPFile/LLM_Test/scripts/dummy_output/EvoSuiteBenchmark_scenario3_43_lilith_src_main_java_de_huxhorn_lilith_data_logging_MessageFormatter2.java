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
	void evaluateArguments_noPlaceholders() {
		String messagePattern = "This is a test.";
		Object[] arguments = new Object[] { "foo", "bar", "baz" };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
	}
	
	@Test
	void evaluateArguments_onePlaceholder() {
		String messagePattern = "This is a test: {}.";
		Object[] arguments = new Object[] { "foo", "bar", "baz" };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
	}
	
	@Test
	void evaluateArguments_twoPlaceholders() {
		String messagePattern = "This is a test: {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", "baz" };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
	}
	
	@Test
	void evaluateArguments_threePlaceholders() {
		String messagePattern = "This is a test: {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", "baz" };
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
	void evaluateArguments_fourPlaceholders() {
		String messagePattern = "This is a test: {}, {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", "baz" };
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
	void evaluateArguments_onePlaceholder_lastArgumentIsThrowable() {
		String messagePattern = "This is a test: {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
	}
	
	@Test
	void evaluateArguments_twoPlaceholders_lastArgumentIsThrowable() {
		String messagePattern = "This is a test: {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
	}
	
	@Test
	void evaluateArguments_threePlaceholders_lastArgumentIsThrowable() {
		String messagePattern = "This is a test: {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(3, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
		assertEquals("java.lang.Throwable: Test", result.getArguments()[2]);
	}
	
	@Test
	void evaluateArguments_fourPlaceholders_lastArgumentIsThrowable() {
		String messagePattern = "This is a test: {}, {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(3, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
		assertEquals("java.lang.Throwable: Test", result.getArguments()[2]);
	}
	
	@Test
	void evaluateArguments_threePlaceholders_lastArgumentIsThrowable_lastPlaceholderIsThrowable() {
		String messagePattern = "This is a test: {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(3, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
		assertEquals("java.lang.Throwable: Test", result.getArguments()[2]);
	}
	
	@Test
	void evaluateArguments_fourPlaceholders_lastArgumentIsThrowable_lastPlaceholderIsThrowable() {
		String messagePattern = "This is a test: {}, {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(3, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
		assertEquals("java.lang.Throwable: Test", result.getArguments()[2]);
	}
	
	@Test
	void evaluateArguments_threePlaceholders_lastArgumentIsThrowable_lastPlaceholderIsThrowable_throwableIsReturned() {
		String messagePattern = "This is a test: {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNotNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
	}
	
	@Test
	void evaluateArguments_fourPlaceholders_lastArgumentIsThrowable_lastPlaceholderIsThrowable_throwableIsReturned() {
		String messagePattern = "This is a test: {}, {}, {}, {}.";
		Object[] arguments = new Object[] { "foo", "bar", new Throwable("Test") };
		MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
		assertNotNull(result);
		assertNotNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("foo", result.getArguments()[0]);
		assertEquals("bar", result.getArguments()[1]);
	}
}