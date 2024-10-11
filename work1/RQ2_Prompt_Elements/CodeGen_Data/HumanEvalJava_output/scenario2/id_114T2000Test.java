// MinsubarraysumTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains one unit test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
@Test
		/*
        * TODO: Please add test description.
        * Description.
        * It is a unit test for the {@link Minsubarraysum#minsubarraysum(List)} method.
        */
    public void minsubarraysum() {

        // Arrange

        // We will pass a variable as argument in the first step
        int[] nums = {1, 2, 3, 4, 5};
        long sum = minsubarraysum(nums);

        // Assert
        
        // Let's try to test the unit test.
        assertEquals(0, sum);

        // We will again pass a variable as argument in the first step
        int[] nums = {2, 4, 5, 6, 7, 8, 9};
        sum = minsubarraysum(nums);

        // Assert
        
        // Let's try to test the unit test.
        assertTrue("Sum is not -1000: " + sum,sum == -1000);
		
    }
}
