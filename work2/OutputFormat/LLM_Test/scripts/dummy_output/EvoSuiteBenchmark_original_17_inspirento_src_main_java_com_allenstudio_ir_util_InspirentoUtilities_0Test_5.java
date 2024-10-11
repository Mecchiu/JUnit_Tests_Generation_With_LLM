// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
		
	final static Object[] TEST_CONSTANTS={null};

	/**
	* Test of tokenize method, of class com.allenstudio.ir.util.
	* {@link InspirentoUtilities#tokenize(String, Class)}
	*/
	@Test
	void tokenizeMethodTest() {
		String str = "file edit view";

		Vector<String> tokenized = null;

		Vector<String> returnVector = InspirentoUtilities.tokenize(str, String.class );
		

		assertEquals( TEST_CONSTANTS.length, returnVector.size());

		// check first token
		String token = returnVector.elementAt( 0 );
		assertEquals("file", token);

		tokenized = new Vector<String>();
		InspirentoUtilities.tokenize( str, tokenized );
		assertNotNull( tokenized);

		assertEquals( 3, tokenized.size());

		// check second token
		token = returnVector.get( 1 );
		assertEquals("edit", token);

		tokenized = new Vector<String>();
		InspirentoUtilities.tokenize( str, tokenized );
		assertNotNull( tokenized);

		assertEquals( 3, tokenized.size());

		// check third token
		token = returnVector.get( 2 );
		assertEquals("view", token);

		tokenized = new Vector<String>();
		InspirentoUtilities.tokenize( str, tokenized );
		assertNotNull( tokenized);

		assertEquals( 3, tokenized.size());

		


	}


}