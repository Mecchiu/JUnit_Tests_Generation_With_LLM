```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Fib4Test {

    @Test
    void testFib4_5() {
        assertEquals(4, Fib4.fib4(5));
    }

    @Test
    void testFib4_6() {
        assertEquals(8, Fib4.fib4(6));
    }

    @Test
    void testFib4_7() {
        assertEquals(14, Fib4.fib4(7));
    }

    @Test
    void testFib4_8() {
        assertEquals(28, Fib4.fib4(8));
    }

    @Test
    void testFib4_10() {
        assertEquals(104, Fib4.fib4(10));
    }

    @Test
    void testFib4_12() {
        assertEquals(386, Fib4.fib4(12));
    }

    @Test
    void testFib4_0() {
        assertEquals(0, Fib4.fib4(0));
    }

    @Test
    void testFib4_1() {
        assertEquals(0, Fib4.fib4(1));
    }

    @Test
    void testFib4_2() {
        assertEquals(2, Fib4.fib4(2));
    }

    @Test
    void testFib4_3() {
        assertEquals(0, Fib4.fib4(3));
    }
}
```
