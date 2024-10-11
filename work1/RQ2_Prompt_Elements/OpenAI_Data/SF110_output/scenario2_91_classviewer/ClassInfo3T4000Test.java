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
		 * It tests the method with a class that has no public constructors.
		 */
		@Test
		void testPrintConstructors1() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] data = ci.printConstructors();
				assertNull(data);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has one public constructor.
		 */
		@Test
		void testPrintConstructors2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] data = ci.printConstructors();
				assertEquals(1, data.length);
				assertEquals("public javax.swing.JFrame()", data[0]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has two public constructors.
		 */
		@Test
		void testPrintConstructors3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] data = ci.printConstructors();
				assertEquals(2, data.length);
				assertEquals("public javax.swing.JButton()", data[0]);
				assertEquals("public javax.swing.JButton(java.lang.String)", data[1]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has three public constructors.
		 */
		@Test
		void testPrintConstructors4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] data = ci.printConstructors();
				assertEquals(3, data.length);
				assertEquals("public javax.swing.JTextField()", data[0]);
				assertEquals("public javax.swing.JTextField(java.lang.String)", data[1]);
				assertEquals("public javax.swing.JTextField(int)", data[2]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has four public constructors.
		 */
		@Test
		void testPrintConstructors5() {
				ClassInfo ci = new ClassInfo(JTextArea.class);
				String[] data = ci.printConstructors();
				assertEquals(4, data.length);
				assertEquals("public javax.swing.JTextArea()", data[0]);
				assertEquals("public javax.swing.JTextArea(java.lang.String)", data[1]);
				assertEquals("public javax.swing.JTextArea(int,int)", data[2]);
				assertEquals("public javax.swing.JTextArea(java.lang.String,int,int)", data[3]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has five public constructors.
		 */
		@Test
		void testPrintConstructors6() {
				ClassInfo ci = new ClassInfo(JList.class);
				String[] data = ci.printConstructors();
				assertEquals(5, data.length);
				assertEquals("public javax.swing.JList()", data[0]);
				assertEquals("public javax.swing.JList(java.lang.Object[])", data[1]);
				assertEquals("public javax.swing.JList(javax.swing.ListModel)", data[2]);
				assertEquals("public javax.swing.JList(java.util.Vector)", data[3]);
				assertEquals("public javax.swing.JList(java.util.ListModel)", data[4]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has six public constructors.
		 */
		@Test
		void testPrintConstructors7() {
				ClassInfo ci = new ClassInfo(JComboBox.class);
				String[] data = ci.printConstructors();
				assertEquals(6, data.length);
				assertEquals("public javax.swing.JComboBox()", data[0]);
				assertEquals("public javax.swing.JComboBox(java.lang.Object[])", data[1]);
				assertEquals("public javax.swing.JComboBox(javax.swing.ComboBoxModel)", data[2]);
				assertEquals("public javax.swing.JComboBox(java.util.Vector)", data[3]);
				assertEquals("public javax.swing.JComboBox(java.util.ListModel)", data[4]);
				assertEquals("public javax.swing.JComboBox(java.util.Vector,javax.swing.ComboBoxModel)", data[5]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has seven public constructors.
		 */
		@Test
		void testPrintConstructors8() {
				ClassInfo ci = new ClassInfo(JCheckBox.class);
				String[] data = ci.printConstructors();
				assertEquals(7, data.length);
				assertEquals("public javax.swing.JCheckBox()", data[0]);
				assertEquals("public javax.swing.JCheckBox(java.lang.String)", data[1]);
				assertEquals("public javax.swing.JCheckBox(java.lang.String,boolean)", data[2]);
				assertEquals("public javax.swing.JCheckBox(javax.swing.Icon)", data[3]);
				assertEquals("public javax.swing.JCheckBox(javax.swing.Icon,boolean)", data[4]);
				assertEquals("public javax.swing.JCheckBox(java.lang.String,javax.swing.Icon)", data[5]);
				assertEquals("public javax.swing.JCheckBox(java.lang.String,javax.swing.Icon,boolean)", data[6]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has eight public constructors.
		 */
		@Test
		void testPrintConstructors9() {
				ClassInfo ci = new ClassInfo(JRadioButton.class);
				String[] data = ci.printConstructors();
				assertEquals(8, data.length);
				assertEquals("public javax.swing.JRadioButton()", data[0]);
				assertEquals("public javax.swing.JRadioButton(java.lang.String)", data[1]);
				assertEquals("public javax.swing.JRadioButton(java.lang.String,boolean)", data[2]);
				assertEquals("public javax.swing.JRadioButton(javax.swing.Icon)", data[3]);
				assertEquals("public javax.swing.JRadioButton(javax.swing.Icon,boolean)", data[4]);
				assertEquals("public javax.swing.JRadioButton(java.lang.String,javax.swing.Icon)", data[5]);
				assertEquals("public javax.swing.JRadioButton(java.lang.String,javax.swing.Icon,boolean)", data[6]);
				assertEquals("public javax.swing.JRadioButton(javax.swing.Action)", data[7]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printConstructors()} method.
		 * It tests the method with a class that has nine public constructors.
		 */
		@Test
		void testPrintConstructors10() {
				ClassInfo ci = new ClassInfo(JToggleButton.class);
				String[] data = ci.printConstructors();
				assertEquals(9, data.length);
				assertEquals("public javax.swing.JToggleButton()", data[0]);
				assertEquals("public javax.swing.JToggleButton(java.lang.String)", data[1]);
				assertEquals("public javax.swing.JToggleButton(java.lang.String,boolean)", data[2]);
				assertEquals("public javax.swing.JToggleButton(javax.swing.Icon)", data[3]);
				assertEquals("public javax.swing.JToggleButton(javax.swing.Icon,boolean)", data[4]);
				assertEquals("public javax.swing.JToggleButton(java.lang.String,javax.swing.Icon)", data[5]);
				assertEquals("public javax.swing.JToggleButton(java.lang.String,javax.swing.Icon,boolean)", data[6]);
				assertEquals("public javax.swing.JToggleButton(javax.swing.Action)", data[7]);
				assertEquals("public javax.swing.JToggleButton(javax.swing.Icon,boolean,boolean)", data[8]);
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
     * Returns an array of strings that contain the public constructors for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
     *
     * @return string array of public constructors
     */
    public String[] printConstructors() {
        Constructor[] constr = c.getConstructors();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(constr);
        if (debug && data == null)
            System.out.println("No public constructors.");
        else
            printArray(data);
        return data;
    }

    /**
     * Returns an array of strings that contain the public methods for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.Class[])} method for methods.
     *
     * @return string array of public methods
     */
    public String[] printMethods() {
        Method[] meth = c.getMethods();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(meth);
        if (debug && data == null)
            System.out.println("No public methods.");
        else
            printArray(data);
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
				String[] data = ci.printMethods();
				assertNull(data);
		}
		
		/**
		 * Test case for {@link ClassInfo#printMethods()} method.
		 * It tests the method with a class that has one public method.
		 */
		@Test
		void testPrintMethods2() {
				ClassInfo ci = new ClassInfo(JFrame.class);
				String[] data = ci.printMethods();
				assertEquals(1, data.length);
				assertEquals("public void javax.swing.JFrame.setDefaultCloseOperation(int)", data[0]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printMethods()} method.
		 * It tests the method with a class that has two public methods.
		 */
		@Test
		void testPrintMethods3() {
				ClassInfo ci = new ClassInfo(JButton.class);
				String[] data = ci.printMethods();
				assertEquals(2, data.length);
				assertEquals("public void javax.swing.JButton.setText(java.lang.String)", data[0]);
				assertEquals("public java.lang.String javax.swing.JButton.getText()", data[1]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printMethods()} method.
		 * It tests the method with a class that has three public methods.
		 */
		@Test
		void testPrintMethods4() {
				ClassInfo ci = new ClassInfo(JTextField.class);
				String[] data = ci.printMethods();
				assertEquals(3, data.length);
				assertEquals("public void javax.swing.JTextField.setText(java.lang.String)", data[0]);
				assertEquals("public java.lang.String javax.swing.JTextField.getText()", data[1]);
				assertEquals("public void javax.swing.JTextField.setColumns(int)", data[2]);
		}
		
		/**
		 * Test case for {@link ClassInfo#printMethods()} method.
		 * It tests the method with a class that has four public methods.
		 */
		@Test
		void testPrintMethods5() {
				ClassInfo ci = new ClassInfo(J