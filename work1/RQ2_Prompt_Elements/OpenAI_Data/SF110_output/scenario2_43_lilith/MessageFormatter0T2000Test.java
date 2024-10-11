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
	void testFormat() {
		String messagePattern = "This is a test message with placeholders: {}, {}, {}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, arg3", result);
	}
	
	@Test
	void testFormat_nullMessagePattern() {
		String messagePattern = null;
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertNull(result);
	}
	
	@Test
	void testFormat_nullArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, {}";
		String[] arguments = null;
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
	}
	
	@Test
	void testFormat_emptyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, {}";
		String[] arguments = new String[0];
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals(messagePattern, result);
	}
	
	@Test
	void testFormat_tooManyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, {}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3", "arg4" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, arg3", result);
	}
	
	@Test
	void testFormat_tooFewArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, {}";
		String[] arguments = new String[] { "arg1", "arg2" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, {}", result);
	}
	
	@Test
	void testFormat_escapedPlaceholder() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, {}", result);
	}
	
	@Test
	void testFormat_escapedPlaceholder_tooManyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3", "arg4" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, {}", result);
	}
	
	@Test
	void testFormat_escapedPlaceholder_tooFewArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\{}";
		String[] arguments = new String[] { "arg1", "arg2" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, {}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_tooManyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3", "arg4" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_tooFewArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\{}";
		String[] arguments = new String[] { "arg1", "arg2" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedPlaceholder() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedPlaceholder_tooManyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3", "arg4" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedPlaceholder_tooFewArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\{}";
		String[] arguments = new String[] { "arg1", "arg2" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedEscapeChar() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\\\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedEscapeChar_tooManyArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\\\{}";
		String[] arguments = new String[] { "arg1", "arg2", "arg3", "arg4" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("This is a test message with placeholders: arg1, arg2, \\\\{}", result);
	}
	
	@Test
	void testFormat_escapedEscapeChar_escapedEscapeChar_tooFewArguments() {
		String messagePattern = "This is a test message with placeholders: {}, {}, \\\\\\\\{}";
		String[] arguments = new String[] { "arg1", "