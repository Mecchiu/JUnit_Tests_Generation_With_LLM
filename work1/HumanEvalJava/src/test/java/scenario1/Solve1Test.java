// Solve1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
			// Test case 1
    @Test
    void testSolve1() {
        assertEquals("0", Solve1.solve(0));
    }

    // Test case 2
    @Test
    void testSolve2() {
        assertEquals("1", Solve1.solve(1));
    }

    // Test case 3
    @Test
    void testSolve3() {
        assertEquals("10", Solve1.solve(2));
    }

    // Test case 4
    @Test
    void testSolve4() {
        assertEquals("11", Solve1.solve(3));
    }

    // Test case 5
    @Test
    void testSolve5() {
        assertEquals("100", Solve1.solve(4));
    }

    // Test case 6
    @Test
    void testSolve6() {
        assertEquals("101", Solve1.solve(5));
    }

    // Test case 7
    @Test
    void testSolve7() {
        assertEquals("110", Solve1.solve(6));
    }

    // Test case 8
    @Test
    void testSolve8() {
        assertEquals("111", Solve1.solve(7));
    }

    // Test case 9
    @Test
    void testSolve9() {
        assertEquals("1000", Solve1.solve(8));
    }

    // Test case 10
    @Test
    void testSolve10() {
        assertEquals("1001", Solve1.solve(9));
    }
}