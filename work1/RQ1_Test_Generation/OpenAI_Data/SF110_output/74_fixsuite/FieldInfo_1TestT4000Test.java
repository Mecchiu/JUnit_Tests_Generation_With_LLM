// FieldInfo_1Test.java
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
class FieldInfo_1Test {

		/**
		 * Test case 1.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo.isValidValue("7"));
				assertTrue(fieldInfo.isValidValue("8"));
				assertTrue(fieldInfo.isValidValue("9"));
				assertTrue(fieldInfo.isValidValue("10"));
		}
		
		/**
		 * Test case 2.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("11"));
				assertFalse(fieldInfo.isValidValue("12"));
				assertFalse(fieldInfo.isValidValue("13"));
				assertFalse(fieldInfo.isValidValue("14"));
				assertFalse(fieldInfo.isValidValue("15"));
				assertFalse(fieldInfo.isValidValue("16"));
				assertFalse(fieldInfo.isValidValue("17"));
				assertFalse(fieldInfo.isValidValue("18"));
				assertFalse(fieldInfo.isValidValue("19"));
				assertFalse(fieldInfo.isValidValue("20"));
		}
		
		/**
		 * Test case 3.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_3() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("21"));
				assertFalse(fieldInfo.isValidValue("22"));
				assertFalse(fieldInfo.isValidValue("23"));
				assertFalse(fieldInfo.isValidValue("24"));
				assertFalse(fieldInfo.isValidValue("25"));
				assertFalse(fieldInfo.isValidValue("26"));
				assertFalse(fieldInfo.isValidValue("27"));
				assertFalse(fieldInfo.isValidValue("28"));
				assertFalse(fieldInfo.isValidValue("29"));
				assertFalse(fieldInfo.isValidValue("30"));
		}
		
		/**
		 * Test case 4.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_4() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("31"));
				assertFalse(fieldInfo.isValidValue("32"));
				assertFalse(fieldInfo.isValidValue("33"));
				assertFalse(fieldInfo.isValidValue("34"));
				assertFalse(fieldInfo.isValidValue("35"));
				assertFalse(fieldInfo.isValidValue("36"));
				assertFalse(fieldInfo.isValidValue("37"));
				assertFalse(fieldInfo.isValidValue("38"));
				assertFalse(fieldInfo.isValidValue("39"));
				assertFalse(fieldInfo.isValidValue("40"));
		}
		
		/**
		 * Test case 5.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_5() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("41"));
				assertFalse(fieldInfo.isValidValue("42"));
				assertFalse(fieldInfo.isValidValue("43"));
				assertFalse(fieldInfo.isValidValue("44"));
				assertFalse(fieldInfo.isValidValue("45"));
				assertFalse(fieldInfo.isValidValue("46"));
				assertFalse(fieldInfo.isValidValue("47"));
				assertFalse(fieldInfo.isValidValue("48"));
				assertFalse(fieldInfo.isValidValue("49"));
				assertFalse(fieldInfo.isValidValue("50"));
		}
		
		/**
		 * Test case 6.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_6() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("51"));
				assertFalse(fieldInfo.isValidValue("52"));
				assertFalse(fieldInfo.isValidValue("53"));
				assertFalse(fieldInfo.isValidValue("54"));
				assertFalse(fieldInfo.isValidValue("55"));
				assertFalse(fieldInfo.isValidValue("56"));
				assertFalse(fieldInfo.isValidValue("57"));
				assertFalse(fieldInfo.isValidValue("58"));
				assertFalse(fieldInfo.isValidValue("59"));
				assertFalse(fieldInfo.isValidValue("60"));
		}
		
		/**
		 * Test case 7.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is invalid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_7() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("61"));
				assertFalse(fieldInfo.isValidValue("62"));
				assertFalse(fieldInfo.isValidValue("63"));
				assertFalse(fieldInfo.isValidValue("64"));
				assertFalse(fieldInfo.isValidValue("65"));
	