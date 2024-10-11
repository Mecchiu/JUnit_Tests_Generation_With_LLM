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
		/**
		 * Verify the value is
		 * encoded properly.
		 */

		@Test
		public void test0() {
				assertEquals("&",String.valueOf(InspirentoUtilities.escapeText("&").charAt(0)));
				assertEquals("&",String.valueOf(InspirentoUtilities.escapeText("&").charAt(1)));
}
/**
 * Test case, used for ics package.
 *
 * @author <a href="mailto:Allen.Stuarte@gmail.com">Henner Eisen<BR>
 * @version <U>Java 1.5</U><BR>
 *          - Changed to use assertNotNull() in the assertion.
 */
public final class InspirentoUtilities_1_15_Test {

	@Test
	public void test1() {
		//
		System.out.print("Test for string in String class: ");
		System.out.println("Test for String.valueOf()   : ");
		//
		String s = InspirentoUtilities.stringValueOf("&");
		if (s!= null) {
			assertEquals("&",s);
			System.out.println("Test for String.valueOf() completed succesfully");
		} else {
			new Thread(InspirentoUtilities_1_15_Test.class).start();
		}

	}
}
}