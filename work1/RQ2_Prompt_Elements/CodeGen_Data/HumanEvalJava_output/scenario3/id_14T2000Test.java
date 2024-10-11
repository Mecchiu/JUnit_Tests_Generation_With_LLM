// AllPrefixesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains one unit test case for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

    /**
     * Set test case for allPrefixes.
     */
    @Test
    void testAllPrefixes() {
    	
    	// set test cases for allPrefixes.
        assertEquals("", 
                     AllPrefixes.allPrefixes(""));

    	assertEquals("", 
                     AllPrefixes.allPrefixes(""));
    	
    	assertEquals("", 
                     AllPrefixes.allPrefixes("abc"));
    	
    	assertEquals("", 
                     AllPrefixes.allPrefixes("abc"));
 
    	assertEquals("", 
                     AllPrefixes.allPrefixes("abc"));
             
		String a = "a";
		String b = "b";
		String c = "c";
		
		List<String> d = AllPrefixes.allPrefixes(a);
		List<String> e = AllPrefixes.allPrefixes(b);
		List<String> f = AllPrefixes.allPrefixes(c);
		
		assertEquals(d.size(), 2);
		assertTrue(d.containsAll(e));
		assertTrue(d.containsAll(f));
    	
    	assertEquals(a,
                     AllPrefixes.allPrefixes("abcd"));
    	
    	assertEquals(b,
                     AllPrefixes.allPrefixes("abcd"));
    
    	assertEquals(e,
                     AllPrefixes.allPrefixes(c));
    	
    	assertEquals(c,
                     AllPrefixes.allPrefixes(c));
    	
		assertEquals(e,
                     AllPrefixes.allPrefixes(c));
    	
    	assertEquals(f,
                     AllPrefixes.allPrefixes("asdg"));
	}
    
    // classOfAllPrefixes.
    classOfAllPrefixes {}
        
    // classOfAllPrefixes3.
    classOfAllPrefixes3 {}
}