```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateIntegersTest {

    @Test
    void testGenerateIntegers_2_8() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    @Test
    void testGenerateIntegers_8_2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    @Test
    void testGenerateIntegers_10_14() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(10, 14));
    }

    @Test
    void testGenerateIntegers_2_10() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
    }

    @Test
    void testGenerateIntegers_132_2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
    }

    @Test
    void testGenerateIntegers_17_89() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(17, 89));
    }
}
```
