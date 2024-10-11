```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUpToTest {

    @Test
    void testCountUpTo_5() {
        assertEquals(List.of(2, 3), CountUpTo.countUpTo(5));
    }

    @Test
    void testCountUpTo_6() {
        assertEquals(List.of(2, 3, 5), CountUpTo.countUpTo(6));
    }

    @Test
    void testCountUpTo_7() {
        assertEquals(List.of(2, 3, 5), CountUpTo.countUpTo(7));
    }

    @Test
    void testCountUpTo_10() {
        assertEquals(List.of(2, 3, 5, 7), CountUpTo.countUpTo(10));
    }

    @Test
    void testCountUpTo_0() {
        assertEquals(List.of(), CountUpTo.countUpTo(0));
    }

    @Test
    void testCountUpTo_22() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), CountUpTo.countUpTo(22));
    }

    @Test
    void testCountUpTo_1() {
        assertEquals(List.of(), CountUpTo.countUpTo(1));
    }

    @Test
    void testCountUpTo_18() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17), CountUpTo.countUpTo(18));
    }

    @Test
    void testCountUpTo_47() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43), CountUpTo.countUpTo(47));
    }

    @Test
    void testCountUpTo_101() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), CountUpTo.countUpTo(101));
    }
}
```
