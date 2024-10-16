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
	 * This test case checks if the method returns the correct data.
	 */
	@Test
	void testGetData() {
		Class[] m = new Class[] {
			String.class,
			Integer.class,
			Double.class,
			Boolean.class,
			Character.class,
			Byte.class,
			Short.class,
			Long.class,
			Float.class,
			Void.class
		};
		String[] expected = new String[] {
			"class java.lang.String",
			"class java.lang.Integer",
			"class java.lang.Double",
			"class java.lang.Boolean",
			"class java.lang.Character",
			"class java.lang.Byte",
			"class java.lang.Short",
			"class java.lang.Long",
			"class java.lang.Float",
			"class java.lang.Void"
		};
		String[] actual = ClassInfo.getData(m);
		assertArrayEquals(expected, actual);
	}
}