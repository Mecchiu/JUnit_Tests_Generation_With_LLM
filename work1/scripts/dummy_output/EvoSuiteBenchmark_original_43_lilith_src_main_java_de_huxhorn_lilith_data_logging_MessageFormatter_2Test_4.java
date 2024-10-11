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
* It contains one unit test case for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {
		String messagePattern;
		Object[] arguments;
		String expected;
	
	/**
	 * Test method for {@link de.huxhorn.lilith.data.logging.MessageFormatter#evaluateArguments(String, Object[])}.
	 */
	@Test
	void resolveArguments() {
		
		Map<String,Object> actual = MessageFormatter.evaluateArguments(messagePattern, arguments);
		Set<Object> expectedActual = new HashSet<>();
		expectedActual.add(actual.get("A"));
		expectedActual.add(actual.get("B"));
		expectedActual.add(actual.get("c"));

		assertEquals(expected, actual);
		assertEquals(new HashSet<>(Arrays.asList("1", "2", "3")), expectedActual);
	}

	/**
	 * Test method for {@link de.huxhorn.lilith.data.logging.MessageFormatter#evaluateArguments(String, Object[])}.
	 */
	@Test
	void resolveArgumentsFail() {
		
		when(messagePattern.matches("[A-Z]")).thenThrow(IllegalArgumentException.class);
		
		assertThrows(IllegalArgumentException.class, () -> MessageFormatter.evaluateArguments(messagePattern, arguments));
	}

	/**
	 * Test method for {@link de.huxhorn.lilith.data.logging.MessageFormatter#evaluateArguments(String, Object[])}.
	 */
	@Test
	void resolveArgumentsNull() {
		
		when(messagePattern.matches("[A-Z0-9]")).thenReturn(true); // should return a null object
		
		String result = MessageFormatter.evaluateArguments("test", null);
		
		assertNull(result);
	}

	/**
	 * Test method for {@link de.huxhorn.lilith.data.logging.MessageFormatter#evaluateArguments(String, Object[])}.
	 */
	@Test
	void resolveArgumentsNullArguments() {
		when(messagePattern.matches("[A-Z0-9]")).thenReturn(true);
		when(messagePattern.matches("([c-p])")).thenReturn(true);
		when(messagePattern.matches("([fgh]]")).thenReturn(true);
		when(messagePattern.matches("([g-m])")).thenReturn(true);
		when(messagePattern.matches("([c-p]|([f-g]|[g-m]))")).thenReturn(false);
		
		when(messagePattern.matches("(\\w+)[-])")).thenReturn(false); // TODO check this too.
		
		Map<String,Object> actual = MessageFormatter.evaluateArguments(messagePattern, null);
		Set<Object> expectedActual = new HashSet<>();
		
		assertNotNull(actual);
		
		expectedActual.add((String)actual.get("A"));
		expectedActual.add((String)actual.get("B"));
		expectedActual.add((String)actual.get("c"));
		expectedActual.add((String)actual.get("fh"));
		expectedActual.add((String)actual.get("fgh"));
		expectedActual.add((String)actual.get("g-m"));
		expectedActual.add((String)actual.get("c-p"));
		expectedActual.add((String)actual.get("f-g"));

		// TODO add test code here

		String pattern = null;
		Object[] arguments = null;
		
		assertEquals(expectedActual, new HashSet<>(Arrays.asList(
				new Object[] { "1", "A", "2", "3" },
				new Object[] { "4", "B", "c", "3" },
				new Object[] { "3", "c", "fh", "g-m" }
		)));
		
		expectedActual.add(actual.get("c")); // TODO use actual
		expectedActual.add(actual.get("fh"));
		expectedActual.add(actual.get("fgh"));
		expectedActual.add(actual.get("g-m"));
		expectedActual.add(actual.get("c-p"));
		expectedActual.add(actual.get("f-g"));
		expectedActual.add(actual.get("D"));

		pattern = messagePattern;
		arguments = (Object[])arguments;
		
		String expectedResult = actual.get("D") + "{ 'actual': " + actual + ", 'expected': " + expectedActual + "}" ;

		assertEquals(expectedResult, MessageFormatter.evaluateArguments(pattern, arguments));
	}

	/**
	 * Example of testing.
	 */
	public static Object[] arguments = new Object[10];

	}