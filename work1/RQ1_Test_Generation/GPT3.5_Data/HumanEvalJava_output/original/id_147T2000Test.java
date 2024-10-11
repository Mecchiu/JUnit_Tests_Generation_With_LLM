```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxTriplesTest {

    @Test
    void testGetMaxTriples_Example1() {
        assertEquals(1, GetMaxTriples.getMaxTriples(5));
    }

    @Test
    void testGetMaxTriples_Example2() {
        assertEquals(4, GetMaxTriples.getMaxTriples(6));
    }

    @Test
    void testGetMaxTriples_Example3() {
        assertEquals(36, GetMaxTriples.getMaxTriples(10));
    }

    @Test
    void testGetMaxTriples_Example4() {
        assertEquals(53361, GetMaxTriples.getMaxTriples(100));
    }

    @Test
    void testGetMaxTriples_ZeroInput() {
        assertEquals(0, GetMaxTriples.getMaxTriples(0));
    }

    @Test
    void testGetMaxTriples_OneInput() {
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
    }

    @Test
    void testGetMaxTriples_NegativeInput() {
        assertEquals(0, GetMaxTriples.getMaxTriples(-5));
    }

    @Test
    void testGetMaxTriples_LargeInput() {
        assertEquals(0, GetMaxTriples.getMaxTriples(1000));
    }

    @Test
    void testGetMaxTriples_MaxIntInput() {
        assertEquals(0, GetMaxTriples.getMaxTriples(Integer.MAX_VALUE));
    }

    @Test
    void testGetMaxTriples_MaxIntMinus1Input() {
        assertEquals(0, GetMaxTriples.getMaxTriples(Integer.MAX_VALUE - 1));
    }
}
```
```