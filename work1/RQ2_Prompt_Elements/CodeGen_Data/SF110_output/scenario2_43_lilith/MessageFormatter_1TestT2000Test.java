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

    /**
     * Counts the number of unescaped placeholders in the given messagePattern.
     *
     * @param messagePattern the message pattern to be analyzed.
     * @return the number of unescaped placeholders.
     */
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
		
	/**
	 * Test method for
	 * {@link de.huxhorn.lilith.data.logging.MessageFormatter#getArgsAsMessagePattern(java.lang.String)}.
	 */
	@Test
	public void testGetArgsAsMessagePattern() {
		int count = 2;
		Collection<String> argStrings = new HashSet<>(count);
		for (int i = 1; i <= count; i++){ // first, one for every position of i
			argStrings.add(i % 3);
			argStrings.add("hello");
		}
		String expectedResult = MessageFormatter.formatMessage(count + ".1", argStrings);
		String result = MessageFormatter.getArgsAsMessagePattern(argStrings);
		assertNotNull(expectedResult);
		assertEquals(expectedResult, result);
		
		// this is a special case, we can't check the result string and the actual construction of the message
		// with a proper delimiter has to be done on the actual construction
//		count = 3;
//		argStrings = new HashSet<>(count);
//		for (int i = 2; i <= count; i++){ // first, one for every position of i
//			argStrings.add(i % 3);
//			argStrings.add("hello");
//		}
//		expectedResult = MessageFormatter.formatMessage(count + ".2", argStrings);
//		result = MessageFormatter.getArgsAsMessagePattern(argStrings);
//		assertNotNull(expectedResult);
////		assertEquals(expectedResult, result);
	}

  /**
   * Test method for
   * {@link de.huxhorn.lilith.data.logging.MessageFormatter#getArgumentsForDelimiter(java.lang.String)}.
   */
  @Test
  public void testGetArgumentsForDelimiter() {
    int count = 3;
    Collection<String> argStrings = new HashSet<>(count);
    for (int i = 1; i <= count; i++){ // first, one for every position of i
      argStrings.add(i % 3);
      argStrings.add("hello");
    }
    String expectedResult = MessageFormatter.formatMessage(count + ".1", argStrings);
    String result = MessageFormatter.getArgumentsForDelimiter(expectedResult);
    assertNotNull(expectedResult);
    assertEquals(expectedResult, result);
    
    // this is a special case, we can't check the result string and the actual construction of the message
    // with a proper delimiter has to be done on the actual construction
    count = 2;
    argStrings = new HashSet<>(count);
    for (int i = 2; i <= count; i++){ // first, one for every position of i
      argStrings.add(i % 3);
      argStrings.add("hello");
    }
    expectedResult = MessageFormatter.formatMessage(count + ".2", argStrings);
    result = MessageFormatter.getArgumentsForDelimiter(expectedResult);
    assertNotNull(expectedResult);
    assertEquals(expectedResult, result);
  }

  /**
   * Test method for
   * {@link de.huxhorn.lilith.data.logging.MessageFormatter#getArgumentsForDelimiter(java.lang.String)}.
   */
  @Test
  public void testGetArgumentsForDelimiter_multipleFields() {
    int count = 2;
    Collection<String> argStrings = new HashSet<>(count);
    for (int i = 1; i <= count; i++){ // first, one for every position of i
      argStrings.add(i % 3);
      argStrings.add("hello");
    }
    String expectedResult = MessageFormatter.formatMessage(count + ".1", argStrings);
    String result = MessageFormatter.getArgumentsForDelimiter("hello", "hello");
    assertNotNull(expectedResult);
    assertEquals(expectedResult, result);
    
    // this is a special case, we can't check the result string and the actual construction of the message
    // with a proper delimiter has to be done on the actual construction
    count = 2;
    argStrings = new HashSet<>(count);
    for (int i = 2; i <= count; i++){ // first, one for every position of i
      argStrings.add("hello");
    }
    expectedResult = MessageFormatter.formatMessage(count + ".2", argStrings);
    result = MessageFormatter.getArgumentsForDelimiter("hello", "hello");
    assertNotNull(expectedResult);
    assertEquals(expectedResult, result);
  }
}