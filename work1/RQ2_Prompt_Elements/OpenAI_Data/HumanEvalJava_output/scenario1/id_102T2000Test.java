// ChooseNumTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
	// Test case 1
    @Test
    void testChooseNum1() {
        int result = ChooseNum.chooseNum(1, 10);
        assertEquals(10, result);
    }

    // Test case 2
    @Test
    void testChooseNum2() {
        int result = ChooseNum.chooseNum(1, 11);
        assertEquals(10, result);
    }

    // Test case 3
    @Test
    void testChooseNum3() {
        int result = ChooseNum.chooseNum(1, 12);
        assertEquals(12, result);
    }

    // Test case 4
    @Test
    void testChooseNum4() {
        int result = ChooseNum.chooseNum(1, 13);
        assertEquals(12, result);
    }

    // Test case 5
    @Test
    void testChooseNum5() {
        int result = ChooseNum.chooseNum(1, 14);
        assertEquals(14, result);
    }

    // Test case 6
    @Test
    void testChooseNum6() {
        int result = ChooseNum.chooseNum(1, 15);
        assertEquals(14, result);
    }

    // Test case 7
    @Test
    void testChooseNum7() {
        int result = ChooseNum.chooseNum(1, 16);
        assertEquals(16, result);
    }

    // Test case 8
    @Test
    void testChooseNum8() {
        int result = ChooseNum.chooseNum(1, 17);
        assertEquals(16, result);
    }

    // Test case 9
    @Test
    void testChooseNum9() {
        int result = ChooseNum.chooseNum(1, 18);
        assertEquals(18, result);
    }

    // Test case 10
    @Test
    void testChooseNum10() {
        int result = ChooseNum.chooseNum(1, 19);
        assertEquals(18, result);
    }
}
