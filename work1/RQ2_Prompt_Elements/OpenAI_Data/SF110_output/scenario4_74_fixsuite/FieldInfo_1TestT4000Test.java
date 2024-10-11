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
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has no valid values.
	 */
	@Test
	public void testIsValidValue_1() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
		assertFalse(fieldInfo.isValidValue(""));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_2() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_3() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_4() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_5() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_6() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("3"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_7() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_8() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_9() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("3"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_10() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("4"));
	}
}

// FieldInfo_2Test.java
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
class FieldInfo_2Test {
		
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has no valid values.
	 */
	@Test
	public void testIsValidValue_1() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
		assertFalse(fieldInfo.isValidValue(""));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_2() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_3() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_4() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_5() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_6() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("3"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_7() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_8() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_9() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("3"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_10() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		validValues.put("3", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("4"));
	}
}

// FieldInfo_3Test.java
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
class FieldInfo_3Test {
		
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has no valid values.
	 */
	@Test
	public void testIsValidValue_1() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
		assertFalse(fieldInfo.isValidValue(""));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_2() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_3() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertFalse(fieldInfo.isValidValue("2"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_4() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("1"));
	}
	
	/**
	 * Test case for {@link FieldInfo#isValidValue(String)} method.
	 * It tests the case when the field has valid values.
	 */
	@Test
	public void testIsValidValue_5() {
		FieldInfo fieldInfo = new FieldInfo();
		TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
		validValues.put("1", new ValueInfo());
		validValues.put("2", new ValueInfo());
		fieldInfo.setValidValues(validValues);
		assertTrue(fieldInfo.isValidValue("2