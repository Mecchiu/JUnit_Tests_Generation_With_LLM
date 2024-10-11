```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @Test
    void testCompareAllCorrect() {
        List<Integer> game = List.of(1, 2, 3, 4, 5, 1);
        List<Integer> guess = List.of(1, 2, 3, 4, 5, 1);
        List<Integer> expected = List.of(0, 0, 0, 0, 0, 0);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareSomeIncorrect() {
        List<Integer> game = List.of(0, 5, 0, 0, 0, 4);
        List<Integer> guess = List.of(4, 1, 1, 0, 0, -2);
        List<Integer> expected = List.of(4, 4, 1, 0, 0, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareNegativeGuesses() {
        List<Integer> game = List.of(1, 2, 3);
        List<Integer> guess = List.of(-1, -2, -3);
        List<Integer> expected = List.of(2, 4, 6);
        assertEquals(expected, Compare.compare(game, guess));
    }

    @Test
    void testCompareMixedGuesses() {
        List<Integer> game = List.of(1, 2, 3, 5);
        List<Integer> guess = List.of(-1, 2, 3, 4);
        List<Integer> expected = List.of(2, 0, 0, 1);
        assertEquals(expected, Compare.compare(game, guess));
    }
}
```
