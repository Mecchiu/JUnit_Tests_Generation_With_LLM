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
		void testPrintConstructors_1() throws Exception {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_2() throws Exception {
				classInfo = new ClassInfo("java.awt.Window");
				String[] constructors = classInfo.printConstructors();
				assertEquals(2, constructors.length);
		}
		
		@Test
		void testPrintConstructors_3() throws Exception {
				classInfo = new ClassInfo("java.awt.Frame");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_4() throws Exception {
				classInfo = new ClassInfo("java.awt.Dialog");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_5() throws Exception {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String[] constructors = classInfo.printConstructors();
				assertEquals(3, constructors.length);
		}
		
		@Test
		void testPrintConstructors_6() throws Exception {
				classInfo = new ClassInfo("java.awt.Color");
				String[] constructors = classInfo.printConstructors();
				assertEquals(11, constructors.length);
		}
		
		@Test
		void testPrintConstructors_7() throws Exception {
				classInfo = new ClassInfo("java.awt.Font");
				String[] constructors = classInfo.printConstructors();
				assertEquals(6, constructors.length);
		}
		
		@Test
		void testPrintConstructors_8() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_9() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_10() throws Exception {
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
		void testPrintInterfaces_1() throws Exception {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_2() throws Exception {
				classInfo = new ClassInfo("java.awt.Window");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_3() throws Exception {
				classInfo = new ClassInfo("java.awt.Frame");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_4() throws Exception {
				classInfo = new ClassInfo("java.awt.Dialog");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_5() throws Exception {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_6() throws Exception {
				classInfo = new ClassInfo("java.awt.Color");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_7() throws Exception {
				classInfo = new ClassInfo("java.awt.Font");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_8() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_9() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_10() throws Exception {
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
* It contains ten unit test cases for the {@link ClassInfo#getClassName()} method.
*/
class ClassInfo_5Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testGetClassName_1() throws Exception {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String className = classInfo.getClassName();
				assertEquals("java.awt.WindowConstants", className);
		}
		
		@Test
		void testGetClassName_2() throws Exception {
				classInfo = new ClassInfo("java.awt.Window");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Window", className);
		}
		
		@Test
		void testGetClassName_3() throws Exception {
				classInfo = new ClassInfo("java.awt.Frame");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Frame", className);
		}
		
		@Test
		void testGetClassName_4() throws Exception {
				classInfo = new ClassInfo("java.awt.Dialog");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Dialog", className);
		}
		
		@Test
		void testGetClassName_5() throws Exception {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String className = classInfo.getClassName();
				assertEquals("java.awt.FileDialog", className);
		}
		
		@Test
		void testGetClassName_6() throws Exception {
				classInfo = new ClassInfo("java.awt.Color");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Color", className);
		}
		
		@Test
		void testGetClassName_7() throws Exception {
				classInfo = new ClassInfo("java.awt.Font");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Font", className);
		}
		
		@Test
		void testGetClassName_8() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Graphics", className);
		}
		
		@Test
		void testGetClassName_9() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String className = classInfo.getClassName();
				assertEquals("java.awt.Graphics2D", className);
		}
		
		@Test
		void testGetClassName_10() throws Exception {
				classInfo = new ClassInfo("java.awt.GraphicsEnvironment");
				String className = classInfo.getClassName();
				assertEquals("java.awt.GraphicsEnvironment", className);
		}
}

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
* It contains ten unit test cases for the {@link ClassInfo#getClassPackage()} method.
*/
class ClassInfo_6Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testGetClassPackage_1() throws Exception {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_2() throws Exception {
				classInfo = new ClassInfo("java.awt.Window");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_3() throws Exception {
				classInfo = new ClassInfo("java.awt.Frame");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_4() throws Exception {
				classInfo = new ClassInfo("java.awt.Dialog");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_5() throws Exception {
				classInfo = new ClassInfo("java.awt.FileDialog");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_6() throws Exception {
				classInfo = new ClassInfo("java.awt.Color");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_7() throws Exception {
				classInfo = new ClassInfo("java.awt.Font");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_8() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_9() throws Exception {
				classInfo = new ClassInfo("java.awt.Graphics2D");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
		
		@Test
		void testGetClassPackage_10() throws Exception {
				classInfo = new ClassInfo("java.awt.GraphicsEnvironment");
				String classPackage = classInfo.getClassPackage();
				assertEquals("java.awt", classPackage);
		}
}

// ClassInfo_7Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getSuperClassName()} method.
*/
class ClassInfo_7Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testGetSuperClassName_1() throws Exception {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String superClassName = classInfo.getSuperClassName();
				assertEquals("java.lang.Object", superClassName);
		}
		
		@Test
		void testGetSuperClassName_2() throws Exception {
				classInfo = new ClassInfo("java.awt.Window");
				String superClassName = classInfo.getSuperClassName();
				assertEqu