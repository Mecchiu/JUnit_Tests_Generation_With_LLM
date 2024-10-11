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
	* It tests the method with the following parameters:
	* <ul>
	* <li>param = 0</li>
	* </ul>
	* <p>
	* The expected result is an array of strings containing the public methods of the class.
	*/
	@Test
	void testPrintMethods_0() {
		// Arrange
		ClassInfo classInfo = new ClassInfo();
		int param = 0;
		String[] expected = new String[] {
			"public void com.jstevh.viewer.ClassInfo.printMethods(int)",
			"public void com.jstevh.viewer.ClassInfo.printFields(int)",
			"public void com.jstevh.viewer.ClassInfo.printConstructors(int)",
			"public void com.jstevh.viewer.ClassInfo.printInterfaces(int)",
			"public void com.jstevh.viewer.ClassInfo.printSuperclass(int)",
			"public void com.jstevh.viewer.ClassInfo.printClass(int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo()",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Object,java.lang.String,int,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.String,java.lang.String,int,int,int,int,int,int,int,int,int,int)",
			"public void com.jstevh.viewer.ClassInfo.printClassInfo(java.lang.Class,java.lang.String,int,int,int,int,int,int,int,int,int,int)",
			"public void com.j