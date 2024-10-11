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
		 * Counts the number of unescaped placeholders in the given pattern.
		 *
		 * @param pattern the pattern to be analyzed.
		 * @return the number of unescaped placeholders.
		 */
		public static int countArgumentPlaceholders(String pattern);
		/**
		 * Replaces the placeholders in the message with their arguments.
		 * The {@link MessageFormatter#countArgumentPlaceholders(String)} method must be called before the actual
		 * creation happens with the pattern for the given message pattern.
		 *
		 * @param pattern the pattern to be analyzed.
		 * @param args the message with the arguments.
		 * @return the message with unescaped placeholders replaced.
		 */
		public static String replacePlaceholdersInMessage(String pattern, Object[] args);
}