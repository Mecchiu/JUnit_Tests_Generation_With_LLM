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
	 * This operation returns a formatted string that contains placeholders as specified in the given message pattern.
	 * 
	 * The format is as following:
	 * 
	 * <pre>
	 * placeholders are specified in the pattern, where they always take place for the same amount of time.
	 * (e.g. placeholders are {@code null})
	 * 
	 * The order of the placesholders is as follows:
	 * first non-null place, then null place, then null place and then final null
	 * 
	 * The order of the calls to format is as follows:
	 * 1st call to format, non-null place, then null
	 * 
	 * The order of the calls to pattern is as follows:
	 * 0st call to pattern, non-null place, then null
	 * 
	 * The order of the calls to string concatenation is as follows:
	 * all non-null places and non-null string values are concatenated.
	 * 
	 </pre>
	 * 
	 */
	@Test
	void test_format() {
		//@formatter:off
		assertEquals("pattern", new MessageFormatter().format(null, null), null);
	//@formatter:on
		assertEquals(null, new MessageFormatter().format(null, new String[0]));
		
		assertEquals("pattern", new MessageFormatter().format("pattern"), null);
		assertTrue(new MessageFormatter().isValid(), "MessageFormatter.format throws validation exception");
		assertTrue(new MessageFormatter().accept(null), "MessageFormatter.format throws an exception if null is passed");
    }
	
	/**
	 * This operation returns a formatted string that contains placeholders as specified in the given message pattern.
	 * 
	 * This implementation does not check for nulls, it assumes that arguments are empty.
	 * 
	 * The format is as follows:
	 * 
	 * <pre>
	 * placeholders are specified in the pattern
	 * (e.g. placeholders are {@code null})
	 * 
	 * The order of the placesholders follows <b>not</b> <a href="https://issues.apache.org/jira/browse/LILITH-1108">LILITH-1108</a>,
	 * where the first couple of placeholders are {@code null} and the second one is always a {@code Collection}.
	 * 
	 * For collections is used but they are sorted by size (smaller values come first) and only one part of collection is
	 * passed.
	 * 
	 * The order of the calls to format is as follows:
	 * <ol>
	 * <li>All non-null placeholders are concatenated</li>
	 * <li>Only non-empty placeholders are concatenated: no collection</li>
	 * <li>Only valid placeholders from given argument are concatenated: single element collection</li>
	 * </ol>
	 * 
	 * For single <a href="https://issues.apache.org/jira/browse/LILITH-1108">LILITH-1108</a>, the argument is not checked.
	 * 
	 */
	@Test
	void test_format_with_nulls() throws InterruptedException, IllegalArgumentException {
		
		final MessageFormatter messageFormatter = new MessageFormatter();
        
        //@formatter:off
		Set<String> messages = new HashSet<>();
		
		for(String place : Arrays.asList("0", "null")) {
			messages.add(messageFormatter.format((String)null, place));
		}
		
		msg("test_format_with_nulls", messages.toString());
		
		for(String place : messages) {
			System.out.println(place);
		}
		msg("test_format_with_nulls_again", messageFormatter.format((String)null, "0"));
		msg("test_format_with_nulls_again", 
			messageFormatter.format((String)null, (String)null));
		msg("test_format_with_valid_place", 
			messageFormatter.format(Arrays.asList((String)null, "2"), "0"));
		assertFalse(new MessageFormatter().isValid(), "Exception not thrown during test");
		//@formatter:off
        
    	assertTrue(new MessageFormatter().accept(Arrays.asList(null,"3", (Object) null)), "Exception not thrown during test");
		msg("test_format_with_valid_same_arg", 
		    messageFormatter.format((Collection<String>)null, "5"));
		msg("test_format_with_valid_same_arg", 
		    messageFormatter.format((Collection<String>)null, Arrays.asList(null,"3")));
		msg("test_format_with_valid_same_arg", 
			messageFormatter.format((Collection<String>)null, Arrays.asList((Object) null, "1")));
		
		assertFalse(new MessageFormatter().accept(Arrays.asList((String) null, "2"), Arrays.asList ((Object) null, "3")), "Exception not thrown during test");
		msg("test_format_with_valid_empty_arg", 
			messageFormatter.format((Collection<String>)null, (String) null));
		msg("test_format_with_valid_empty_arg", 
			messageFormatter.format((Collection<String>)null, new HashSet<String>(0)));
		assertTrue(new MessageFormatter().accept(Arrays.asList(null,"2", (Object) null), Arrays.asList((String) null)), "Exception not thrown during test");
		//@formatter:on
	}
	
	@SuppressWarnings("serial")
	private boolean 	msg(final String name, final Collection<String> messages) {
		try {
			return messageFormatter.accept(messages);
		}
		catch(Exception e) {
			return false;
		}
	}
}