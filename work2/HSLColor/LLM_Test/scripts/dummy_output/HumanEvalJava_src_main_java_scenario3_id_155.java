// EvenOddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
			@Test
    void evenOddCountTest1() {
        List<Integer> result = EvenOddCount.evenOddCount(7);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void evenOddCountTest2() {
        List<Integer> result = EvenOddCount.evenOddCount(-78);
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void evenOddCountTest3() {
        List<Integer> result = EvenOddCount.evenOddCount(3452);
        assertEquals(2, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void evenOddCountTest4() {
        List<Integer> result = EvenOddCount.evenOddCount(346211);
        assertEquals(3, result.get(0));
        assertEquals(3, result.get(1));
    }

    @Test
    void evenOddCountTest5() {
        List<Integer> result = EvenOddCount.evenOddCount(-345821);
        assertEquals(3, result.get(0));
        assertEquals(3, result.get(1));
    }

    @Test
    void evenOddCountTest6() {
        List<Integer> result = EvenOddCount.evenOddCount(-2);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void evenOddCountTest7() {
        List<Integer> result = EvenOddCount.evenOddCount(-45347);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
    }

    @Test
    void evenOddCountTest8() {
        List<Integer> result = EvenOddCount.evenOddCount(0);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void evenOddCountTest9() {
        List<Integer> result = EvenOddCount.evenOddCount(123);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void evenOddCountTest10() {
        List<Integer> result = EvenOddCount.evenOddCount(-12);
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }
}