```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import original.Common;
import java.util.Arrays;
import java.util.List;

class CommonTest {

    @Test
    void testCommonCase1() {
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = Arrays.asList(1, 5, 653);
        assertEquals(expected, Common.common(l1, l2));
    }

    @Test
    void testCommonCase2() {
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2);
        List<Object> expected = Arrays.asList(2, 3);
        assertEquals(expected, Common.common(l1, l2));
    }

    @Test
    void testCommonCase3() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2, 4);
        List<Object> expected = Arrays.asList(2, 3, 4);
        assertEquals(expected, Common.common(l1, l2));
    }

    @Test
    void testCommonCase4() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Arrays.asList();
        List<Object> expected = Arrays.asList();
        assertEquals(expected, Common.common(l1, l2));
    }

    // Add more test cases as needed
}
```
