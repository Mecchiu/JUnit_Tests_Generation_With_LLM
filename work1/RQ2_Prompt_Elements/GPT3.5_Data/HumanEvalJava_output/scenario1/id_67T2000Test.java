// FruitDistributionTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
    
    @Test
    void testFruitDistribution1() {
        String s = "3 apples 2 oranges";
        int n = 10;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution2() {
        String s = "1 apples 4 oranges";
        int n = 10;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution3() {
        String s = "5 apples 0 oranges";
        int n = 10;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution4() {
        String s = "0 apples 5 oranges";
        int n = 10;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution5() {
        String s = "2 apples 2 oranges";
        int n = 10;
        int expected = 6;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution6() {
        String s = "1 apples 1 oranges";
        int n = 10;
        int expected = 8;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution7() {
        String s = "0 apples 0 oranges";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution8() {
        String s = "10 apples 0 oranges";
        int n = 10;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution9() {
        String s = "0 apples 10 oranges";
        int n = 10;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFruitDistribution10() {
        String s = "5 apples 5 oranges";
        int n = 10;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
}