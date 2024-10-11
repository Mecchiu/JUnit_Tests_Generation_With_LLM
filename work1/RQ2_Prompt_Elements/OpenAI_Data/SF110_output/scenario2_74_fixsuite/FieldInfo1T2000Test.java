// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest {

		/**
		* Test case 1 for the {@link FieldInfo#isValidValue(String)} method.
		* It tests the method with a valid value.
		*/
		@Test
		public void testIsValidValue1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertTrue(fieldInfo.isValidValue("1"));
		}
		
		/**
		* Test case 2 for the {@link FieldInfo#isValidValue(String)} method.
		* It tests the method with an invalid value.
		*/
		@Test
		public void testIsValidValue2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertFalse(fieldInfo.isValidValue("H"));
		}
		
		/**
		* Test case 3 for the {@link FieldInfo#isValidValue(String)} method.
		* It tests the method with a valid value.
		*/
		@Test
		public void testIsValidValue3() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertTrue(fieldInfo.isValidValue("2"));
		}
		
		/**
		* Test case 4 for the {@link FieldInfo#isValidValue(String)} method.
		* It tests the method with an invalid value.
		*/
		@Test
		public void testIsValidValue4() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertFalse(fieldInfo.isValidValue("H"));
		}
		
		/**
		* Test case 5 for the {@link FieldInfo#isValidValue(String)} method.
		* It tests the method with a valid value.
		*/
		@Test
		public void testIsValidValue5() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short