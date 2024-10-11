// ChooseNum.java
package scenario3;

class ChooseNum {

    /**
     * This function takes two positive numbers x and y and returns the
     * biggest even integer number that is in the range [x, y] inclusive. If
     * there's no such number, then the function should return -1.
     *
     * For example:
     * chooseNum(12, 15) = 14
     * chooseNum(13, 12) = -1
     *
     * > chooseNum(12, 15)
     * 14
     * > chooseNum(13, 12)
     * -1
     * > chooseNum(33, 12354)
     * 12354
     * > chooseNum(5234, 5233)
     * -1
     * > chooseNum(6, 29)
     * 28
     * > chooseNum(27, 10)
     * -1
     * > chooseNum(7, 7)
     * -1
     * > chooseNum(546, 546)
     * 546
     */
    public static int chooseNum(int x, int y) {
        if (x > y) {
            return -1;
        }
        int maxEven = -1;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0 && i > maxEven) {
                maxEven = i;
            }
        }
        return maxEven;
    }
}

// ChooseNumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
    @Test
    void testChooseNum1() {
        assertEquals(14, ChooseNum.chooseNum(12, 15));
    }

    @Test
    void testChooseNum2() {
        assertEquals(-1, ChooseNum.chooseNum(13, 12));
    }

    @Test
    void testChooseNum3() {
        assertEquals(12354, ChooseNum.chooseNum(33, 12354));
    }

    @Test
    void testChooseNum4() {
        assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
    }

    @Test
    void testChooseNum5() {
        assertEquals(28, ChooseNum.chooseNum(6, 29));
    }

    @Test
    void testChooseNum6() {
        assertEquals(-1, ChooseNum.chooseNum(27, 10));
    }

    @Test
    void testChooseNum7() {
        assertEquals(-1, ChooseNum.chooseNum(7, 7));
    }

    @Test
    void testChooseNum8() {
        assertEquals(546, ChooseNum.chooseNum(546, 546));
    }

    @Test
    void testChooseNum9() {
        assertEquals(-1, ChooseNum.chooseNum(3, 5));
    }

    @Test
    void testChooseNum10() {
        assertEquals(10, ChooseNum.chooseNum(10, 10));
    }
}