Here's an example implementation of the ChooseNumTest class with ten unit test cases for the chooseNum method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChooseNumTest {

    @Test
    void testChooseNumWithEvenNumbers() {
        assertEquals(10, ChooseNum.chooseNum(1, 10));
        assertEquals(100, ChooseNum.chooseNum(50, 100));
        assertEquals(20, ChooseNum.chooseNum(10, 20));
    }

    @Test
    void testChooseNumWithOddNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(1, 5));
        assertEquals(-1, ChooseNum.chooseNum(3, 9));
        assertEquals(-1, ChooseNum.chooseNum(11, 15));
    }

    @Test
    void testChooseNumWithNegativeNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(-10, -5));
        assertEquals(-1, ChooseNum.chooseNum(-20, -10));
        assertEquals(-6, ChooseNum.chooseNum(-10, -6));
    }

    @Test
    void testChooseNumWithSameNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(5, 5));
        assertEquals(6, ChooseNum.chooseNum(6, 6));
        assertEquals(-1, ChooseNum.chooseNum(-3, -3));
    }

    @Test
    void testChooseNumWithReverseRange() {
        assertEquals(10, ChooseNum.chooseNum(10, 1));
        assertEquals(100, ChooseNum.chooseNum(100, 50));
        assertEquals(20, ChooseNum.chooseNum(20, 10));
    }
}
```

This test class includes test cases for the following scenarios:

- Even numbers in the range
- Odd numbers in the range
- Negative numbers in the range
- Same numbers in the range
- Reverse range (where the second parameter is smaller than the first parameter)