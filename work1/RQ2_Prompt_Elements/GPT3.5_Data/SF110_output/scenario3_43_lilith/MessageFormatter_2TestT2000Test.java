// Here's an implementation of the MessageFormatter class and a test class for the evaluateArguments method:

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
        int argumentCount = countArguments(messagePattern);
        ArgumentResult argumentResult = convertArguments(arguments, argumentCount);
        return replacePlaceholders(messagePattern, argumentResult);
    }

    private static int countArguments(String messagePattern) {
        int argumentCount = 0;
        int index = 0;
        while (index < messagePattern.length()) {
            int openBraceIndex = messagePattern.indexOf('{', index);
            if (openBraceIndex == -1) {
                break;
            }
            int closeBraceIndex = messagePattern.indexOf('}', openBraceIndex);
            if (closeBraceIndex == -1) {
                break;
            }
            if (closeBraceIndex == openBraceIndex + 1) {
                index = closeBraceIndex + 1;
                continue;
            }
            if (messagePattern.charAt(openBraceIndex + 1) == '}') {
                index = openBraceIndex + 2;
                continue;
            }
            try {
                Integer.parseInt(messagePattern.substring(openBraceIndex + 1, closeBraceIndex));
                argumentCount++;
            } catch (NumberFormatException e) {
                // ignore
            }
            index = closeBraceIndex + 1;
        }
        return argumentCount;
    }

    private static ArgumentResult convertArguments(Object[] arguments, int argumentCount) {
        ArgumentResult argumentResult = new ArgumentResult();
        argumentResult.arguments = new String[argumentCount];
        int argumentIndex = 0;
        for (Object argument : arguments) {
            if (argumentIndex >= argumentCount) {
                if (argument instanceof Throwable) {
                    argumentResult.throwable = (Throwable) argument;
                }
                break;
            }
            argumentResult.arguments[argumentIndex] = String.valueOf(argument);
            argumentIndex++;
        }
        return argumentResult;
    }

    private static ArgumentResult replacePlaceholders(String messagePattern, ArgumentResult argumentResult) {
        StringBuilder sb = new StringBuilder();
        int argumentIndex = 0;
        int index = 0;
        while (index < messagePattern.length()) {
            int openBraceIndex = messagePattern.indexOf('{', index);
            if (openBraceIndex == -1) {
                sb.append(messagePattern.substring(index));
                break;
            }
            int closeBraceIndex = messagePattern.indexOf('}', openBraceIndex);
            if (closeBraceIndex == -1) {
                sb.append(messagePattern.substring(index));
                break;
            }
            if (closeBraceIndex == openBraceIndex + 1) {
                sb.append(messagePattern.substring(index, closeBraceIndex + 1));
                index = closeBraceIndex + 1;
                continue;
            }
            if (messagePattern.charAt(openBraceIndex + 1) == '}') {
                sb.append(messagePattern.substring(index, openBraceIndex + 2));
                index = openBraceIndex + 2;
                continue;
            }
            try {
                int argumentNumber = Integer.parseInt(messagePattern.substring(openBraceIndex + 1, closeBraceIndex));
                if (argumentNumber >= argumentResult.arguments.length) {
                    sb.append(messagePattern.substring(index, closeBraceIndex + 1));
                } else {
                    sb.append(messagePattern.substring(index, openBraceIndex));
                    sb.append(argumentResult.arguments[argumentNumber]);
                }
            } catch (NumberFormatException e) {
                sb.append(messagePattern.substring(index, closeBraceIndex + 1));
            }
            index = closeBraceIndex + 1;
        }
        argumentResult.formattedMessage = sb.toString();
        return argumentResult;
    }

    public static class ArgumentResult {
        public String[] arguments;
        public String formattedMessage;
        public Throwable throwable;

        public String getFormattedMessage() {
            return formattedMessage;
        }

        public String[] getArguments() {
            return arguments;
        }

        public Throwable getThrowable() {
            return throwable;
        }
    }
}

// MessageFormatter_2Test.java
package de.huxhorn.lilith.data.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MessageFormatter}.
 * It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
 */
class MessageFormatter_2Test {

    @Test
    void testNoArguments() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, world!", new Object[0]);
        assertEquals("Hello, world!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[0], result.getArguments());
    }

    @Test
    void testOneArgument() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {}!", new Object[]{"world"});
        assertEquals("Hello, world!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"world"}, result.getArguments());
    }

    @Test
    void testTwoArguments() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {} and {}!", new Object[]{"Alice", "Bob"});
        assertEquals("Hello, Alice and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Alice", "Bob"}, result.getArguments());
    }

    @Test
    void testArgumentIndex() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {1} and {0}!", new Object[]{"Bob", "Alice"});
        assertEquals("Hello, Alice and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Alice", "Bob"}, result.getArguments());
    }

    @Test
    void testArgumentIndexOutOfBounds() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {1} and {0}!", new Object[]{"Bob"});
        assertEquals("Hello, {1} and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Bob"}, result.getArguments());
    }

    @Test
    void testArgumentIndexNotANumber() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {x} and {0}!", new Object[]{"Bob", "Alice"});
        assertEquals("Hello, {x} and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Bob", "Alice"}, result.getArguments());
    }

    @Test
    void testArgumentIndexEmptyBraces() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {} and {0}!", new Object[]{"Bob", "Alice"});
        assertEquals("Hello, {} and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Bob", "Alice"}, result.getArguments());
    }

    @Test
    void testArgumentIndexDoubleBraces() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {{}} and {0}!", new Object[]{"Bob", "Alice"});
        assertEquals("Hello, {} and Bob!", result.getFormattedMessage());
        assertNull(result.getThrowable());
        assertArrayEquals(new String[]{"Bob", "Alice"}, result.getArguments());
    }

    @Test
    void testArgumentIndexWithThrowable() {
        Exception exception = new Exception("test");
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Hello, {1} and {0}!", new Object[]{"Bob", exception});
        assertEquals("Hello, {1} and Bob!", result.getFormattedMessage());
        assertSame(exception, result.get