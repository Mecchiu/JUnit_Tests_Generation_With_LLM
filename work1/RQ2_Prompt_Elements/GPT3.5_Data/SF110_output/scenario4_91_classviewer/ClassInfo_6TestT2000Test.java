// ClassInfo_6Test.java
package com.jstevh.viewer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
 */
class ClassInfo_6Test {

    @Test
    void testGetDataWithNull() {
        String[] result = ClassInfo.getData(null);
        assertNull(result);
    }

    @Test
    void testGetDataWithEmptyArray() {
        Class[] classes = new Class[0];
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    void testGetDataWithOneClass() {
        Class[] classes = {String.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("java.lang.String", result[0]);
    }

    @Test
    void testGetDataWithMultipleClasses() {
        Class[] classes = {String.class, Integer.class, Double.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("java.lang.String", result[0]);
        assertEquals("java.lang.Integer", result[1]);
        assertEquals("java.lang.Double", result[2]);
    }

    @Test
    void testGetDataWithMethods() throws NoSuchMethodException {
        Method[] methods = {String.class.getMethod("length"), Integer.class.getMethod("intValue")};
        String[] result = ClassInfo.getData(methods);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("public int java.lang.String.length()", result[0]);
        assertEquals("public int java.lang.Integer.intValue()", result[1]);
    }

    @Test
    void testGetDataWithConstructors() throws NoSuchMethodException {
        Constructor[] constructors = {String.class.getConstructor(String.class), Integer.class.getConstructor(int.class)};
        String[] result = ClassInfo.getData(constructors);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("public java.lang.String(java.lang.String)", result[0]);
        assertEquals("public java.lang.Integer(int)", result[1]);
    }

    @Test
    void testGetDataWithMixedMembers() throws NoSuchMethodException {
        Method[] methods = {String.class.getMethod("length"), Integer.class.getMethod("intValue")};
        Constructor[] constructors = {String.class.getConstructor(String.class), Integer.class.getConstructor(int.class)};
        Member[] members = new Member[4];
        System.arraycopy(methods, 0, members, 0, methods.length);
        System.arraycopy(constructors, 0, members, methods.length, constructors.length);
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("public int java.lang.String.length()", result[0]);
        assertEquals("public int java.lang.Integer.intValue()", result[1]);
        assertEquals("public java.lang.String(java.lang.String)", result[2]);
        assertEquals("public java.lang.Integer(int)", result[3]);
    }

    @Test
    void testGetDataWithMixedMembersAndNull() throws NoSuchMethodException {
        Method[] methods = {String.class.getMethod("length"), Integer.class.getMethod("intValue")};
        Constructor[] constructors = {String.class.getConstructor(String.class), Integer.class.getConstructor(int.class)};
        Member[] members = new Member[5];
        System.arraycopy(methods, 0, members, 0, methods.length);
        System.arraycopy(constructors, 0, members, methods.length, constructors.length);
        members[4] = null;
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("public int java.lang.String.length()", result[0]);
        assertEquals("public int java.lang.Integer.intValue()", result[1]);
        assertEquals("public java.lang.String(java.lang.String)", result[2]);
        assertEquals("public java.lang.Integer(int)", result[3]);
    }

    @Test
    void testGetDataWithMixedMembersAndDuplicates() throws NoSuchMethodException {
        Method[] methods = {String.class.getMethod("length"), Integer.class.getMethod("intValue")};
        Constructor[] constructors = {String.class.getConstructor(String.class), Integer.class.getConstructor(int.class)};
        Member[] members = new Member[5];
        System.arraycopy(methods, 0, members, 0, methods.length);
        System.arraycopy(constructors, 0, members, methods.length, constructors.length);
        members[4] = constructors[1];
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("public int java.lang.String.length()", result[0]);
        assertEquals("public int java.lang.Integer.intValue()", result[1]);
        assertEquals("public java.lang.String(java.lang.String)", result[2]);
        assertEquals("public java.lang.Integer(int)", result[3]);
    }

    @Test
    void testGetDataWithMixedMembersAndNonPublic() throws NoSuchMethodException {
        Method[] methods = {String.class.getMethod("length"), Integer.class.getMethod("intValue")};
        Constructor[] constructors = {String.class.getConstructor(String.class), Integer.class.getConstructor(int.class)};
        Member[] members = new Member[5];
        System.arraycopy(methods, 0, members, 0, methods.length);
        System.arraycopy(constructors, 0, members, methods.length, constructors.length);
        members[4] = String.class.getDeclaredField("value");
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals("public int java.lang.String.length()", result[0]);
        assertEquals("public int java.lang.Integer.intValue()", result[1]);
        assertEquals("public java.lang.String(java.lang.String)", result[2]);
        assertEquals("private final char[] java.lang.String.value", result[3]);
    }
}