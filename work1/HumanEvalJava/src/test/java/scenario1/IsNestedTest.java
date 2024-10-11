// IsNestedTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {
			// Test case 1
    @Test
    void testIsNested1() {
        String string = "[]";
        Boolean expResult = false;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testIsNested2() {
        String string = "[][]";
        Boolean expResult = false;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testIsNested3() {
        String string = "[[]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testIsNested4() {
        String string = "[[][]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testIsNested5() {
        String string = "[[[]]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testIsNested6() {
        String string = "[[[][]]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testIsNested7() {
        String string = "[[[]]][[]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testIsNested8() {
        String string = "[[[]]][[]][[]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testIsNested9() {
        String string = "[[[]]][[]][[]][[]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testIsNested10() {
        String string = "[[[]]][[]][[]][[]][[]]";
        Boolean expResult = true;
        Boolean result = IsNested.isNested(string);
        assertEquals(expResult, result);
    }
}