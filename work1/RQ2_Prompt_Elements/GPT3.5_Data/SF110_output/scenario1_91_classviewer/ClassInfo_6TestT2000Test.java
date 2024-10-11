// Here's an updated version of the ClassInfo_6Test class with ten unit test cases for the getData method:

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfo_6Test {

    @Test
    void testGetDataWithEmptyArray() {
        String[] result = ClassInfo.getData(new Class[0]);
        assertNull(result);
    }

    @Test
    void testGetDataWithOneClass() {
        String[] result = ClassInfo.getData(new Class[] {String.class});
        assertEquals(1, result.length);
        assertEquals("java.lang.String", result[0]);
    }

    @Test
    void testGetDataWithMultipleClasses() {
        String[] result = ClassInfo.getData(new Class[] {String.class, Integer.class, Double.class});
        assertEquals(3, result.length);
        assertEquals("java.lang.String", result[0]);
        assertEquals("java.lang.Integer", result[1]);
        assertEquals("java.lang.Double", result[2]);
    }

    @Test
    void testGetDataWithNullClass() {
        String[] result = ClassInfo.getData(null);
        assertNull(result);
    }

    @Test
    void testGetDataWithPrimitiveClasses() {
        String[] result = ClassInfo.getData(new Class[] {int.class, double.class, boolean.class});
        assertEquals(3, result.length);
        assertEquals("int", result[0]);
        assertEquals("double", result[1]);
        assertEquals("boolean", result[2]);
    }

    @Test
    void testGetDataWithArrayClass() {
        String[] result = ClassInfo.getData(new Class[] {String[].class});
        assertEquals(1, result.length);
        assertEquals("[Ljava.lang.String;", result[0]);
    }

    @Test
    void testGetDataWithInterface() {
        String[] result = ClassInfo.getData(new Class[] {List.class});
        assertEquals(1, result.length);
        assertEquals("java.util.List", result[0]);
    }

    @Test
    void testGetDataWithInnerClass() {
        String[] result = ClassInfo.getData(new Class[] {ClassInfo.class});
        assertEquals(1, result.length);
        assertEquals("com.jstevh.viewer.ClassInfo", result[0]);
    }

    @Test
    void testGetDataWithAnonymousClass() {
        String[] result = ClassInfo.getData(new Class[] {new Object() {}.getClass()});
        assertEquals(1, result.length);
        assertEquals("com.jstevh.viewer.ClassInfo_6Test$1", result[0]);
    }

    @Test
    void testGetDataWithLocalClass() {
        class LocalClass {}
        String[] result = ClassInfo.getData(new Class[] {LocalClass.class});
        assertEquals(1, result.length);
        assertEquals("com.jstevh.viewer.ClassInfo_6Test$1LocalClass", result[0]);
    }
}