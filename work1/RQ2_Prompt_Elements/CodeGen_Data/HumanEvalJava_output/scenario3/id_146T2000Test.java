// SpecialfilterTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains one unit test case for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
/**
		 * Do an Array.filter() test
		 */
    @Test
    void testArrayFilter() {
    	assertEquals(0, nums.filter(new IsOddFunction()).size());
    	assertEquals("testIsOddFunctionArrayFilter", 1, nums.filter(new IsOddFunction(true)).size());
    	assertEquals(3, nums.filter(new IsOddFunction(false)).size());
    	assertEquals("testIsOddFunctionArrayFilter2", 2, nums.filter(new IsOddFunction(true, false)).size());
    }
		/**
		 * Do an Iterator.filter() test
		 */
    @Test
    void testIteratorFilter() {
    	assertEquals(0, nums.filter(new IsOddFunction()).size());
    	assertEquals("testIsOddFunctionIteratorFilter", 1, nums.filter(new IsOddFunction(true)).size());
    	assertEquals(3, nums.filter(new IsOddFunction(false)).size());
    	assertEquals("testIsOddFunctionIteratorFilter2", 2, nums.filter(new IsOddFunction(true, false)).size());
    }
}

// SpecialfilterTest_noArg_java.java
