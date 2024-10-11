```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solve1Test {

    @Test
    void testSolveWith1000() {
        assertEquals("1", Solve1.solve(1000));
    }

    @Test
    void testSolveWith150() {
        assertEquals("110", Solve1.solve(150));
    }

    @Test
    void testSolveWith147() {
        assertEquals("1100", Solve1.solve(147));
    }

    @Test
    void testSolveWith333() {
        assertEquals("1001", Solve1.solve(333));
    }

    @Test
    void testSolveWith963() {
        assertEquals("10010", Solve1.solve(963));
    }

    @Test
    void testSolveWith0() {
        assertEquals("0", Solve1.solve(0));
    }

    @Test
    void testSolveWith1() {
        assertEquals("1", Solve1.solve(1));
    }

    @Test
    void testSolveWith10() {
        assertEquals("1", Solve1.solve(10));
    }

    @Test
    void testSolveWith9999() {
        assertEquals("1001", Solve1.solve(9999));
    }

    @Test
    void testSolveWith10000() {
        assertEquals("10000", Solve1.solve(10000));
    }
}
```
```