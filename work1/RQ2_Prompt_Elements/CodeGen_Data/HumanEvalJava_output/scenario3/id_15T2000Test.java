// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains one unit test case for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
public static final StringSequenceTestTest TEST_CASE_0 = new StringSequenceTestTest();

    @Test
    public void test_0() {
        assertEquals("0", TEST_CASE_0.stringSequence(0));
    }

    @Test
    public void test_5() {
        assertEquals("0 1 2 3 4 5", TEST_CASE_0.stringSequence(5));
    }

    @Test
    public void test_10() {
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", TEST_CASE_0.stringSequence(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_100() {
        TEST_CASE_0.stringSequence(100);
    }
}
