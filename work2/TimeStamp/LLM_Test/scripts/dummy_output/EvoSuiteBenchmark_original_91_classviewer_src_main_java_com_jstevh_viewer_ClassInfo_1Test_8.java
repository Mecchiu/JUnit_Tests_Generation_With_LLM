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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		
	// Test class variables
	private static boolean debug;

	// System class info
	private static String[] knownPackages;

	private static String name = "This is a test class info.java";

	// Class information
	private static String[] cMethods = {"m_name", "m_npm", "m_f", "m_f0", "m_n", "m_v",
			"m_w", };
	private static String fndMethods = null;


	// Constructor for the Class
	private ClassInfo_1Test() {
	}

	// Returns an array filled with the cMethods.
	static String[] getCMethods() throws ClassNotFoundException {
		List classes = getClasses();
		cMethods = new String[classes.size()];
		classes.toArray(cMethods);
		return cMethods;
	}

	// Returns an array filled with the fndMethods.
	static String[] getFndMethods() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		List classes = getClasses();
}
}