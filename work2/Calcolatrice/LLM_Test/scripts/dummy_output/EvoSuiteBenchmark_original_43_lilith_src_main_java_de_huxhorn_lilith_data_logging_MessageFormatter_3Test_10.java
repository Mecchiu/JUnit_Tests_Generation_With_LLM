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
		/*
 * Test toString()
 */
	@Test
	public void test_getClassName() {
		assertEquals("MessageFormatter_3Test", MessageFormatter.class.getName()); //$NON-NLS-1$
	}


	/*
	 * Test toString(Object o) - String replacement for the "identityToString" method that
	 * is overridden at the class level in the case of an array
	 */
	@Test
	public void test_toStringString0() {
		assertEquals("identityToString({})", MessageFormatter.identityToString(null)); //$NON-NLS-1$
	}


	/*
	 * Test toString(Object o) - String replacement for the "conversionToString" method which
	 * is overridden at the class level in the case of an array.
	 */
	@Test
	public void test_conversionToStringString0() {
		assertEquals("{\"identityToString(null)}, conversionToString()", MessageFormatter.conversionToString(null)); //$NON-NLS-1$
	}


	/*
	 * Test toString(Object o) - String replacement for the "identityToString(Collection)".
	 * It contains an additional condition.
	 * The test case can not be easily reproduced with Collection because the elements in the test cases have been
	 * generated assuming no collisions.
	 */
	@Test
	public void test_conversionToStringCollectionString1() {
		final String[] input = { "", null };
}
}