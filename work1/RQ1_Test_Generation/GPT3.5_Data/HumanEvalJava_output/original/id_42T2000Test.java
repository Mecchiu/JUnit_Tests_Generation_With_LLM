```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class IncrListTest {

    @Test
    public void testIncrList_emptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_allIntegers() {
        List<Object> input = List.of(1, 2, 3);
        List<Object> expected = List.of(2, 3, 4);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_mixedTypes() {
        List<Object> input = List.of(5, "hello", 3.5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 2, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_negativeNumbers() {
        List<Object> input = List.of(-1, -5, -10);
        List<Object> expected = List.of(0, -4, -9);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_singleElement() {
        List<Object> input = List.of(7);
        List<Object> expected = List.of(8);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_largeNumbers() {
        List<Object> input = List.of(999999, 1000000, 1000001);
        List<Object> expected = List.of(1000000, 1000001, 1000002);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_duplicateNumbers() {
        List<Object> input = List.of(3, 3, 3, 3);
        List<Object> expected = List.of(4, 4, 4, 4);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_noIntegers() {
        List<Object> input = List.of("a", "b", "c");
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_negativeZero() {
        List<Object> input = List.of(-0);
        List<Object> expected = List.of(1);
        assertEquals(expected, IncrList.incrList(input));
    }

    @Test
    public void testIncrList_maxIntegerValue() {
        List<Object> input = List.of(Integer.MAX_VALUE);
        List<Object> expected = List.of(Integer.MAX_VALUE + 1);
        assertEquals(expected, IncrList.incrList(input));
    }
}
```
```