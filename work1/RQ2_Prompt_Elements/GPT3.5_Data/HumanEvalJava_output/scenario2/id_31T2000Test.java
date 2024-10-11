Here's the code for the IsPrimeTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-5));
    }

    @Test
    void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0));
    }

    @Test
    void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1));
    }

    @Test
    void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2));
    }

    @Test
    void testIsPrimeWithThree() {
        assertTrue(IsPrime.isPrime(3));
    }

    @Test
    void testIsPrimeWithFour() {
        assertFalse(IsPrime.isPrime(4));
    }

    @Test
    void testIsPrimeWithFive() {
        assertTrue(IsPrime.isPrime(5));
    }

    @Test
    void testIsPrimeWithSix() {
        assertFalse(IsPrime.isPrime(6));
    }

    @Test
    void testIsPrimeWithLargeNumber() {
        assertFalse(IsPrime.isPrime(1000000));
    }

    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(IsPrime.isPrime(17));
    }
}
```

This class contains ten unit test cases for the `IsPrime.isPrime(int)` method. Each test case tests a different scenario, such as negative numbers, zero, one, prime numbers, and large numbers. The `@Test` annotation is used to mark each test method, and the `Assertions` class is used to verify the expected results.