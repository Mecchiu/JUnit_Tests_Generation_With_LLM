```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GetOddCollatzTest {

    @Test
    void testGetOddCollatz_With5_ReturnsCorrectList() {
        List<Integer> expected = List.of(1, 5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(5));
    }

    @Test
    void testGetOddCollatz_With14_ReturnsCorrectList() {
        List<Integer> expected = List.of(1, 5, 7, 11, 13, 17);
        assertEquals(expected, GetOddCollatz.getOddCollatz(14));
    }

    @Test
    void testGetOddCollatz_With12_ReturnsCorrectList() {
        List<Integer> expected = List.of(1, 3, 5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(12));
    }

    @Test
    void testGetOddCollatz_With1_ReturnsCorrectList() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));
    }

    // Add more test cases as needed
}
```
```