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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {

		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has no public methods.
		*/
		@Test
		void testPrintMethods1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printMethods(0);
				assertNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods6() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods7() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods8() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods9() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods(int)} method.
		* It tests the method with a class that has public methods.
		*/
		@Test
		void testPrintMethods10() {
				ClassInfo ci = new ClassInfo(ClassInfo.class);
				String[] data = ci.printMethods(0);
				assertNotNull(data);
		}
}