Here's the source code for the `FibTest` class with ten unit test cases for the `Fib.fib(int)` method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void testFib0() {
        assertEquals(0, Fib.fib(0));
    }

    @Test
    void testFib1() {
        assertEquals(1, Fib.fib(1));
    }

    @Test
    void testFib2() {
        assertEquals(1, Fib.fib(2));
    }

    @Test
    void testFib3() {
        assertEquals(2, Fib.fib(3));
    }

    @Test
    void testFib4() {
        assertEquals(3, Fib.fib(4));
    }

    @Test
    void testFib5() {
        assertEquals(5, Fib.fib(5));
    }

    @Test
    void testFib6() {
        assertEquals(8, Fib.fib(6));
    }

    @Test
    void testFib7() {
        assertEquals(13, Fib.fib(7));
    }

    @Test
    void testFib8() {
        assertEquals(21, Fib.fib(8));
    }

    @Test
    void testFib9() {
        assertEquals(34, Fib.fib(9));
    }
}
```

This class imports the `Test` class from the `org.junit.jupiter.api` package and the `Assertions` class from the same package. It contains ten test methods, each of which calls the `assertEquals` method to compare the expected result with the actual result of calling the `Fib.fib(int)` method with a specific input value.