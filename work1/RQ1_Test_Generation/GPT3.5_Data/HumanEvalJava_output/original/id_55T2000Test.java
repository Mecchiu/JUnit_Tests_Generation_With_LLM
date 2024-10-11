```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void testFib_WhenInputIs10_ThenReturn55() {
        assertEquals(55, Fib.fib(10));
    }

    @Test
    void testFib_WhenInputIs1_ThenReturn1() {
        assertEquals(1, Fib.fib(1));
    }

    @Test
    void testFib_WhenInputIs8_ThenReturn21() {
        assertEquals(21, Fib.fib(8));
    }

    @Test
    void testFib_WhenInputIs11_ThenReturn89() {
        assertEquals(89, Fib.fib(11));
    }

    @Test
    void testFib_WhenInputIs12_ThenReturn144() {
        assertEquals(144, Fib.fib(12));
    }

    // Add more test cases as needed
}
```
