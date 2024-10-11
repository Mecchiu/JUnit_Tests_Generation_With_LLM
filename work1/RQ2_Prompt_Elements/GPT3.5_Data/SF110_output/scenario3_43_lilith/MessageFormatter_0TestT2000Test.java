// Here's an implementation of the MessageFormatter class and its test cases:

// MessageFormatter.java
package de.huxhorn.lilith.data.logging;

import java.text.MessageFormat;
import java.util.Arrays;

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
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments the arguments to be used to replace placeholders.
     * @return the formatted message.
     */
    public static String format(String messagePattern, String[] arguments) {
        if (messagePattern == null) {
            return null;
        }
        if (arguments == null || arguments.length == 0) {
            return messagePattern;
        }
        return MessageFormat.format(messagePattern, (Object[]) arguments);
    }
}

// MessageFormatter_0Test.java
package de.huxhorn.lilith.data.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class of {@link MessageFormatter}.
 * It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
 */
class MessageFormatter_0Test {

    @Test
    void testNullMessagePattern() {
        assertNull(MessageFormatter.format(null, new String[]{"arg1", "arg2"}));
    }

    @Test
    void testNullArguments() {
        assertEquals("test message", MessageFormatter.format("test message", null));
    }

    @Test
    void testEmptyArguments() {
        assertEquals("test message", MessageFormatter.format("test message", new String[]{}));
    }

    @Test
    void testNoPlaceholders() {
        assertEquals("test message", MessageFormatter.format("test message", new String[]{"arg1", "arg2"}));
    }

    @Test
    void testOnePlaceholder() {
        assertEquals("test message arg1", MessageFormatter.format("test message {}", new String[]{"arg1"}));
    }

    @Test
    void testTwoPlaceholders() {
        assertEquals("test message arg1 arg2", MessageFormatter.format("test message {} {}", new String[]{"arg1", "arg2"}));
    }

    @Test
    void testMorePlaceholdersThanArguments() {
        assertEquals("test message arg1 arg2", MessageFormatter.format("test message {} {} {}", new String[]{"arg1", "arg2"}));
    }

    @Test
    void testMoreArgumentsThanPlaceholders() {
        assertEquals("test message arg1 arg2", MessageFormatter.format("test message {} {}", new String[]{"arg1", "arg2", "arg3"}));
    }

    @Test
    void testPlaceholderInMiddle() {
        assertEquals("test arg1 message arg2", MessageFormatter.format("test {} message {}", new String[]{"arg1", "arg2"}));
    }

    @Test
    void testPlaceholderAtEnd() {
        assertEquals("test message arg1", MessageFormatter.format("test message {}", new String[]{"arg1"}));
    }
}