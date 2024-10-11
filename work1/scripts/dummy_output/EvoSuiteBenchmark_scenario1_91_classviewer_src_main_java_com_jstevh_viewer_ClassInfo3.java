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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintConstructors() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printConstructors();
				assertEquals(data[0], "public com.jstevh.viewer.ClassInfo()");
		}
}