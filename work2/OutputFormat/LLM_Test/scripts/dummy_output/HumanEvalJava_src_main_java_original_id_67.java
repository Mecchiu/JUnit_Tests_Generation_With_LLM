// FruitDistributionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "5 apples and 6 oranges"</li>
			* <li>int n = 19</li>
			* </ul>
			* The expected result is 8.
			*/
			@Test
			void testFruitDistribution1() {
						assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "5 apples and 6 oranges"</li>
			* <li>int n = 21</li>
			* </ul>
			* The expected result is 10.
			*/
			@Test
			void testFruitDistribution2() {
						assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "0 apples and 1 oranges"</li>
			* <li>int n = 3</li>
			* </ul>
			* The expected result is 2.
			*/
			@Test
			void testFruitDistribution3() {
						assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "1 apples and 0 oranges"</li>
			* <li>int n = 3</li>
			* </ul>
			* The expected result is 2.
			*/
			@Test
			void testFruitDistribution4() {
						assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "2 apples and 3 oranges"</li>
			* <li>int n = 100</li>
			* </ul>
			* The expected result is 95.
			*/
			@Test
			void testFruitDistribution5() {
						assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "2 apples and 3 oranges"</li>
			* <li>int n = 5</li>
			* </ul>
			* The expected result is 0.
			*/
			@Test
			void testFruitDistribution6() {
						assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "1 apples and 100 oranges"</li>
			* <li>int n = 120</li>
			* </ul>
			* The expected result is 19.
			*/
			@Test
			void testFruitDistribution7() {
						assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "1 apples and 100 oranges"</li>
			* <li>int n = 121</li>
			* </ul>
			* The expected result is 20.
			*/
			@Test
			void testFruitDistribution8() {
						assertEquals(20, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 121));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "1 apples and 100 oranges"</li>
			* <li>int n = 122</li>
			* </ul>
			* The expected result is 21.
			*/
			@Test
			void testFruitDistribution9() {
						assertEquals(21, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 122));
			}

			/**
			* Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
			* It checks the method with the following parameters:
			* <ul>
			* <li>String s = "1 apples and 100 oranges"</li>
			* <li>int n = 123</li>
			* </ul>
			* The expected result is 22.
			*/
			@Test
			void testFruitDistribution10() {
						assertEquals(22, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 123));
			}
}