// StringSequenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains one unit test case for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

    /**
     * Verify that the {@link StringSequence#stringSequence(int)} method
     * returns the expected string sequence.
     */
    @Test
    void testStringSequence() {
        StringSequence strSeq = new StringSequence();
        assertEquals("The sequence contains 123 elements", "123", strSeq.stringSequence(4));
        assertEquals("The sequence contains 43 elements", "43,43", strSeq.stringSequence(10));
        assertEquals("The sequence contains 12 elements", "12", strSeq.stringSequence(19));
        assertEquals("The sequence contains 15 elements", "15,15,15", strSeq.stringSequence(20));
    }

}