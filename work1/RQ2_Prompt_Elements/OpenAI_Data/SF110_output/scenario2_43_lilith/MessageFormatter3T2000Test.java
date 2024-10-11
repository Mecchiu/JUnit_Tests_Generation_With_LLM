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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {

	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_String() {
		String testString = "test";
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode(testString)), MessageFormatter.identityToString(testString));
	}
	
	@Test
	void identityToString_StringBuffer() {
		StringBuffer testStringBuffer = new StringBuffer("test");
		assertEquals("java.lang.StringBuffer@" + Integer.toHexString(System.identityHashCode(testStringBuffer)), MessageFormatter.identityToString(testStringBuffer));
	}
	
	@Test
	void identityToString_StringBuilder() {
		StringBuilder testStringBuilder = new StringBuilder("test");
		assertEquals("java.lang.StringBuilder@" + Integer.toHexString(System.identityHashCode(testStringBuilder)), MessageFormatter.identityToString(testStringBuilder));
	}
	
	@Test
	void identityToString_Date() {
		Date testDate = new Date();
		assertEquals("java.util.Date@" + Integer.toHexString(System.identityHashCode(testDate)), MessageFormatter.identityToString(testDate));
	}
	
	@Test
	void identityToString_SimpleDateFormat() {
		SimpleDateFormat testSimpleDateFormat = new SimpleDateFormat();
		assertEquals("java.text.SimpleDateFormat@" + Integer.toHexString(System.identityHashCode(testSimpleDateFormat)), MessageFormatter.identityToString(testSimpleDateFormat));
	}
	
	@Test
	void identityToString_Array() {
		String[] testArray = new String[]{"test"};
		assertEquals("[Ljava.lang.String;@" + Integer.toHexString(System.identityHashCode(testArray)), MessageFormatter.identityToString(testArray));
	}
	
	@Test
	void identityToString_Collection() {
		Collection<String> testCollection = Arrays.asList("test");
		assertEquals("java.util.Arrays$ArrayList@" + Integer.toHexString(System.identityHashCode(testCollection)), MessageFormatter.identityToString(testCollection));
	}
	
	@Test
	void identityToString_Set() {
		Set<String> testSet = new HashSet<String>();
		testSet.add("test");
		assertEquals("java.util.HashSet@" + Integer.toHexString(System.identityHashCode(testSet)), MessageFormatter.identityToString(testSet));
	}
	
	@Test
	void identityToString_Map() {
		Map<String, String> testMap = new java.util.HashMap<String, String>();
		testMap.put("test", "test");
		assertEquals("java.util.HashMap@" + Integer.toHexString(System.identityHashCode(testMap)), MessageFormatter.identityToString(testMap));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_String() {
		String testString = "test";
		assertEquals("java.lang.String@" + Integer.toHexString(System.identityHashCode(testString)), MessageFormatter.identityToString(testString));
	}
	
	@Test
	void identityToString_StringBuffer() {
		StringBuffer testStringBuffer = new StringBuffer("test");
		assertEquals("java.lang.StringBuffer@" + Integer.toHexString(System.identityHashCode(testStringBuffer)), MessageFormatter.identityToString(testStringBuffer));
	}
	
	@Test
	void identityToString_StringBuilder() {
		StringBuilder testStringBuilder = new StringBuilder("test");
		assertEquals("java.lang.StringBuilder@" + Integer.toHexString(System.identityHashCode(testStringBuilder)), MessageFormatter.identityToString(testStringBuilder));
	}
	
	@Test
	void identityToString_Date() {
		Date testDate = new Date();
		assertEquals("java.util.Date@" + Integer.toHexString(System.identityHashCode(testDate)), MessageFormatter.identityToString(testDate));
	}
	
	@Test
	void identityToString_SimpleDateFormat() {
		SimpleDateFormat testSimpleDateFormat = new SimpleDateFormat();
		assertEquals("java.text.SimpleDateFormat@" + Integer.toHexString(System.identityHashCode(testSimpleDateFormat)), MessageFormatter.identityToString(testSimpleDateFormat));
	}
	
	@Test
	void identityToString_Array() {
		String[] testArray = new String[]{"test"};
		assertEquals("[Ljava.lang.String;@" + Integer.toHexString(System.identityHashCode(testArray)), MessageFormatter.identityToString(testArray));
	}
	
	@Test
	void identityToString_Collection() {
		Collection<String> testCollection = Arrays.asList("test");
		assertEquals("java.util.Arrays$ArrayList@" + Integer.toHexString(System.identityHashCode(testCollection)), MessageFormatter.identityToString(testCollection));
	}
	
	@Test
	void identityToString_Set() {
		Set<String> testSet = new HashSet<String>();
		testSet.add("test");
		assertEquals("java.util.HashSet@" + Integer.toHexString(System.identityHashCode(testSet)), MessageFormatter.identityToString(testSet));
	}
	
	@Test
	void identityToString_Map() {
		Map<String, String> testMap = new java.util.HashMap<String, String>();
		testMap.put("test", "test");
		assertEquals("java.util.HashMap@" + Integer.toHexString(System.identityHashCode(testMap)), MessageFormatter.identityToString(testMap));
	}
}

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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
		
	@Test
	void identityToString_null() {
		assertNull(MessageFormatter.identityToString(null));
	}
	
	@Test
	void identityToString_String() {
		String testString = "test";
		assertEquals("java.lang.String