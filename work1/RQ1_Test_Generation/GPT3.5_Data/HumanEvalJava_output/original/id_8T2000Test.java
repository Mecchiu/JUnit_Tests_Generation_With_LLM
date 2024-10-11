```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

class SumProductTest {

    @Test
    void testSumProduct_withNonEmptyList() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withSameNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withZero() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(100);
        expected.add(0);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withDifferentNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        List<Integer> expected = new ArrayList<>();
        expected.add(15);
        expected.add(105);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withSingleNumber() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(10);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(10);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSumProduct_withInvalidNumberType() {
        List<Object> numbers = new ArrayList<>();
        numbers.add("invalid");
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }
}
```
```