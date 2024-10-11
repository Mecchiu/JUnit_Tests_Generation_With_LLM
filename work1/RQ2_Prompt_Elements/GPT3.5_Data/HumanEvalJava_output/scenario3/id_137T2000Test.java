// CompareOne.java
package scenario3;

class CompareOne {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,
     *
     * compareOne(1, 2.5) ➞ 2.5
     * compareOne(1, "2,3") ➞ "2,3"
     * compareOne("5,1", "6") ➞ "6"
     * compareOne("1", 1) ➞ None
     *
     * > compareOne(1, 2)
     * 2
     * > compareOne(1, 2.5)
     * 2.5
     * > compareOne(2, 3)
     * 3
     * > compareOne(5, 6)
     * 6
     * > compareOne(1, "2,3")
     * "2,3"
     * > compareOne("5,1", "6")
     * "6"
     * > compareOne("1", "2")
     * "2"
     * > compareOne("1", 1)
     * null
     */
    public static Object compareOne(Object a, Object b) {
        if (a instanceof String && b instanceof String) {
            String strA = (String) a;
            String strB = (String) b;
            strA = strA.replace(',', '.');
            strB = strB.replace(',', '.');
            double doubleA = Double.parseDouble(strA);
            double doubleB = Double.parseDouble(strB);
            if (doubleA > doubleB) {
                return a;
            } else if (doubleB > doubleA) {
                return b;
            } else {
                return null;
            }
        } else if (a instanceof String) {
            String strA = (String) a;
            strA = strA.replace(',', '.');
            double doubleA = Double.parseDouble(strA);
            if (doubleA > (double) b) {
                return a;
            } else if ((double) b > doubleA) {
                return b;
            } else {
                return null;
            }
        } else if (b instanceof String) {
            String strB = (String) b;
            strB = strB.replace(',', '.');
            double doubleB = Double.parseDouble(strB);
            if ((double) a > doubleB) {
                return a;
            } else if (doubleB > (double) a) {
                return b;
            } else {
                return null;
            }
        } else {
            if ((double) a > (double) b) {
                return a;
            } else if ((double) b > (double) a) {
                return b;
            } else {
                return null;
            }
        }
    }
}

// CompareOneTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
    @Test
    void testCompareOneIntegers() {
        assertEquals(2, CompareOne.compareOne(1, 2));
        assertEquals(2, CompareOne.compareOne(2, 1));
        assertNull(CompareOne.compareOne(1, 1));
    }

    @Test
    void testCompareOneFloats() {
        assertEquals(2.5, CompareOne.compareOne(1.5, 2.5));
        assertEquals(2.5, CompareOne.compareOne(2.5, 1.5));
        assertNull(CompareOne.compareOne(1.5, 1.5));
    }

    @Test
    void testCompareOneStrings() {
        assertEquals("2.3", CompareOne.compareOne("1.5", "2.3"));
        assertEquals("2.3", CompareOne.compareOne("2.3", "1.5"));
        assertEquals("2.3", CompareOne.compareOne("2,3", "1.5"));
        assertEquals("2,3", CompareOne.compareOne("1.5", "2,3"));
        assertNull(CompareOne.compareOne("1.5", "1.5"));
    }

    @Test
    void testCompareOneMixed() {
        assertEquals("2.3", CompareOne.compareOne("1.5", "2,3"));
        assertEquals("2.3", CompareOne.compareOne("2,3", "1.5"));
        assertEquals(2, CompareOne.compareOne("2", 1));
        assertEquals(2, CompareOne.compareOne(1, "2"));
        assertNull(CompareOne.compareOne("1", 1));
    }
}