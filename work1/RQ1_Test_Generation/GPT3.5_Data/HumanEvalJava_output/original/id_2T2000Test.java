```java
import original.TruncateNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruncateNumberTest {

    @Test
    void testTruncateNumber_3_5() {
        assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
    }

    @Test
    void testTruncateNumber_1_33() {
        assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
    }

    @Test
    void testTruncateNumber_123_456() {
        assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
    }

    // Add more test cases as needed
}
```
