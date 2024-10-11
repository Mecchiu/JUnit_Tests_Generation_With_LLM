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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {

		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.WindowConstants}.
		*/
		@Test
		public void testPrintFields_0() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] result = classInfo.printFields();
				assertEquals(3, result.length);
				assertEquals("public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE", result[0]);
				assertEquals("public static final int java.awt.WindowConstants.HIDE_ON_CLOSE", result[1]);
				assertEquals("public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE", result[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowAdapter}.
		*/
		@Test
		public void testPrintFields_1() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowAdapter");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintFields_2() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowFocusListener}.
		*/
		@Test
		public void testPrintFields_3() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowFocusListener");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowListener}.
		*/
		@Test
		public void testPrintFields_4() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowListener");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowStateListener}.
		*/
		@Test
		public void testPrintFields_5() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowStateListener");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintFields_6() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintFields_7() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintFields_8() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintFields_9() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printFields();
				assertEquals(0, result.length);
		}
}

// ClassInfo_1Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with the class {@link java.awt.WindowConstants}.
		*/
		@Test
		public void testPrintMethods_0() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] result = classInfo.printMethods();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with the class {@link java.awt.event.WindowAdapter}.
		*/
		@Test
		public void testPrintMethods_1() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowAdapter");
				String[] result = classInfo.printMethods();
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with the class {@link java.awt.event.WindowEvent}.
		*/
		@Test
		public void testPrintMethods_2() throws Exception {
				ClassInfo classInfo = new ClassInfo("java.awt.event.WindowEvent");
				String[] result = classInfo.printMethods();
				assertEquals(0, result.length);
		}
		
		/**
	