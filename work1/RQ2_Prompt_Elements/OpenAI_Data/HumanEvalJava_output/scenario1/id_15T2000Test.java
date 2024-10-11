// StringSequenceTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
	// Test case 1
    @Test
    void stringSequenceTest1() {
        assertEquals("0", StringSequence.stringSequence(0));
    }

    // Test case 2
    @Test
    void stringSequenceTest2() {
        assertEquals("0 1", StringSequence.stringSequence(1));
    }

    // Test case 3
    @Test
    void stringSequenceTest3() {
        assertEquals("0 1 2", StringSequence.stringSequence(2));
    }

    // Test case 4
    @Test
    void stringSequenceTest4() {
        assertEquals("0 1 2 3", StringSequence.stringSequence(3));
    }

    // Test case 5
    @Test
    void stringSequenceTest5() {
        assertEquals("0 1 2 3 4", StringSequence.stringSequence(4));
    }

    // Test case 6
    @Test
    void stringSequenceTest6() {
        assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
    }

    // Test case 7
    @Test
    void stringSequenceTest7() {
        assertEquals("0 1 2 3 4 5 6", StringSequence.stringSequence(6));
    }

    // Test case 8
    @Test
    void stringSequenceTest8() {
        assertEquals("0 1 2 3 4 5 6 7", StringSequence.stringSequence(7));
    }

    // Test case 9
    @Test
    void stringSequenceTest9() {
        assertEquals("0 1 2 3 4 5 6 7 8", StringSequence.stringSequence(8));
    }

    // Test case 10
    @Test
    void stringSequenceTest10() {
        assertEquals("0 1 2 3 4 5 6 7 8 9", StringSequence.stringSequence(9));
    }
}
