```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    @Test
    void testIsPrimeWith6() {
        assertFalse(IsPrime.isPrime(6));
    }

    @Test
    void testIsPrimeWith101() {
        assertTrue(IsPrime.isPrime(101));
    }

    @Test
    void testIsPrimeWith11() {
        assertTrue(IsPrime.isPrime(11));
    }

    @Test
    void testIsPrimeWith13441() {
        assertTrue(IsPrime.isPrime(13441));
    }

    @Test
    void testIsPrimeWith61() {
        assertTrue(IsPrime.isPrime(61));
    }

    @Test
    void testIsPrimeWith4() {
        assertFalse(IsPrime.isPrime(4));
    }

    @Test
    void testIsPrimeWith1() {
        assertFalse(IsPrime.isPrime(1));
    }

    @Test
    void testIsPrimeWith5() {
        assertTrue(IsPrime.isPrime(5));
    }

    @Test
    void testIsPrimeWith17() {
        assertTrue(IsPrime.isPrime(17));
    }

    @Test
    void testIsPrimeWith255379() {
        assertFalse(IsPrime.isPrime(255379));
    }
}
```
