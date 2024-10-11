// Here's an example of how you can write unit tests for the CompareOne class using JUnit 5:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareOneTest {

    @Test
    void testCompareOneWithEqualFloats() {
        Object a = 1.23f;
        Object b = 1.23f;
        assertNull(CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithDifferentFloats() {
        Object a = 1.23f;
        Object b = 4.56f;
        assertEquals(b, CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithEqualIntegers() {
        Object a = 42;
        Object b = 42;
        assertNull(CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithDifferentIntegers() {
        Object a = 42;
        Object b = 1337;
        assertEquals(b, CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithEqualStrings() {
        Object a = "3.14";
        Object b = "3.14";
        assertNull(CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithDifferentStrings() {
        Object a = "3.14";
        Object b = "2.72";
        assertEquals(a, CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithMixedTypes() {
        Object a = 3.14f;
        Object b = "2.72";
        assertEquals(a, CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithNull() {
        Object a = null;
        Object b = 42;
        assertEquals(b, CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithNulls() {
        Object a = null;
        Object b = null;
        assertNull(CompareOne.compareOne(a, b));
    }

    @Test
    void testCompareOneWithInvalidInput() {
        Object a = "foo";
        Object b = "bar";
        assertThrows(NumberFormatException.class, () -> CompareOne.compareOne(a, b));
    }
}