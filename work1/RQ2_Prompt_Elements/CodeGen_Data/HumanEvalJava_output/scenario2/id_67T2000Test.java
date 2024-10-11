// FruitDistributionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains one unit test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
@Test
		public void testCases() {
			assertEquals("2 apples and 2 oranges are distributed in a basket", //
					2,       fruitDistribution("apple 2 apples",   2));        //
            assertEquals("4 apples and 20 oranges are distributed in a basket",             //
                    30,       fruitDistribution("apple 20 apples",   20));  //
            assertEquals("8 apples and 30 oranges are distributed in a basket",             //
                    60,       fruitDistribution("apple 30 apples",   30)); //
        }
}		
