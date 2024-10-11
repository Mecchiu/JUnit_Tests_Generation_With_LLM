// StringXor.java
package scenario3;

class StringXor {

    /**
     * Input are two strings a and b consisting only of 1s and 0s.
     * Perform binary XOR on these inputs and return result also as a string.
     *
     * > stringXor("010", "110")
     * "100"
     * > stringXor("111000", "101010")
     * "010010"
     * > stringXor("1", "1")
     * "0"
     * > stringXor("0101", "0000")
     * "0101"
     */
    public static String stringXor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }
}

// StringXorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
    @Test
    void testStringXor() {
        assertEquals("100", StringXor.stringXor("010", "110"));
        assertEquals("010010", StringXor.stringXor("111000", "101010"));
        assertEquals("0", StringXor.stringXor("1", "1"));
        assertEquals("0101", StringXor.stringXor("0101", "0000"));
        assertEquals("111111", StringXor.stringXor("111111", "000000"));
        assertEquals("000000", StringXor.stringXor("000000", "000000"));
        assertEquals("101010", StringXor.stringXor("111111", "010101"));
        assertEquals("111111", StringXor.stringXor("000000", "111111"));
        assertEquals("000000", StringXor.stringXor("000000", "111111"));
        assertEquals("111111", StringXor.stringXor("111111", "111111"));
    }
}