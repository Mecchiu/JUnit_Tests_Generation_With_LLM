// Here's an example implementation of the ClassInfo_5Test class with ten unit test cases for the getData method:

package com.jstevh.viewer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassInfo_5Test {

    @Test
    void testGetDataWithNull() {
        String[] data = ClassInfo.getData(null);
        Assertions.assertNull(data);
    }

    @Test
    void testGetDataWithEmptyArray() {
        String[] data = ClassInfo.getData(new Member[0]);
        Assertions.assertNull(data);
    }

    @Test
    void testGetDataWithOnePublicConstructor() throws NoSuchMethodException {
        Constructor<?> constructor = TestClass.class.getConstructor();
        String[] data = ClassInfo.getData(new Member[] { constructor });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("TestClass()"));
    }

    @Test
    void testGetDataWithOnePrivateConstructor() throws NoSuchMethodException {
        Constructor<?> constructor = TestClass.class.getDeclaredConstructor(int.class);
        String[] data = ClassInfo.getData(new Member[] { constructor });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("TestClass(int)"));
        Assertions.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void testGetDataWithTwoConstructors() throws NoSuchMethodException {
        Constructor<?> constructor1 = TestClass.class.getConstructor();
        Constructor<?> constructor2 = TestClass.class.getDeclaredConstructor(int.class);
        String[] data = ClassInfo.getData(new Member[] { constructor1, constructor2 });
        Assertions.assertEquals(2, data.length);
        Assertions.assertTrue(data[0].contains("TestClass()"));
        Assertions.assertTrue(data[1].contains("TestClass(int)"));
    }

    @Test
    void testGetDataWithOnePublicMethod() throws NoSuchMethodException {
        Method method = TestClass.class.getMethod("publicMethod");
        String[] data = ClassInfo.getData(new Member[] { method });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("publicMethod()"));
    }

    @Test
    void testGetDataWithOnePrivateMethod() throws NoSuchMethodException {
        Method method = TestClass.class.getDeclaredMethod("privateMethod");
        String[] data = ClassInfo.getData(new Member[] { method });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("privateMethod()"));
        Assertions.assertTrue(Modifier.isPrivate(method.getModifiers()));
    }

    @Test
    void testGetDataWithTwoMethods() throws NoSuchMethodException {
        Method method1 = TestClass.class.getMethod("publicMethod");
        Method method2 = TestClass.class.getDeclaredMethod("privateMethod");
        String[] data = ClassInfo.getData(new Member[] { method1, method2 });
        Assertions.assertEquals(2, data.length);
        Assertions.assertTrue(data[0].contains("publicMethod()"));
        Assertions.assertTrue(data[1].contains("privateMethod()"));
    }

    @Test
    void testGetDataWithOnePublicField() throws NoSuchFieldException {
        Field field = TestClass.class.getField("publicField");
        String[] data = ClassInfo.getData(new Member[] { field });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("publicField"));
    }

    @Test
    void testGetDataWithOnePrivateField() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("privateField");
        String[] data = ClassInfo.getData(new Member[] { field });
        Assertions.assertEquals(1, data.length);
        Assertions.assertTrue(data[0].contains("privateField"));
        Assertions.assertTrue(Modifier.isPrivate(field.getModifiers()));
    }

    @Test
    void testGetDataWithTwoFields() throws NoSuchFieldException {
        Field field1 = TestClass.class.getField("publicField");
        Field field2 = TestClass.class.getDeclaredField("privateField");
        String[] data = ClassInfo.getData(new Member[] { field1, field2 });
        Assertions.assertEquals(2, data.length);
        Assertions.assertTrue(data[0].contains("publicField"));
        Assertions.assertTrue(data[1].contains("privateField"));
    }

    private static class TestClass {
        public int publicField;
        private int privateField;

        public TestClass() {
        }

        private TestClass(int arg) {
        }

        public void publicMethod() {
        }

        private void privateMethod() {
        }
    }
}