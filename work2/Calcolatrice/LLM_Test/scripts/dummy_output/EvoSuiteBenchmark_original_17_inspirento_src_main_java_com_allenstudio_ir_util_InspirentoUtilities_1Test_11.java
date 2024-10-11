// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {
		@Test
    public void test() {
				// get the string from the line above, which is a
				// sample of the following:
				final String str1 = "${@{@{@{LIMIT}@{@{@{LIMIT}@{@{LIMIT}@{@{LIMIT}@{LIMIT}@{LIMIT}}}}}}}"
				;							// from the line above

				// test that this gets converted to the correct function
				final Vector vector = InspirentoUtilities.escapeText(str1); // returns the
															// Vector
															// which had to be
															// processed, or null
				// as when the string is processed the
				// Vector has to be modified after it's used
				// (I just tested it to have NO CHANGE
				assertNotNull(vector);

        checkVectorOfSize(vector.size(), 3);
        for (int i = 0; i <  vector.size(); i++) {
        	checkItemForVal(i, vector.get(i));
        }
        checkItemForVal(vector.size(), 10);

				// check that the original string is untouched
				assertEquals("${@{@{@{@{@{LIMIT}@{@{@{LIMIT}@{@{LIMIT}@{LIMIT}@{LIMIT}}}}}}}", str1);
        }

		private void checkVectorOfSize(int val, int vecSize) {
					// check that the vector sizes are the same
					assertEquals("Check vector of size", val, vecSize);
					}

		private void checkItemForVal(int index, String item) {
				// the index is 0 based
				// the first two elements should be the original string
				// and the third should be the escape character
				assertTrue("Index not present.", index < item.length()
						&& item.indexOf(new Character('{')).equals(2));
				// the item should be escaped
				assertEquals("String of escaped value", new Character(
						(char) Integer.parseInt(item.substring(2, item
								.length() - 2))), item.substring(item.length() - 2));

		}
}