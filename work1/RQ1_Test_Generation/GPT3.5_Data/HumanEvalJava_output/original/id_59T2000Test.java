```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @Test
    void testLargestPrimeFactor_2048() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
    }

    @Test
    void testLargestPrimeFactor_15() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
    }

    @Test
    void testLargestPrimeFactor_27() {
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
    }

    @Test
    void testLargestPrimeFactor_63() {
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
    }

    @Test
    void testLargestPrimeFactor_330() {
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
    }

    @Test
    void testLargestPrimeFactor_13195() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
    }

    // Add more test cases as needed

}
```
