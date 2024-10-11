// ClassInfo_0Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
 */
class ClassInfo_0Test {

    @Test
    void testPrintFields_emptyClass() {
        ClassInfo ci = new ClassInfo(EmptyClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(0, fields.length);
    }

    @Test
    void testPrintFields_oneField() {
        ClassInfo ci = new ClassInfo(OneFieldClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("public int OneFieldClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_multipleFields() {
        ClassInfo ci = new ClassInfo(MultipleFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(3, fields.length);
        assertEquals("public int MultipleFieldsClass.field1", fields[0]);
        assertEquals("public String MultipleFieldsClass.field2", fields[1]);
        assertEquals("private boolean MultipleFieldsClass.field3", fields[2]);
    }

    @Test
    void testPrintFields_inheritedFields() {
        ClassInfo ci = new ClassInfo(InheritedFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(2, fields.length);
        assertEquals("public int InheritedFieldsClass.field1", fields[0]);
        assertEquals("public String InheritedFieldsClass.field2", fields[1]);
    }

    @Test
    void testPrintFields_privateFields() {
        ClassInfo ci = new ClassInfo(PrivateFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("private int PrivateFieldsClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_protectedFields() {
        ClassInfo ci = new ClassInfo(ProtectedFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("protected int ProtectedFieldsClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_staticFields() {
        ClassInfo ci = new ClassInfo(StaticFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("public static int StaticFieldsClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_finalFields() {
        ClassInfo ci = new ClassInfo(FinalFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("public final int FinalFieldsClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_transientFields() {
        ClassInfo ci = new ClassInfo(TransientFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("public transient int TransientFieldsClass.field1", fields[0]);
    }

    @Test
    void testPrintFields_volatileFields() {
        ClassInfo ci = new ClassInfo(VolatileFieldsClass.class.getName());
        String[] fields = ci.printFields();
        assertEquals(1, fields.length);
        assertEquals("public volatile int VolatileFieldsClass.field1", fields[0]);
    }

    private static class EmptyClass {
    }

    private static class OneFieldClass {
        public int field1;
    }

    private static class MultipleFieldsClass {
        public int field1;
        public String field2;
        private boolean field3;
    }

    private static class SuperClass {
        public int field1;
        public String field2;
    }

    private static class InheritedFieldsClass extends SuperClass {
    }

    private static class PrivateFieldsClass {
        private int field1;
    }

    private static class ProtectedFieldsClass {
        protected int field1;
    }

    private static class StaticFieldsClass {
        public static int field1;
    }

    private static class FinalFieldsClass {
        public final int field1 = 0;
    }

    private static class TransientFieldsClass {
        public transient int field1;
    }

    private static class VolatileFieldsClass {
        public volatile int field1;
    }
}