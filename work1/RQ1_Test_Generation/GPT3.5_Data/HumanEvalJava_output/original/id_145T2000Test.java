```java
package test;

import original.OrderByPoints;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class OrderByPointsTest {

    @Test
    void testOrderByPoints() {
        List<Object> input1 = Arrays.asList(1, 11, -1, -11, -12);
        List<Object> expected1 = Arrays.asList(-1, -11, 1, -12, 11);
        assertEquals(expected1, OrderByPoints.orderByPoints(input1));

        List<Object> input2 = Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46);
        List<Object> expected2 = Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457);
        assertEquals(expected2, OrderByPoints.orderByPoints(input2));

        List<Object> input3 = Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3);
        List<Object> expected3 = Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54);
        assertEquals(expected3, OrderByPoints.orderByPoints(input3));

        List<Object> input4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Object> expected4 = Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected4, OrderByPoints.orderByPoints(input4));

        List<Object> input5 = Arrays.asList(0, 6, 6, -76, -21, 23, 4);
        List<Object> expected5 = Arrays.asList(-76, -21, 0, 4, 23, 6, 6);
        assertEquals(expected5, OrderByPoints.orderByPoints(input5));
    }
}
```
