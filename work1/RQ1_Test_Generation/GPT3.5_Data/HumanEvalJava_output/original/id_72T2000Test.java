```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WillItFlyTest {

    @Test
    void testWillItFlyCase1() {
        assertFalse(WillItFly.willItFly(List.of(1, 2), 5));
    }

    @Test
    void testWillItFlyCase2() {
        assertFalse(WillItFly.willItFly(List.of(3, 2, 3), 1));
    }

    @Test
    void testWillItFlyCase3() {
        assertTrue(WillItFly.willItFly(List.of(3, 2, 3), 9));
    }

    @Test
    void testWillItFlyCase4() {
        assertTrue(WillItFly.willItFly(List.of(3), 5));
    }

    @Test
    void testWillItFlyCase5() {
        assertFalse(WillItFly.willItFly(List.of(1, 2, 3), 6));
    }

    @Test
    void testWillItFlyCase6() {
        assertTrue(WillItFly.willItFly(List.of(5), 5));
    }

    @Test
    void testWillItFlyCase7() {
        assertTrue(WillItFly.willItFly(List.of(3, 2, 3), 9));
    }

    @Test
    void testWillItFlyCase8() {
        assertFalse(WillItFly.willItFly(List.of(1, 2), 5));
    }

    @Test
    void testWillItFlyCase9() {
        assertTrue(WillItFly.willItFly(List.of(3), 5));
    }

    @Test
    void testWillItFlyCase10() {
        assertFalse(WillItFly.willItFly(List.of(1, 2, 3), 6));
    }
}
```
