Here's the code for the SolutionTest class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolutionWithEmptyList() {
        List<Integer> lst = Arrays.asList();
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithOneEvenElement() {
        List<Integer> lst = Arrays.asList(2);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithOneOddElement() {
        List<Integer> lst = Arrays.asList(3);
        int expected = 3;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithTwoEvenElements() {
        List<Integer> lst = Arrays.asList(2, 4);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithTwoOddElements() {
        List<Integer> lst = Arrays.asList(3, 5);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithOneEvenAndOneOddElement() {
        List<Integer> lst = Arrays.asList(2, 3);
        int expected = 3;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithOneOddAndOneEvenElement() {
        List<Integer> lst = Arrays.asList(3, 2);
        int expected = 0;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithThreeElements() {
        List<Integer> lst = Arrays.asList(2, 3, 4);
        int expected = 3;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithFourElements() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4);
        int expected = 4;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSolutionWithFiveElements() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 6;
        int actual = Solution.solution(lst);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten unit test cases for the `Solution.solution()` method. Each test case covers a different scenario, including empty lists, lists with one or two elements, and lists with odd and even elements. The expected results are calculated manually and compared to the actual results returned by the `Solution.solution()` method using the `assertEquals()` method from the JUnit library.