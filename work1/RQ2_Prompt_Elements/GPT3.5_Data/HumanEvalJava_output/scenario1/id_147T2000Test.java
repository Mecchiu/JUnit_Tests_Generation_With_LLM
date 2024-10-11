Here's the code for the test class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxTriplesTest {

    @Test
    void testGetMaxTriplesWithZero() {
        int result = GetMaxTriples.getMaxTriples(0);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxTriplesWithOne() {
        int result = GetMaxTriples.getMaxTriples(1);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxTriplesWithTwo() {
        int result = GetMaxTriples.getMaxTriples(2);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxTriplesWithThree() {
        int result = GetMaxTriples.getMaxTriples(3);
        assertEquals(1, result);
    }

    @Test
    void testGetMaxTriplesWithFour() {
        int result = GetMaxTriples.getMaxTriples(4);
        assertEquals(1, result);
    }

    @Test
    void testGetMaxTriplesWithFive() {
        int result = GetMaxTriples.getMaxTriples(5);
        assertEquals(2, result);
    }

    @Test
    void testGetMaxTriplesWithSix() {
        int result = GetMaxTriples.getMaxTriples(6);
        assertEquals(2, result);
    }

    @Test
    void testGetMaxTriplesWithSeven() {
        int result = GetMaxTriples.getMaxTriples(7);
        assertEquals(3, result);
    }

    @Test
    void testGetMaxTriplesWithEight() {
        int result = GetMaxTriples.getMaxTriples(8);
        assertEquals(3, result);
    }

    @Test
    void testGetMaxTriplesWithNine() {
        int result = GetMaxTriples.getMaxTriples(9);
        assertEquals(4, result);
    }
}
```

This test class contains ten test cases that cover different input values for the `getMaxTriples` method. Each test case checks if the method returns the expected output for a given input. The `assertEquals` method is used to compare the expected output with the actual output of the method.