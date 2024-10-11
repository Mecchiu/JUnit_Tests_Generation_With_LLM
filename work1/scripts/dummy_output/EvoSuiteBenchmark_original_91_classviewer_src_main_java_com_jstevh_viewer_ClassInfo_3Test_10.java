// ClassInfo_3Test.java
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
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {
		
	/**
	 * This unit test class creates a {@link ClassInfo} instance from string.
	 * 
	 * @author James Harris
	 */
	@Test
	public void test_1() {
		ClassInfo classInfo1 = new ClassInfo("edu.emory.mathcs.backport.java.awt.Window");
		classInfo1.printConstructors();
		assertNotNull("ClassInfo_3Test.test_1: Constructors was not found",
					classInfo1);
	}

	/**
	 * Prints out all the private methods.
	 */
	@Test
	public void test_2() {
		ClassInfo classInfo1 = new ClassInfo("edu.emory.mathcs.backport.java.awt.Window");
		classInfo1.printConstructors();
		System.out.println("\nMethods:");
		Object[] methods4 = classInfo1.getData(new String[0]);
}
}