// Calcolatrice_2Test.java

package calcolatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Calcolatrice}.
 * It contains ten unit test cases for the {@link Calcolatrice#multiply(int, int)} method.
 */
class Calcolatrice_2Test {

    @Test
    void testMultiplyPositiveNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(12, calcolatrice.multiply(4, 3));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(6, calcolatrice.multiply(-2, -3));
    }

    @Test
    void testMultiplyPositiveAndNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-12, calcolatrice.multiply(4, -3));
    }

    @Test
    void testMultiplyWithZero() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(0, calcolatrice.multiply(3, 0));
    }

    @Test
    void testMultiplyLargeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1000000000000L, calcolatrice.multiply(1000000, 1000000));
    }

    @Test
    void testMultiplySmallNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.multiply(1, 1));
    }

    @Test
    void testMultiplyNumberWithOne() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(3, calcolatrice.multiply(3, 1));
    }

    @Test
    void testMultiplyNumberWithNegativeOne() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-3, calcolatrice.multiply(3, -1));
    }

    @Test
    void testMultiplyWithMaxInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MAX_VALUE, calcolatrice.multiply(1, Integer.MAX_VALUE));
    }

    @Test
    void testMultiplyWithMinInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MIN_VALUE, calcolatrice.multiply(1, Integer.MIN_VALUE));
    }
}
