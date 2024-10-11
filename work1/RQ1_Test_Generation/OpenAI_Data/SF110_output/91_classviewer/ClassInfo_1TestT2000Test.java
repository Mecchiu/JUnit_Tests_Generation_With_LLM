// ClassInfo_1Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
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
		* <p>
		* This test case checks if the method returns the correct array of strings.
		*/
		@Test
		void testPrintMethods() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				String[] data = myClassInfo.printMethods();
				assertEquals(data[0], "public boolean java.lang.String.equals(java.lang.Object)");
				assertEquals(data[1], "public java.lang.String java.lang.String.toString()");
				assertEquals(data[2], "public int java.lang.String.hashCode()");
				assertEquals(data[3], "public int java.lang.String.length()");
				assertEquals(data[4], "public char java.lang.String.charAt(int)");
				assertEquals(data[5], "public int java.lang.String.compareTo(java.lang.String)");
				assertEquals(data[6], "public int java.lang.String.compareTo(java.lang.Object)");
				assertEquals(data[7], "public int java.lang.String.compareToIgnoreCase(java.lang.String)");
				assertEquals(data[8], "public boolean java.lang.String.equalsIgnoreCase(java.lang.String)");
				assertEquals(data[9], "public int java.lang.String.indexOf(int)");
				assertEquals(data[10], "public int java.lang.String.indexOf(int,int)");
				assertEquals(data[11], "public int java.lang.String.indexOf(java.lang.String)");
				assertEquals(data[12], "public int java.lang.String.indexOf(java.lang.String,int)");
				assertEquals(data[13], "public java.lang.String java.lang.String.intern()");
				assertEquals(data[14], "public int java.lang.String.lastIndexOf(int)");
				assertEquals(data[15], "public int java.lang.String.lastIndexOf(int,int)");
				assertEquals(data[16], "public int java.lang.String.lastIndexOf(java.lang.String)");
				assertEquals(data[17], "public int java.lang.String.lastIndexOf(java.lang.String,int)");
				assertEquals(data[18], "public int java.lang.String.length()");
				assertEquals(data[19], "public boolean java.lang.String.matches(java.lang.String)");
				assertEquals(data[20], "public boolean java.lang.String.regionMatches(boolean,int,java.lang.String,int,int)");
				assertEquals(data[21], "public boolean java.lang.String.regionMatches(int,java.lang.String,int,int)");
				assertEquals(data[22], "public java.lang.String java.lang.String.replaceAll(java.lang.String,java.lang.String)");
				assertEquals(data[23], "public java.lang.String java.lang.String.replaceFirst(java.lang.String,java.lang.String)");
				assertEquals(data[24], "public java.lang.String[] java.lang.String.split(java.lang.String)");
				assertEquals(data[25], "public java.lang.String[] java.lang.String.split(java.lang.String,int)");
				assertEquals(data[26], "public boolean java.lang.String.startsWith(java.lang.String,int)");
				assertEquals(data[27], "public boolean java.lang.String.startsWith(java.lang.String)");
				assertEquals(data[28], "public java.lang.CharSequence java.lang.String.subSequence(int,int)");
				assertEquals(data[29], "public java.lang.String java.lang.String.substring(int)");
				assertEquals(data[30], "public java.lang.String java.lang.String.substring(int,int)");
				assertEquals(data[31], "public char[] java.lang.String.toCharArray()");
				assertEquals(data[32], "public java.lang.String java.lang.String.toLowerCase()");
				assertEquals(data[33], "public java.lang.String java.lang.String.toString()");
				assertEquals(data[34], "public java.lang.String java.lang.String.toUpperCase()");
				assertEquals(data[35], "public java.lang.String java.lang.String.trim()");
				assertEquals(data[36], "public static java.lang.String java.lang.String.valueOf(boolean)");
				assertEquals(data[37], "public static java.lang.String java.lang.String.valueOf(char)");
				assertEquals(data[38], "public static java.lang.String java.lang.String.valueOf(char[])");
				assertEquals(data[39], "public static java.lang.String java.lang.String.valueOf(char[],int,int)");
				assertEquals(data[40], "public static java.lang.String java.lang.String.valueOf(double)");
				assertEquals(data[41], "public static java.lang.String java.lang.String.valueOf(float)");
				assertEquals(data[42], "public static java.lang.String java.lang.String.valueOf(int)");
				assertEquals(data[43], "public static java.lang.String java.lang.String.valueOf(long)");
				assertEquals(data[44], "public static java.lang.String java.lang.String.valueOf(java.lang.Object)");
				assertEquals(data[45], "public static java.lang.String java.lang.String.valueOf(java.lang.String)");
				assertEquals(data[46], "public void java.lang.String.getChars(int,int,char[],int)");
				assertEquals(data[47], "public void java.lang.String.getBytes(int,int,byte[],int)");
				assertEquals(data[48], "public byte[] java.lang.String.getBytes(java.lang.String) throws java.io.UnsupportedEncodingException");
				assertEquals(data[49], "public byte[] java.lang.String.getBytes()");
				assertEquals(data[50], "public boolean java.lang.String.contentEquals(java.lang.StringBuffer)");
				assertEquals(data[51], "public boolean java.lang.String.contentEquals(java.lang.CharSequence)");
				assertEquals(data[52], "public boolean java.lang.String.equalsIgnoreCase(java.lang.String)");
				assertEquals(data[53], "public int java.lang.String.compareToIgnoreCase(java.lang.String)");
				assertEquals(data[54], "public boolean java.lang.String.regionMatches(boolean,int,java.lang.String,int,int)");
				assertEquals(data[55], "public boolean java.lang.String.regionMatches(int,java.lang.String,int,int)");
				assertEquals(data[56],