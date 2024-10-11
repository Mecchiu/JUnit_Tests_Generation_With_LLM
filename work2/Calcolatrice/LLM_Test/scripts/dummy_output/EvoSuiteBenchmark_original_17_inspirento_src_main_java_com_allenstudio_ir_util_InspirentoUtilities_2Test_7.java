// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {
		
	/**
	 * This is a unit test for the new constructor {@link InspirentoUtilities#InspirentoUtilities_2(String[])}, which
	 * uses one unit test.
	 * {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} is called twice
	 * once.  This test is a slight difference.
	 */
	@Test
	void testStringReplaceAll() {
		String[] testArray = {
				"This is a test",
				null,
				null, null,
				null,
				"This is another test" };
		String testString = "This is another test";
		StringBuffer testStringBuffer = new StringBuffer(testString);
		
		for(int i=0;testArray[i]!= null;i++) {
			String testStringWithToken = "Token:"+i+": ";
			stringReplaceAll(testStringWithToken, '\t', testArray[i]);
		
			if(testArray[i]!= null) {
				assertEquals(
						null,
						testStringWithToken
						.replace(
							0,
							testStringWithToken.length(),
							(testArray[i]+" ")
							)
						);
			} // if
		} // for
		if(testStringBuffer.equals(testString)) {
			assertTrue("The original test string was not modified!",
					testString.equals(testStringBuffer));
		}
				//assertEquals(
				//		null,
				//		testStringBuffer.replace(0,testString.length(),
				//			"More words here")
				//		);
	} // testStringReplaceAll()
		
	
}