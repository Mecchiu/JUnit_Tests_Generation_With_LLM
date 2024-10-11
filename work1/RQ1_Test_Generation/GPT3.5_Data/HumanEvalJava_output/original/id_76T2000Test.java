```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSimplePowerTest {

    @Test
    void testIsSimplePower_1() {
        assertTrue(IsSimplePower.isSimplePower(16, 2));
    }

    @Test
    void testIsSimplePower_2() {
        assertFalse(IsSimplePower.isSimplePower(143214, 16));
    }

    @Test
    void testIsSimplePower_3() {
        assertTrue(IsSimplePower.isSimplePower(4, 2));
    }

    @Test
    void testIsSimplePower_4() {
        assertTrue(IsSimplePower.isSimplePower(9, 3));
    }

    @Test
    void testIsSimplePower_5() {
        assertTrue(IsSimplePower.isSimplePower(16, 4));
    }

    @Test
    void testIsSimplePower_6() {
        assertFalse(IsSimplePower.isSimplePower(24, 2));
    }

    @Test
    void testIsSimplePower_7() {
        assertFalse(IsSimplePower.isSimplePower(128, 4));
    }

    @Test
    void testIsSimplePower_8() {
        assertFalse(IsSimplePower.isSimplePower(12, 6));
    }

    @Test
    void testIsSimplePower_9() {
        assertTrue(IsSimplePower.isSimplePower(1, 1));
    }

    @Test
    void testIsSimplePower_10() {
        assertTrue(IsSimplePower.isSimplePower(1, 12));
    }
}
```
