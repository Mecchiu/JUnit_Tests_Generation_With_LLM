// CompareOneTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
			// Test case 1: Test with two equal integers
    @Test
    void testCompareOne1() {
        Object a = 1;
        Object b = 1;
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 2: Test with two equal floats
    @Test
    void testCompareOne2() {
        Object a = 1.0f;
        Object b = 1.0f;
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 3: Test with two equal strings
    @Test
    void testCompareOne3() {
        Object a = "1";
        Object b = "1";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 4: Test with two equal strings containing a comma
    @Test
    void testCompareOne4() {
        Object a = "1,0";
        Object b = "1,0";
        Object expected = null;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 5: Test with two different integers
    @Test
    void testCompareOne5() {
        Object a = 1;
        Object b = 2;
        Object expected = 2;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 6: Test with two different floats
    @Test
    void testCompareOne6() {
        Object a = 1.0f;
        Object b = 2.0f;
        Object expected = 2.0f;
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 7: Test with two different strings
    @Test
    void testCompareOne7() {
        Object a = "1";
        Object b = "2";
        Object expected = "2";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 8: Test with two different strings containing a comma
    @Test
    void testCompareOne8() {
        Object a = "1,0";
        Object b = "2,0";
        Object expected = "2,0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 9: Test with two different strings containing a comma and a dot
    @Test
    void testCompareOne9() {
        Object a = "1,0";
        Object b = "2.0";
        Object expected = "2.0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
		// Test case 10: Test with two different strings containing a dot
    @Test
    void testCompareOne10() {
        Object a = "1.0";
        Object b = "2.0";
        Object expected = "2.0";
        Object actual = CompareOne.compareOne(a, b);
        assertEquals(expected, actual);
    }
}