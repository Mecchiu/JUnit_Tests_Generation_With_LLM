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

	@Test
	void stringReplaceAllString() throws Exception {
		assertSame("First string", "someString", InspirentoUtilities.stringReplaceAll("someString", 'a', "someString2"));
		assertEquals("Second string", "someString2", InspirentoUtilities.stringReplaceAll("someString", 'a', "someString2"));
	}
	
	@Test
	void stringReplaceAllStringString() throws Exception {
		assertSame("First string", "someString", InspirentoUtilities.stringReplaceAll("someString", 'a', "someString2", "someString3"));
		assertEquals("Second string", "someString2", InspirentoUtilities.stringReplaceAll("someString", 'a', "someString2", "someString3"));
	}
	
}

// Test Vector implementation
class TestVector {
	Vector testList;
	
     public TestVector(Vector list1) {
         testList = list1;
     }
}
