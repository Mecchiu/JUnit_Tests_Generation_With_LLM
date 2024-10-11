```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XOrYTest {

    @Test
    void testXOrY_PrimeNumber_ReturnsX() {
        assertEquals(34, XOrY.xOrY(7, 34, 12));
        assertEquals(5, XOrY.xOrY(3, 5, 8));
        assertEquals(33, XOrY.xOrY(3, 33, 5212));
        assertEquals(3, XOrY.xOrY(1259, 3, 52));
        assertEquals(-1, XOrY.xOrY(7919, -1, 12));
    }

    @Test
    void testXOrY_NonPrimeNumber_ReturnsY() {
        assertEquals(12, XOrY.xOrY(12, 34, 12));
        assertEquals(8, XOrY.xOrY(15, 8, 5));
        assertEquals(1245, XOrY.xOrY(3609, 1245, 583));
        assertEquals(56, XOrY.xOrY(91, 56, 129));
        assertEquals(34, XOrY.xOrY(6, 34, 1234));
        assertEquals(0, XOrY.xOrY(1, 2, 0));
        assertEquals(0, XOrY.xOrY(4, 2, 0));
    }
}
```
