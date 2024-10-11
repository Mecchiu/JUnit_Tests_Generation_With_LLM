Here's the source code for the SumSquares1Test class with ten unit test cases for the sumSquares method:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSquares1Test {

    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<>();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithOneElement() {
        List<Object> lst = Arrays.asList(2);
        int expected = 4;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithTwoElements() {
        List<Object> lst = Arrays.asList(2, 3);
        int expected = 13;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithThreeElements() {
        List<Object> lst = Arrays.asList(2, 3, 4);
        int expected = 29;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithFourElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5);
        int expected = 54;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithFiveElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6);
        int expected = 91;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithSixElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6, 7);
        int expected = 140;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithSevenElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        int expected = 205;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithEightElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        int expected = 284;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithNineElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expected = 369;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithTenElements() {
        List<Object> lst = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int expected = 460;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}
```