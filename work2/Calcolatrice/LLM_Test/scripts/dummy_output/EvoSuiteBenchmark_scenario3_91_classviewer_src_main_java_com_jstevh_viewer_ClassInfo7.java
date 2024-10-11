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
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods1() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods2() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("get");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods3() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("set");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods4() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("is");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods5() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("to");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods6() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("hash");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods7() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("equals");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods8() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("clone");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods9() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("finalize");
		assertEquals(methods.length, ci.cMethods.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#srchMethods(String)} method.
	 * <p>
	 * This test case checks if the method returns the correct number of methods.
	 */
	@Test
	void testSrchMethods10() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.srchMethods("wait");
		assertEquals(methods.length, ci.cMethods.length);
	}
}