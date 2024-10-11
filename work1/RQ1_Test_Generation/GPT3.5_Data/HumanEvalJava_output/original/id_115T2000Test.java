```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class MaxFillTest {

    @Test
    void testMaxFillExample1() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(0, 1, 0, 0),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 1;
        assertEquals(6, MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillExample2() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 1),
                Arrays.asList(0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(0, 1, 1, 1)
        );
        int capacity = 2;
        assertEquals(5, MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillExample3() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0)
        );
        int capacity = 5;
        assertEquals(0, MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillCustom1() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 2;
        assertEquals(4, MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillCustom2() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 9;
        assertEquals(2, MaxFill.maxFill(grid, capacity));
    }
}
```
