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
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with a null array.
	 */
	@Test
	void testGetDataNull() {
		Class[] m = null;
		String[] expected = null;
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an empty array.
	 */
	@Test
	void testGetDataEmpty() {
		Class[] m = new Class[0];
		String[] expected = null;
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of one element.
	 */
	@Test
	void testGetDataOneElement() {
		Class[] m = new Class[1];
		m[0] = String.class;
		String[] expected = new String[1];
		expected[0] = "java.lang.String";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of two elements.
	 */
	@Test
	void testGetDataTwoElements() {
		Class[] m = new Class[2];
		m[0] = String.class;
		m[1] = Integer.class;
		String[] expected = new String[2];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of three elements.
	 */
	@Test
	void testGetDataThreeElements() {
		Class[] m = new Class[3];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		String[] expected = new String[3];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of four elements.
	 */
	@Test
	void testGetDataFourElements() {
		Class[] m = new Class[4];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		String[] expected = new String[4];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of five elements.
	 */
	@Test
	void testGetDataFiveElements() {
		Class[] m = new Class[5];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		String[] expected = new String[5];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of six elements.
	 */
	@Test
	void testGetDataSixElements() {
		Class[] m = new Class[6];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		String[] expected = new String[6];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		expected[5] = "java.lang.Byte";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of seven elements.
	 */
	@Test
	void testGetDataSevenElements() {
		Class[] m = new Class[7];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		String[] expected = new String[7];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		expected[5] = "java.lang.Byte";
		expected[6] = "java.lang.Short";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of eight elements.
	 */
	@Test
	void testGetDataEightElements() {
		Class[] m = new Class[8];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		m[7] = Long.class;
		String[] expected = new String[8];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		expected[5] = "java.lang.Byte";
		expected[6] = "java.lang.Short";
		expected[7] = "java.lang.Long";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of nine elements.
	 */
	@Test
	void testGetDataNineElements() {
		Class[] m = new Class[9];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		m[7] = Long.class;
		m[8] = Float.class;
		String[] expected = new String[9];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		expected[5] = "java.lang.Byte";
		expected[6] = "java.lang.Short";
		expected[7] = "java.lang.Long";
		expected[8] = "java.lang.Float";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Class[])} method.
	 * <p>
	 * This test case tests the {@link ClassInfo#getData(Class[])} method
	 * with an array of ten elements.
	 */
	@Test
	void testGetDataTenElements() {
		Class[] m = new Class[10];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		m[7] = Long.class;
		m[8] = Float.class;
		m[9] = Void.class;
		String[] expected = new String[10];
		expected[0] = "java.lang.String";
		expected[1] = "java.lang.Integer";
		expected[2] = "java.lang.Double";
		expected[3] = "java.lang.Boolean";
		expected[4] = "java.lang.Character";
		expected[5] = "java.lang.Byte";
		expected[6] = "java.lang.Short";
		expected[7] = "java.lang.Long";
		expected[8] = "java.lang.Float";
		expected[9] = "java.lang.Void";
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
}