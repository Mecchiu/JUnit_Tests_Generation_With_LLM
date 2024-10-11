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
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfoTest {

	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with a null array.
	 * <p>
	 * This test case expects the method to return null.
	 */
	@Test
	void testGetDataNull() {
		Class[] m = null;
		String[] result = ClassInfo.getData(m);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an empty array.
	 * <p>
	 * This test case expects the method to return null.
	 */
	@Test
	void testGetDataEmpty() {
		Class[] m = new Class[0];
		String[] result = ClassInfo.getData(m);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of one element.
	 * <p>
	 * This test case expects the method to return an array of one element.
	 */
	@Test
	void testGetDataOneElement() {
		Class[] m = new Class[1];
		m[0] = ClassInfo.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(1, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of two elements.
	 * <p>
	 * This test case expects the method to return an array of two elements.
	 */
	@Test
	void testGetDataTwoElements() {
		Class[] m = new Class[2];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(2, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of three elements.
	 * <p>
	 * This test case expects the method to return an array of three elements.
	 */
	@Test
	void testGetDataThreeElements() {
		Class[] m = new Class[3];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(3, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of four elements.
	 * <p>
	 * This test case expects the method to return an array of four elements.
	 */
	@Test
	void testGetDataFourElements() {
		Class[] m = new Class[4];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(4, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of five elements.
	 * <p>
	 * This test case expects the method to return an array of five elements.
	 */
	@Test
	void testGetDataFiveElements() {
		Class[] m = new Class[5];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		m[4] = ClassInfo.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(5, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of six elements.
	 * <p>
	 * This test case expects the method to return an array of six elements.
	 */
	@Test
	void testGetDataSixElements() {
		Class[] m = new Class[6];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		m[4] = ClassInfo.class;
		m[5] = ClassInfoTest.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(6, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of seven elements.
	 * <p>
	 * This test case expects the method to return an array of seven elements.
	 */
	@Test
	void testGetDataSevenElements() {
		Class[] m = new Class[7];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		m[4] = ClassInfo.class;
		m[5] = ClassInfoTest.class;
		m[6] = ClassInfo.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(7, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of eight elements.
	 * <p>
	 * This test case expects the method to return an array of eight elements.
	 */
	@Test
	void testGetDataEightElements() {
		Class[] m = new Class[8];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		m[4] = ClassInfo.class;
		m[5] = ClassInfoTest.class;
		m[6] = ClassInfo.class;
		m[7] = ClassInfoTest.class;
		String[] result = ClassInfo.getData(m);
		assertEquals(8, result.length);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the method with an array of nine elements.
	 * <p>
	 * This test case expects the method to return an array of nine elements.
	 */
	@Test
	void testGetDataNineElements() {
		Class[] m = new Class[9];
		m[0] = ClassInfo.class;
		m[1] = ClassInfoTest.class;
		m[2] = ClassInfo.class;
		m[3] = ClassInfoTest.class;
		m[4] = ClassInfo.class;
		m[5] = ClassInfoTest.class;
		m[6] = ClassInfo.class;
		m[7] = ClassInfoTest.class;
		m[8] = ClassInfo.class;
		String[] result