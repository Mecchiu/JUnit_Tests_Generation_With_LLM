// EatTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {
			// Test case 1
    @Test
    void testEat1() {
        List<Integer> result = Eat.eat(10, 5, 10);
        assertEquals(Arrays.asList(15, 5), result);
    }

    // Test case 2
    @Test
    void testEat2() {
        List<Integer> result = Eat.eat(10, 5, 5);
        assertEquals(Arrays.asList(15, 0), result);
    }

    // Test case 3
    @Test
    void testEat3() {
        List<Integer> result = Eat.eat(10, 5, 0);
        assertEquals(Arrays.asList(10, 0), result);
    }

    // Test case 4
    @Test
    void testEat4() {
        List<Integer> result = Eat.eat(10, 10, 10);
        assertEquals(Arrays.asList(20, 0), result);
    }

    // Test case 5
    @Test
    void testEat5() {
        List<Integer> result = Eat.eat(10, 10, 5);
        assertEquals(Arrays.asList(15, 0), result);
    }

    // Test case 6
    @Test
    void testEat6() {
        List<Integer> result = Eat.eat(10, 10, 0);
        assertEquals(Arrays.asList(10, 0), result);
    }

    // Test case 7
    @Test
    void testEat7() {
        List<Integer> result = Eat.eat(10, 15, 10);
        assertEquals(Arrays.asList(25, 0), result);
    }

    // Test case 8
    @Test
    void testEat8() {
        List<Integer> result = Eat.eat(10, 15, 5);
        assertEquals(Arrays.asList(20, 0), result);
    }

    // Test case 9
    @Test
    void testEat9() {
        List<Integer> result = Eat.eat(10, 15, 0);
        assertEquals(Arrays.asList(10, 0), result);
    }

    // Test case 10
    @Test
    void testEat10() {
        List<Integer> result = Eat.eat(10, 0, 10);
        assertEquals(Arrays.asList(10, 10), result);
    }
}