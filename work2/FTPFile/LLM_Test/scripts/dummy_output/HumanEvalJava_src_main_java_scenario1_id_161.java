// SolveTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {
			// Test case 1
    @Test
    void testSolve1() {
        String input = "Hello World";
        String expected = "hELLO wORLD";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 2
    @Test
    void testSolve2() {
        String input = "Hello World!";
        String expected = "hELLO wORLD!";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 3
    @Test
    void testSolve3() {
        String input = "12345";
        String expected = "54321";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 4
    @Test
    void testSolve4() {
        String input = "1a2b3c4d5e";
        String expected = "5E4D3C2B1A";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testSolve5() {
        String input = "1A2B3C4D5E";
        String expected = "5e4d3c2b1a";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testSolve6() {
        String input = "1A2b3C4d5E";
        String expected = "5e4D3c2B1a";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testSolve7() {
        String input = "1a2B3c4D5e";
        String expected = "5E4d3C2b1A";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testSolve8() {
        String input = "1A2b3C4d5E";
        String expected = "5e4D3c2B1a";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testSolve9() {
        String input = "1a2B3c4D5e";
        String expected = "5E4d3C2b1A";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testSolve10() {
        String input = "12345!";
        String expected = "!54321";
        String actual = Solve.solve(input);
        assertEquals(expected, actual);
    }
}