```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibfibTest {

    @Test
    void testFibfib2() {
        assertEquals(1, Fibfib.fibfib(2));
    }

    @Test
    void testFibfib1() {
        assertEquals(0, Fibfib.fibfib(1));
    }

    @Test
    void testFibfib5() {
        assertEquals(4, Fibfib.fibfib(5));
    }

    @Test
    void testFibfib8() {
        assertEquals(24, Fibfib.fibfib(8));
    }

    @Test
    void testFibfib10() {
        assertEquals(81, Fibfib.fibfib(10));
    }

    @Test
    void testFibfib12() {
        assertEquals(274, Fibfib.fibfib(12));
    }

    @Test
    void testFibfib14() {
        assertEquals(927, Fibfib.fibfib(14));
    }

    @Test
    void testFibfib0() {
        assertEquals(0, Fibfib.fibfib(0));
    }

    @Test
    void testFibfib3() {
        assertEquals(1, Fibfib.fibfib(3));
    }

    @Test
    void testFibfib4() {
        assertEquals(2, Fibfib.fibfib(4));
    }
}
```
