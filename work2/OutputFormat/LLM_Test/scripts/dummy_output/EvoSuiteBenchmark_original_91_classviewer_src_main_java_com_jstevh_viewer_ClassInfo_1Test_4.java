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
		
		/**
		 * @param args not currently known
		 */
		public static void main(String[] args) throws Exception {
			ClassInspector.info();
		}

		/**
		 * @throws Exception
		 */
		public ClassInfo_1Test() throws Exception {
			debug = false;
			if (check(1) && check(2).getLength() > 0) {
				
				// System.err.println(Arrays.toString(new Object [], "java.lang.Object")[1]);
				// System.err.println(Arrays.toString(new Object [], "java.lang.Object")[2]);
				
			}
		}

		private static char check(int expected) throws Exception {
}
}