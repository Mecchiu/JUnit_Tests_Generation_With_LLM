// ChangeBase.java
package scenario3;

class ChangeBase {

    /**
     * Change numerical base of input number x to base.
     * return string representation after the conversion.
     * base numbers are less than 10.
     *
     * > changeBase(8, 3)
     * "22"
     * > changeBase(8, 2)
     * "1000"
     * > changeBase(7, 2)
     * "111"
     * > changeBase(8, 3)
     * "22"
     * > changeBase(9, 3)
     * "100"
     * > changeBase(234, 2)
     * "11101010"
     * > changeBase(16, 2)
     * "10000"
     * > changeBase(8, 2)
     * "1000"
     * > changeBase(7, 2)
     * "111"
     * > changeBase(2, 3)
     * "2"
     * > changeBase(3, 4)
     * "3"
     * > changeBase(4, 5)
     * "4"
     * > changeBase(5, 6)
     * "5"
     * > changeBase(6, 7)
     * "6"
     * > changeBase(7, 8)
     * "7"
     */
    public static String changeBase(int x, int base) {
        if (base < 2 || base > 9) {
            throw new IllegalArgumentException("Base must be between 2 and 9");
        }
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(x % base);
            x /= base;
        }
        return sb.reverse().toString();
    }
}

// ChangeBaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {
    @Test
    void testChangeBase() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("22", ChangeBase.changeBase(8, 3));
        assertEquals("100", ChangeBase.changeBase(9, 3));
        assertEquals("11101010", ChangeBase.changeBase(234, 2));
        assertEquals("10000", ChangeBase.changeBase(16, 2));
        assertEquals("1000", ChangeBase.changeBase(8, 2));
        assertEquals("111", ChangeBase.changeBase(7, 2));
        assertEquals("2", ChangeBase.changeBase(2, 3));
        assertEquals("3", ChangeBase.changeBase(3, 4));
        assertEquals("4", ChangeBase.changeBase(4, 5));
        assertEquals("5", ChangeBase.changeBase(5, 6));
        assertEquals("6", ChangeBase.changeBase(6, 7));
        assertEquals("7", ChangeBase.changeBase(7, 8));
    }
}