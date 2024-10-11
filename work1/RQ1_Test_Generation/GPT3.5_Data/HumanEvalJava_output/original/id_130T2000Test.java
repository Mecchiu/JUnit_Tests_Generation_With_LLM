```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriTest {

    @Test
    void testTriWithN3() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0);
        assertEquals(expected, Tri.tri(3));
    }

    @Test
    void testTriWithN4() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0);
        assertEquals(expected, Tri.tri(4));
    }

    @Test
    void testTriWithN5() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0);
        assertEquals(expected, Tri.tri(5));
    }

    @Test
    void testTriWithN6() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0);
        assertEquals(expected, Tri.tri(6));
    }

    @Test
    void testTriWithN7() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0);
        assertEquals(expected, Tri.tri(7));
    }

    @Test
    void testTriWithN8() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0);
        assertEquals(expected, Tri.tri(8));
    }

    @Test
    void testTriWithN9() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0);
        assertEquals(expected, Tri.tri(9));
    }

    @Test
    void testTriWithN20() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0);
        assertEquals(expected, Tri.tri(20));
    }

    @Test
    void testTriWithN0() {
        List<Number> expected = Arrays.asList(1);
        assertEquals(expected, Tri.tri(0));
    }

    @Test
    void testTriWithN1() {
        List<Number> expected = Arrays.asList(1, 3);
        assertEquals(expected, Tri.tri(1));
    }
}
```
