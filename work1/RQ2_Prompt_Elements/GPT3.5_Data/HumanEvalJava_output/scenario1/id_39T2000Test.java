// PrimeFibTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {

    @Test
    void testPrimeFibWithZero() {
        assertEquals(0, PrimeFib.primeFib(0));
    }

    @Test
    void testPrimeFibWithOne() {
        assertEquals(2, PrimeFib.primeFib(1));
    }

    @Test
    void testPrimeFibWithTwo() {
        assertEquals(3, PrimeFib.primeFib(2));
    }

    @Test
    void testPrimeFibWithThree() {
        assertEquals(5, PrimeFib.primeFib(3));
    }

    @Test
    void testPrimeFibWithFour() {
        assertEquals(13, PrimeFib.primeFib(4));
    }

    @Test
    void testPrimeFibWithFive() {
        assertEquals(89, PrimeFib.primeFib(5));
    }

    @Test
    void testPrimeFibWithSix() {
        assertEquals(233, PrimeFib.primeFib(6));
    }

    @Test
    void testPrimeFibWithSeven() {
        assertEquals(1597, PrimeFib.primeFib(7));
    }

    @Test
    void testPrimeFibWithEight() {
        assertEquals(28657, PrimeFib.primeFib(8));
    }

    @Test
    void testPrimeFibWithNine() {
        assertEquals(514229, PrimeFib.primeFib(9));
    }
}