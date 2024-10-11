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

    public static int countArgumentPlaceholders(String messagePattern) {
        if (messagePattern == null) {
            return 0;
        }
        int delim = messagePattern.indexOf(DELIM_START);
        if (delim == -1) {
            // special case, no placeholders at all.
            return 0;
        }
        int result = 0;
        boolean isEscaped = false;
        for (int i = 0; i < messagePattern.length(); i++) {
            char curChar = messagePattern.charAt(i);
            if (curChar == ESCAPE_CHAR) {
                isEscaped =!isEscaped;
            } else if (curChar == DELIM_START) {
                if (!isEscaped) {
                    if (i < messagePattern.length() - 1) {
                        if (messagePattern.charAt(i + 1) == DELIM_STOP) {
                            result++;
                            i++;
                        }
                    }
                }
                isEscaped = false;
            } else {
                isEscaped = false;
            }
        }
        return result;
    }
}

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
		private final String[] strings = getStrings();
		
		private final String logPattern = "Test log pattern";
		
		private Map<String,Object> data;
		private Map<String,SimpleDateFormat> formats;
		private Set<String> stringsSet;
		
		/**
		* Test method for {@link MessageFormatter#countArgumentPlaceholders(String)}.
		*/
		@Test
		public void testCountArgumentPlaceholders() {
			final MessageFormatter formatter = new MessageFormatter();
			System.out.println("Testing countArgumentPlaceholders(logPattern)...");
			validateCountArgumentPlaceholders(formatter, strings[0], logPattern);
			validateCountArgumentPlaceholders(formatter, strings[1], logPattern);
			validateCountArgumentPlaceholders(formatter, strings[2], logPattern);
			validateCountArgumentPlaceholders(formatter, strings[3], logPattern);
		}
	
		/**
		* Validates {@link MessageFormatter#format(String, Object)} and
		* {@link MessageFormatter#format(String, Object[])}.
		* <p>
		* The data parameter should contain
		* the following two entries.
		* <pre>{@code
		* ArrayList<Object> result =
		*     new SimpleFormatter().format("${date}", new Date());
		* }</pre>
		*
		* The result format must contain
		* the following two entries.
		* <pre>{@code
		* ArrayList<Object> result = new SimpleFormatter()
		*                        .format("${date}", new Date());
		* }</pre>
		*</p>
	*/
	private void validateCountArgumentPlaceholders(MessageFormatter formatter, String string, String logPattern) {
		Object result = formatter.format(logPattern, string);
		assertEquals(string, result);
		String resultList = formatter.formatStrings(logPattern, string);
		assertEquals(resultList, result);
		Object resultArray = formatter.format(logPattern, Arrays.asList(string, string));
		assertEquals(resultList + "\n" + resultArray, result);
		resultArray = formatter.format(logPattern, Arrays.asList(string, new Date()));
		assertEquals(resultList + "\n" + resultArray, result);
		Set<String> stringsSet2 = new HashSet<>();
		stringsSet2.add(string);
		stringsSet2.add(new Date());
		assertEquals(stringsSet.size(), resultSetSize(stringsSet2));

		Object[] resultArray2 = result.toArray();
		assertEquals(resultArray.getClass().getCanonicalName(), resultArray2.getClass().getCanonicalName());
		int size = resultArray.getClass().getCanonicalName().length();
		if (size > 1000) {
			System.out.println("The returned result list does not contain " + size + "\n");
		}
		
//		Set<String> stringsSet3 = formatter.formatStrings(logPattern, strings);
//		System.out.println("There are: " + stringsSet3.size());
//		String[] array = stringsSet3.toArray(new String[0]);
//		Arrays.sort(array);
//		System.out.println(array[0]);
	}
	
	private int resultSetSize(Set<String> strings) {
		return strings.size();
	}
	
	/**
	 * This test will create two simple formatter.
	 * The expected result is:
	 * <pre>{@code MessageFormatter
	 * []
	 * }</pre>
	 */
	private final MessageFormatter simpleFormatter = new MessageFormatter() {
		@Override
		public String format(String formatPattern, Object arg) {
			return "${string}:${time1}:${time2}:${result}" + formatPattern +
				":${result}";
		}
	};
	
	/**
	 * This test will create two String based formatter.
	 * The expected result is:
	 * <pre>{@code
	 * MessageFormatter
	 * [("${time1}", "")].format().format(" ${date}", new Date()));
	 * }</pre>
	 */
	private final MessageFormatter str1Formatter = new MessageFormatter() {
		@Override
		public String format(String formatPattern, Object arg) {
			return "MessageFormatter(" + "\"" + "\"" + "; " + formatPattern +
				(arg == null? "" : () + arg) ; + ")";
		}
	};
	
	/**
	 * This test will create Map based formatter.
	 * The expected result is:
	 * <pre>{@code
	 * Map
	 * ["${time1}", "${date}", <object>, ${"Result"}]
	 * }</pre>
	 */
	private final MessageFormatter mapFormatter = new MessageFormatter() {
		private final String OBFUSCATION = "${Object}";
		
		@Override
		String format(String formatPattern, Object arg) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern);
			if (arg == null) {
				return "@" + dateFormat.format(new Date());
			} else {
				return ("@" + date