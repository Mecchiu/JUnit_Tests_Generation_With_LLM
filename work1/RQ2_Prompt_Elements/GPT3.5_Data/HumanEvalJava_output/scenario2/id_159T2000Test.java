// Here's the source code for the EatTest class:

package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Eat}.
 * It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
 */
class EatTest {

    @Test
    void testEatWithEnoughCarrots() {
        List<Integer> result = Eat.eat(5, 3, 7);
        assertEquals(Arrays.asList(8, 4), result);
    }

    @Test
    void testEatWithNotEnoughCarrots() {
        List<Integer> result = Eat.eat(5, 10, 7);
        assertEquals(Arrays.asList(12, 0), result);
    }

    @Test
    void testEatWithZeroNeed() {
        List<Integer> result = Eat.eat(5, 0, 7);
        assertEquals(Arrays.asList(5, 7), result);
    }

    @Test
    void testEatWithZeroRemaining() {
        List<Integer> result = Eat.eat(5, 3, 0);
        assertEquals(Arrays.asList(5, 0), result);
    }

    @Test
    void testEatWithZeroNumber() {
        List<Integer> result = Eat.eat(0, 3, 7);
        assertEquals(Arrays.asList(3, 4), result);
    }

    @Test
    void testEatWithMaxValues() {
        List<Integer> result = Eat.eat(1000, 1000, 1000);
        assertEquals(Arrays.asList(2000, 0), result);
    }

    @Test
    void testEatWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Eat.eat(-1, 3, 7));
    }

    @Test
    void testEatWithNegativeNeed() {
        assertThrows(IllegalArgumentException.class, () -> Eat.eat(5, -1, 7));
    }

    @Test
    void testEatWithNegativeRemaining() {
        assertThrows(IllegalArgumentException.class, () -> Eat.eat(5, 3, -1));
    }

    @Test
    void testEatWithTooManyCarrots() {
        List<Integer> result = Eat.eat(5, 10, 15);
        assertEquals(Arrays.asList(15, 0), result);
    }
}