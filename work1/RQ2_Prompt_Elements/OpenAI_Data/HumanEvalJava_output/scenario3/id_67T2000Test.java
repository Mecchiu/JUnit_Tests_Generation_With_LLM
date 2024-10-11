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
			void testFruitDistribution1() {
				assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
			}

			@Test
			void testFruitDistribution2() {
				assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
			}

			@Test
			void testFruitDistribution3() {
				assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
			}

			@Test
			void testFruitDistribution4() {
				assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
			}

			@Test
			void testFruitDistribution5() {
				assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
			}

			@Test
			void testFruitDistribution6() {
				assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
			}

			@Test
			void testFruitDistribution7() {
				assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
			}

			@Test
			void testFruitDistribution8() {
				assertEquals(0, FruitDistribution.fruitDistribution("0 apples and 0 oranges", 0));
			}

			@Test
			void testFruitDistribution9() {
				assertEquals(0, FruitDistribution.fruitDistribution("0 apples and 0 oranges", 10));
			}

			@Test
			void testFruitDistribution10() {
				assertEquals(0, FruitDistribution.fruitDistribution("0 apples and 0 oranges", 100));
			}
}
