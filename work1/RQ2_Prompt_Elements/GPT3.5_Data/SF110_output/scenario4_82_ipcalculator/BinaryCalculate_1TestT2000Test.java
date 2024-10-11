// BinaryCalculate_1Test.java
package ipac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BinaryCalculate}.
 * It contains ten unit test cases for the {@link BinaryCalculate#subBinary(String, String)} method.
 */
class BinaryCalculate_1Test {

    @Test
    void testSubBinary1() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1010", "0011");
        assertEquals("1001", result);
    }

    @Test
    void testSubBinary2() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1111", "0001");
        assertEquals("1110", result);
    }

    @Test
    void testSubBinary3() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1100", "0101");
        assertEquals("0111", result);
    }

    @Test
    void testSubBinary4() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1001", "0110");
        assertEquals("0011", result);
    }

    @Test
    void testSubBinary5() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("101010", "010101");
        assertEquals("010101", result);
    }

    @Test
    void testSubBinary6() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("111111", "111111");
        assertEquals("000000", result);
    }

    @Test
    void testSubBinary7() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("100000", "000001");
        assertEquals("011111", result);
    }

    @Test
    void testSubBinary8() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("111000", "001111");
        assertEquals("101001", result);
    }

    @Test
    void testSubBinary9() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("110011", "001100");
        assertEquals("100111", result);
    }

    @Test
    void testSubBinary10() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1111111111", "0000000001");
        assertEquals("1111111110", result);
    }
}