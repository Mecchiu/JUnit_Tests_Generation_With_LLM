// Solve1.java
package scenario3;

class Solve1 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 2;
            n /= 2;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
    @Test
    void testSolve1() {
        assertEquals("1", Solve1.solve(1000));
    }

    @Test
    void testSolve2() {
        assertEquals("110", Solve1.solve(150));
    }

    @Test
    void testSolve3() {
        assertEquals("1100", Solve1.solve(147));
    }

    @Test
    void testSolve4() {
        assertEquals("1001", Solve1.solve(333));
    }

    @Test
    void testSolve5() {
        assertEquals("10010", Solve1.solve(963));
    }

    @Test
    void testSolve6() {
        assertEquals("0", Solve1.solve(0));
    }

    @Test
    void testSolve7() {
        assertEquals("1", Solve1.solve(1));
    }

    @Test
    void testSolve8() {
        assertEquals("10", Solve1.solve(2));
    }

    @Test
    void testSolve9() {
        assertEquals("11", Solve1.solve(3));
    }

    @Test
    void testSolve10() {
        assertEquals("101", Solve1.solve(5));
    }
}