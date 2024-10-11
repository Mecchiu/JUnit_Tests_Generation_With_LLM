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
	 * Test method getValue(String).
	 * Given a String, it should return its
	 * original value to have a new Object with that name
	 * and original field of this name must exist.
	 *
	 * @throws Throwable an unexpected exception
	 */
	@Test
	void getValue() throws Throwable {
	}
	
	/**
	 * Make an Object of the correct type for the field, following the
	 * usual requirements for a field.
	 *
	 * @param type the required type
	 * @return an Object of the correct type and value
	 */
	private Object makeObject(String type) {
		return new Object();
	}
}