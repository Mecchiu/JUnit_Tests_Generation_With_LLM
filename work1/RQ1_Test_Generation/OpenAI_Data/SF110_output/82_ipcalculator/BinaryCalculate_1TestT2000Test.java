// BinaryCalculate_1Test.java
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
class BinaryCalculate_1Test {

		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "0"</li>
		* </ul>
		*/
		@Test
		void testSubBinary_1() {
			String num1 = "1010101010101010101010101010101010101010101010101010101010101010";
			String num2 = "1010101010101010101010101010101010101010101010101010101010101010";
			String result = "0";
			assertEquals(result, new BinaryCalculate().subBinary(num1, num2));
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101011"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "1111111111111111111111111111111111111111111111111111111111111111"</li>
		* </ul>
		*/
		@Test
		void testSubBinary_2() {
			String num1 = "1010101010101010101010101010101010101010101010101010101010101010";
			String num2 = "1010101010101010101010101010101010101010101010101010101010101011";
			String result = "1111111111111111111111111111111111111111111111111111111111111111";
			assertEquals(result, new BinaryCalculate().subBinary(num1, num2));
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101100"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "1111111111111111111111111111111111111111111111111111111111111110"</li>
		* </ul>
		*/
		@Test
		void testSubBinary_3() {
			String num1 = "1010101010101010101010101010101010101010101010101010101010101010";
			String num2 = "1010101010101010101010101010101010101010101010101010101010101100";
			String result = "1111111111111111111111111111111111111111111111111111111111111110";
			assertEquals(result, new BinaryCalculate().subBinary(num1, num2));
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101101"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "1111111111111111111111111111111111111111111111111111111111111101"</li>
		* </ul>
		*/
		@Test
		void testSubBinary_4() {
			String num1 = "1010101010101010101010101010101010101010101010101010101010101010";
			String num2 = "1010101010101010101010101010101010101010101010101010101010101101";
			String result = "1111111111111111111111111111111111111111111111111111111111111101";
			assertEquals(result, new BinaryCalculate().subBinary(num1, num2));
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101110"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "1111111111111111111111111111111111111111111111111111111111111100"</li>
		* </ul>
		*/
		@Test
		void testSubBinary_5() {
			String num1 = "1010101010101010101010101010101010101010101010101010101010101010";
			String num2 = "1010101010101010101010101010101010101010101010101010101010101110";
			String result = "1111111111111111111111111111111111111111111111111111111111111100";
			assertEquals(result, new BinaryCalculate().subBinary(num1, num2));
		}
		
		/**
		* Test case for {@link BinaryCalculate#subBinary(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>num1 = "1010101010101010101010101010101010101010101010101010101010101010"</li>
		* <li>num2 = "1010101010101010101010101010101010101010101010101010101010101111"</li>
		* </ul>
		* and expects the following result:
		* <ul>
		* <li>result = "1111111111111111111111111111111111111111111111111111111111111011"</li>
		* </ul>
		*/
		@