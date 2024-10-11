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
				classInfo = new ClassInfo("java.awt.event.ActionListener");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.util.EventListener", interfaces[0]);
		}
		
		@Test
		void testPrintInterfaces_3() {
				classInfo = new ClassInfo("java.awt.event.ActionEvent");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_4() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentListener");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.util.EventListener", interfaces[0]);
		}
		
		@Test
		void testPrintInterfaces_5() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentEvent");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_6() {
				classInfo = new ClassInfo("java.awt.event.ComponentListener");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.util.EventListener", interfaces[0]);
		}
		
		@Test
		void testPrintInterfaces_7() {
				classInfo = new ClassInfo("java.awt.event.ComponentEvent");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_8() {
				classInfo = new ClassInfo("java.awt.event.ContainerListener");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.util.EventListener", interfaces[0]);
		}
		
		@Test
		void testPrintInterfaces_9() {
				classInfo = new ClassInfo("java.awt.event.ContainerEvent");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		@Test
		void testPrintInterfaces_10() {
				classInfo = new ClassInfo("java.awt.event.FocusListener");
				String[] interfaces = classInfo.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.util.EventListener", interfaces[0]);
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
* It contains ten unit test cases for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_5Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testPrintConstructors_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_2() {
				classInfo = new ClassInfo("java.awt.event.ActionListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_3() {
				classInfo = new ClassInfo("java.awt.event.ActionEvent");
				String[] constructors = classInfo.printConstructors();
				assertEquals(1, constructors.length);
				assertEquals("public java.awt.event.ActionEvent(java.awt.Event)", constructors[0]);
		}
		
		@Test
		void testPrintConstructors_4() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_5() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentEvent");
				String[] constructors = classInfo.printConstructors();
				assertEquals(1, constructors.length);
				assertEquals("public java.awt.event.AdjustmentEvent(java.awt.Adjustable,int,int,int)", constructors[0]);
		}
		
		@Test
		void testPrintConstructors_6() {
				classInfo = new ClassInfo("java.awt.event.ComponentListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_7() {
				classInfo = new ClassInfo("java.awt.event.ComponentEvent");
				String[] constructors = classInfo.printConstructors();
				assertEquals(1, constructors.length);
				assertEquals("public java.awt.event.ComponentEvent(java.awt.Component,int)", constructors[0]);
		}
		
		@Test
		void testPrintConstructors_8() {
				classInfo = new ClassInfo("java.awt.event.ContainerListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
		
		@Test
		void testPrintConstructors_9() {
				classInfo = new ClassInfo("java.awt.event.ContainerEvent");
				String[] constructors = classInfo.printConstructors();
				assertEquals(1, constructors.length);
				assertEquals("public java.awt.event.ContainerEvent(java.awt.Component,java.awt.Container,java.awt.Component)", constructors[0]);
		}
		
		@Test
		void testPrintConstructors_10() {
				classInfo = new ClassInfo("java.awt.event.FocusListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
		}
}

//