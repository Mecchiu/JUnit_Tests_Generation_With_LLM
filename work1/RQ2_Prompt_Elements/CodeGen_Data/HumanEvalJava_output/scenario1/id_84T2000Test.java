// Solve1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains one unit test case for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

    /**
     * Method for testing {@link Scenario1#solve(int)}.
     */
    @Test
    public void testSolve() {
            assertEquals("0", solve(23));
            assertEquals("1", solve(24));
            assertEquals("10", solve(25));
            assertEquals("11", solve(26));
            assertEquals("12", solve(27));
            assertEquals("13", solve(24));
            assertEquals("14", solve(25));
            assertEquals("15", solve(26));
            assertEquals("30", solve(27));
            assertEquals("0", solve(17));
            assertEquals("1", solve(18));
            assertEquals("10", solve(19));
            assertEquals("11", solve(20));
            assertEquals("12", solve(21));
            assertEquals("13", solve(23));
            assertEquals("1", solve(22));
        }
		
}
