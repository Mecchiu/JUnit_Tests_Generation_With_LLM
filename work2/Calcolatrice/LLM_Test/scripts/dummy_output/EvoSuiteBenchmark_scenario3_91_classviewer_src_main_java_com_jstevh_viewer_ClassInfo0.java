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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
	}
}