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
		* It tests the method with a class that has no methods.
		*/
		@Test
		void testPrintMethods_1() {
				ClassInfo ci = new ClassInfo("java.lang.Object");
				String[] methods = ci.printMethods();
				assertEquals(0, methods.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has one method.
		*/
		@Test
		void testPrintMethods_2() {
				ClassInfo ci = new ClassInfo("java.lang.String");
				String[] methods = ci.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public java.lang.String java.lang.String.toString()", methods[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has two methods.
		*/
		@Test
		void testPrintMethods_3() {
				ClassInfo ci = new ClassInfo("java.lang.StringBuffer");
				String[] methods = ci.printMethods();
				assertEquals(2, methods.length);
				assertEquals("public java.lang.StringBuffer java.lang.StringBuffer.append(java.lang.String)", methods[0]);
				assertEquals("public java.lang.String java.lang.StringBuffer.toString()", methods[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has three methods.
		*/
		@Test
		void testPrintMethods_4() {
				ClassInfo ci = new ClassInfo("java.lang.StringBuilder");
				String[] methods = ci.printMethods();
				assertEquals(3, methods.length);
				assertEquals("public java.lang.StringBuilder java.lang.StringBuilder.append(java.lang.String)", methods[0]);
				assertEquals("public java.lang.StringBuilder java.lang.StringBuilder.append(java.lang.Object)", methods[1]);
				assertEquals("public java.lang.String java.lang.StringBuilder.toString()", methods[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has four methods.
		*/
		@Test
		void testPrintMethods_5() {
				ClassInfo ci = new ClassInfo("java.lang.StringTokenizer");
				String[] methods = ci.printMethods();
				assertEquals(4, methods.length);
				assertEquals("public java.lang.String java.lang.StringTokenizer.nextToken()", methods[0]);
				assertEquals("public boolean java.lang.StringTokenizer.hasMoreTokens()", methods[1]);
				assertEquals("public int java.lang.StringTokenizer.countTokens()", methods[2]);
				assertEquals("public java.lang.String java.lang.StringTokenizer.nextToken(java.lang.String)", methods[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has five methods.
		*/
		@Test
		void testPrintMethods_6() {
				ClassInfo ci = new ClassInfo("java.lang.System");
				String[] methods = ci.printMethods();
				assertEquals(5, methods.length);
				assertEquals("public static void java.lang.System.arraycopy(java.lang.Object,int,java.lang.Object,int,int)", methods[0]);
				assertEquals("public static long java.lang.System.currentTimeMillis()", methods[1]);
				assertEquals("public static void java.lang.System.exit(int)", methods[2]);
				assertEquals("public static java.io.PrintStream java.lang.System.out", methods[3]);
				assertEquals("public static java.io.PrintStream java.lang.System.err", methods[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has six methods.
		*/
		@Test
		void testPrintMethods_7() {
				ClassInfo ci = new ClassInfo("java.lang.Thread");
				String[] methods = ci.printMethods();
				assertEquals(6, methods.length);
				assertEquals("public void java.lang.Thread.start()", methods[0]);
				assertEquals("public void java.lang.Thread.run()", methods[1]);
				assertEquals("public void java.lang.Thread.stop()", methods[2]);
				assertEquals("public void java.lang.Thread.suspend()", methods[3]);
				assertEquals("public void java.lang.Thread.resume()", methods[4]);
				assertEquals("public void java.lang.Thread.setPriority(int)", methods[5]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has seven methods.
		*/
		@Test
		void testPrintMethods_8() {
				ClassInfo ci = new ClassInfo("java.lang.Throwable");
				String[] methods = ci.printMethods();
				assertEquals(7, methods.length);
				assertEquals("public java.lang.String java.lang.Throwable.getMessage()", methods[0]);
				assertEquals("public java.lang.String java.lang.Throwable.toString()", methods[1]);
				assertEquals("public void java.lang.Throwable.printStackTrace()", methods[2]);
				assertEquals("public void java.lang.Throwable.printStackTrace(java.io.PrintStream)", methods[3]);
				assertEquals("public void java.lang.Throwable.printStackTrace(java.io.PrintWriter)", methods[4]);
				assertEquals("public java.lang.Throwable java.lang.Throwable.fillInStackTrace()", methods[5]);
				assertEquals("public java.lang.Throwable java.lang.Throwable.getCause()", methods[6]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has eight methods.
		*/
		@Test
		void testPrintMethods_9() {
				ClassInfo ci = new ClassInfo("java.lang.Void");
				String[] methods = ci.printMethods();
				assertEquals(8, methods.length);
				assertEquals("public static java.lang.Class java.lang.Void.TYPE", methods[0]);
				assertEquals("public static java.lang.Class java.lang.Void.getType()", methods[1]);
				assertEquals("public static java.lang.Class java.lang.Void.getClass()", methods[2]);
				assertEquals("public static java.lang.Class java.lang.Void.getClass