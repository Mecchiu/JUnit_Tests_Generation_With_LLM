// Calcolatrice_3Test.java

package calcolatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Calcolatrice}.
 * It contains ten unit test cases for the {@link Calcolatrice#divide(double, double)} method.
 */
class Calcolatrice_3Test {

    @Test
    void testDividePositiveNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(2.0, calcolatrice.divide(6.0, 3.0), 0.0001);
    }

    @Test
    void testDivideNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(2.0, calcolatrice.divide(-6.0, -3.0), 0.0001);
    }

    @Test
    void testDividePositiveAndNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-2.0, calcolatrice.divide(6.0, -3.0), 0.0001);
    }

    @Test
    void testDivideByZero() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertThrows(IllegalArgumentException.class, () -> calcolatrice.divide(3.0, 0.0));
    }

    @Test
    void testDivideZeroByNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(0.0, calcolatrice.divide(0.0, 3.0), 0.0001);
    }

    @Test
    void testDivideLargeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1.0, calcolatrice.divide(1000000.0, 1000000.0), 0.0001);
    }

    @Test
    void testDivideSmallNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1.0, calcolatrice.divide(0.000001, 0.000001), 0.0001);
    }

    @Test
    void testDivideNumberByItself() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1.0, calcolatrice.divide(3.0, 3.0), 0.0001);
    }

    @Test
    void testDivideWithMaxDouble() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1.0, calcolatrice.divide(Double.MAX_VALUE, Double.MAX_VALUE), 0.0001);
    }

    @Test
    void testDivideWithMinDouble() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1.0, calcolatrice.divide(Double.MIN_VALUE, Double.MIN_VALUE), 0.0001);
    }
}
