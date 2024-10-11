```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @Test
    void testDecimalToBinaryZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    void testDecimalToBinaryThirtyTwo() {
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
    }

    @Test
    void testDecimalToBinaryOneHundredThree() {
        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
    }

    @Test
    void testDecimalToBinaryFifteen() {
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    // Add more test cases as needed

}
```
