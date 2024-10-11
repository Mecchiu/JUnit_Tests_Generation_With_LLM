```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsMultiplyPrimeTest {

    @Test
    void testIsMultiplyPrime_5() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
    }

    @Test
    void testIsMultiplyPrime_30() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
    }

    @Test
    void testIsMultiplyPrime_8() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
    }

    @Test
    void testIsMultiplyPrime_10() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
    }

    @Test
    void testIsMultiplyPrime_125() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
    }

    @Test
    void testIsMultiplyPrime_105() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
    }

    @Test
    void testIsMultiplyPrime_126() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
    }

    @Test
    void testIsMultiplyPrime_729() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
    }

    @Test
    void testIsMultiplyPrime_891() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
    }

    @Test
    void testIsMultiplyPrime_1001() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}
```
