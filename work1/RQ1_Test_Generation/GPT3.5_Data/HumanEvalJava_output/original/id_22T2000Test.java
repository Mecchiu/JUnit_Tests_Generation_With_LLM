```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class FilterIntegersTest {

    @Test
    public void testFilterIntegersWithMixedValues() {
        List<Object> input = new ArrayList<>();
        input.add("a");
        input.add(3.14);
        input.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(5);
        assertEquals(expected, FilterIntegers.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersWithIntegersAndNonIntegers() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add("abc");
        input.add(new Object());
        input.add(new ArrayList<>());
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, FilterIntegers.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersWithMixedValuesIncludingFloat() {
        List<Object> input = new ArrayList<>();
        input.add(4);
        input.add(new Object());
        input.add(new ArrayList<>());
        input.add(23.2);
        input.add(9);
        input.add("adasd");
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(9);
        assertEquals(expected, FilterIntegers.filterIntegers(input));
    }

    @Test
    public void testFilterIntegersWithRepeatedIntegersAndNonIntegers() {
        List<Object> input = new ArrayList<>();
        input.add(3);
        input.add("c");
        input.add(3);
        input.add(3);
        input.add("a");
        input.add("b");
        List<Object> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(input));
    }
}
```
