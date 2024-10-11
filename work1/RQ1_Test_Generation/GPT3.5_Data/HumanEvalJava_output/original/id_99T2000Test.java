```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(10, ClosestInteger.closestInteger("10"));
    }

    @Test
    void testClosestIntegerPositiveDecimal() {
        assertEquals(15, ClosestInteger.closestInteger("15.3"));
    }

    @Test
    void testClosestIntegerPositiveRoundingUp() {
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
    }

    @Test
    void testClosestIntegerNegativeRoundingDown() {
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-10, ClosestInteger.closestInteger("-10"));
    }

    @Test
    void testClosestIntegerNegativeDecimal() {
        assertEquals(-15, ClosestInteger.closestInteger("-15.3"));
    }

    @Test
    void testClosestIntegerNegativeRoundingUp() {
        assertEquals(-15, ClosestInteger.closestInteger("-14.5"));
    }

    @Test
    void testClosestIntegerPositiveRoundingDown() {
        assertEquals(10, ClosestInteger.closestInteger("9.5"));
    }

    @Test
    void testClosestIntegerNegativeRoundingDown() {
        assertEquals(-10, ClosestInteger.closestInteger("-9.5"));
    }
}
```
