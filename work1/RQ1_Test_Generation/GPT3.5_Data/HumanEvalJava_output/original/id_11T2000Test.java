```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringXorTest {

    @Test
    void testStringXor1() {
        assertEquals("100", StringXor.stringXor("010", "110"));
    }

    @Test
    void testStringXor2() {
        assertEquals("010010", StringXor.stringXor("111000", "101010"));
    }

    @Test
    void testStringXor3() {
        assertEquals("0", StringXor.stringXor("1", "1"));
    }

    @Test
    void testStringXor4() {
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
    }

    @Test
    void testStringXor5() {
        assertEquals("110", StringXor.stringXor("101", "011"));
    }

    @Test
    void testStringXor6() {
        assertEquals("111", StringXor.stringXor("000", "111"));
    }

    @Test
    void testStringXor7() {
        assertEquals("101010", StringXor.stringXor("101010", "000000"));
    }

    @Test
    void testStringXor8() {
        assertEquals("111111", StringXor.stringXor("111111", "000000"));
    }

    @Test
    void testStringXor9() {
        assertEquals("000000", StringXor.stringXor("111111", "111111"));
    }

    @Test
    void testStringXor10() {
        assertEquals("111111", StringXor.stringXor("000000", "000000"));
    }
}
```