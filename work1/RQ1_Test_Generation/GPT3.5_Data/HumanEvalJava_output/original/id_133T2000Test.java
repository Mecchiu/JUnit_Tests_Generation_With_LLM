```java
import original.SumSquares;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SumSquaresTest {

    @Test
    void testSumSquares1() {
        List<Number> lst = Arrays.asList(1, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares2() {
        List<Number> lst = Arrays.asList(1.0, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares3() {
        List<Number> lst = Arrays.asList(1, 3, 5, 7);
        assertEquals(84, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares4() {
        List<Number> lst = Arrays.asList(1.4, 4.2, 0);
        assertEquals(29, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares5() {
        List<Number> lst = Arrays.asList(-2.4, 1, 1);
        assertEquals(6, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares6() {
        List<Number> lst = Arrays.asList(100, 1, 15, 2);
        assertEquals(10230, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares7() {
        List<Number> lst = Arrays.asList(10000, 10000);
        assertEquals(200000000, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares8() {
        List<Number> lst = Arrays.asList(-1.4, 4.6, 6.3);
        assertEquals(75, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares9() {
        List<Number> lst = Arrays.asList(-1.4, 17.9, 18.9, 19.9);
        assertEquals(1086, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares10() {
        List<Number> lst = Arrays.asList(0);
        assertEquals(0, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares11() {
        List<Number> lst = Arrays.asList(-1);
        assertEquals(1, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares12() {
        List<Number> lst = Arrays.asList(-1, 1, 0);
        assertEquals(2, SumSquares.sumSquares(lst));
    }
}
```
