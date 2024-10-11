// FruitDistributionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

	@Test
	void testFruitDistribution() {
		assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
		assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
		assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
		assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
		assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
		assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
		assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
	}
}