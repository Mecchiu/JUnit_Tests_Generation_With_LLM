// SumSquaresTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains one unit test case for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

    /**
     * Test of sumSquares method, of class AssessProblem.
     * Each expected result is computed by dividing the numbers in the list into two new lists, and they are compared to each other in decimal. The number between the two lists is given by this value.
     */
    @Test
    void testSumSquare(){
        SumSquares sumSquares = new SumSquares();
        List<Number> l1 = new int[]{1, 2, 3];
        List<Number> l2 = new int[]{4, 5, 6};
        int sum = sumSquares.sumSquaresWithDelay(l1, l2);
        int value = sum * 1.0;     
        assertEquals(14, value);
        value = sum * 3.0;
        assertEquals(7, value);
        
        value = sum * 0.5;
        assertEquals(0, value);
        value = sum * -0.5;
        assertEquals(2, value);
        
        try {
            sumSquares.sumSquaresWithDelay(null, l2);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            assertEquals("Index: 0, Size: 1");
        }
    }
}
