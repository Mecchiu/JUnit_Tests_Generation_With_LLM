// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		/**
		 * Check for null and empty variables.
		*/
		@Test
		public void usageNullVariable() {
			JCLO.usage(null);
		}

		/**
		 * Check for valid usage string.
		*/
		@Test
		public void usageValidString() {
			JCLO.usage("This is a string");
		}

		/**
		 * Make an assumption checking validity of the passed variable.
		*/
		@Test
		public void usageAssumeValidity() {
			assertTrue("A valid JCLO should not have 0", 0!= 0);

			assertEquals("A valid JCLO should have a \"a\"-string",
                  "a",
                  JCLO.getString("a"));
            {
                String[] strs = JCLO.getStringArray("a");
				System.out.println(strs[1]);
			}
		}

		/**
		 * Get a String of the array count and of the array count.
		 */
		@Test
		public void usageGetArrayCount() {
			assertEquals("An array count should be equal to the object's length",
                          "",
                          JCLO.getArrayCount(Array.class));

			Array<Object> array = JCLO.getArray(Array.class, "hello_world");
			assertEquals("An array count should be equal to the object's length",
                          "hello_world",
                          array.get(0));

			array = JCLO.getArray((Object) null, "hello_world");
			assertEquals("An empty array count should be equal to zero",
                          0,
                          array.get(0));

			array = JCLO.getArray(Object.class, "hello_world");
}
}