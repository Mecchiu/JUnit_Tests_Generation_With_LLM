```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsEqualToSumEvenTest {

    @Test
    void testIsEqualToSumEven_4() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
    }

    @Test
    void testIsEqualToSumEven_6() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
    }

    @Test
    void testIsEqualToSumEven_8() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
    }

    @Test
    void testIsEqualToSumEven_10() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
    }

    @Test
    void testIsEqualToSumEven_11() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
    }

    @Test
    void testIsEqualToSumEven_12() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
    }

    @Test
    void testIsEqualToSumEven_13() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
    }

    @Test
    void testIsEqualToSumEven_16() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
    }
}
```
