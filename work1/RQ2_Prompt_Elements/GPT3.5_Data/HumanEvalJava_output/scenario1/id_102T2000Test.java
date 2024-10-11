Here's the source code for the ChooseNumTest class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChooseNum}.
 * It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
 */
class ChooseNumTest {

    @Test
    void testChooseNumWithEvenNumbers() {
        int result = ChooseNum.chooseNum(2, 10);
        assertEquals(10, result);
    }

    @Test
    void testChooseNumWithOddNumbers() {
        int result = ChooseNum.chooseNum(1, 9);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNumWithNegativeNumbers() {
        int result = ChooseNum.chooseNum(-10, -2);
        assertEquals(-2, result);
    }

    @Test
    void testChooseNumWithSameNumbers() {
        int result = ChooseNum.chooseNum(5, 5);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNumWithReverseOrder() {
        int result = ChooseNum.chooseNum(10, 2);
        assertEquals(10, result);
    }

    @Test
    void testChooseNumWithLargeNumbers() {
        int result = ChooseNum.chooseNum(100, 1000);
        assertEquals(1000, result);
    }

    @Test
    void testChooseNumWithOneEvenNumber() {
        int result = ChooseNum.chooseNum(1, 3);
        assertEquals(2, result);
    }

    @Test
    void testChooseNumWithOneOddNumber() {
        int result = ChooseNum.chooseNum(2, 4);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNumWithAllOddNumbers() {
        int result = ChooseNum.chooseNum(1, 7);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNumWithAllEvenNumbers() {
        int result = ChooseNum.chooseNum(2, 8);
        assertEquals(8, result);
    }
}
```

This test class contains ten unit test cases for the `chooseNum` method of the `ChooseNum` class. Each test case tests a different scenario, such as when the input range contains only even numbers, only odd numbers, or a mix of both. The `assertEquals` method is used to check that the actual result of the method matches the expected result.