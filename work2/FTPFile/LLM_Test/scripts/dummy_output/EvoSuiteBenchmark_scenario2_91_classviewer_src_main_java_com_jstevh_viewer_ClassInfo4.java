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
* It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfoTest {
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has no interfaces.
		*/
		@Test
		void testPrintInterfaces1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printInterfaces();
				assertNull(data);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has one interface.
		*/
		@Test
		void testPrintInterfaces2() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] data = ci.printInterfaces();
				assertEquals(1, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has two interfaces.
		*/
		@Test
		void testPrintInterfaces3() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] data = ci.printInterfaces();
				assertEquals(2, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has three interfaces.
		*/
		@Test
		void testPrintInterfaces4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] data = ci.printInterfaces();
				assertEquals(3, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has four interfaces.
		*/
		@Test
		void testPrintInterfaces5() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] data = ci.printInterfaces();
				assertEquals(4, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has five interfaces.
		*/
		@Test
		void testPrintInterfaces6() {
				ClassInfo ci = new ClassInfo(JList.class);
				String[] data = ci.printInterfaces();
				assertEquals(5, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
				assertEquals("javax.swing.ItemSelectable", data[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has six interfaces.
		*/
		@Test
		void testPrintInterfaces7() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] data = ci.printInterfaces();
				assertEquals(6, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
				assertEquals("javax.swing.ItemSelectable", data[4]);
				assertEquals("javax.swing.ComboBoxEditor", data[5]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has seven interfaces.
		*/
		@Test
		void testPrintInterfaces8() {
				ClassInfo ci = new ClassInfo(JTable.class);
				String[] data = ci.printInterfaces();
				assertEquals(7, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
				assertEquals("javax.swing.ItemSelectable", data[4]);
				assertEquals("javax.swing.ComboBoxEditor", data[5]);
				assertEquals("javax.swing.table.TableModel", data[6]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has eight interfaces.
		*/
		@Test
		void testPrintInterfaces9() {
				ClassInfo ci = new ClassInfo(JTree.class);
				String[] data = ci.printInterfaces();
				assertEquals(8, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
				assertEquals("javax.swing.ItemSelectable", data[4]);
				assertEquals("javax.swing.ComboBoxEditor", data[5]);
				assertEquals("javax.swing.table.TableModel", data[6]);
				assertEquals("javax.swing.tree.TreeModel", data[7]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has nine interfaces.
		*/
		@Test
		void testPrintInterfaces10() {
				ClassInfo ci = new ClassInfo(JTabbedPane.class);
				String[] data = ci.printInterfaces();
				assertEquals(9, data.length);
				assertEquals("java.awt.image.ImageObserver", data[0]);
				assertEquals("java.awt.MenuContainer", data[1]);
				assertEquals("javax.accessibility.Accessible", data[2]);
				assertEquals("javax.swing.Scrollable", data[3]);
				assertEquals("javax.swing.ItemSelectable", data[4]);
				assertEquals("javax.swing.ComboBoxEditor", data[5]);
				assertEquals("javax.swing.table.TableModel", data[6]);
				assertEquals("javax.swing.tree.TreeModel", data[7]);
				assertEquals("javax.swing.SingleSelectionModel", data[8]);
		}
}