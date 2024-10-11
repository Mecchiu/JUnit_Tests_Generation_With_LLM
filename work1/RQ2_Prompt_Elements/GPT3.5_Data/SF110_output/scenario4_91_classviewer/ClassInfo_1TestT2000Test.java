// ClassInfo_1Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
 */
class ClassInfo_1Test {

    @Test
    void testPrintMethods() {
        ClassInfo classInfo = new ClassInfo("java.lang.String");
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsEmpty() {
        ClassInfo classInfo = new ClassInfo("java.awt.Point");
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertEquals(0, methods.length);
    }

    @Test
    void testPrintMethodsNull() {
        ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo");
        String[] methods = classInfo.printMethods();
        assertNull(methods);
    }

    @Test
    void testPrintMethodsInherited() {
        ClassInfo classInfo = new ClassInfo("java.util.ArrayList");
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsNoInherited() {
        ClassInfo classInfo = new ClassInfo("java.util.ArrayList");
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
        assertEquals(0, methods.length);
    }

    @Test
    void testPrintMethodsNoObject() {
        ClassInfo classInfo = new ClassInfo("java.util.ArrayList");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsNoObjectNoInherited() {
        ClassInfo classInfo = new ClassInfo("java.util.ArrayList");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS | ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
        assertEquals(0, methods.length);
    }

    @Test
    void testPrintMethodsInvalidParam() {
        ClassInfo classInfo = new ClassInfo("java.lang.String");
        String[] methods = classInfo.printMethods(3);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsAbstract() {
        ClassInfo classInfo = new ClassInfo("java.awt.Shape");
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsInterface() {
        ClassInfo classInfo = new ClassInfo("java.util.List");
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }
}