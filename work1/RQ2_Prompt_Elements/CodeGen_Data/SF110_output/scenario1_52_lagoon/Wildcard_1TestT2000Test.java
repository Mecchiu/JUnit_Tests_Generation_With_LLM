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

	/**
	* Test method for
	* {@link Wildcard#matchWildcard(String, String)}(String, String[])}.
	* No test method.
	* No exception should be expected.
	*/
    @Test
	public void testMatchWildcard(String fileName) {
		System.out.println("matchWildcard: "+ Wildcard.matchWildcard(fileName, "java"));
	}
}
