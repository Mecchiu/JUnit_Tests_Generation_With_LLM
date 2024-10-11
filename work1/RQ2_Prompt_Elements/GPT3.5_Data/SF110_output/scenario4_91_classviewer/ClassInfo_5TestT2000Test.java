// ClassInfo_5Test.java
package com.jstevh.viewer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
 */
class ClassInfo_5Test {

    @Test
    void testGetDataWithFields() throws NoSuchFieldException {
        Field[] fields = TestClass.class.getDeclaredFields();
        String[] expected = {"publicField", "protectedField", "defaultField", "privateField"};
        String[] actual = ClassInfo.getData(fields);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithMethods() throws NoSuchMethodException {
        Method[] methods = TestClass.class.getDeclaredMethods();
        String[] expected = {"publicMethod()", "protectedMethod()", "defaultMethod()", "privateMethod()"};
        String[] actual = ClassInfo.getData(methods);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithConstructors() throws NoSuchMethodException {
        Constructor<?>[] constructors = TestClass.class.getDeclaredConstructors();
        String[] expected = {"TestClass()", "TestClass(int)", "TestClass(String)"};
        String[] actual = ClassInfo.getData(constructors);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithMixedMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field[] fields = TestClass.class.getDeclaredFields();
        Method[] methods = TestClass.class.getDeclaredMethods();
        Constructor<?>[] constructors = TestClass.class.getDeclaredConstructors();
        Member[] mixedMembers = new Member[fields.length + methods.length + constructors.length];
        System.arraycopy(fields, 0, mixedMembers, 0, fields.length);
        System.arraycopy(methods, 0, mixedMembers, fields.length, methods.length);
        System.arraycopy(constructors, 0, mixedMembers, fields.length + methods.length, constructors.length);
        String[] expected = {
                "defaultField", "privateField", "protectedField", "publicField",
                "defaultMethod()", "privateMethod()", "protectedMethod()", "publicMethod()",
                "TestClass()", "TestClass(int)", "TestClass(String)"
        };
        String[] actual = ClassInfo.getData(mixedMembers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithNull() {
        Member[] members = null;
        String[] expected = {};
        String[] actual = ClassInfo.getData(members);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithEmptyArray() {
        Member[] members = new Member[0];
        String[] expected = {};
        String[] actual = ClassInfo.getData(members);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithStaticMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field[] fields = TestClass.class.getDeclaredFields();
        Method[] methods = TestClass.class.getDeclaredMethods();
        Constructor<?>[] constructors = TestClass.class.getDeclaredConstructors();
        Member[] mixedMembers = new Member[fields.length + methods.length + constructors.length];
        System.arraycopy(fields, 0, mixedMembers, 0, fields.length);
        System.arraycopy(methods, 0, mixedMembers, fields.length, methods.length);
        System.arraycopy(constructors, 0, mixedMembers, fields.length + methods.length, constructors.length);
        for (Member member : mixedMembers) {
            if (Modifier.isStatic(member.getModifiers())) {
                member.setAccessible(true);
            }
        }
        String[] expected = {
                "defaultField", "privateField", "protectedField", "publicField",
                "defaultMethod()", "privateMethod()", "protectedMethod()", "publicMethod()",
                "TestClass()", "TestClass(int)", "TestClass(String)"
        };
        String[] actual = ClassInfo.getData(mixedMembers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithNonPublicMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field[] fields = TestClass.class.getDeclaredFields();
        Method[] methods = TestClass.class.getDeclaredMethods();
        Constructor<?>[] constructors = TestClass.class.getDeclaredConstructors();
        Member[] mixedMembers = new Member[fields.length + methods.length + constructors.length];
        System.arraycopy(fields, 0, mixedMembers, 0, fields.length);
        System.arraycopy(methods, 0, mixedMembers, fields.length, methods.length);
        System.arraycopy(constructors, 0, mixedMembers, fields.length + methods.length, constructors.length);
        for (Member member : mixedMembers) {
            if (!Modifier.isPublic(member.getModifiers())) {
                member.setAccessible(true);
            }
        }
        String[] expected = {
                "defaultField", "privateField", "protectedField", "publicField",
                "defaultMethod()", "privateMethod()", "protectedMethod()", "publicMethod()",
                "TestClass()", "TestClass(int)", "TestClass(String)"
        };
        String[] actual = ClassInfo.getData(mixedMembers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithInheritedMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field[] fields = TestSubclass.class.getDeclaredFields();
        Method[] methods = TestSubclass.class.getDeclaredMethods();
        Constructor<?>[] constructors = TestSubclass.class.getDeclaredConstructors();
        Member[] mixedMembers = new Member[fields.length + methods.length + constructors.length];
        System.arraycopy(fields, 0, mixedMembers, 0, fields.length);
        System.arraycopy(methods, 0, mixedMembers, fields.length, methods.length);
        System.arraycopy(constructors, 0, mixedMembers, fields.length + methods.length, constructors.length);
        String[] expected = {
                "defaultField", "privateField", "protectedField", "publicField",
                "defaultMethod()", "privateMethod()", "protectedMethod()", "publicMethod()",
                "TestClass()", "TestClass(int)", "TestClass(String)",
                "TestSubclass()", "TestSubclass(int)", "TestSubclass(String)"
        };
        String[] actual = ClassInfo.getData(mixedMembers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetDataWithInheritedNonPublicMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field[] fields = TestSubclass.class.getDeclaredFields();
        Method[] methods = TestSubclass.class.getDeclaredMethods();
        Constructor<?>[] constructors = TestSubclass.class.getDeclaredConstructors();
        Member[] mixedMembers = new Member[fields.length + methods.length + constructors.length];
        System.arraycopy(fields, 0, mixedMembers, 0, fields.length);
        System.arraycopy(methods, 0, mixedMembers, fields.length, methods.length);
        System.arraycopy(constructors, 0, mixedMembers, fields.length + methods.length, constructors.length);
        for (Member member : mixedMembers) {
            if (!Modifier.isPublic(member.getModifiers())) {
                member.setAccessible(true);
            }
        }
        String[] expected = {
                "defaultField", "privateField", "protectedField", "publicField",
                "defaultMethod()", "privateMethod()", "protectedMethod()", "publicMethod()",
                "TestClass()", "TestClass(int)", "TestClass(String)",
                "TestSubclass()", "TestSubclass(int)", "TestSubclass(String)"
        };
        String[] actual = ClassInfo.getData(mixedMembers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    private static class TestClass {
        public int publicField;
        protected int protectedField;
        int defaultField;
        private int privateField;

        public void publicMethod() {}
        protected void protectedMethod() {}
        void defaultMethod() {}
        private void privateMethod() {}

        public TestClass() {}
        public TestClass(int i) {}
        public TestClass(String s) {}
    }

    private static class TestSubclass extends TestClass {
        public TestSubclass() {}
        public TestSubclass(int i) {}
        public TestSubclass(String s) {}
    }
}