import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryCalculate_1Test {

    @Test
    public void testSubBinary1() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1010", "0101");
        assertEquals("0101", result);
    }

    @Test
    public void testSubBinary2() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1111", "0001");
        assertEquals("1110", result);
    }

    @Test
    public void testSubBinary3() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1100", "1010");
        assertEquals("0010", result);
    }

    @Test
    public void testSubBinary4() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("1001", "0110");
        assertEquals("0011", result);
    }

    @Test
    public void testSubBinary5() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("11111111", "00000001");
        assertEquals("11111110", result);
    }

    @Test
    public void testSubBinary6() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("10101010", "01010101");
        assertEquals("01010101", result);
    }

    @Test
    public void testSubBinary7() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("11110000", "00001111");
        assertEquals("11101111", result);
    }

    @Test
    public void testSubBinary8() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("11001100", "00110011");
        assertEquals("10011001", result);
    }

    @Test
    public void testSubBinary9() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("11111111", "11111111");
        assertEquals("00000000", result);
    }

    @Test
    public void testSubBinary10() {
        BinaryCalculate bc = new BinaryCalculate();
        String result = bc.subBinary("00000000", "11111111");
        assertEquals("00000001", result);
    }
}