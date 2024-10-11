// LargestDivisorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains one unit test case for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

    /**
     * Finds the largest number that divides 5 evenly
     * <p>
     * Returns the largest number that, divided by 5, more than n for example 7,
     * 3, 1, 2, 5, 4. For the example to see what is returned, call {@link Util#getLargest()},
     */
    @Test
    public void findLargestDivisor() {
        assertThat(LargestDivisor.largestDivisor(5), is(7));
    }
}
