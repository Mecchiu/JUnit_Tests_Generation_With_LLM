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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {

		private ClassInfo classInfo;
		
		@Test
		void testPrintConstructors_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_2() {
				classInfo = new ClassInfo("java.awt.Window");
				String[] constructors = classInfo.printConstructors();
				assertEquals(2, constructors.length);
		}
		
		@Test
		void testPrintConstructors_3() {
				classInfo = new ClassInfo("java.awt.Frame");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_4() {
				classInfo = new ClassInfo("java.awt.Dialog");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_5() {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_6() {
				classInfo = new ClassInfo("java.awt.Color");
				String[] constructors = classInfo.printConstructors();
				assertEquals(11, constructors.length);
		}
		
		@Test
		void testPrintConstructors_7() {
				classInfo = new ClassInfo("java.awt.Font");
				String[] constructors = classInfo.printConstructors();
				assertEquals(6, constructors.length);
		}
		
		@Test
		void testPrintConstructors_8() {
				classInfo = new ClassInfo("java.awt.Graphics");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_9() {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_10() {
				classInfo = new ClassInfo("java.awt.GraphicsEnvironment");
				String[] constructors = classInfo.printConstructors();
				assertEquals(1, constructors.length);
		}
}

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
* It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testPrintInterfaces_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_2() {
				classInfo = new ClassInfo("java.awt.Window");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_3() {
				classInfo = new ClassInfo("java.awt.Frame");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_4() {
				classInfo = new ClassInfo("java.awt.Dialog");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_5() {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_6() {
				classInfo = new ClassInfo("java.awt.Color");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_7() {
				classInfo = new ClassInfo("java.awt.Font");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_8() {
				classInfo = new ClassInfo("java.awt.Graphics");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_9() {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_10() {
				classInfo = new ClassInfo("java.awt.GraphicsEnvironment");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
}

// ClassInfo_5Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(java.lang.String)} method.
*/
class ClassInfo_5Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testSrchMethods_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] methods = classInfo.srchMethods("");
				assertEquals(0, methods.length);
		}
		
		@Test
		void testSrchMethods_2() {
				classInfo = new ClassInfo("java.awt.Window");
				String[] methods = classInfo.