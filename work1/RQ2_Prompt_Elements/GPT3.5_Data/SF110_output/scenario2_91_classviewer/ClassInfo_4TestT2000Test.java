// ClassInfo_4Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#printInterfaces()} method.
 */
class ClassInfo_4Test {

    @Test
    void testPrintInterfaces_noInterfaces() {
        ClassInfo classInfo = new ClassInfo();
        String[] interfaces = classInfo.printInterfaces();
        assertNull(interfaces);
    }

    @Test
    void testPrintInterfaces_oneInterface() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(ArrayList.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(1, interfaces.length);
        assertEquals("java.util.List", interfaces[0]);
    }

    @Test
    void testPrintInterfaces_multipleInterfaces() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(JButton.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(6, interfaces.length);
        assertEquals("javax.accessibility.Accessible", interfaces[0]);
        assertEquals("javax.swing.SwingConstants", interfaces[1]);
        assertEquals("javax.swing.Action", interfaces[2]);
        assertEquals("java.awt.image.ImageObserver", interfaces[3]);
        assertEquals("java.awt.MenuContainer", interfaces[4]);
        assertEquals("java.io.Serializable", interfaces[5]);
    }

    @Test
    void testPrintInterfaces_withSuperclass() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(JTextField.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(9, interfaces.length);
        assertEquals("javax.accessibility.Accessible", interfaces[0]);
        assertEquals("javax.swing.SwingConstants", interfaces[1]);
        assertEquals("javax.swing.text.AttributeSet", interfaces[2]);
        assertEquals("javax.swing.text.Document", interfaces[3]);
        assertEquals("javax.swing.text.Editable", interfaces[4]);
        assertEquals("javax.swing.text.NavigationFilter", interfaces[5]);
        assertEquals("javax.swing.text.View", interfaces[6]);
        assertEquals("java.awt.image.ImageObserver", interfaces[7]);
        assertEquals("java.io.Serializable", interfaces[8]);
    }

    @Test
    void testPrintInterfaces_interfaceOnly() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(Runnable.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(0, interfaces.length);
    }

    @Test
    void testPrintInterfaces_objectClass() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(Object.class);
        String[] interfaces = classInfo.printInterfaces();
        assertNull(interfaces);
    }

    @Test
    void testPrintInterfaces_debugMode() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setDebug(true);
        classInfo.setClass(JButton.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(6, interfaces.length);
    }

    @Test
    void testPrintInterfaces_nullClass() {
        ClassInfo classInfo = new ClassInfo();
        assertThrows(NullPointerException.class, () -> {
            classInfo.printInterfaces();
        });
    }

    @Test
    void testPrintInterfaces_interfaceWithInheritance() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(JList.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(7, interfaces.length);
        assertEquals("javax.accessibility.Accessible", interfaces[0]);
        assertEquals("javax.swing.Scrollable", interfaces[1]);
        assertEquals("javax.swing.ListModel", interfaces[2]);
        assertEquals("javax.swing.event.ListSelectionModel", interfaces[3]);
        assertEquals("javax.swing.TransferHandler.HasGetTransferHandler", interfaces[4]);
        assertEquals("java.awt.image.ImageObserver", interfaces[5]);
        assertEquals("java.io.Serializable", interfaces[6]);
    }

    @Test
    void testPrintInterfaces_interfaceWithDuplicateInheritance() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClass(JComboBox.class);
        String[] interfaces = classInfo.printInterfaces();
        assertEquals(9, interfaces.length);
        assertEquals("javax.accessibility.Accessible", interfaces[0]);
        assertEquals("javax.swing.ComboBoxModel", interfaces[1]);
        assertEquals("javax.swing.ListCellRenderer", interfaces[2]);
        assertEquals("javax.swing.MutableComboBoxModel", interfaces[3]);
        assertEquals("javax.swing.SwingConstants", interfaces[4]);
        assertEquals("javax.swing.event.ListDataListener", interfaces[5]);
        assertEquals("javax.swing.event.ListSelectionListener", interfaces[6]);
        assertEquals("java.awt.event.ActionListener", interfaces[7]);
        assertEquals("java.awt.image.ImageObserver", interfaces[8]);
    }
}