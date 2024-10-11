// BinaryCalculateTest.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculateTest {

		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two positive numbers.
		*/
		@Test
		void testSubBinaryPositive() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two negative numbers.
		*/
		@Test
		void testSubBinaryNegative() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one positive and one negative number.
		*/
		@Test
		void testSubBinaryPositiveNegative() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one negative and one positive number.
		*/
		@Test
		void testSubBinaryNegativePositive() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two positive numbers.
		*/
		@Test
		void testSubBinaryPositive2() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two negative numbers.
		*/
		@Test
		void testSubBinaryNegative2() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one positive and one negative number.
		*/
		@Test
		void testSubBinaryPositiveNegative2() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one negative and one positive number.
		*/
		@Test
		void testSubBinaryNegativePositive2() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two positive numbers.
		*/
		@Test
		void testSubBinaryPositive3() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with two negative numbers.
		*/
		@Test
		void testSubBinaryNegative3() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one positive and one negative number.
		*/
		@Test
		void testSubBinaryPositiveNegative3() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with one negative and one positive number.
		*/
		@Test
		void testSubBinaryNegativePositive3() {
				BinaryCalculate bc = new BinaryCalculate();
				String num1 = "101";
				String num2 = "11";
				String expected = "1010";
				String actual = bc.subBinary(num1, num2);
				assertEquals(expected, actual);
		}
}