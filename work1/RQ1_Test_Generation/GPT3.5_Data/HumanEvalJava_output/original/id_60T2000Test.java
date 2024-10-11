```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumToNTest {

    @Test
    void testSumToNWith5() {
        assertEquals(15, SumToN.sumToN(5));
    }

    @Test
    void testSumToNWith10() {
        assertEquals(55, SumToN.sumToN(10));
    }

    @Test
    void testSumToNWith1() {
        assertEquals(1, SumToN.sumToN(1));
    }

    @Test
    void testSumToNWith6() {
        assertEquals(21, SumToN.sumToN(6));
    }

    @Test
    void testSumToNWith11() {
        assertEquals(66, SumToN.sumToN(11));
    }

    @Test
    void testSumToNWith30() {
        assertEquals(465, SumToN.sumToN(30));
    }

    @Test
    void testSumToNWith100() {
        assertEquals(5050, SumToN.sumToN(100));
    }

    // Add more test cases as needed
}
```
