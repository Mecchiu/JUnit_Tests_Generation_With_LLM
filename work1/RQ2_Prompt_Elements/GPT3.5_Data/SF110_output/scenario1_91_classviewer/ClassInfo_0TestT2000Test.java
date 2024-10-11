// Here's an example of how you can test the printFields() method of ClassInfo class using JUnit 5.

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfoTest {

    @Test
    void testPrintFieldsWithPublicFields() {
        ClassInfo classInfo = new ClassInfo(MyClassWithPublicFields.class);
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        assertEquals(2, fields.length);
        assertEquals("publicField1=1", fields[0]);
        assertEquals("publicField2=2", fields[1]);
    }

    @Test
    void testPrintFieldsWithNoPublicFields() {
        ClassInfo classInfo = new ClassInfo(MyClassWithNoPublicFields.class);
        String[] fields = classInfo.printFields();
        assertNull(fields);
    }

    @Test
    void testPrintFieldsWithIllegalAccessException() {
        ClassInfo classInfo = new ClassInfo(MyClassWithPrivateFields.class);
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        assertEquals(2, fields.length);
        assertTrue(fields[0].contains("privateField1= ILLEGAL ACCESS EXCEPTION"));
        assertTrue(fields[1].contains("privateField2= ILLEGAL ACCESS EXCEPTION"));
    }

    @Test
    void testPrintFieldsWithIllegalArgumentException() {
        ClassInfo classInfo = new ClassInfo(MyClassWithStaticFields.class);
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        assertEquals(2, fields.length);
        assertTrue(fields[0].contains("staticField1= ILLEGAL ARGUMENT EXCEPTION"));
        assertTrue(fields[1].contains("staticField2= ILLEGAL ARGUMENT EXCEPTION"));
    }

    // Add more test cases for other scenarios

    private static class MyClassWithPublicFields {
        public int publicField1 = 1;
        public int publicField2 = 2;
    }

    private static class MyClassWithNoPublicFields {
        private int privateField1 = 1;
        private int privateField2 = 2;
    }

    private static class MyClassWithPrivateFields {
        private int privateField1 = 1;
        private int privateField2 = 2;
    }

    private static class MyClassWithStaticFields {
        public static int staticField1 = 1;
        public static int staticField2 = 2;
    }
}