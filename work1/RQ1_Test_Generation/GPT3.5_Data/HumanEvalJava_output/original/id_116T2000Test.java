```java
import original.SortArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class SortArrayTest {

    @Test
    void testSortArrayExample1() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(5);
        input.add(2);
        input.add(3);
        input.add(4);

        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, SortArray.sortArray(input));
    }

    @Test
    void testSortArrayExample2() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(0);
        input.add(2);
        input.add(3);
        input.add(4);

        List<Object> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        assertEquals(expected, SortArray.sortArray(input));
    }

    // Add more test cases here

}
```
