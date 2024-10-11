// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
		private static final String TEST = "Test";
		private static Vector<Class<?>> array = new Vector<Class<?>>(10);
		
		boolean debug = false;

		/**
		 * Constructor for the ClassInfo_4Test class.
		 *
		 * @param  debug        print method names and constructors, false if no methods
		 */
		ClassInfo_4Test(boolean debug) {
			if (!debug) {
				return;
			}
			
			Class<Test>[] cMethods = {Test.class, Test[].class};
			Vector<String> vector = new Vector<String>(cMethods.length);
			array.addAll(Arrays.asList(cMethods));
			for (Class<?> i : cMethods) {
				if (i!= null) {
					vector.add("onMethod" + i.getName());
				}
			}
			sortMethods(cMethods);
			printArray(array);
			assertEquals("wrong testClass", TEST, array.firstElement().getName());
		}
}