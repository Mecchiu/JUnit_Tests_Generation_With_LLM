```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SmallestChangeTest {

    @Test
    void testSmallestChange1() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6);
        assertEquals(4, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange2() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 3, 2, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange3() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange4() {
        List<Integer> arr = Arrays.asList(1, 4, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange5() {
        List<Integer> arr = Arrays.asList(1, 4, 4, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange6() {
        List<Integer> arr = Arrays.asList(3, 1, 1, 3);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange7() {
        List<Integer> arr = Arrays.asList(1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange8() {
        List<Integer> arr = Arrays.asList(0, 1);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange9() {
        List<Integer> arr = Arrays.asList(1, 1, 1, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSmallestChange10() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(4, SmallestChange.smallestChange(arr));
    }
}
```
