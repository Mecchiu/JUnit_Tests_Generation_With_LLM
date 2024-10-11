// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {

    @Test void test() {
        assertTrue("The wildcard pattern must be present", Wildcard.instantiateWildcard("*")!= null);
        assertTrue("The wildcard pattern may have only one part", "*"+Wildcard.instantiateWildcard("*")!= "");
        assertTrue("The wildcard pattern may not be empty", "*"+Wildcard.instantiateWildcard("","")!= "");
        assertTrue("The wildcard pattern may contain one or more '*'", "*"+Wildcard.instantiateWildcard("*","")!= "");
        assertTrue("The wildcard pattern with a wildcard pattern does not contain one or more '*'", "*"+Wildcard.instantiateWildcard("*.","")!= "");
        assertTrue("The wildcard pattern with a wildcard pattern does not contain one or more '*'", "*"+Wildcard.instantiateWildcard("*..","", false)!= "");
        assertTrue("The wildcard pattern with a wildcard pattern must not contain a '*' at the end", "*"+Wildcard.instantiateWildcard("", "...")!= "");
		
    }
}
