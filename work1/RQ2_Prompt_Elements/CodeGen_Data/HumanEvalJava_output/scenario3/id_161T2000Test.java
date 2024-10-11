// SolveTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains one unit test case for the {@link Solve#solve(String)} method.
*/
class SolveTest {
/**
		 * Unit test case for {@link Solve#solve(String)}.
		 */
    @Test
    public void testSolving() {
        assertEquals("4321", new Solve().solve("4321"));
        assertEquals(null, new Solve().solve("4"));
        assertEquals(null, new Solve().solve("a4  asdf#"));
        assertEquals("ab", new Solve().solve("AB"));
        assertEquals("B", new Solve().solve("\u0024B"));
    }
}
