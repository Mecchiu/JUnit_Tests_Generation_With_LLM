// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {

	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a null string.
	 * <p>
	 * The expected result is a null string array.
	 */
	@Test
	void testSrchMethodsNull() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods(null);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with an empty string.
	 * <p>
	 * The expected result is a null string array.
	 */
	@Test
	void testSrchMethodsEmpty() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is not found.
	 * <p>
	 * The expected result is a null string array.
	 */
	@Test
	void testSrchMethodsNotFound() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("not found");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound2() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound3() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound4() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound5() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound6() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound7() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound8() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound9() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case tests the method with a string that is found.
	 * <p>
	 * The expected result is a string array with one element.
	 */
	@Test
	void testSrchMethodsFound10() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
		assertEquals(1, result.length);
	}
}