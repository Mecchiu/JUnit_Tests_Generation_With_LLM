// StringSequence.java
package scenario3;

class StringSequence {

    /**
     * Return a string containing space-delimited numbers starting from 0 up to n inclusive.
     *
     * > stringSequence(0)
     * "0"
     * > stringSequence(5)
     * "0 1 2 3 4 5"
     * > stringSequence(0)
     * "0"
     * > stringSequence(3)
     * "0 1 2 3"
     * > stringSequence(10)
     * "0 1 2 3 4 5 6 7 8 9 10"
     */
    public static String stringSequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
}

// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
    
    @Test
    void testStringSequenceWithZero() {
        assertEquals("0", StringSequence.stringSequence(0));
    }
    
    @Test
    void testStringSequenceWithFive() {
        assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
    }
    
    @Test
    void testStringSequenceWithThree() {
        assertEquals("0 1 2 3", StringSequence.stringSequence(3));
    }
    
    @Test
    void testStringSequenceWithTen() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
    }
    
    @Test
    void testStringSequenceWithNegativeNumber() {
        assertEquals("", StringSequence.stringSequence(-1));
    }
    
    @Test
    void testStringSequenceWithLargeNumber() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", StringSequence.stringSequence(20));
    }
    
    @Test
    void testStringSequenceWithMaxValue() {
        assertEquals("", StringSequence.stringSequence(Integer.MAX_VALUE));
    }
    
    @Test
    void testStringSequenceWithOne() {
        assertEquals("0 1", StringSequence.stringSequence(1));
    }
    
    @Test
    void testStringSequenceWithTwo() {
        assertEquals("0 1 2", StringSequence.stringSequence(2));
    }
    
    @Test
    void testStringSequenceWithEmptyString() {
        assertEquals("", StringSequence.stringSequence(0));
    }
}