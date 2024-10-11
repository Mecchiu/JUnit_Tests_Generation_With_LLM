// Here's an example of how you can test the ClassInfo class using JUnit 5:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfoTest {

    @Test
    void testGetDataWithEmptyArray() {
        Class[] classes = new Class[0];
        assertNull(ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithSingleClass() {
        Class[] classes = {String.class};
        String[] expected = {"java.lang.String"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithMultipleClasses() {
        Class[] classes = {String.class, Integer.class, Double.class};
        String[] expected = {"java.lang.String", "java.lang.Integer", "java.lang.Double"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithPrimitiveTypes() {
        Class[] classes = {int.class, double.class, boolean.class};
        String[] expected = {"int", "double", "boolean"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithArrayTypes() {
        Class[] classes = {String[].class, int[][].class};
        String[] expected = {"[Ljava.lang.String;", "[[I"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithInnerClasses() {
        Class[] classes = {ClassInfo.class, ClassInfo.InnerClass.class};
        String[] expected = {"com.jstevh.viewer.ClassInfo", "com.jstevh.viewer.ClassInfo$InnerClass"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithInterfaces() {
        Class[] classes = {List.class, Set.class};
        String[] expected = {"java.util.List", "java.util.Set"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithAnonymousClasses() {
        Class[] classes = {new Object() {}.getClass()};
        String[] expected = {"com.jstevh.viewer.ClassInfoTest$1"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithLocalClasses() {
        class LocalClass {}
        Class[] classes = {LocalClass.class};
        String[] expected = {"com.jstevh.viewer.ClassInfoTest$1LocalClass"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    @Test
    void testGetDataWithMemberClasses() {
        Class[] classes = {ClassInfo.MemberClass.class};
        String[] expected = {"com.jstevh.viewer.ClassInfo$MemberClass"};
        assertArrayEquals(expected, ClassInfo.getData(classes));
    }

    static class InnerClass {}
    class MemberClass {}
}