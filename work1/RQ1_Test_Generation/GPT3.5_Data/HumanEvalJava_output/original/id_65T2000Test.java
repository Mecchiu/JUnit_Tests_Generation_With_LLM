```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularShiftTest {

    @Test
    void testCircularShift_ShiftGreaterThanLength() {
        assertEquals("001", CircularShift.circularShift(100, 2));
        assertEquals("12", CircularShift.circularShift(12, 2));
        assertEquals("79", CircularShift.circularShift(97, 8));
    }

    @Test
    void testCircularShift_ShiftLessThanLength() {
        assertEquals("21", CircularShift.circularShift(12, 1));
    }

    @Test
    void testCircularShift_ShiftEqualToLength() {
        assertEquals("11", CircularShift.circularShift(11, 101));
    }
}
```
