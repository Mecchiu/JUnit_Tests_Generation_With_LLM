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
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
		}
}