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
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void test() {
        // given
        String pattern_1 = "*.*";
        String pattern_2 = "*.*";
        
        // when
        String result = Wildcard.matchWildcard(pattern_1, pattern_2);
        
        // then
        assertNotNull(result);
        assertEquals("".getBytes().length, result.length());
    }

}