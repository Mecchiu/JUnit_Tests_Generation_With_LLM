// FruitDistributionTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FruitDistribution}.
 * It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
 */
class FruitDistributionTest {

    @Test
    void testFruitDistribution1() {
        int result = FruitDistribution.fruitDistribution("3 apples 4 oranges", 10);
        assertEquals(3, result);
    }

    @Test
    void testFruitDistribution2() {
        int result = FruitDistribution.fruitDistribution("1 apple 1 orange", 5);
        assertEquals(3, result);
    }

    @Test
    void testFruitDistribution3() {
        int result = FruitDistribution.fruitDistribution("2 apples 3 oranges", 8);
        assertEquals(3, result);
    }

    @Test
    void testFruitDistribution4() {
        int result = FruitDistribution.fruitDistribution("5 apples 2 oranges", 10);
        assertEquals(3, result);
    }

    @Test
    void testFruitDistribution5() {
        int result = FruitDistribution.fruitDistribution("1 apple 1 orange", 2);
        assertEquals(0, result);
    }

    @Test
    void testFruitDistribution6() {
        int result = FruitDistribution.fruitDistribution("0 apples 0 oranges", 5);
        assertEquals(5, result);
    }

    @Test
    void testFruitDistribution7() {
        int result = FruitDistribution.fruitDistribution("10 apples 10 oranges", 20);
        assertEquals(0, result);
    }

    @Test
    void testFruitDistribution8() {
        int result = FruitDistribution.fruitDistribution("1 apple 0 oranges", 2);
        assertEquals(1, result);
    }

    @Test
    void testFruitDistribution9() {
        int result = FruitDistribution.fruitDistribution("0 apples 1 orange", 2);
        assertEquals(1, result);
    }

    @Test
    void testFruitDistribution10() {
        int result = FruitDistribution.fruitDistribution("0 apples 0 oranges", 0);
        assertEquals(0, result);
    }
}