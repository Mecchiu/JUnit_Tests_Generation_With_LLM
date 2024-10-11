// MessageFormatter_3Test.java
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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		
	/**
	 * Tests that Object.isEmpty returns false.
	 */
	@Test
	void isEmpty_1() {
		Object obj = null;
		assertEquals(false, MessageFormatter.identityToString(obj).isEmpty());		
	}
	
	/** 
	 * Tests that Object.isEmpty returns false (ignoring duplicates).
	 */
	@Test
	void isEmpty_2() {
		Object obj = null;
		obj = new Object();
		obj = new Object();
		assertEquals(false, MessageFormatter.identityToString(obj).isEmpty());
	}
	
	/** 
	 * Tests that Object.isEmpty returns true.
	 */
	@Test
	void isEmpty_3() {
		Object obj = null;
		obj = new Object();
		assertEquals(true, MessageFormatter.identityToString(obj).isEmpty());
	}
	
	/**
	 * Tests that an empty key is encoded correctly.
	 */
	@Test
	void escapeKey_1() {
		Object obj = null; // empty key
		obj = new Object(); // key, null, and string
		assertEquals("", MessageFormatter.escapeKey(obj, null, ""));
	}
	
	/**
	 * Tests that an empty key is encoded correctly.
	 */
	@Test
	void escapeKey_2() {
		Object obj = null; // empty key
		obj = new Object[0]; // key, null, and empty Array 
		assertEquals("", MessageFormatter.escapeKey(obj, null, ""));
	}
	
	/**
	 * Tests that an empty key is encoded correctly.
	 */
	@Test
	void escapeKey_4() {
		Object obj = null; // empty key
		obj = new Object[]{}; // Array, null, and empty Array 
		assertEquals("", MessageFormatter.escapeKey(obj, null, ""));
	}
	
	/**
	 * Tests if Object#toString() contains all keys, values, and array entries.
	 */
	@Test
	void test_allKeysValuesAndEntries() {
		Set<Object> keys = new HashSet<Object>();
		Set<Object> values = new HashSet<Object>();
		Set<Object[]> entries = new HashSet<Object[]>();
		// Object#toString() would return with a key and array as one entry, so this call
		// would convert key/value pairs.
		String text = MessageFormatter.identityToString(new Object());
		for (int i = 0; i < text.length(); i++) {
			Object key = text.charAt( i );
			Object value = text.charAt( text.length()-1 - i );
			Object[] entry = keyValueToEntry(key, value);
			entries.add(entry);
			keys.add(key);  
			values.add(value);
		}
		text = MessageFormatter.identityToString(null);
		for (int i = 0; i < text.length(); i++) {
			Object key = text.charAt( i );
			Object value = text.charAt( text.length()-1 - i );
			Object[] entry = keyValueToEntry(key, value);
			entries.add(entry);
			keys.add(null);  
			values.add(value);
		}
		// keys is the sorted set of objects, values is the sorted set of objects.
}
}