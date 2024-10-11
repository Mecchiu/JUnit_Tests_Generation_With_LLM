// FruitDistributionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

		@Test
		void testFruitDistribution() {
				assertEquals(1, FruitDistribution.fruitDistribution("2 apples", 3));
				assertEquals(1, FruitDistribution.fruitDistribution("2 oranges", 3));
				assertEquals(1, FruitDistribution.fruitDistribution("2 apples 1 oranges", 3));
				assertEquals(1, FruitDistribution.fruitDistribution("1 apples 2 oranges", 3));
				assertEquals(1, FruitDistribution.fruitDistribution("2 apples 2 oranges", 4));
				assertEquals(1, FruitDistribution.fruitDistribution("2 apples 2 oranges", 5));
				assertEquals(2, FruitDistribution.fruitDistribution("2 apples 2 oranges", 6));
				assertEquals(2, FruitDistribution.fruitDistribution("2 apples 2 oranges", 7));
				assertEquals(2, FruitDistribution.fruitDistribution("2 apples 2 oranges", 8));
				assertEquals(2, FruitDistribution.fruitDistribution("2 apples 2 oranges", 9));
		}
}