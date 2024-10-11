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
		private final Map<String, Object> config = Map_0_1Test.configuration;

		private final SimpleDateFormat simple = new SimpleDateFormat("dd.MM.yyyy", Config.getInstance().getConfiguration(Config.DEFAULT_LOCALE));

		private final Date date = new Date(System.currentTimeMillis());

		@Test
		void formatMessage() {

			final String message = messageString(1);
			String result = format( messagePattern, array( "a", "b", "c", ""));

			assertEquals(message, "1 a b c ");
			assertEquals(result, messagePattern);
			assertEquals(date.getTime(), (new SimpleDateFormat("dd.MM.yyyy").parse(result)).getTime());
		}

		@Test
		void formatMessage_1() {

			final String message = messageString(1);
			String result = format( messagePattern, array( "a", "b", "c", ""));

			assertEquals(message, "1 a b c ");
			assertEquals(result, messagePattern);
			assertEquals(date.getTime(), (new SimpleDateFormat("dd.MM.yyyy").parse(result)).getTime());
		}
}