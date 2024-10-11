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
		String message;
		
		public ClassInfo_1Test(String msg) {
			message = msg;
		}

		@Test
		void printMethods_should_print_all_methods_in_class_from_list() throws Exception {
			assertTrue( ClassInfo.printMethods("Test") == "Test" );
			assertTrue( ClassInfo.printMethods("Test", cMethods) == "Test" );
			assertTrue( ClassInfo.printMethods("Test", "cMethods") == "Test" );
			assertTrue( ClassInfo.printMethods("Test(cMethods)") == "Test(cMethods)" );
			assertTrue( ClassInfo.printMethods("Test(cMethods,0)", "cMethods", cMethods) == "Test(cMethods,0,cMethods)" );
			assertTrue( ClassInfo.printMethods("Test (cMethods,0)", "cMethods", cMethods) == "Test (cMethods,0,cMethods)" );
}
}