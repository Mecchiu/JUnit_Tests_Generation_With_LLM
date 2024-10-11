// Here's an example implementation of the ClassInfo_8Test class with ten unit test cases for the getFoundMethod() method:

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfo_8Test {

    @Test
    void testGetFoundMethodWithNoMethods() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithOneMethod() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "void", new String[0]);
        classInfo.foundMethods.add(methodData);
        assertEquals(methodData, classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithMultipleMethods() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData1 = new MethodData("testMethod1", "void", new String[0]);
        MethodData methodData2 = new MethodData("testMethod2", "int", new String[]{"int", "String"});
        MethodData methodData3 = new MethodData("testMethod3", "String", new String[]{"String"});
        classInfo.foundMethods.add(methodData1);
        classInfo.foundMethods.add(methodData2);
        classInfo.foundMethods.add(methodData3);
        assertEquals(methodData2, classInfo.getFoundMethod(1));
    }

    @Test
    void testGetFoundMethodWithInvalidPosition() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "void", new String[0]);
        classInfo.foundMethods.add(methodData);
        assertNull(classInfo.getFoundMethod(1));
    }

    @Test
    void testGetFoundMethodWithNullMethodData() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.foundMethods.add(null);
        assertNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithEmptyMethodName() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("", "void", new String[0]);
        classInfo.foundMethods.add(methodData);
        assertEquals(methodData, classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithEmptyReturnType() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "", new String[0]);
        classInfo.foundMethods.add(methodData);
        assertEquals(methodData, classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithEmptyParameterTypes() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "void", new String[0]);
        classInfo.foundMethods.add(methodData);
        assertEquals(methodData, classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithNullParameterTypes() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "void", null);
        classInfo.foundMethods.add(methodData);
        assertEquals(methodData, classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithInvalidParameterTypes() {
        ClassInfo classInfo = new ClassInfo();
        MethodData methodData = new MethodData("testMethod", "void", new String[]{"int", "invalidType"});
        classInfo.foundMethods.add(methodData);
        assertNull(classInfo.getFoundMethod(0));
    }
}