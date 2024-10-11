// SumSquaresTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains one unit test case for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

    /**
     * Sum of two values.
	 * @throws Exception 
     * @param args 
     */
    @Test
    void sumOfTwoValues() throws Exception {
	int total = 0;
        int sum1 = 0;
        for (int i = 0; i < 10; i ++) {
            sum1 = sumSquares(NumberUtils.getRandomValues(10));
            total += sum1;
        }
        assertEquals(sum1, total);
    }

}