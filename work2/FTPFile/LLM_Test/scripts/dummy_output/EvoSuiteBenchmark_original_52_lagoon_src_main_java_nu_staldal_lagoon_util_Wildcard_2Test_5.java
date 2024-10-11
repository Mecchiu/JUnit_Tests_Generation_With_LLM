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
		public static void match_2(String pattern, String part){
            assertEquals("p=test.txt", pattern);
            assertEquals("test.txt", InstantiateWildcard(pattern, part).toString());
        }
        
		@Test(expected=IllegalArgumentException.class)
		public void testWithNullPattern_ThrowException() {
		    Wildcard.instantiateWildcard(null, null);
		}
		
		@Test(expected=IllegalArgumentException.class)
		public void testWithNullPart_ThrowException(){
			Wildcard.instantiateWildcard(pattern, null);
		}
		
		@Test(expected=IllegalArgumentException.class)
		public void testWithEmptyPart_ThrowException(){
			Wildcard.instantiateWildcard("*", null);
		}
        
	}