// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
		
	/**
	 * Constructor for the ClassInfo_0 class
	 */
	private ClassInfo_0Test() throws Exception {
		
		// test if possible
		Class c = Class.forName("com.jstevh.viewer.ClassInfo_0");

		assertTrue(c.getName().indexOf("ClassInfo_0Test")!= -1);
	
		// test cloning
		ClassInfo_0Test other = new ClassInfo_0Test();

		assertTrue(!other.equals(new Object()));
	
	}

	/**
	 * Test if the first parameter, index, is null.
	 */
	private static void testFieldsAreNull(Object o, String testString, int index) {
		String[] fields = o.getClass().getFields();

		assertEquals(o.getClass().getName(), testString);
		
		FieldIterator fi = o.getClass().getDeclaredFields();

		while (fi.hasNext()) {
			fi.next();
		}

}
}