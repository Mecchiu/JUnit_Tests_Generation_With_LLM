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
* It contains one unit test case for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {
		
	/**
	 * The message pattern to be analyzed.
	 */
	private static final String MESSAGE_PATTERN = "%d %d";
	/**
	 * The arguments to an argument result array.
	 */
	private static final String ARGS_ARRAY = "arg_0 %d $arg_1 $arg_2";	
	/*
	 * The date formats used by this test.
	 */
	private static final Date ISO_FORMAT = new Date(0);
	// private static final SimpleDateFormat ISO_FORMAT = new SimpleDateFormat("yyyy.HH") ;
	private final Set<Integer> placeholders = new HashSet<Integer>();
	private String messagePattern;

	public MessageFormatter_1Test(String messagePattern) {
		this.messagePattern = messagePattern;
	}

	@Test
	public void shouldBeInvokedWithMessagePattern() {
		
		// 1 - expected values
		int expected = 3;
		

		// 1a - expected values (after formatting the messagePattern)
		int actual = MessageFormatter.countArgumentPlaceholders(messagePattern);
		assertEquals(expected, actual);
		
		
		// 1b - expected values (after formatting the messagePattern)

		
		
		// 1c - expected values (after replacing placeholders by String[].
		int actual2 = MessageFormatter.countArgumentPlaceholders(messagePattern.replaceAll(MESSAGE_PATTERN, ARGS_ARRAY));		
		assertEquals(expected, actual2);
	}
	
	
}