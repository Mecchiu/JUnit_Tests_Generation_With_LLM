```java
package original;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testSolution1() {
        List<Integer> lst = Arrays.asList(5, 8, 7, 1);
        assertEquals(12, Solution.solution(lst));
    }

    @Test
    void testSolution2() {
        List<Integer> lst = Arrays.asList(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst));
    }

    @Test
    void testSolution3() {
        List<Integer> lst = Arrays.asList(30, 13, 24, 321);
        assertEquals(0, Solution.solution(lst));
    }

    @Test
    void testSolution4() {
        List<Integer> lst = Arrays.asList(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst));
    }

    @Test
    void testSolution5() {
        List<Integer> lst = Arrays.asList(30, 13, 24, 321);
        assertEquals(0, Solution.solution(lst));
    }

    @Test
    void testSolution6() {
        List<Integer> lst = Arrays.asList(5, 9);
        assertEquals(5, Solution.solution(lst));
    }

    @Test
    void testSolution7() {
        List<Integer> lst = Arrays.asList(2, 4, 8);
        assertEquals(0, Solution.solution(lst));
    }

    @Test
    void testSolution8() {
        List<Integer> lst = Arrays.asList(30, 13, 23, 32);
        assertEquals(23, Solution.solution(lst));
    }

    @Test
    void testSolution9() {
        List<Integer> lst = Arrays.asList(3, 13, 2, 9);
        assertEquals(3, Solution.solution(lst));
    }

    @Test
    void testSolution10() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(16, Solution.solution(lst));
    }
}
```
```