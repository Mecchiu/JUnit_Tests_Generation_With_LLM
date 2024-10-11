// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		/**
		 *
		 */
		private static final int NO_OBJECT_METHODS = 7,
			NO_INHERITED_METHODS = 4;

		/**
		 *
		 */
		private String [] cMethods = null;

		/**
		 *
		 */
		private ClassInfo (String cm) throws Exception {
					/**
					 * Create a Class object from a Class object used to
					 * determine the class name.
					 *
					 * @param c (not currently used)
					 *
					 * @return  Class object
					 */
				cMethods = ClassInfo.class.getName().split("\\.");
				
}
}