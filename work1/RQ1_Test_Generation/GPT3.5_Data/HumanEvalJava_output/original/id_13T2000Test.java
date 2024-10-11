```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void testGreatestCommonDivisor_3_5() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 5));
    }

    @Test
    void testGreatestCommonDivisor_25_15() {
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(25, 15));
    }

    @Test
    void testGreatestCommonDivisor_3_7() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 7));
    }

    @Test
    void testGreatestCommonDivisor_10_15() {
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
    }

    @Test
    void testGreatestCommonDivisor_49_14() {
        assertEquals(7, GreatestCommonDivisor.greatestCommonDivisor(49, 14));
    }

    @Test
    void testGreatestCommonDivisor_144_60() {
        assertEquals(12, GreatestCommonDivisor.greatestCommonDivisor(144, 60));
    }
}
```
