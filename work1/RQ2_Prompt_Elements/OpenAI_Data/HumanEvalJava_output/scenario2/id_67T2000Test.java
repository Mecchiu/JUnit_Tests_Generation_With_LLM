// FruitDistributionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
	/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution1() {
						String s = "4 apples, 3 oranges";
						int n = 7;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution2() {
						String s = "10 apples, 5 oranges";
						int n = 20;
						int expected = 5;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution3() {
						String s = "2 apples, 4 oranges";
						int n = 10;
						int expected = 4;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution4() {
						String s = "1 apples, 1 oranges";
						int n = 3;
						int expected = 1;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution5() {
						String s = "5 apples, 5 oranges";
						int n = 10;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution6() {
						String s = "0 apples, 0 oranges";
						int n = 0;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution7() {
						String s = "10 apples, 0 oranges";
						int n = 10;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution8() {
						String s = "0 apples, 10 oranges";
						int n = 10;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution9() {
						String s = "1 apples, 0 oranges";
						int n = 1;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with a valid input.
			*/
			@Test
			void testFruitDistribution10() {
						String s = "0 apples, 1 oranges";
						int n = 1;
						int expected = 0;
						int actual = FruitDistribution.fruitDistribution(s, n);
						assertEquals(expected, actual);
			}
}
