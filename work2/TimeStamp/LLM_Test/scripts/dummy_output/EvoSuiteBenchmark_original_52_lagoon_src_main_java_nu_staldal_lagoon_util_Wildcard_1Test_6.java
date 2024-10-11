// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		
    //------------------------------------------------------- Member Data ---------------

    private final String simplePattern = "^(test)";
    private final String complexPattern = ".*\1test$";

    private List<String> complexPatterns;

    //------------------------------------------------------- Constructors ---------------

    //------------------------------------------------------- Test Methods 


	//------------------------------------------------------- public data ---------------

	@Test
	public void test_simpleWildcard() {

		// Given
		List<String> patterns = new ArrayList<>();

		// When
		String substituted = matchWildcard(simplePattern, "test.txt");

		// Assert
		assertNotNull(substituted);
		assertNotNull(substituted.matches("test.txt"));
		logln(substituted);

	}

	@Test
	public void test_complexWildcard() {

		// Given
		List<String> patterns = new ArrayList<>();

		// When
		String substituted = matchWildcard(complexPattern, "test.txt");

		// Assert
		assertNotNull(substituted);
		assertNotNull(substituted.matches("test$1.txt"));
		logln(substituted);
	}

	@Test
	public void test_wildcards_1() {

		// Given a single string of patterns
		List<String> patterns = new ArrayList<>();

		// The wildcard pattern is '1.txt' and simple pattern is 'test1'
		patterns.add("1.txt");

		// As 'test.txt' is part of the wildcard pattern, '*' is part of the simple pattern.
		patterns.add("*");

		// Create a list of patterns we will match if matchWildcard() is called.
		List<String> simplePatterns = new ArrayList<>();

		// Add simple pattern matching
		simplePatterns.add("test");
		simplePatterns.add(".*");

		// Construct a list of potential matches
		List<String> matches = new ArrayList<>();
		matches.add(simplePattern);
		matches.add("test.txt");

		// Now match the list of potential matches
		String substituted = matchWildcard(patterns, "test.txt");

		// Assert that at least one match has been made
		assertNotNull(substituted);
		assertTrue(substituted.matches("test.*"));
		assertFalse(substituted.matches("test.txt"));

		// Match the list of potential matches
		String actual = matchWildcard(substituted, simplePattern);

		// Assert that the returned string is exactly what was expected
		assertEquals(substituted, actual);

	}


		//------------------------------------------------------- Static methods ---------------


	/**
	 * This method will be invoked before the test cases are run.
	 * It is invoked by LTL.Tac.
	 */
	static void initTestCase_1() {
	}



	/**
	 * This method will be invoked after the test cases have run.
	 * This method is invoked by LTL.Tac.
	 */
	static void cleanupTestCase_1() {
	}

	/**
	 * This method will be invoked after the tests have been completed.
	 * This method is invoked by LTL.Tac
	 */
	static void endTestCase_1() {
	}

    //------------------------------------------------------- Static methods ---------------


}