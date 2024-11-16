// Calcolatrice_0Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Calcolatrice}.
 * It contains ten unit test cases for the {@link Calcolatrice#add(int, int)} method.
 */
class Calcolatrice_0Test {

    @Test
    void testAddPositiveNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(5, calcolatrice.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-5, calcolatrice.add(-2, -3));
    }

    @Test
    void testAddPositiveAndNegativeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1, calcolatrice.add(4, -3));
    }

    @Test
    void testAddZeroAndPositiveNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(3, calcolatrice.add(0, 3));
    }

    @Test
    void testAddZeroAndNegativeNumber() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(-3, calcolatrice.add(0, -3));
    }

    @Test
    void testAddLargeNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(1000000000, calcolatrice.add(500000000, 500000000));
    }

    @Test
    void testAddSmallNumbers() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(2, calcolatrice.add(1, 1));
    }

    @Test
    void testAddNumberToItself() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(6, calcolatrice.add(3, 3));
    }

    @Test
    void testAddWithMaxInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MAX_VALUE, calcolatrice.add(0, Integer.MAX_VALUE));
    }

    @Test
    void testAddWithMinInt() {
        Calcolatrice calcolatrice = new Calcolatrice();
        assertEquals(Integer.MIN_VALUE, calcolatrice.add(0, Integer.MIN_VALUE));
    }
}
