```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnyIntTest {

    @Test
    void testAnyIntCase1() {
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    @Test
    void testAnyIntCase2() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    @Test
    void testAnyIntCase3() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    @Test
    void testAnyIntCase4() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    @Test
    void testAnyIntCase5() {
        assertTrue(AnyInt.anyInt(2, 3, 1));
    }

    @Test
    void testAnyIntCase6() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    @Test
    void testAnyIntCase7() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    @Test
    void testAnyIntCase8() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    @Test
    void testAnyIntCase9() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    @Test
    void testAnyIntCase10() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    @Test
    void testAnyIntCase11() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    @Test
    void testAnyIntCase12() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    @Test
    void testAnyIntCase13() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    @Test
    void testAnyIntCase14() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}
```
