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
		private MessageFormatter me;

		/**
		 * Initializes a new instance of <code>MessageFormatter_2Test</code> without any arguments.
		 */
		public MessageFormatter_2Test() {
			me = new MessageFormatter();
		}

		/**
		 * Initializes a new instance of <code>MessageFormatter_2Test</code> with the specified arguments.
		 *
		 * @param messagePattern the message pattern.
		 * @param arguments the argument array.
		 */
		public MessageFormatter_2Test(String messagePattern, Object[] arguments) {
			me = new MessageFormatter(messagePattern, arguments);
		}

		/**
		 * Gets the last argument in the message pattern where placeholders have been used and thus it is used by the
		 * corresponding message pattern.
		 *
		 * @return the last argument in the message pattern where placeholders have been used.
		 */
		@Test
		public void test() {
			assertEquals(Arrays.asList(new Date()), me.evaluateArguments("%1$tY-%1$tm-%1$td", new int[] {}));
		}
}

/**
 * Checks if {@link MessageFormatter.ArgumentResult#getThrowable()} returns NOT null when used via the method {@link MessageFormatter_2Test#evaluateArguments(String, Object[])}.
 */
class ArgumentResult_isNotNull_2Test {

    /**
     * Checks if ArgumentResult.getThrowable() returns NOT null.
     */
    @Test
    public void test() {
        Map<Object, Throwable> map = Arrays.asList(
                new Object[]{"%1$tYT-%1$tm-%1$tdTHROWABLE%1$tY"},
                new Object[]{"%1$tY$1$Z$$$1$t$X$$$1"},
                null
        );
        ArgumentResult ar = new ArgumentResult(null, map);
        assertNotNull(ar.getThrowable());
        assertTrue(ar.getThrowable() instanceof Throwable);
        assertNull(ar.getThrowable());
    }
}

class MessageFormatter {
	static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	static final Set<Object> placeholderEvaluation = new HashSet<Object>(Arrays.<Object>asList(new Date()));
	static final Set<Object> placeholderEvalationPart = new HashSet<Object>();
}