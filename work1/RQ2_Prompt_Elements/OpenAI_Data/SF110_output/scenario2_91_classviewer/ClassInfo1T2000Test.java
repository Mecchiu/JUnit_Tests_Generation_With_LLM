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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfoTest {

		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has no public methods.
		*/
		@Test
		void testPrintMethods1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] methods = ci.printMethods();
				assertEquals(0, methods.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has one public method.
		*/
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] methods = ci.printMethods();
				assertEquals(1, methods.length);
				assertEquals("public void javax.swing.JFrame.setDefaultCloseOperation(int)", methods[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has two public methods.
		*/
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] methods = ci.printMethods();
				assertEquals(2, methods.length);
				assertEquals("public void javax.swing.JButton.setText(java.lang.String)", methods[0]);
				assertEquals("public void javax.swing.JButton.setActionCommand(java.lang.String)", methods[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has three public methods.
		*/
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(JLabel.class);
				String[] methods = ci.printMethods();
				assertEquals(3, methods.length);
				assertEquals("public void javax.swing.JLabel.setText(java.lang.String)", methods[0]);
				assertEquals("public void javax.swing.JLabel.setIcon(javax.swing.Icon)", methods[1]);
				assertEquals("public void javax.swing.JLabel.setHorizontalAlignment(int)", methods[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has four public methods.
		*/
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] methods = ci.printMethods();
				assertEquals(4, methods.length);
				assertEquals("public void javax.swing.JTextField.setText(java.lang.String)", methods[0]);
				assertEquals("public void javax.swing.JTextField.setColumns(int)", methods[1]);
				assertEquals("public void javax.swing.JTextField.setHorizontalAlignment(int)", methods[2]);
				assertEquals("public void javax.swing.JTextField.setEditable(boolean)", methods[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has five public methods.
		*/
		@Test
		void testPrintMethods6() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] methods = ci.printMethods();
				assertEquals(5, methods.length);
				assertEquals("public void javax.swing.JTextArea.setText(java.lang.String)", methods[0]);
				assertEquals("public void javax.swing.JTextArea.setColumns(int)", methods[1]);
				assertEquals("public void javax.swing.JTextArea.setRows(int)", methods[2]);
				assertEquals("public void javax.swing.JTextArea.setEditable(boolean)", methods[3]);
				assertEquals("public void javax.swing.JTextArea.setLineWrap(boolean)", methods[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has six public methods.
		*/
		@Test
		void testPrintMethods7() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] methods = ci.printMethods();
				assertEquals(6, methods.length);
				assertEquals("public void javax.swing.JComboBox.setEditable(boolean)", methods[0]);
				assertEquals("public void javax.swing.JComboBox.setMaximumRowCount(int)", methods[1]);
				assertEquals("public void javax.swing.JComboBox.setSelectedItem(java.lang.Object)", methods[2]);
				assertEquals("public void javax.swing.JComboBox.setSelectedIndex(int)", methods[3]);
				assertEquals("public void javax.swing.JComboBox.setEnabled(boolean)", methods[4]);
				assertEquals("public void javax.swing.JComboBox.setLightWeightPopupEnabled(boolean)", methods[5]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has seven public methods.
		*/
		@Test
		void testPrintMethods8() {
				ClassInfo ci = new ClassInfo(JCheckBox.class);
				String[] methods = ci.printMethods();
				assertEquals(7, methods.length);
				assertEquals("public void javax.swing.JCheckBox.setText(java.lang.String)", methods[0]);
				assertEquals("public void javax.swing.JCheckBox.setSelected(boolean)", methods[1]);
				assertEquals("public void javax.swing.JCheckBox.setHorizontalAlignment(int)", methods[2]);
				assertEquals("public void javax.swing.JCheckBox.setHorizontalTextPosition(int)", methods[3]);
				assertEquals("public void javax.swing.JCheckBox.setVerticalTextPosition(int)", methods[4]);
				assertEquals("public void javax.swing.JCheckBox.setIcon(javax.swing.Icon)", methods[5]);
				assertEquals("public void javax.swing.JCheckBox.setSelectedIcon(javax.swing.Icon)", methods[6]);
		}
		
		/**
		* Test case for {@link ClassInfo#printMethods()} method.
		* It tests the method with a class that has eight public methods.
		*/
		@Test
		void testPrintMethods9() {
				ClassInfo ci = new ClassInfo(JRadioButton.class);
				String[] methods = ci.printMethods();
				assertEquals(8, methods.length);
				assertEquals("public void javax.swing.JRadioButton.setText(java.lang.String)", methods[0]);
