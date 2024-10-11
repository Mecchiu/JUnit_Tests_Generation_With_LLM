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
		 * Basic test.
		 *
		 * @throws AssertionError if an unrecoverable error occurred.
		 */
	@Test
	void test_formats_pattern() throws AssertionError {
		//test: replace placeholders in the messagePattern
		assertEquals("Test {\"String\"}", messagePattern.replace("\\{String\\}", "Test {\"String\"}"));
	}
	/**
	 * Basic test.
	 *
	 * @throws AssertionError if an unrecoverable error occurred.
	 */
	@Test
	void test_formats_arguments() throws AssertionError {
		//test: return ArgumentResult for replaced placeholders
		final ArgumentResult result = new ArgumentResult();
		{
			//test: replace placeholder in messagePattern
			int originalLength = messagePattern.length();
			{
				int oldLength;
				String newPlaceholder;
				{
					oldLength = originalLength;
					newPlaceholder = messagePattern.replace("{String}", "string");
				}
				//test: assert new length
				assertEquals("test new length for {String}", originalLength, newLength);
				assertEquals("test replacement for old {String} has returned wrong value", "string", newPlaceholder);
			}
			//test: assert new number of elements
			assertEquals("test new number of elements for {String}", newLength, messagePattern.length());
		}
		{
			//test: convert String[] to set
			final Set<Object> original = new HashSet<>(Arrays.asList("arg1", "arg2", "arg3"));
			final Set<Object> converted = new HashSet<>();
			{
				//test: add replacement
				converted.addAll(messagePattern.replace("{arg1}", "arg12").replace("{arg1,2}", "arg2").replace("{arg1,2,3}", "arg3"));
				//test: assert new set
				assertEquals("test replaced from {String} to {String[]}", new HashSet<Object>(Arrays.asList("arg2", "arg3")), new HashSet<>(converted));
			}
		}
		//test: assert new set
		{
			//test: assert new set
			final Set<Object> converted = new HashSet<>(messagePattern.replace("{arg1,2}", "arg3").replace("{arg1,2,3}", "arg2").replace("{arg1,2,3,4,5}", "arg4"));
			//test: assert new set
			assertEquals("test replaced from {String} to {Set}", new HashSet<Object>(Arrays.asList("arg2", "arg3")), new HashSet<>(converted));
		}
		{
			//test: assert new set
			final Set<Object> converted = new HashSet<>(messagePattern.replace("{arg1,2}", "arg3").replace("{arg1,2,3}", "arg2").replace("{arg1,2,3,4,5}", "arg4"));
			//test: assert new set
			assertEquals("test replaced from {String} to {Set}", new HashSet<Object>(Arrays.asList("arg2", "arg3")), new HashSet<>(converted));
		}
		{
			//test: assert new unqiue set
			final Set<Object> original = new HashSet<>(Arrays.asList("arg1", "arg2", "arg3"));
			final Set<Object> converted = new HashSet<>(messagePattern.replace("{arg1}", "arg12").replace("{arg1,2}", "arg2").replace("{arg1,2,3}", "arg3"));
			//test: assert new unqiue set
			assertEquals("test replaced from {String} to {Set}", new HashSet<Object>(Arrays.asList("arg2", "arg3")), converted);
		}
		{
			//test: assert new unqiue set
			final Set<Object> converted = new HashSet<>(messagePattern.replace("{arg1,2}", "arg3").replace("{arg1,2,3}", "arg2").replace("{arg1,2,3,4,5}", "arg4"));
			//test: assert new unqiue set
			assertEquals("test replaced from {String} to {Set}", new HashSet<Object>(Arrays.asList("arg2", "arg3")), converted);
		}
	}
}

/**
 * MessageFormatter implementation of java.util.logging.Formatter.<br>
 * This formatter always converts object arguments as String arrays into HashSet<String[]>.
 */
public class MessageFormatter_0Test_SimpleFormatter extends MessageFormatter {

	@Override
	public String format(String messagePattern, String[] arguments) {
		return String.format(messagePattern, Arrays.asList(arguments));
	}

    /** Static utility class used by MessageFormatter_0Test_SimpleFormatter(). */
	public static class MessageFormatter_0Test_SimpleFormatter extends MessageFormatter_0Test {

		// Simple constructor.
		public MessageFormatter_0Test_SimpleFormatter(String[] messagePattern) throws AssertionError {
			super(messagePattern);
		}

		// Static utility method that builds a simple message pattern from a collection of arguments.
		public static String format(String messagePattern, String[] arguments) {
			return Arrays.stream(arguments)
					.map(HashSet::new)
					.collect(MessageFormatter_0Test_SimpleFormatter::format);
		}

		@Override
		protected Set<String> fromArguments(Collection<Object> collection) {
			Set<String> converted = new HashSet<>();
			collection.stream()
					.forEach(string -> converted.add(String.valueOf(string)));
			return converted;
		}
	}

}