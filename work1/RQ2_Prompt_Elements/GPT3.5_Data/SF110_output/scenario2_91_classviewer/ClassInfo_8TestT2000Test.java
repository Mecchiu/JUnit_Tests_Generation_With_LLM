// ClassInfo_8Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
 */
class ClassInfo_8Test {

    @Test
    void testGetFoundMethodWithNullFoundMethods() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithOutOfRangePosition() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNull(classInfo.getFoundMethod(2));
    }

    @Test
    void testGetFoundMethodWithValidPosition() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNotNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithValidPositionAndCorrectMethodName() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertEquals("method1", classInfo.getFoundMethod(0).getMethName());
    }

    @Test
    void testGetFoundMethodWithValidPositionAndCorrectClassName() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertEquals("com.jstevh.viewer.ClassInfo", classInfo.getFoundMethod(0).getMethClass());
    }

    @Test
    void testGetFoundMethodWithValidPositionAndCorrectPackageName() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertEquals("com.jstevh.viewer", classInfo.getFoundMethod(0).getMethPackage());
    }

    @Test
    void testGetFoundMethodWithInvalidClassName() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNull(classInfo.getFoundMethod(2).getMethPackage());
    }

    @Test
    void testGetFoundMethodWithInvalidMethodName() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNull(classInfo.getFoundMethod(2).getMethName());
    }

    @Test
    void testGetFoundMethodWithInvalidPosition() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void com.jstevh.viewer.ClassInfo.method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNull(classInfo.getFoundMethod(-1));
    }

    @Test
    void testGetFoundMethodWithValidPositionAndNullPackage() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.fndMethods = new String[]{"public void method1()", "public void com.jstevh.viewer.ClassInfo.method2()"};
        assertNull(classInfo.getFoundMethod(0).getMethPackage());
    }
}