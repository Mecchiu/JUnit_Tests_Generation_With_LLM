// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {

	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = null</td><td>false</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_0() {
		// Test Data
		ComponentInfo component = null;
		
		// Expected Result
		boolean expected = false;
		
		// Actual Result
		FieldInfo fieldInfo = new FieldInfo();
		boolean actual = fieldInfo.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()</td><td>false</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_1() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		
		// Expected Result
		boolean expected = false;
		
		// Actual Result
		FieldInfo fieldInfo = new FieldInfo();
		boolean actual = fieldInfo.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()<br>
	 * component.setName("Component")</td><td>false</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_2() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		component.setName("Component");
		
		// Expected Result
		boolean expected = false;
		
		// Actual Result
		FieldInfo fieldInfo = new FieldInfo();
		boolean actual = fieldInfo.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()<br>
	 * component.setName("Component")<br>
	 * fieldInfo = new FieldInfo()<br>
	 * fieldInfo.setName("Field")<br>
	 * component.addRequiredField(fieldInfo)</td><td>false</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_3() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		component.setName("Component");
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Field");
		component.addRequiredField(fieldInfo);
		
		// Expected Result
		boolean expected = false;
		
		// Actual Result
		FieldInfo fieldInfo2 = new FieldInfo();
		boolean actual = fieldInfo2.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()<br>
	 * component.setName("Component")<br>
	 * fieldInfo = new FieldInfo()<br>
	 * fieldInfo.setName("Field")<br>
	 * component.addRequiredField(fieldInfo)</td><td>true</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_4() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		component.setName("Component");
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Field");
		component.addRequiredField(fieldInfo);
		
		// Expected Result
		boolean expected = true;
		
		// Actual Result
		boolean actual = fieldInfo.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()<br>
	 * component.setName("Component")<br>
	 * fieldInfo = new FieldInfo()<br>
	 * fieldInfo.setName("Field")<br>
	 * component.addRequiredField(fieldInfo)<br>
	 * fieldInfo2 = new FieldInfo()<br>
	 * fieldInfo2.setName("Field2")<br>
	 * component.addRequiredField(fieldInfo2)</td><td>true</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_5() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		component.setName("Component");
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Field");
		component.addRequiredField(fieldInfo);
		FieldInfo fieldInfo2 = new FieldInfo();
		fieldInfo2.setName("Field2");
		component.addRequiredField(fieldInfo2);
		
		// Expected Result
		boolean expected = true;
		
		// Actual Result
		boolean actual = fieldInfo.isRequiredInComponent(component);
		
		// Assertion
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
	 * 
	 * <p>
	 * Test Data:
	 * <table border="1">
	 * <tr><th>Input</th><th>Expected</th></tr>
	 * <tr><td>component = new ComponentInfo()<br>
	 * component.setName("Component")<br>
	 * fieldInfo = new FieldInfo()<br>
	 * fieldInfo.setName("Field")<br>
	 * component.addRequiredField(fieldInfo)<br>
	 * fieldInfo2 = new FieldInfo()<br>
	 * fieldInfo2.setName("Field2")<br>
	 * component.addRequiredField(fieldInfo2)</td><td>true</td></tr>
	 * </table>
	 * </p>
	 */
	@Test
	public void testIsRequiredInComponent_6() {
		// Test Data
		ComponentInfo component = new ComponentInfo();
		component.setName("Component