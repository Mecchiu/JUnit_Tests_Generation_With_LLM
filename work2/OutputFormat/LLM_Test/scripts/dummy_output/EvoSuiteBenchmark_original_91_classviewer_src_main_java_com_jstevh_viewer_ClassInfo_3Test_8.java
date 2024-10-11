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
	 * Prints out class information with System.out.println
	 */
	private void printClassInfo() {
		// Prints out class information with System.out.println
		System.out.println("Class Info is: ClassInfo" + "\n" +
				"==========================================");
		System.out.println(ClassInfo.class.getName());
		System.out.println(ClassInfo.class.getPackage().getName());
		System.out.println("\n");
}
}