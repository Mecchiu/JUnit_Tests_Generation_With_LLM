// Here's an example implementation of the ClassInfo_5Test class with ten unit test cases for the getData() method:

package com.jstevh.viewer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfo_5Test {

    @Test
    void testGetDataWithNull() {
        String[] result = ClassInfo.getData(null);
        assertNull(result);
    }

    @Test
    void testGetDataWithEmptyArray() {
        String[] result = ClassInfo.getData(new Member[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    void testGetDataWithFields() throws NoSuchFieldException {
        Field[] fields = MyClass.class.getDeclaredFields();
        String[] result = ClassInfo.getData(fields);
        assertNotNull(result);
        assertEquals(fields.length, result.length);
        for (int i = 0; i < fields.length; i++) {
            assertTrue(result[i].contains(fields[i].getName()));
            assertTrue(result[i].contains(fields[i].getType().getSimpleName()));
            assertTrue(Modifier.toString(fields[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithMethods() throws NoSuchMethodException {
        Method[] methods = MyClass.class.getDeclaredMethods();
        String[] result = ClassInfo.getData(methods);
        assertNotNull(result);
        assertEquals(methods.length, result.length);
        for (int i = 0; i < methods.length; i++) {
            assertTrue(result[i].contains(methods[i].getName()));
            assertTrue(result[i].contains(methods[i].getReturnType().getSimpleName()));
            assertTrue(Modifier.toString(methods[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithConstructors() throws NoSuchMethodException {
        Constructor<?>[] constructors = MyClass.class.getDeclaredConstructors();
        String[] result = ClassInfo.getData(constructors);
        assertNotNull(result);
        assertEquals(constructors.length, result.length);
        for (int i = 0; i < constructors.length; i++) {
            assertTrue(result[i].contains(constructors[i].getName()));
            assertTrue(Modifier.toString(constructors[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithMixedMembers() throws NoSuchFieldException, NoSuchMethodException {
        List<Member> members = new ArrayList<>();
        members.add(MyClass.class.getDeclaredField("field1"));
        members.add(MyClass.class.getDeclaredMethod("method1"));
        members.add(MyClass.class.getDeclaredConstructor());
        String[] result = ClassInfo.getData(members.toArray(new Member[0]));
        assertNotNull(result);
        assertEquals(members.size(), result.length);
        for (int i = 0; i < members.size(); i++) {
            assertTrue(result[i].contains(members.get(i).getName()));
            assertTrue(Modifier.toString(members.get(i).getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithInheritedFields() throws NoSuchFieldException {
        Field[] fields = MySubclass.class.getDeclaredFields();
        String[] result = ClassInfo.getData(fields);
        assertNotNull(result);
        assertEquals(fields.length, result.length);
        for (int i = 0; i < fields.length; i++) {
            assertTrue(result[i].contains(fields[i].getName()));
            assertTrue(result[i].contains(fields[i].getType().getSimpleName()));
            assertTrue(Modifier.toString(fields[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithInheritedMethods() throws NoSuchMethodException {
        Method[] methods = MySubclass.class.getDeclaredMethods();
        String[] result = ClassInfo.getData(methods);
        assertNotNull(result);
        assertEquals(methods.length, result.length);
        for (int i = 0; i < methods.length; i++) {
            assertTrue(result[i].contains(methods[i].getName()));
            assertTrue(result[i].contains(methods[i].getReturnType().getSimpleName()));
            assertTrue(Modifier.toString(methods[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithInheritedConstructors() throws NoSuchMethodException {
        Constructor<?>[] constructors = MySubclass.class.getDeclaredConstructors();
        String[] result = ClassInfo.getData(constructors);
        assertNotNull(result);
        assertEquals(constructors.length, result.length);
        for (int i = 0; i < constructors.length; i++) {
            assertTrue(result[i].contains(constructors[i].getName()));
            assertTrue(Modifier.toString(constructors[i].getModifiers()).contains(result[i]));
        }
    }

    @Test
    void testGetDataWithPrivateMembers() throws NoSuchFieldException, NoSuchMethodException {
        Field privateField = MyClass.class.getDeclaredField("privateField");
        Method privateMethod = MyClass.class.getDeclaredMethod("privateMethod");
        Constructor<?> privateConstructor = MyClass.class.getDeclaredConstructor(int.class);
        List<Member> members = new ArrayList<>();
        members.add(privateField);
        members.add(privateMethod);
        members.add(privateConstructor);
        String[] result = ClassInfo.getData(members.toArray(new Member[0]));
        assertNotNull(result);
        assertEquals(members.size(), result.length);
        for (int i = 0; i < members.size(); i++) {
            assertTrue(result[i].contains(members.get(i).getName()));
            assertTrue(Modifier.toString(members.get(i).getModifiers()).contains(result[i]));
        }
    }

    private static class MyClass {
        public int field1;
        private String privateField;
        public MyClass() {}
        public MyClass(int arg) {}
        public void method1() {}
        private void privateMethod() {}
    }

    private static class MySubclass extends MyClass {
        public int field2;
        public MySubclass() {}
        public void method2() {}
    }
}