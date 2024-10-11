```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeAPileTest {

    @Test
    void testMakeAPileWith3() {
        List<Integer> expected = List.of(3, 5, 7);
        assertEquals(expected, MakeAPile.makeAPile(3));
    }

    @Test
    void testMakeAPileWith4() {
        List<Integer> expected = List.of(4, 6, 8, 10);
        assertEquals(expected, MakeAPile.makeAPile(4));
    }

    @Test
    void testMakeAPileWith5() {
        List<Integer> expected = List.of(5, 7, 9, 11, 13);
        assertEquals(expected, MakeAPile.makeAPile(5));
    }

    @Test
    void testMakeAPileWith6() {
        List<Integer> expected = List.of(6, 8, 10, 12, 14, 16);
        assertEquals(expected, MakeAPile.makeAPile(6));
    }

    @Test
    void testMakeAPileWith8() {
        List<Integer> expected = List.of(8, 10, 12, 14, 16, 18, 20, 22);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }

    // Add more test cases as needed
}
```
