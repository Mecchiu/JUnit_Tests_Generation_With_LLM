```java
import original.SortThird;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SortThirdTest {

    @Test
    void testSortThird() {
        List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(expected1, SortThird.sortThird(input1));

        List<Integer> input2 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        assertEquals(expected2, SortThird.sortThird(input2));

        List<Integer> input3 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10));
        assertEquals(expected3, SortThird.sortThird(input3));

        List<Integer> input4 = new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5));
        assertEquals(expected4, SortThird.sortThird(input4));

        List<Integer> input5 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> expected5 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        assertEquals(expected5, SortThird.sortThird(input5));

        List<Integer> input6 = new ArrayList<>(Arrays.asList(5, 8, 3, 4, 6, 9, 2));
        List<Integer> expected6 = new ArrayList<>(Arrays.asList(2, 8, 3, 4, 6, 9, 5));
        assertEquals(expected6, SortThird.sortThird(input6));

        List<Integer> input7 = new ArrayList<>(Arrays.asList(5, 6, 9, 4, 8, 3, 2));
        List<Integer> expected7 = new ArrayList<>(Arrays.asList(2, 6, 9, 4, 8, 3, 5));
        assertEquals(expected7, SortThird.sortThird(input7));

        List<Integer> input8 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1));
        List<Integer> expected8 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1));
        assertEquals(expected8, SortThird.sortThird(input8));
    }
}
```
