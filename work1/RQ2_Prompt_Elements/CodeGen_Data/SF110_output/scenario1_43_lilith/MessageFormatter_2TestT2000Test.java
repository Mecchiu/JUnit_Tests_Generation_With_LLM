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
/**
		 * Test case of {@link MessageFormatter#evaluateArguments(String, Object[])}.
		* The argument given by the String[][] array is split by ',' into
		* the count of placeholders and the string representation array.
		* The result is given as argument to {@link MessageFormatter#evaluateArguments(String, Object[])}.
		*/
		@Test
		void testEvaluateArguments_countPlaceholdersString_argumentsString_resultToString_allPlaceholdersCount() {
			// Arrange
			String[] strPattern = {"1, 2, -3.0"};
			Object[] argsToString = Arrays.asList("One", "Two", Double.toString(Double.MIN_VALUE)/*minus the 'Min'"*/"0"/*minus the 'Min'*/).toArray();
			int resultPosition = 3;
			String resultStr = "";

			// Act
			ArgumentResult result = evaluateArguments(strPattern, argsToString);

			// Assert
			assertEquals("result", resultPattern, result.toString());
			assertEquals("result", resultStr, Arrays.toString(Strings.subarray(result.getArgs(), resultPosition)));

		}

		@Test
		void testEvaluateArguments_countPlaceholdersString_allPlaceholdersAndArgumentsString_resultToString_allPlaceholders() {
			// Arrange
			String[] resultWithArgs = {"0.0", "2.12", "-3.0"};
			String[] resultWithoutArgs = {"0", "-3", "2.12"};
			Object[] strPattern = {resultWithArgs};
			Object[] argsToString = Arrays.asList(resultWithoutArgs).toArray();
			int resultPosition = 0;
			String resultStr = "";

			// Act
			ArgumentResult result = evaluateArguments(strPattern, argsToString);

			// Assert
			Set<Integer> stringsCount = new HashSet<>();
			for (int i = 0; i < result.getArgs().length; i++) {
				int actualCount = Strings.countOccurrences(result.getArgs()[i].toString(), ',');
				stringsCount.add(actualCount);
			}
			for (int i = 0; i < stringsCount.size(); i++) {
				int actualCount = stringsCount.get(i);
				String actualStr = Arrays.toString((int[]) result.getArgs()[i].toString());
				String expectedStr = result.getArgs()[i].toString();
				resultStr += " [" + (i + 1) + "] " + actualStr;
				resultStr += ", args[" + (i + 1) + "] = " + actualStr;
				System.out.println(resultStr);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				String actualDate = df.format(new Date(Long.parseLong(actualStr))) + "  ";
				String expectedDate = df.format(new Date(Long.parseLong(expectedStr)));
				assertEquals("result", expectedDate, actualDate);
			}
			for (int i = 0; i < strPattern.length; i++) {
				int actualCount = Strings.countOccurrences(strPattern[i], ',');
				assertNotSame("result", result.getArgs()[i + 1], actualCount);
				resultStr += " (" + i + ") " + strPattern[i];
				for (int j = result.getArgs().length - 1; j > 0; j--) {
					obj = Strings.subarray(result.getArgs()[j], i, j);
					assertNotSame("result", obj, Strings.countOccurrences(obj.toString(), ','));
					resultStr += " " + obj;
				}
				resultStr += "    ";
			}
			System.out.println(resultStr);
			assertEquals("result", result.getArgs(), result.getArgs().length < result.getCount()? Arrays.toString(Strings.subarray(result.getArgs(), result.getCount())): result.getArgs());
		}

		/**
		 * A placeholder to count placeholders (in the argument pattern) of the format given by a
		 * String array (that is, the count of placeholders is given by the number), where all the placeholders are
		 * of the same length.
		 */
		
		private static final String[] countArgumentPlaceholders(String pattern) {
			int count = 1;
			for (int i = 1; i < pattern.length(); i++) {
				if (!Character.isWhitespace(pattern.charAt(i))) {
					count++;
				}
			}
			return new String[] {"count = " + count + ", " + "}"};
		}
}