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
	public void testEvaluateArguments_null() {
		ArgumentResult result = MessageFormatter.evaluateArguments("", null);
		assertNull(result);
	}
	
	@Test
	public void testEvaluateArguments_empty() {
		ArgumentResult result = MessageFormatter.evaluateArguments("", new Object[0]);
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
		assertNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_noPlaceholders() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello World!", new Object[0]);
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
		assertNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable() });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable() });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!" });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable(), "!", new Throwable() });
		assertNotNull(result);
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertNotNull(result.getThrowable());
	}
	
	@Test
	public void testEvaluateArguments_onePlaceholder_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[] { "World", "!", new Throwable(), "!", new Throw