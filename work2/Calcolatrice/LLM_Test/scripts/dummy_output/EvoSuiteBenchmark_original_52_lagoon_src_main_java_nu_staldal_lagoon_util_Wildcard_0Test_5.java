// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {
		/**
		 * Default constructor.
		*/
	public Wildcard_0Test() {
		super();
	}

    /**
     * Test method for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    public void testIsWildcard() {
	    String wildcard = "*.test";
		assertTrue(Wildcard.isWildcard(wildcard));
    }

}