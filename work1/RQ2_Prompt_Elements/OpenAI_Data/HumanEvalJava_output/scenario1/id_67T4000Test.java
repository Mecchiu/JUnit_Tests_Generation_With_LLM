// FruitDistributionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

		/**
		* Test case 1.
		* The input string is "10 apples 20 oranges" and the number of fruits is 30.
		* The expected result is 0.
		*/
		@Test
		void testCase1() {
				String s = "10 apples 20 oranges";
				int n = 30;
				int expected = 0;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string is "10 apples 20 oranges" and the number of fruits is 40.
		* The expected result is 10.
		*/
		@Test
		void testCase2() {
				String s = "10 apples 20 oranges";
				int n = 40;
				int expected = 10;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string is "10 apples 20 oranges" and the number of fruits is 50.
		* The expected result is 20.
		*/
		@Test
		void testCase3() {
				String s = "10 apples 20 oranges";
				int n = 50;
				int expected = 20;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string is "10 apples 20 oranges" and the number of fruits is 60.
		* The expected result is 30.
		*/
		@Test
		void testCase4() {
				String s = "10 apples 20 oranges";
				int n = 60;
				int expected = 30;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string is "10 apples 20 oranges" and the number of fruits is 70.
		* The expected result is 40.
		*/
		@Test
		void testCase5() {
				String s = "10 apples 20 oranges";
				int n = 70;
				int expected = 40;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string is "10 apples 20 oranges" and the number of fruits is 80.
		* The expected result is 50.
		*/
		@Test
		void testCase6() {
				String s = "10 apples 20 oranges";
				int n = 80;
				int expected = 50;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string is "10 apples 20 oranges" and the number of fruits is 90.
		* The expected result is 60.
		*/
		@Test
		void testCase7() {
				String s = "10 apples 20 oranges";
				int n = 90;
				int expected = 60;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string is "10 apples 20 oranges" and the number of fruits is 100.
		* The expected result is 70.
		*/
		@Test
		void testCase8() {
				String s = "10 apples 20 oranges";
				int n = 100;
				int expected = 70;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string is "10 apples 20 oranges" and the number of fruits is 110.
		* The expected result is 80.
		*/
		@Test
		void testCase9() {
				String s = "10 apples 20 oranges";
				int n = 110;
				int expected = 80;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string is "10 apples 20 oranges" and the number of fruits is 120.
		* The expected result is 90.
		*/
		@Test
		void testCase10() {
				String s = "10 apples 20 oranges";
				int n = 120;
				int expected = 90;
				int actual = FruitDistribution.fruitDistribution(s, n);
				assertEquals(expected, actual);
		}
}