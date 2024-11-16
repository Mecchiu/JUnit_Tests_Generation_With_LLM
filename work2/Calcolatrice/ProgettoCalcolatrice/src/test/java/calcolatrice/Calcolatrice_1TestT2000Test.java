// Calcolatrice_1Test.java

package calcolatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Calcolatrice}.
 * It contains ten unit test cases for the {@link Calcolatrice#subtract(int, int)} method.
 */
class Calcolatrice_1Test {

    @Test
    void testSubtractPositiveNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.subtract(4, 3));
    }

    @Test
    void testSubtractNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.subtract(-2, -3));
    }

    @Test
    void testSubtractPositiveAndNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(7, calcolatrice.subtract(4, -3));
    }

    @Test
    void testSubtractZeroFromPositiveNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(3, calcolatrice.subtract(3, 0));
    }

    @Test
    void testSubtractZeroFromNegativeNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-3, calcolatrice.subtract(-3, 0));
    }

    @Test
    void testSubtractLargeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(0, calcolatrice.subtract(1000000000, 1000000000));
    }

    @Test
    void testSubtractSmallNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(0, calcolatrice.subtract(1, 1));
    }

    @Test
    void testSubtractNumberFromItself() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(0, calcolatrice.subtract(3, 3));
    }

    @Test
    void testSubtractFromMaxInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MAX_VALUE - 1, calcolatrice.subtract(Integer.MAX_VALUE, 1));
    }

    @Test
    void testSubtractFromMinInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MIN_VALUE + 1, calcolatrice.subtract(Integer.MIN_VALUE, -1));
    }
}
