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
		* Test case 1:
		* The method isValidValue(String) should return true if the value is valid.
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
		* Test case 2:
		* The method isValidValue(String) should return false if the value is not valid.
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
		* Test case 3:
		* The method isValidValue(String) should return true if the value is valid.
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
		* Test case 4:
		* The method isValidValue(String) should return false if the value is not valid.
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
		* Test case 5:
		* The method isValidValue(String) should return true if the value is valid.
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
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				assertTrue(fieldInfo.isValidValue("3"));
		}
		
		/**
		* Test case 6:
		* The method isValidValue(String) should return false if the value is not valid.
		*/
		@Test
		public void testIsValidValue6() {
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
		* Test case 7:
		* The method isValidValue(String) should return true if the value is valid.
		*/
		@Test
		public void testIsValidValue7() {
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
				assertTrue(fieldInfo.isValidValue("4"));
		}
		
		/**
		* Test case 8:
		* The method isValidValue(String) should return false if the value is not valid.
		*/
		@Test
		public void testIsValidValue8() {
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
		* Test case 9:
		* The method isValidValue(String) should return true if the value is valid.
		*/
		@Test
		public void testIsValidValue9() {
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
				assertTrue(fieldInfo.isValidValue("5"));
		}
		
		/**
		* Test case 10:
		* The method isValidValue(String) should return false if the value is not valid.
		*/
		@Test
		public void testIsValidValue10() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
