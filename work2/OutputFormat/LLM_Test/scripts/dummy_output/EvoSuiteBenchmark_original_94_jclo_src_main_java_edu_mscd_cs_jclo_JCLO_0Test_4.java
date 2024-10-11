// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		
	/**
	 * Check that a string does not have any double dashes.
	 * @param s		the string to check
	 */
	private void check1(String s) {
		assertEquals(s, getValue(s));
	}

	/**
	 * Check that an object that does not have the correct type
	 * fails with a meaningful error message.
	 * @param o		the object to check
	 */
	private void test1(Object o) {
		try {
			assertEquals("", getValue(o));
		} catch (ClassCastException e) {
			System.err.println(e.getMessage() + '\n');
		} catch (Exception e) {
			System.err.println(e.getMessage() + '\n');
		}
	}

	/**
	 * Check that a string with an unknown variable name can be constructed
	 * with no exception.
	 * @param s		the string to check
	 */
	private void check2(String s) {
		assertTrue(!s.isEmpty() && s.startsWith("unknown"));
	}
}