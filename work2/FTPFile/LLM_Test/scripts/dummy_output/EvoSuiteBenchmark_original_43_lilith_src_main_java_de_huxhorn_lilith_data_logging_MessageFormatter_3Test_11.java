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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		/**
     * This method creates an identity string with the placeholders in the message pattern
     * into the argument array.
     *
     * @param pattern The pattern of message elements.
     * @param arguments An argument array of String[] where we will replace their placeholders.
     */
    public String identityToString(String pattern, String[] arguments) {
        return messagePatternToPattern(pattern) + identityToStringImpl(arguments);
    }

    static private Object identityToStringImpl(String[] arguments) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH-mm-ss");
		final String[] result = new String[arguments.length];
		for (int i = 0; i < arguments.length; i++) {
			result[i] = dateFormat.format(new Date(
				System.currentTimeMillis()));
		}
		return Arrays.asList(result)
			.toArray(new String[result.length]);
    }

    /**
     * Test of the message pattern "Message{placeholder}"
     */
    @Test
    public void testMatches_messagePatternPlaceholder(){
		assertTrue(identityToString(MessagePattern.Plain_String));
        assertTrue(identityToString(MessagePattern.Plain_String_String));
        assertTrue(identityToString(MessagePattern.Placeholder_String,
                MessagePattern.Plain_String));
        assertTrue(identityToString(MessagePattern.Plain_String_String,
                MessagePattern.Plain_String_String));
        assertTrue(identityToString(MessagePattern.Placeholder_String,
				MessagePattern.Plain_String_String,
				MessagePattern.Plain_String));
		assertFalse(identityToString(MessagePattern.Plain_String,
				MessagePattern.Placeholder_String_String));
        assertFalse(identityToString(MessagePattern.Plain_String_String,
				MessagePattern.Plain_String,
				MessagePattern.Plain_String_String));
        assertFalse(identityToString(MessagePattern.Plain_String,
				"Message{placeholder}"));
        assertFalse(identityToString(MessagePattern.Plain_String_String,
				"Message{placeholder}" ));
    }
}