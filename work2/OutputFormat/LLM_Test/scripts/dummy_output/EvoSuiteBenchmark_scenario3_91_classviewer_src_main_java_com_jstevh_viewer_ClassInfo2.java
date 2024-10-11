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
}
}