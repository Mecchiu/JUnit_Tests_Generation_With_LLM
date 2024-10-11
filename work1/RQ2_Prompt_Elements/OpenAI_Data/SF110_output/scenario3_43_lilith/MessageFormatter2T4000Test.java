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

// MessageFormatter.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Replacement for org.slf4j.helpers.MessageFormatter.</p>
 * <p>
 * In contrast to the mentioned class, the formatting of message pattern and arguments into the actual message
 * is split into three parts:
 * </p>
 * <ol>
 * <li>Counting of placeholders in the message pattern (cheap)</li>
 * <li>Conversion of argument array into an ArgumentResult, containing the arguments converted to String as well as
 * an optional Throwable if available (relatively cheap)</li>
 * <li>Replacement of placeholders in a message pattern with arguments given as String[]. (most expensive)</li>
 * </ol>
 * <p>
 * That way only the first two steps have to be done during event creation while the most expensive part, i.e. the
 * actual construction of the message, is only done on demand.
 * </p>
 */
public class MessageFormatter {

    /**
     * <p>This method returns a MessageFormatter.ArgumentResult which contains the arguments converted to String
     * as well as an optional Throwable.</p>
     * <p/>
     * <p>If the last argument is a Throwable and is NOT used up by a placeholder in the message pattern it is returned
     * in MessageFormatter.ArgumentResult.getThrowable() and won't be contained in the created String[].<br/>
     * If it is used up getThrowable will return null even if the last argument was a Throwable!</p>
     *
     * @param messagePattern the message pattern that to be checked for placeholders.
     * @param arguments the argument array to be converted.
     * @return a MessageFormatter.ArgumentResult containing the converted arformatted message and optionally a Throwable.
     */
    public static ArgumentResult evaluateArguments(String messagePattern, Object[] arguments) {
        if (messagePattern == null) {
            return new ArgumentResult(null, null);
        }
        if (arguments == null) {
            return new ArgumentResult(null, null);
        }
        int argumentCount = arguments.length;
        int placeholderCount = countPlaceholders(messagePattern);
        if (argumentCount == placeholderCount) {
            return new ArgumentResult(null, convertArguments(arguments));
        }
        if (argumentCount > placeholderCount) {
            Object lastArgument = arguments[argumentCount - 1];
            if (lastArgument instanceof Throwable) {
                if (argumentCount == placeholderCount + 1) {
                    return new ArgumentResult((Throwable) lastArgument, convertArguments(arguments, 0, argumentCount - 1));
                }
                if (argumentCount == placeholderCount + 2) {
                    Object secondLastArgument = arguments[argumentCount - 2];
                    if (secondLastArgument instanceof Throwable) {
                        return new ArgumentResult((Throwable) secondLastArgument, convertArguments(arguments, 0, argumentCount - 2));
                    }
                }
            }
        }
        return new ArgumentResult(null, convertArguments(arguments));
    }

    private static String[] convertArguments(Object[] arguments) {
        return convertArguments(arguments, 0, arguments.length);
    }

    private static String[] convertArguments(Object[] arguments, int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = convertArgument(arguments[i]);
        }
        return result;
    }

    private static String convertArgument(Object argument) {
        if (argument == null) {
            return "null";
        }
        if (argument instanceof String) {
            return (String) argument;
        }
        if (argument instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format((Date) argument);
        }
        if (argument instanceof Collection) {
            return convertCollection((Collection) argument);
        }
        if (argument instanceof Map) {
            return convertMap((Map) argument);
        }
        if (argument instanceof Object[]) {
            return convertArray((Object[]) argument);
        }
        return argument.toString();
    }

    private static String convertArray(Object[] argument) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < argument.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(convertArgument(argument[i]));
        }
        result.append("]");
        return result.toString();
    }

    private static String convertMap(Map argument) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        Set<Map.Entry> entries = new HashSet<Map.Entry>(argument.entrySet());
        for (Map.Entry entry : entries) {
            if (result.length() > 1) {
                result.append(", ");
            }
            result.append(convertArgument(entry.getKey()));
            result.append("=");
            result.append(convertArgument(entry.getValue()));
        }
        result.append("}");
        return result.toString();
    }

    private static String convertCollection(Collection argument) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (Object o : argument) {
            if (result.length() > 1) {
                result.append(", ");
            }
            result.append(convertArgument(o));
        }
        result.append("]");
        return result.toString();
    }

    private static int countPlaceholders(String messagePattern) {
        int result = 0;
        int index = 0;
        while (index < messagePattern.length()) {
            index = messagePattern.indexOf('{', index);
            if (index == -1) {
                break;
            }
            index++;
            if (index < messagePattern.length() && messagePattern.charAt(index) == '{') {