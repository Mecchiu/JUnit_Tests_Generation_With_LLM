```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChangeBaseTest {

    @Test
    void testChangeBase_8_to_3() {
        assertEquals("22", ChangeBase.changeBase(8, 3));
    }

    @Test
    void testChangeBase_8_to_2() {
        assertEquals("1000", ChangeBase.changeBase(8, 2));
    }

    @Test
    void testChangeBase_7_to_2() {
        assertEquals("111", ChangeBase.changeBase(7, 2));
    }

    @Test
    void testChangeBase_9_to_3() {
        assertEquals("100", ChangeBase.changeBase(9, 3));
    }

    @Test
    void testChangeBase_234_to_2() {
        assertEquals("11101010", ChangeBase.changeBase(234, 2));
    }

    @Test
    void testChangeBase_16_to_2() {
        assertEquals("10000", ChangeBase.changeBase(16, 2));
    }

    @Test
    void testChangeBase_2_to_3() {
        assertEquals("2", ChangeBase.changeBase(2, 3));
    }

    @Test
    void testChangeBase_3_to_4() {
        assertEquals("3", ChangeBase.changeBase(3, 4));
    }

    @Test
    void testChangeBase_4_to_5() {
        assertEquals("4", ChangeBase.changeBase(4, 5));
    }

    @Test
    void testChangeBase_5_to_6() {
        assertEquals("5", ChangeBase.changeBase(5, 6));
    }

    @Test
    void testChangeBase_6_to_7() {
        assertEquals("6", ChangeBase.changeBase(6, 7));
    }

    @Test
    void testChangeBase_7_to_8() {
        assertEquals("7", ChangeBase.changeBase(7, 8));
    }
}
```
