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

		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has no constructors.
		*/
		@Test
		public void testPrintConstructors1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] expected = new String[0];
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has one constructor.
		*/
		@Test
		public void testPrintConstructors2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] expected = new String[1];
				expected[0] = "public JFrame()";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has two constructors.
		*/
		@Test
		public void testPrintConstructors3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] expected = new String[2];
				expected[0] = "public JButton()";
				expected[1] = "public JButton(java.lang.String)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has three constructors.
		*/
		@Test
		public void testPrintConstructors4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] expected = new String[3];
				expected[0] = "public JTextField()";
				expected[1] = "public JTextField(java.lang.String)";
				expected[2] = "public JTextField(int)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has four constructors.
		*/
		@Test
		public void testPrintConstructors5() {
				ClassInfo ci = new ClassInfo(JLabel.class);
				String[] expected = new String[4];
				expected[0] = "public JLabel()";
				expected[1] = "public JLabel(java.lang.String)";
				expected[2] = "public JLabel(java.lang.String,int)";
				expected[3] = "public JLabel(javax.swing.Icon)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has five constructors.
		*/
		@Test
		public void testPrintConstructors6() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] expected = new String[5];
				expected[0] = "public JTextArea()";
				expected[1] = "public JTextArea(java.lang.String)";
				expected[2] = "public JTextArea(int,int)";
				expected[3] = "public JTextArea(java.lang.String,int,int)";
				expected[4] = "public JTextArea(javax.swing.text.Document)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has six constructors.
		*/
		@Test
		public void testPrintConstructors7() {
				ClassInfo ci = new ClassInfo(JList.class);
				String[] expected = new String[6];
				expected[0] = "public JList()";
				expected[1] = "public JList(java.lang.Object[])";
				expected[2] = "public JList(java.util.Vector)";
				expected[3] = "public JList(javax.swing.ListModel)";
				expected[4] = "public JList(javax.swing.ListSelectionModel)";
				expected[5] = "public JList(javax.swing.ListDataModel)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has seven constructors.
		*/
		@Test
		public void testPrintConstructors8() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] expected = new String[7];
				expected[0] = "public JComboBox()";
				expected[1] = "public JComboBox(java.lang.Object[])";
				expected[2] = "public JComboBox(java.util.Vector)";
				expected[3] = "public JComboBox(javax.swing.ComboBoxModel)";
				expected[4] = "public JComboBox(javax.swing.ComboBoxModel,javax.swing.ComboBoxEditor)";
				expected[5] = "public JComboBox(javax.swing.ComboBoxModel,javax.swing.ComboBoxEditor,javax.swing.ListCellRenderer)";
				expected[6] = "public JComboBox(javax.swing.ComboBoxModel,javax.swing.ComboBoxEditor,javax.swing.ListCellRenderer,javax.swing.ListCellRenderer)";
				String[] actual = ci.printConstructors();
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ClassInfo#printConstructors()} method.
		* It tests the method with a class that has eight constructors.
		*/
		@Test
		public void testPrintConstructors9() {
				ClassInfo ci = new ClassInfo(JCheckBox.class);
				String[] expected = new String[8];
				expected[0] = "public JCheckBox()";
				expected[1] = "public JCheckBox(java.lang.String)";
				expected[2] = "public JCheckBox(java.lang.String,boolean)";
				expected[3] = "public JCheckBox(java.lang.String,javax.swing.Icon)";
				expected[4] = "public JCheckBox(java.lang.String,javax.swing.Icon,boolean)";
				expected[5] =