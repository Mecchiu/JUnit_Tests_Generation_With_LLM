// Calcolatrice_4Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Calcolatrice}.
 * It contains ten unit test cases for the {@link Calcolatrice#factorial(int)} method.
 */
class Calcolatrice_4Test {

    @Test
    void testFactorialOfZero() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.factorial(1));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(120, calcolatrice.factorial(5));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertThrows(IllegalArgumentException.class, () -> calcolatrice.factorial(-3));
    }

    @Test
    void testFactorialOfLargeNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(3628800, calcolatrice.factorial(10));
    }

    @Test
    void testFactorialOfSmallNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(2, calcolatrice.factorial(2));
    }

    @Test
    void testFactorialOfThree() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(6, calcolatrice.factorial(3));
    }

    @Test
    void testFactorialOfFour() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(24, calcolatrice.factorial(4));
    }

    @Test
    void testFactorialOfFive() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(120, calcolatrice.factorial(5));
    }

    @Test
    void testFactorialOfSix() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(720, calcolatrice.factorial(6));
    }
}
