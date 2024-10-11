Here's the source code for the SumProductTest class:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SumProduct}.
 * It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
 */
class SumProductTest {

    @Test
    void testEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testSingleNumber() {
        List<Object> numbers = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5, 5);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testMultipleNumbers() {
        List<Object> numbers = Arrays.asList(2, 3, 4);
        List<Integer> expected = Arrays.asList(9, 24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testNegativeNumbers() {
        List<Object> numbers = Arrays.asList(-2, 3, -4);
        List<Integer> expected = Arrays.asList(-3, 24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testZero() {
        List<Object> numbers = Arrays.asList(2, 0, 4);
        List<Integer> expected = Arrays.asList(6, 0);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testDecimalNumber() {
        List<Object> numbers = Arrays.asList(2.5, 3, 4);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testString() {
        List<Object> numbers = Arrays.asList("2", 3, 4);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testNull() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testLargeNumbers() {
        List<Object> numbers = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE);
        List<Integer> expected = Arrays.asList(-2, 1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }

    @Test
    void testOverflow() {
        List<Object> numbers = Arrays.asList(Integer.MAX_VALUE, 2);
        assertThrows(ArithmeticException.class, () -> SumProduct.sumProduct(numbers));
    }
}
```

This class contains ten unit test cases for the `SumProduct.sumProduct()` method. The test cases cover various scenarios, including empty list, single number, multiple numbers, negative numbers, zero, invalid input types, null input, large numbers, and overflow. The `assertEquals()` method is used to compare the expected result with the actual result, and the `assertThrows()` method is used to verify that the method throws the expected exception.