// FruitDistributionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains one unit test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
/**
		 * Empty constructor.
		 */
		public FruitDistributionTest() {

		}

		/**
		 * Test {@link FruitDistribution#fruitDistribution(String, int)} method.
		*/
		@Test
    public void testFruitDistribution() {
		assertEquals("Incorrect fruitDistribution", "apple + orange + mango",
				fruitDistribution("apple", 1));
    }
}