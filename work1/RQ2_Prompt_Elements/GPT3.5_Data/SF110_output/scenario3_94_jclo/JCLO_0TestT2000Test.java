// Here's an example implementation of the JCLO class and a test class for it:

// JCLO.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

public class JCLO {

    private Object object;

    public JCLO(Object object) {
        this.object = object;
    }

    /**
     * Get the current value of the variable in the object
     *
     * @param key the variable name
     * @return an Object with the value
     */
    public Object getValue(String key) throws NoSuchFieldException, IllegalAccessException {
        Field field = object.getClass().getDeclaredField(key);
        field.setAccessible(true);
        return field.get(object);
    }
}

// JCLO_0Test.java
package edu.mscd.cs.jclo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {

    private static class TestObject {
        private int intValue = 42;
        private String stringValue = "Hello, world!";
        private boolean booleanValue = true;
    }

    @Test
    void testGetIntValue() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        assertEquals(42, jclo.getValue("intValue"));
    }

    @Test
    void testGetStringValue() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        assertEquals("Hello, world!", jclo.getValue("stringValue"));
    }

    @Test
    void testGetBooleanValue() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        assertEquals(true, jclo.getValue("booleanValue"));
    }

    @Test
    void testGetNonexistentField() {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        assertThrows(NoSuchFieldException.class, () -> jclo.getValue("nonexistentField"));
    }

    @Test
    void testGetPrivateField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        Field field = testObject.getClass().getDeclaredField("intValue");
        field.setAccessible(true);
        assertEquals(field.get(testObject), jclo.getValue("intValue"));
    }

    @Test
    void testGetStaticField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        Field field = testObject.getClass().getDeclaredField("stringValue");
        field.setAccessible(true);
        assertEquals(field.get(null), jclo.getValue("stringValue"));
    }

    @Test
    void testGetFinalField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        JCLO jclo = new JCLO(testObject);
        Field field = testObject.getClass().getDeclaredField("booleanValue");
        field.setAccessible(true);
        assertEquals(field.get(testObject), jclo.getValue("booleanValue"));
    }

    @Test
    void testGetArrayField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        int[] intArray = {1, 2, 3};
        testObject.intValue = intArray;
        JCLO jclo = new JCLO(testObject);
        assertArrayEquals(intArray, (int[]) jclo.getValue("intValue"));
    }

    @Test
    void testGetFinalArrayField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        final int[] intArray = {1, 2, 3};
        testObject.intValue = intArray;
        JCLO jclo = new JCLO(testObject);
        assertArrayEquals(intArray, (int[]) jclo.getValue("intValue"));
    }

    @Test
    void testGetStaticArrayField() throws NoSuchFieldException, IllegalAccessException {
        TestObject testObject = new TestObject();
        final int[] intArray = {1, 2, 3};
        TestObject.intValue = intArray;
        JCLO jclo = new JCLO(testObject);
        assertArrayEquals(intArray, (int[]) jclo.getValue("intValue"));
    }
}