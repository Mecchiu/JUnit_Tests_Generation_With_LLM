```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class SearchTest {

    @Test
    void testSearchCase1() {
        List<Integer> lst = Arrays.asList(4, 1, 2, 2, 3, 1);
        assertEquals(2, Search.search(lst));
    }

    @Test
    void testSearchCase2() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4);
        assertEquals(3, Search.search(lst));
    }

    @Test
    void testSearchCase3() {
        List<Integer> lst = Arrays.asList(5, 5, 4, 4, 4);
        assertEquals(-1, Search.search(lst));
    }

    // Add more test cases here

}
```
```