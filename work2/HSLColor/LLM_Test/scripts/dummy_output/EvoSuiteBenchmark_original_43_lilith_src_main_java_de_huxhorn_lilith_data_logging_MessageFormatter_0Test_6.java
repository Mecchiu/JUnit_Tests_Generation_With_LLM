// MessageFormatter_0Test.java
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
* It contains one unit test case for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_0Test {
		
    /**
     * Test method of MessageFormatter.format(String,String[]).
     * Test the result of format(String,String[]).
     * 
	 * @throws Exception
     */
	@Test
	public void testFormat() throws Exception {
		
		// Simple date format test
		
		String dateFmtResult = "yyyy_MM_dd HH:mm:ss";
		
		// Test format (using a Map).
		Set<String> expectedOutput = new HashSet<>(Integer.MAX_VALUE, 0);
		String[] actualResult = MessageFormatter.format(String.format(dateFmtResult,
				new Object[]{"2014_06_24 10:50:38"}),
				new String[]{"2014_06_24 10:50:38"});
		Set<String> actual = MessageFormatter.parse(String.format(dateFmtResult,
				new Object[]{"2014_06_24 10:50:38"}));
		final Set<String> actualCopy = new HashSet<>(actual);
		expectedOutput.addAll(actualCopy);
		
		// Test formatting with null
		assertNull(MessageFormatter.format(null, null));
	
		// Test formatting with Collection.
		expectedOutput.add("2014_06_24 10:50:38");
		
		// Test formatting with null.
		Collection<String> nullableOutput = null;
		assertNonNull(nullableOutput);
		expectedOutput.addAll(nullableOutput);
		
		// Date-type output.
		expectedOutput.add("2014");
		
		// Date and time output.
		String timeFmtResult = "H:mm:ss a";
		String dateFmtResult = "yyyy-MM-dd HH:mm:ss";
		String timeFmtResult2 = "H:mm:ss a H:mm:ss";
		
		// Test formatting
		String messagePattern = "%1$s - %2$s (%3$s)";
		Collection<String> arguments = Arrays.asList("s1", "s2", "s3", "time.s");
		String expectedOutput2 = String.format(messagePattern, "s1", "s2", "s3", "time.s");
		assertEquals(expectedOutput2, MessageFormatter.format(messagePattern, arguments));
		
		// Test format (using a Map, but using null for the arguments).
		expectedOutput2 = String.format(messagePattern, "s1", "s2", null, "null");
		Collection<String> actualResult2 = MessageFormatter.format(messagePattern, arguments);
		assertEquals(expectedOutput2, actualResult2);
		
		// Test parsing
		Set<String> output = new HashSet<>(Integer.MAX_VALUE, 0);
		messagePattern = "%1$s - %2$s (%3$s)";
		arguments = Arrays.asList("s1", "s2", "s3", "time.s");
		Collection<String> expectedOutput3 = new HashSet<>(Integer.MAX_VALUE, 0);
		assertEquals(expectedOutput3, MessageFormatter.parse(messagePattern, Collections.<String>emptyList()));
		
		// Test format (using a Map, but using null for the arguments).
		String messagePattern2 = "%1$s - \"%2$s (%3$s, %4$s)\"";
		arguments = Arrays.asList("time.s", "s1", "null", "s2");
		output = new HashSet<>(Integer.MAX_VALUE, 0);
		expectedOutput3 = new HashSet<>(Integer.MAX_VALUE, 0);
		assertEquals(expectedOutput3, MessageFormatter.format(messagePattern2, arguments, output));
		
		// Test formatting and parsing
		expectedOutput.clear();
		output.clear();
		messagePattern = "%1$s - \"%2$s (%3$s, %4$s)\"";
		arguments = Arrays.asList("time.s", "s1", "null", "s2", "s3");
		Collection<String> expectedOutput4 = new HashSet<>(Integer.MAX_VALUE, 0);
		assertEquals(expectedOutput4, MessageFormatter.parse(messagePattern, Collections.<String>emptyList()));
	}

}