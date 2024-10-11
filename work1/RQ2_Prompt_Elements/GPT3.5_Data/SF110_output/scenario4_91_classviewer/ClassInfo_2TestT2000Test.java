// ClassInfo_2Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
 */
class ClassInfo_2Test {

    @Test
    void testPrintMethodsNoParam() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsNoObjectMethods() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertFalse(method.startsWith("java.lang.Object"));
        }
    }

    @Test
    void testPrintMethodsNoInheritedMethods() {
        ClassInfo classInfo = new ClassInfo(JButton.class);
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertFalse(method.startsWith("javax.swing.JComponent"));
        }
    }

    @Test
    void testPrintMethodsNoObjectAndInheritedMethods() {
        ClassInfo classInfo = new ClassInfo(JButton.class);
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS | ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertFalse(method.startsWith("java.lang.Object"));
            assertFalse(method.startsWith("javax.swing.JComponent"));
        }
    }

    @Test
    void testPrintMethodsInvalidParam() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] methods = classInfo.printMethods(3);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoPublicMethods() {
        ClassInfo classInfo = new ClassInfo(Border.class);
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertEquals(0, methods.length);
    }

    @Test
    void testPrintMethodsNoPublicConstructors() {
        ClassInfo classInfo = new ClassInfo(Border.class);
        String[] constructors = classInfo.printConstructors();
        assertNotNull(constructors);
        assertEquals(0, constructors.length);
    }

    @Test
    void testPrintMethodsNoInterfaces() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] interfaces = classInfo.printInterfaces();
        assertNotNull(interfaces);
        assertEquals(0, interfaces.length);
    }

    @Test
    void testSrchMethods() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] methods = classInfo.srchMethods("substring");
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertTrue(method.contains("substring"));
        }
    }

    @Test
    void testGetFoundMethod() {
        ClassInfo classInfo = new ClassInfo(String.class);
        String[] methods = classInfo.srchMethods("substring");
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        MethodData methodData = classInfo.getFoundMethod(0);
        assertNotNull(methodData);
        assertEquals("public java.lang.String java.lang.String.substring(int)", methodData.toString());
    }
}