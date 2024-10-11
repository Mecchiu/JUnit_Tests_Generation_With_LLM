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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {

		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JFrame} object.
		*/
		@Test
		void testPrintFieldsWithJFrame() {
				JFrame frame = new JFrame();
				ClassInfo classInfo = new ClassInfo(frame.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JFrame.EXIT_ON_CLOSE=3");
				assertEquals(fields[1], "public static final int javax.swing.JFrame.HIDE_ON_CLOSE=1");
				assertEquals(fields[2], "public static final int javax.swing.JFrame.DO_NOTHING_ON_CLOSE=0");
				assertEquals(fields[3], "public static final int javax.swing.JFrame.DISPOSE_ON_CLOSE=2");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JButton} object.
		*/
		@Test
		void testPrintFieldsWithJButton() {
				JButton button = new JButton();
				ClassInfo classInfo = new ClassInfo(button.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JButton.CENTER=0");
				assertEquals(fields[1], "public static final int javax.swing.JButton.LEADING=3");
				assertEquals(fields[2], "public static final int javax.swing.JButton.LEFT=2");
				assertEquals(fields[3], "public static final int javax.swing.JButton.RIGHT=1");
				assertEquals(fields[4], "public static final int javax.swing.JButton.TRAILING=4");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JLabel} object.
		*/
		@Test
		void testPrintFieldsWithJLabel() {
				JLabel label = new JLabel();
				ClassInfo classInfo = new ClassInfo(label.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JLabel.LEADING=10");
				assertEquals(fields[1], "public static final int javax.swing.JLabel.LEFT=11");
				assertEquals(fields[2], "public static final int javax.swing.JLabel.RIGHT=12");
				assertEquals(fields[3], "public static final int javax.swing.JLabel.TRAILING=13");
				assertEquals(fields[4], "public static final int javax.swing.JLabel.CENTER=0");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JTextField} object.
		*/
		@Test
		void testPrintFieldsWithJTextField() {
				JTextField textField = new JTextField();
				ClassInfo classInfo = new ClassInfo(textField.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JTextField.LEADING=10");
				assertEquals(fields[1], "public static final int javax.swing.JTextField.LEFT=11");
				assertEquals(fields[2], "public static final int javax.swing.JTextField.RIGHT=12");
				assertEquals(fields[3], "public static final int javax.swing.JTextField.TRAILING=13");
				assertEquals(fields[4], "public static final int javax.swing.JTextField.CENTER=0");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JTextArea} object.
		*/
		@Test
		void testPrintFieldsWithJTextArea() {
				JTextArea textArea = new JTextArea();
				ClassInfo classInfo = new ClassInfo(textArea.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JTextArea.SCROLLBARS_BOTH=0");
				assertEquals(fields[1], "public static final int javax.swing.JTextArea.SCROLLBARS_HORIZONTAL_ONLY=1");
				assertEquals(fields[2], "public static final int javax.swing.JTextArea.SCROLLBARS_NONE=3");
				assertEquals(fields[3], "public static final int javax.swing.JTextArea.SCROLLBARS_VERTICAL_ONLY=2");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JScrollPane} object.
		*/
		@Test
		void testPrintFieldsWithJScrollPane() {
				JScrollPane scrollPane = new JScrollPane();
				ClassInfo classInfo = new ClassInfo(scrollPane.getClass());
				String[] fields = classInfo.printFields();
				assertEquals(fields[0], "public static final int javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS=22");
				assertEquals(fields[1], "public static final int javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED=21");
				assertEquals(fields[2], "public static final int javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER=20");
				assertEquals(fields[3], "public static final int javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS=32");
				assertEquals(fields[4], "public static final int javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED=31");
				assertEquals(fields[5], "public static final int javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER=30");
		}
		
		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link JList} object.
		*/
		@Test
		void testPrintFieldsWithJList() {
				JList list = new JList();
				ClassInfo classInfo = new ClassInfo(list.getClass());
				String[] fields = class