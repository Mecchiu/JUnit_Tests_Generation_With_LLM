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
		private final MessageFormatter messageFormatter = new MessageFormatter();

	/**
	 * Tests {@link MessageFormatter#evaluateArguments(String, Object[])} with zero arguments.
	 */
	@Test
	public void zeroArgument() {
		assertNotNull(messageFormatter.createMessage(null));
	}

	/**
	 * Tests {@link MessageFormatter#createMessage(String)} with a simple value.
	 */
	@Test
	public void simpleValue() {
		String formattedMessage = "An error has occured";
		try {
			messageFormatter.createMessage(formattedMessage);
		}
		catch (IllegalArgumentException e) {
			// expected
		}
		final String actualMessage = messageFormatter.createMessage(formattedMessage);
		assertMessage(formattedMessage, actualMessage);
	}

	/**
	 * Tests {@link MessageFormatter#createSimpleValue(Object, int)} with a simple value.
	 */
	@Test
	public void simpleValue2() {
		final String message = "An error has occured";
		try {
			final Set<String> placeholders = new HashSet<String>();
			for (int i=0; i < 50; i++) {
				messageFormatter.createSimpleValue(message, (byte)(i + 1));
				placeholders.add((String) messageFormatter.createSimpleValue((byte) i, Integer.class));
			}
			final Collection<Object[]> collectionValues = messageFormatter.createArgumentResult(message);

			@SuppressWarnings("unchecked")
			final Set<String> actualSetValues = new HashSet<String>(Arrays.asList(collectionValues.iterator().next()));

			assertEquals(new HashSet<String>(Arrays.asList(placeholders.toArray())), actualSetValues);
		}
		catch (IllegalArgumentException e) {
			// expected
		}
	}

	/**
	 * Tests {@link MessageFormatter#createSimpleValue(Object, int)} with a collection that's not a String[].
	 */
	@Test
	public void simpleValue4() {
		final String message = "An error has occured";
		try {
			messageFormatter.createSimpleValue(message, (T) new T[]{new Integer(10), Long.MIN_VALUE});
		}
		catch (IllegalArgumentException e) {
			// expected
		}
		final Collection<Object> actualCollectionValues = new HashSet<Object>();
		for (int i=0; i < 10; i++) {
			actualCollectionValues.add(new Integer(10));
			actualCollectionValues.add(Long.valueOf(10));
		}
		try {
			@SuppressWarnings("unchecked")
			final Collection<Object> actualCollection = new HashSet<Object>(Arrays.asList(actualCollectionValues.iterator().next()));
			assertEquals(false, actualCollection);
		}
		catch (IllegalArgumentException e) {
			// expected to occur
		}
	}
}