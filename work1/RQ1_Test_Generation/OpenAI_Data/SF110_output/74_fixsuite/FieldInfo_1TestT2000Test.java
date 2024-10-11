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
		 * 
		 * <p>
		 * This test case is for the following assumptions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following conditions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following steps:
		 * <ol>
		 * <li>Create a {@link FieldInfo} object.</li>
		 * <li>Add a valid value to the {@link FieldInfo} object.</li>
		 * <li>Call the {@link FieldInfo#isValidValue(String)} method with the valid value.</li>
		 * <li>Verify that the {@link FieldInfo#isValidValue(String)} method returns true.</li>
		 * </ol>
		 * </p>
		 */
		@Test
		void testIsValidValue_1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.addValidValue(new ValueInfo("1", "One"));
				assertTrue(fieldInfo.isValidValue("1"));
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
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following assumptions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following conditions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following steps:
		 * <ol>
		 * <li>Create a {@link FieldInfo} object.</li>
		 * <li>Add a valid value to the {@link FieldInfo} object.</li>
		 * <li>Call the {@link FieldInfo#isValidValue(String)} method with the valid value.</li>
		 * <li>Verify that the {@link FieldInfo#isValidValue(String)} method returns true.</li>
		 * </ol>
		 * </p>
		 */
		@Test
		void testIsValidValue_2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.addValidValue(new ValueInfo("1", "One"));
				assertTrue(fieldInfo.isValidValue("1"));
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
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following assumptions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following conditions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following steps:
		 * <ol>
		 * <li>Create a {@link FieldInfo} object.</li>
		 * <li>Add a valid value to the {@link FieldInfo} object.</li>
		 * <li>Call the {@link FieldInfo#isValidValue(String)} method with the valid value.</li>
		 * <li>Verify that the {@link FieldInfo#isValidValue(String)} method returns true.</li>
		 * </ol>
		 * </p>
		 */
		@Test
		void testIsValidValue_3() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.addValidValue(new ValueInfo("1", "One"));
				assertTrue(fieldInfo.isValidValue("1"));
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
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following assumptions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following conditions:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following steps:
		 * <ol>
		 * <li>Create a {@link FieldInfo} object.</li>
		 * <li>Add a valid value to the {@link FieldInfo} object.</li>
		 * <li>Call the {@link FieldInfo#isValidValue(String)} method with the valid value.</li>
		 * <li>Verify that the {@link FieldInfo#isValidValue(String)} method returns true.</li>
		 * </ol>
		 * </p>
		 */
		@Test
		void testIsValidValue_