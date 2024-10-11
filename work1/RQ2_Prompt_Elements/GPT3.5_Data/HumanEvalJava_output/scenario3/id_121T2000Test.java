// Solution.java
package scenario3;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     *
     * Examples
     * solution([5, 8, 7, 1]) ==> 12
     * solution([3, 3, 3, 3, 3]) ==> 9
     * solution([30, 13, 24, 321]) ==>0
     *
     * > solution([3, 3, 3, 3, 3])
     * 9
     * > solution([30, 13, 24, 321])
     * 0
     * > solution([5, 9])
     * 5
     * > solution([2, 4, 8])
     * 0
     * > solution([30, 13, 23, 32])
     * 23
     * > solution([3, 13, 2, 9])
     * 3
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i += 2) {
            if (i % 2 == 0 && lst.get(i) % 2 != 0) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

    @Test
    void testSolution() {
        List<Integer> lst1 = Arrays.asList(5, 8, 7, 1);
        assertEquals(12, Solution.solution(lst1));

        List<Integer> lst2 = Arrays.asList(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst2));

        List<Integer> lst3 = Arrays.asList(30, 13, 24, 321);
        assertEquals(0, Solution.solution(lst3));

        List<Integer> lst4 = Arrays.asList(5, 9);
        assertEquals(5, Solution.solution(lst4));

        List<Integer> lst5 = Arrays.asList(2, 4, 8);
        assertEquals(0, Solution.solution(lst5));

        List<Integer> lst6 = Arrays.asList(30, 13, 23, 32);
        assertEquals(23, Solution.solution(lst6));

        List<Integer> lst7 = Arrays.asList(3, 13, 2, 9);
        assertEquals(3, Solution.solution(lst7));

        List<Integer> lst8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(16, Solution.solution(lst8));

        List<Integer> lst9 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(15, Solution.solution(lst9));

        List<Integer> lst10 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(0, Solution.solution(lst10));
    }
}