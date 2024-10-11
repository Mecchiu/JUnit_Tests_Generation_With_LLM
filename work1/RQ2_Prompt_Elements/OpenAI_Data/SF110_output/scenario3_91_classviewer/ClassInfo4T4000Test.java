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
		public void testPrintInterfaces1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has one interface.
		*/
		@Test
		public void testPrintInterfaces2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.awt.Window", interfaces[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has two interfaces.
		*/
		@Test
		public void testPrintInterfaces3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(2, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has three interfaces.
		*/
		@Test
		public void testPrintInterfaces4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(3, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has four interfaces.
		*/
		@Test
		public void testPrintInterfaces5() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(4, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has five interfaces.
		*/
		@Test
		public void testPrintInterfaces6() {
				ClassInfo ci = new ClassInfo(JList.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(5, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has six interfaces.
		*/
		@Test
		public void testPrintInterfaces7() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(6, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
				assertEquals("javax.swing.ComboBoxEditor", interfaces[5]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has seven interfaces.
		*/
		@Test
		public void testPrintInterfaces8() {
				ClassInfo ci = new ClassInfo(JCheckBox.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(7, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
				assertEquals("javax.swing.ComboBoxEditor", interfaces[5]);
				assertEquals("javax.swing.SwingConstants", interfaces[6]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has eight interfaces.
		*/
		@Test
		public void testPrintInterfaces9() {
				ClassInfo ci = new ClassInfo(JRadioButton.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(8, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
				assertEquals("javax.swing.ComboBoxEditor", interfaces[5]);
				assertEquals("javax.swing.SwingConstants", interfaces[6]);
				assertEquals("javax.swing.Action", interfaces[7]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has nine interfaces.
		*/
		@Test
		public void testPrintInterfaces10() {
				ClassInfo ci = new ClassInfo(JTabbedPane.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(9, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
				assertEquals("javax.swing.ComboBoxEditor", interfaces[5]);
				assertEquals("javax.swing.SwingConstants", interfaces[6]);
				assertEquals("javax.swing.Action", interfaces[7]);
				assertEquals("javax.swing.TransferHandler.HasGetTransferHandler", interfaces[8]);
		}
}

// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Returns an array of strings that contain the interfaces for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
     *
     * @return string array of interfaces
     */
    public String[] printInterfaces() {
        Class[] interfaces = c.getInterfaces();
        String[] data = getData(interfaces);
        return data;
    }
}

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
		public void testPrintInterfaces1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(0, interfaces.length);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has one interface.
		*/
		@Test
		public void testPrintInterfaces2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(1, interfaces.length);
				assertEquals("java.awt.Window", interfaces[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has two interfaces.
		*/
		@Test
		public void testPrintInterfaces3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(2, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has three interfaces.
		*/
		@Test
		public void testPrintInterfaces4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(3, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has four interfaces.
		*/
		@Test
		public void testPrintInterfaces5() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(4, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has five interfaces.
		*/
		@Test
		public void testPrintInterfaces6() {
				ClassInfo ci = new ClassInfo(JList.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(5, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has six interfaces.
		*/
		@Test
		public void testPrintInterfaces7() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] interfaces = ci.printInterfaces();
				assertEquals(6, interfaces.length);
				assertEquals("java.awt.image.ImageObserver", interfaces[0]);
				assertEquals("java.awt.MenuContainer", interfaces[1]);
				assertEquals("javax.accessibility.Accessible", interfaces[2]);
				assertEquals("javax.swing.Scrollable", interfaces[3]);
				assertEquals("javax.swing.ItemSelectable", interfaces[4]);
				assertEquals("javax.swing.ComboBoxEditor", interfaces[5]);
		}
		
		/**
		* Test case for {@link ClassInfo#printInterfaces()} method.
		* It tests the method with a class that has seven interfaces.
		*/
		@Test
		public void testPrintInterfaces8() {