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
		
	@Test
	void testTokenize() {
		assertNotNull("Result is not null", tokenize(new String("")));
	}

	@Test
	void testTokenize_Null() {
		String token = null;
		Vector result = tokenize(token);
		assertNull("Result is null", result);
	}

	@Test
	void testTokenize_S() {
		String token = "";
		Vector result = tokenize(token);
		assertEquals("Result does not contain the token", 0, result.size());
	}

	@Test
	void testTokenize_Str() {
		String token = "file";
		Vector result = tokenize(token);
		assertEquals("Result does not contain the token", 0, result.size());
	}

	@Test
	void testTokenize_V() {
		String token = new Vector();
		Vector result = tokenize(token);
		assertNull("Result is null", result);
	}
	
	/**
	 * Test of {@link InspirentoUtilities#tokenize(String)}
	 * for the empty string.
	 */
	@Test
	void testNullWithEmptyString() {
		String token = "";
		Vector result = tokenize(token);
		assertNull("Result is null", result);
	}

	/**
	 * Test of {@link InspirentoUtilities#tokenize(String)}
	 * for the non empty string with tokens.
	 */
	@Test
	void testNullWithNonEmptyString() {
		String token = null;
		Vector result = tokenize(token);
		assertNotNull("Result is null", result);

		assertEquals("Length", 0, result.size());
	}

	/**
	 * Test of {@link InspirentoUtilities#tokenize(String)}
	 * for the single string
	 */
	@Test
	void testSingleString() {
		String token = "file";
		Vector result = tokenize(token);
		assertEquals("Result is " + token, 1, result.size());
	}

	@Test
	void testTokenize_Int() {
		String token = 0;
		Vector result = tokenize(token);
		assertEquals("Result does not contain the token", 0, result.size());
	}
	
	@Test
	void testTokenize_Str_Int() {
		String token = new String("a");
		Vector result = tokenize(token);
		assertEquals("Result does not contain the token", 1, result.size());
	}

	@Test
	void testTokenize_VInt() {
		String token = new Vector();
		Vector result = tokenize(token);
		assertEquals("Result does not contain the token", 1, result.size());
	}

	@Test
	void testTokenize_VInt_Str() {
		String token = new Vector();
		Vector result = tokenize(token);
		assertNotNull("Result is null", result);

		assertEquals("Result does not contain the token", 1, result.size());
	}
	
	@Test
	void testTokenize_StrStr() {
		String token = null;

		try {
			tokenize(token);

			fail("Expected RuntimeException");
		} catch (RuntimeException e) {
			assertNotNull("Result is null", e.getMessage());
		}
	}
	
	@Test
	void testTokenize_StrV() {
		String token = new Vector();

		try {
			tokenize(token);

			fail("Expected RuntimeException");
		} catch (RuntimeException e) {
			assertNotNull("Result is null", e.getMessage());
		}
	}
	
	
	@Test
	void testTokenize_VStr() {
		String token = new Vector();

		try {
			tokenize(token);

			fail("Expected RuntimeException");
		} catch (RuntimeException e) {
			assertEquals("Result does not equal the token", null, e.getMessage());
		}
	}
	
	@Test
	void testTokenize_VStrStr() {
		String token = new Vector();

		try {
			tokenize(token);

			fail("Expected RuntimeException");
		} catch (RuntimeException e) {
			assertEquals("Result does not equal the token", null, e.getMessage());
		}
	}
	
	
	@Test
	void testTokenize_VStrInt() {
		String token = new Vector();

		try {
			tokenize(token);

			fail("Expected RuntimeException");
		} catch (RuntimeException e) {
			assertEquals("Result does not equal the token", null, e.getMessage());
		}
	}
	
	
}