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
		String messagePattern = "Hello {}!";
		String[] arguments = new String[] { "World" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World!", result);
	}
	
	@Test
	void testFormat_null() {
		String messagePattern = "Hello {}!";
		String[] arguments = null;
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello {}!", result);
	}
	
	@Test
	void testFormat_empty() {
		String messagePattern = "Hello {}!";
		String[] arguments = new String[0];
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello {}!", result);
	}
	
	@Test
	void testFormat_nullMessagePattern() {
		String messagePattern = null;
		String[] arguments = new String[] { "World" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("null", result);
	}
	
	@Test
	void testFormat_emptyMessagePattern() {
		String messagePattern = "";
		String[] arguments = new String[] { "World" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("", result);
	}
	
	@Test
	void testFormat_nullArgument() {
		String messagePattern = "Hello {}!";
		String[] arguments = new String[] { null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello null!", result);
	}
	
	@Test
	void testFormat_emptyArgument() {
		String messagePattern = "Hello {}!";
		String[] arguments = new String[] { "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello !", result);
	}
	
	@Test
	void testFormat_multipleArguments() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "How are you?" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! How are you?", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooMany() {
		String messagePattern = "Hello {}!";
		String[] arguments = new String[] { "World", "How are you?" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World!", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! {}", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! ", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_empty_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "", null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! ", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_empty_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, "", null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_null_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, null, "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_empty_null_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "", null, null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! ", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_empty_empty_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "", "", null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! ", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_empty_null_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", "", null, "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! ", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_empty_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, "", "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_empty_empty_null() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, "", "", null };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_empty_null_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, "", null, "" };
		String result = MessageFormatter.format(messagePattern, arguments);
		assertEquals("Hello World! null", result);
	}
	
	@Test
	void testFormat_multipleArguments_tooFew_null_null_empty_empty() {
		String messagePattern = "Hello {}! {}";
		String[] arguments = new String[] { "World", null, null, "", "" };
