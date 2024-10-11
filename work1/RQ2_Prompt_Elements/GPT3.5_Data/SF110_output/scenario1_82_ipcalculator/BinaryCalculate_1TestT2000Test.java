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
        String result = bc.subBinary("1010", "110");
        assertEquals("1000", result);
    }
    
    @Test
    void testSubBinary2() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1111", "101");
        assertEquals("1010", result);
    }
    
    @Test
    void testSubBinary3() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1100", "1011");
        assertEquals("1", result);
    }
    
    @Test
    void testSubBinary4() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1001", "111");
        assertEquals("110", result);
    }
    
    @Test
    void testSubBinary5() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("101010", "10101");
        assertEquals("100001", result);
    }
    
    @Test
    void testSubBinary6() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("111111", "111111");
        assertEquals("0", result);
    }
    
    @Test
    void testSubBinary7() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("101", "101");
        assertEquals("0", result);
    }
    
    @Test
    void testSubBinary8() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1101", "101");
        assertEquals("1000", result);
    }
    
    @Test
    void testSubBinary9() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("111", "10");
        assertEquals("101", result);
    }
    
    @Test
    void testSubBinary10() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1001", "1101");
        assertEquals("110", result);
    }
}