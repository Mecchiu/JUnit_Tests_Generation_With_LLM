// DecimalToBinaryTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
	/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db0db" when the input is 0.
			*/
			@Test
			void testDecimalToBinaryWithZero() {
						assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db1db" when the input is 1.
			*/
			@Test
			void testDecimalToBinaryWithOne() {
						assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db10db" when the input is 2.
			*/
			@Test
			void testDecimalToBinaryWithTwo() {
						assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db11db" when the input is 3.
			*/
			@Test
			void testDecimalToBinaryWithThree() {
						assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db100db" when the input is 4.
			*/
			@Test
			void testDecimalToBinaryWithFour() {
						assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db101db" when the input is 5.
			*/
			@Test
			void testDecimalToBinaryWithFive() {
						assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db110db" when the input is 6.
			*/
			@Test
			void testDecimalToBinaryWithSix() {
						assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db111db" when the input is 7.
			*/
			@Test
			void testDecimalToBinaryWithSeven() {
						assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db1000db" when the input is 8.
			*/
			@Test
			void testDecimalToBinaryWithEight() {
						assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
			}

			/**
			* Test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
			* The method should return "db1001db" when the input is 9.
			*/
			@Test
			void testDecimalToBinaryWithNine() {
						assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
			}
}
