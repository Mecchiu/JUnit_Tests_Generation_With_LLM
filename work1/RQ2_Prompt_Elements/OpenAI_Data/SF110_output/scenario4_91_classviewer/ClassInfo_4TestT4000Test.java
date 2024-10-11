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
				assertEquals("public java.awt.event.ContainerEvent(java.awt.Component,int,java.awt.Component)", constructors[0]);
		}
		
		@Test
		void testPrintConstructors_10() {
				classInfo = new ClassInfo("java.awt.event.FocusListener");
				String[] constructors = classInfo.printConstructors();
				assertEquals(0, constructors.length);
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_6Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testPrintMethods_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] methods = classInfo.printMethods();
				assertEquals(0, methods.length);
		}
		
		@Test
		void testPrintMethods_2() {
				classInfo = new ClassInfo("java.awt.event.ActionListener");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public abstract void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)", methods[0]);
		}
		
		@Test
		void testPrintMethods_3() {
				classInfo = new ClassInfo("java.awt.event.ActionEvent");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public java.lang.String java.awt.event.ActionEvent.getActionCommand()", methods[0]);
		}
		
		@Test
		void testPrintMethods_4() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentListener");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public abstract void java.awt.event.AdjustmentListener.adjustmentValueChanged(java.awt.event.AdjustmentEvent)", methods[0]);
		}
		
		@Test
		void testPrintMethods_5() {
				classInfo = new ClassInfo("java.awt.event.AdjustmentEvent");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public int java.awt.event.AdjustmentEvent.getValue()", methods[0]);
		}
		
		@Test
		void testPrintMethods_6() {
				classInfo = new ClassInfo("java.awt.event.ComponentListener");
				String[] methods = classInfo.printMethods();
				assertEquals(4, methods.length);
				assertEquals("public abstract void java.awt.event.ComponentListener.componentHidden(java.awt.event.ComponentEvent)", methods[0]);
				assertEquals("public abstract void java.awt.event.ComponentListener.componentMoved(java.awt.event.ComponentEvent)", methods[1]);
				assertEquals("public abstract void java.awt.event.ComponentListener.componentResized(java.awt.event.ComponentEvent)", methods[2]);
				assertEquals("public abstract void java.awt.event.ComponentListener.componentShown(java.awt.event.ComponentEvent)", methods[3]);
		}
		
		@Test
		void testPrintMethods_7() {
				classInfo = new ClassInfo("java.awt.event.ComponentEvent");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public java.awt.Component java.awt.event.ComponentEvent.getComponent()", methods[0]);
		}
		
		@Test
		void testPrintMethods_8() {
				classInfo = new ClassInfo("java.awt.event.ContainerListener");
				String[] methods = classInfo.printMethods();
				assertEquals(2, methods.length);
				assertEquals("public abstract void java.awt.event.ContainerListener.componentAdded(java.awt.event.ContainerEvent)", methods[0]);
				assertEquals("public abstract void java.awt.event.ContainerListener.componentRemoved(java.awt.event.ContainerEvent)", methods[1]);
		}
		
		@Test
		void testPrintMethods_9() {
				classInfo = new ClassInfo("java.awt.event.ContainerEvent");
				String[] methods = classInfo.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public java.awt.Component java.awt.event.ContainerEvent.getChild()", methods[0]);
		}
		
		@Test
		void testPrintMethods_10() {
				classInfo = new ClassInfo("java.awt.event.FocusListener");
				String[] methods = classInfo.printMethods();
				assertEquals(2, methods.length);
				assertEquals("public abstract void java.awt.event.FocusListener.focusGained(java.awt.event.FocusEvent)", methods[0]);
				assertEquals("public abstract void java.awt.event.FocusListener.focusLost(java.awt.event.FocusEvent)", methods[1]);
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_7Test {
		
		private ClassInfo classInfo;
		
		@Test
		void testPrintFields_1() {
				classInfo = new ClassInfo("java.awt.WindowConstants");
				String[] fields = classInfo.printFields();
				assertEquals(3, fields.length);
				assertEquals("public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE", fields[0]);
				assertEquals("public static final int java.awt.WindowConstants.HIDE_ON_CLOSE", fields[1]);
				assertEquals("public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE", fields[2]);
		}
		
		@Test
		void testPrintFields_2() {
				classInfo = new ClassInfo("java.awt.event.ActionListener");
				String[] fields = classInfo.printFields();
				assertEquals(0, fields.length);
		}
		
		@Test
		void testPrintFields_3() {
				classInfo = new ClassInfo("java.awt.event.ActionEvent");
				String[] fields = classInfo.printFields();
				assertEquals(1, fields.length);
				assertEquals("public static final int java.awt.event.ActionEvent.ACTION_PERFORMED", fields[0]);
		}
		
		@Test
		void testPrintFields_4() {