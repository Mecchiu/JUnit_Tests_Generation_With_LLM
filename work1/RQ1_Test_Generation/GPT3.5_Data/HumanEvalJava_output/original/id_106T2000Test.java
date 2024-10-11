```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FTest {

    @Test
    void testFWith5() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15);
        assertEquals(expected, F.f(5));
    }

    @Test
    void testFWith7() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28);
        assertEquals(expected, F.f(7));
    }

    @Test
    void testFWith1() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, F.f(1));
    }

    @Test
    void testFWith3() {
        List<Integer> expected = List.of(1, 2, 6);
        assertEquals(expected, F.f(3));
    }

    // Add more test cases as needed

}
```
```