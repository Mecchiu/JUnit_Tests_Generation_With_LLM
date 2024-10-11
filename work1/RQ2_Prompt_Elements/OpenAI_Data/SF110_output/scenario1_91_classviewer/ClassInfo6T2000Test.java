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

	@Test
	void testGetData() {
		Class[] m = new Class[0];
		String[] result = ClassInfo.getData(m);
		assertNull(result);
		
		m = new Class[1];
		m[0] = String.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		
		m = new Class[2];
		m[0] = String.class;
		m[1] = Integer.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		
		m = new Class[3];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		
		m = new Class[4];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		
		m = new Class[5];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		
		m = new Class[6];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		assertEquals("java.lang.Byte", result[5]);
		
		m = new Class[7];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		assertEquals("java.lang.Byte", result[5]);
		assertEquals("java.lang.Short", result[6]);
		
		m = new Class[8];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		m[7] = Long.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		assertEquals("java.lang.Byte", result[5]);
		assertEquals("java.lang.Short", result[6]);
		assertEquals("java.lang.Long", result[7]);
		
		m = new Class[9];
		m[0] = String.class;
		m[1] = Integer.class;
		m[2] = Double.class;
		m[3] = Boolean.class;
		m[4] = Character.class;
		m[5] = Byte.class;
		m[6] = Short.class;
		m[7] = Long.class;
		m[8] = Float.class;
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		assertEquals("java.lang.Byte", result[5]);
		assertEquals("java.lang.Short", result[6]);
		assertEquals("java.lang.Long", result[7]);
		assertEquals("java.lang.Float", result[8]);
		
		m = new Class[10];
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
		result = ClassInfo.getData(m);
		assertEquals("java.lang.String", result[0]);
		assertEquals("java.lang.Integer", result[1]);
		assertEquals("java.lang.Double", result[2]);
		assertEquals("java.lang.Boolean", result[3]);
		assertEquals("java.lang.Character", result[4]);
		assertEquals("java.lang.Byte", result[5]);
		assertEquals("java.lang.Short", result[6]);
		assertEquals("java.lang.Long", result[7]);
		assertEquals("java.lang.Float", result[8]);
		assertEquals("java.lang.Void", result[9]);
	}
}