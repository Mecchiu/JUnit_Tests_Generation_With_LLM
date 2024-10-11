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
		
	@Test
	void identityToString() {
		assertNotEmpty(identityToString("Hello world"));
		assertNotEmpty(identityToString("Hello world","Hello world"));
		assertNotEmpty(identityToString((new Exception())));
		assertNotEmpty(identityToString(null));
		
		assertNull(identityToString(""));
		assertNull(identityToString("Hello World"));
		assertNull(identityToString("", "Hello ", " World"));
		assertNotNull(identityToString("String"));
		identityToString("String");
		
		assertNotNull(identityToString("String", " "));
		assertNotNull(identityToString("String", "World"));
	}
	
	@Test
	void identityToStringCollection() {
		assertNotEmpty(identityToString(Arrays.asList("Hello World")));
		assertNotEmpty(identityToString(Arrays.asList("Hello World","Hello", " World")));
		assertNotEmpty(identityToString(Arrays.asList("hello", "world")));
		assertNotEmpty(identityToString(Arrays.asList("String", "World")));
		assertNotEmpty(identityToString(Arrays.asList("string", "world", "hello")));
	}
	
	@Test
	void identityToStringMap() {
		assertNotEmpty(identityToString(new HashMap()));
		assertNotEmpty(identityToString(new HashMap(), "Hello", " World"));
		assertNotEmpty(identityToString(new HashMap(), "Hello", " "));
		assertNotEmpty(identityToString(new HashMap(), "String", " World"));
		assertNotEmpty(identityToString(new HashMap(), "String", " "));
		assertNotEmpty(identityToString(new HashMap(), "String", " Hello "));
		assertNotEmpty(identityToString(new HashMap(), "String", "Hello", " World"));
		assertNotEmpty(identityToString(new HashMap(), "String", " "));
		assertNotEmpty(identityToString(new HashMap(), "String", "Hello", " "));
	}
	
	private static void assertNotEmpty(Collection<?> col) {
		assertFalse(col.isEmpty());
		assertTrue(col.size() > 0);
	}
	
	private static boolean assertThrows(
			Throwable expectedError,
			Object obj,
			String description) {
		boolean thrown = true;
		try {
			identityToString(obj);
		}
		catch (Throwable t) {
			thrown = assertExceptionMessage(t, description);
		}
		assertEquals(expectedError, thrown, true);
		return thrown;
	}
	
	private static void assertNotThrows(Throwable expectedError, Object obj) {
		assertNotEmpty(identityToString(obj));
		boolean thrown = false;
		try {
			identityToString(obj);
		}
		catch (Throwable t) {
			thrown = assertExceptionMessage(t, "error occurred while converting object to identity");
		}
		assertTrue(thrown || expectedError!= thrown);
	}
	
	private static boolean assertExceptionMessage(
			Throwable t,
			String description) {
		assertNotNull(t);
		assertNotNull(description);
		return assertExceptionMessage(t, description, "expected", "actual", false);
	}
	
	private static boolean assertExceptionMessage(
			Throwable t,
			String description,
			String... expectedPart) {
		if (expectedPart!= null && expectedPart.length > 0) {
			assertTrue("expected message part doesn't match; " + Arrays.toString(expectedPart), 
					String.format("expected part (%s) didn't match, actual part (%s)", Arrays.toString(expectedPart), t.getMessage()).matches(description));
		}
		else {
			assertTrue("expected message part doesn't match", t.getMessage().matches(description));
		}
		
		return expectedPart!= null && expectedPart.length > 0 && expectedPart.length == t.getStackTrace().length;
	}
	
	public static void assertThrows(Throwable expectedError, String message) {
		assertThrows(expectedError, null, message);
	}
	
	public static void assertThrows(Throwable expectedError, Object obj) {
		assertNotThrows(expectedError, obj);
	}
	
	public static void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		MongoFormatter.setSimpleDateFormat(simpleDateFormat);
	}
}