package com.jstevh.viewer;
java
class ClassInfo_6Test {

    @Test
    void testGetData_withEmptyArray() {
        Class[] classes = new Class[0];
        String[] result = ClassInfo.getData(classes);
        assertNull(result);
    }

    @Test
    void testGetData_withSingleClass() {
        Class[] classes = {String.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("java.lang.String", result[0]);
    }

    @Test
    void testGetData_withMultipleClasses() {
        Class[] classes = {String.class, Integer.class, Double.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("java.lang.String", result[0]);
        assertEquals("java.lang.Integer", result[1]);
        assertEquals("java.lang.Double", result[2]);
    }

    @Test
    void testGetData_withNullClass() {
        Class[] classes = {String.class, null, Integer.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("java.lang.String", result[0]);
        assertNull(result[1]);
        assertEquals("java.lang.Integer", result[2]);
    }

    @Test
    void testGetData_withPrimitiveClasses() {
        Class[] classes = {int.class, double.class, boolean.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("int", result[0]);
        assertEquals("double", result[1]);
        assertEquals("boolean", result[2]);
    }

    @Test
    void testGetData_withArrayClass() {
        Class[] classes = {String[].class, int[].class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("[Ljava.lang.String;", result[0]);
        assertEquals("[I", result[1]);
    }

    @Test
    void testGetData_withInnerClass() {
        Class[] classes = {Map.Entry.class, ListIterator.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("java.util.Map.Entry", result[0]);
        assertEquals("java.util.ListIterator", result[1]);
    }

    @Test
    void testGetData_withAnonymousClass() {
        Class[] classes = {new ActionListener() {}.getClass()};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("com.jstevh.viewer.ClassInfo_6Test$1", result[0]);
    }

    @Test
    void testGetData_withLocalClass() {
        class LocalClass {}
        Class[] classes = {LocalClass.class};
        String[] result = ClassInfo.getData(classes);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("com.jstevh.viewer.ClassInfo_6Test$1LocalClass", result[0]);
    }
}
