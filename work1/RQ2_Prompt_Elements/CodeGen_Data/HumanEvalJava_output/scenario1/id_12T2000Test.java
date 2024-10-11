// LongestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains one unit test case for the {@link Longest#longest(List)} method.
*/
class LongestTest {

	// Test cases.
	@Test
	void test01() {
        // System.out.println(new Longest().longest(Arrays.asList("a")).toString());  
        assertEquals("Longest:", "a", new Longest().longest("a").toString());
	}
	
	@Test 
	void test02() {
        // System.out.println(new Longest().longest(Arrays.asList("a", "b", "c")).toString());  
        assertEquals("Longest:", "b", new Longest().longest("a", null, "b").toString());
	}
	
	@Test 
	void test03() {
        // System.out.println(new Longest().longest(Arrays.asList("a", "b", "c", "d", "e")).toString());  
        assertEquals("Longest:", "a b c d e", new Longest().longest("a", "b", "c", "d", null).toString());
	}
	
}

// Longest.java