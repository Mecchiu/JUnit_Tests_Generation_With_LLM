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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfoTest {

		@Test
		void testGetFoundMethod() {
				ClassInfo classInfo = new ClassInfo();
				MethodData methodData = classInfo.getFoundMethod(0);
				assertEquals("java.lang.String", methodData.getMethClass());
				assertEquals("java.lang", methodData.getMethPackage());
				assertEquals("toString", methodData.getMethName());
		}
}