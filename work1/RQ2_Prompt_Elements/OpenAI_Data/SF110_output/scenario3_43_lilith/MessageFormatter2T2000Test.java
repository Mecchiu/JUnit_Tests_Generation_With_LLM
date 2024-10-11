// MessageFormatterTest.java
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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatterTest {

	@Test
	void evaluateArguments_null() {
		ArgumentResult result = MessageFormatter.evaluateArguments(null, null);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
	}

	@Test
	void evaluateArguments_empty() {
		ArgumentResult result = MessageFormatter.evaluateArguments("", null);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
	}

	@Test
	void evaluateArguments_noPlaceholders() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello World!", null);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
	}

	@Test
	void evaluateArguments_noArguments() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", null);
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(0, result.getArguments().length);
	}

	@Test
	void evaluateArguments_oneArgument() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[]{"World"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
	}

	@Test
	void evaluateArguments_oneArgument_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {}!", new Object[]{"World", "!"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
	}

	@Test
	void evaluateArguments_oneArgument_tooFew() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {}!", new Object[]{"World"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(1, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
	}

	@Test
	void evaluateArguments_twoArguments() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {}!", new Object[]{"World", "!"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}

	@Test
	void evaluateArguments_twoArguments_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {}!", new Object[]{"World", "!", "!"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}

	@Test
	void evaluateArguments_twoArguments_tooFew() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {} {}!", new Object[]{"World", "!"});
		assertNotNull(result);
		assertNull(result.getThrowable());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}

	@Test
	void evaluateArguments_twoArguments_throwable() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {}!", new Object[]{"World", "!", new Throwable("Test")});
		assertNotNull(result);
		assertNotNull(result.getThrowable());
		assertEquals("Test", result.getThrowable().getMessage());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}

	@Test
	void evaluateArguments_twoArguments_throwable_tooMany() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {}!", new Object[]{"World", "!", new Throwable("Test"), "!"});
		assertNotNull(result);
		assertNotNull(result.getThrowable());
		assertEquals("Test", result.getThrowable().getMessage());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}

	@Test
	void evaluateArguments_twoArguments_throwable_tooFew() {
		ArgumentResult result = MessageFormatter.evaluateArguments("Hello {} {} {}!", new Object[]{"World", "!", new Throwable("Test")});
		assertNotNull(result);
		assertNotNull(result.getThrowable());
		assertEquals("Test", result.getThrowable().getMessage());
		assertNotNull(result.getArguments());
		assertEquals(2, result.getArguments().length);
		assertEquals("World", result.getArguments()[0]);
		assertEquals("!", result.getArguments()[1]);
	}
}

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
     * <p>This method returns a MessageFormatter.ArgumentResult which contains the arguments converted to String
     * as well as an optional Throwable.</p>
     * <p/>
     * <p>If the last argument is a Throwable and is NOT used up by a placeholder in the message pattern it is returned
    