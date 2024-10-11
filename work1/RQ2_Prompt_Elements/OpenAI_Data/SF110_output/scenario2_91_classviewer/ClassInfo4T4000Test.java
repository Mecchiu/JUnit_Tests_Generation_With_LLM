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
        Class[] inter = c.getInterfaces();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(inter);
        if (c != java.lang.Object.class && !c.isInterface()) {
            Class superC = c.getSuperclass();
            TreeSet<String> hInterfaces = new TreeSet<String>();
            int i = 0;
            if (data != null)
                for (i = 0; i < data.length; i++) {
                    hInterfaces.add(data[i]);
                }
            while (superC != null && superC != java.lang.Object.class) {
                inter = superC.getInterfaces();
                if (debug)
                    System.out.println("****************************************");
                data = getData(inter);
                if (data != null)
                    for (i = 0; i < data.length; i++) {
                        hInterfaces.add(data[i]);
                    }
                superC = superC.getSuperclass();
            }
            if (hInterfaces.size() != 0) {
                data = new String[hInterfaces.size()];
                Iterator it = hInterfaces.iterator();
                i = 0;
                while (it.hasNext()) {
                    data[i] = (String) it.next();
                    i++;
                }
            }
        }
        if (debug && data == null)
            System.out.println("No interfaces.");
        else
            printArray(data);
        return data;
    }

    /**
     * Returns an array of strings that contain the constructors for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.reflect.Constructor[])} method for constructors.
     *
     * @return string array of constructors
     */
    public String[] printConstructors() {
        Constructor[] cons = c.getConstructors();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(cons);
        if (debug && data == null)
            System.out.println("No constructors.");
        else
            printArray(data);
        return data;
    }

    /**
     * Returns an array of strings that contain the methods for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.reflect.Method[])} method for constructors.
     *
     * @return string array of methods
     */
    public String[] printMethods() {
        Method[] meth = c.getMethods();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(meth);
        if (debug && data == null)
            System.out.println("No methods.");
        else
            printArray(data);
        return data;
    }

    /**
     * Returns an array of strings that contain the fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.reflect.Field[])} method for constructors.
     *
     * @return string array of fields
     */
    public String[] printFields() {
        Field[] fiel = c.getFields();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(fiel);
        if (debug && data == null)
            System.out.println("No fields.");
        else
            printArray(data);
        return data;
    }

    /**
     * Returns an array of strings that contain the data for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.reflect.Field[])} method for constructors.
     *
     * @return string array of fields
     */
    public String[] printData() {
        String[] data = new String[4];
        data[0] = printClass();
        data[1] = printSuperClass();
        data[2] = printInterfaces();
        data[3] = printConstructors();
        data[4] = printMethods();
        data[5] = printFields();
        return data;
    }

    /**
     * Returns a string that contains the class for
     * the class. The data is pulled from the c private Class object.
     *
     * @return string of class
     */
    public String printClass() {
        String data = c.getName();
        if (debug)
            System.out.println("****************************************");
        if (debug)
            System.out.println("Class: " + data);
        return data;
    }

    /**
     * Returns a string that contains the superclass for
     * the class. The data is pulled from the c private Class object.
     *
     * @return string of superclass
     */
    public String printSuperClass() {
        String data = c.getSuperclass().getName();
        if (debug)
            System.out.println("****************************************");
        if (debug)
            System.out.println("Superclass: " + data);
        return data;
    }

    /**
     * Returns an array of strings that contain the data for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.reflect.Field[])} method for constructors.
     *
     * @return string array of fields
     */
    public String[] printData() {
        String[] data = new String[4];
        data[0] = printClass();
        data[1] = printSuperClass();
        data[2] = printInterfaces();
        data[3] = printConstructors();
        data[4] = printMethods();
        data[5] = printFields();
        return data;
    }

    /**
     * Returns a string that contains the class for
     * the class. The data is pulled from the c private Class object.
     *
     * @return string of class
     */
    public String printClass() {
        String data = c.getName();
        if (debug)
            System.out.println("****************************************");
        if (debug)
            System.out