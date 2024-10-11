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
		 * Test method for
		 * {@link MessageFormatter#format(String, String[])}
		 * with default argument and error messagePattern containing only placeholders.
		 */
		@Test
		void testSimple_10() {
			String formattedMessage = MessageFormatter.format(
					String.format("There was a failure. The cause was the %s!", this.getClass().getSimpleName()
							),
					new String[]{"cause", "the cause"}
			);
			assertEquals("<p>There was a failure. The cause was the <b>cause</b>!", (formattedMessage));
		}

	}
// MessageFormatter_0.java