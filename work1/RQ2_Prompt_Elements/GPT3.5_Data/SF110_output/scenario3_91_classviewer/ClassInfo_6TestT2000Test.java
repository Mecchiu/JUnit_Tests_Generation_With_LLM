Here's an example implementation of the `ClassInfo` class with the `getData` method:

```java
// ClassInfo.java
package com.jstevh.viewer;

import java.lang.reflect.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Takes an array of Class objects and gets names from toString().
     *
     * @param classes array of Class objects
     * @return string array of names
     */
    public static String[] getData(Class<?>[] classes) {
        String[] names = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            names[i] = classes[i].toString();
        }
        return names;
    }
}
```

And here's an example implementation of the `ClassInfo_6Test` class with ten unit test cases for the `getData` method:

```java
// ClassInfo_6Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {

    @Test
    void testEmptyArray() {
        String[] result = ClassInfo.getData(new Class<?>[0]);
        assertEquals(0, result.length);
    }

    @Test
    void testSingleClass() {
        String[] result = ClassInfo.getData(new Class<?>[] {String.class});
        assertEquals(1, result.length);
        assertEquals("class java.lang.String", result[0]);
    }

    @Test
    void testMultipleClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {String.class, Integer.class, Double.class});
        assertEquals(3, result.length);
        assertEquals("class java.lang.String", result[0]);
        assertEquals("class java.lang.Integer", result[1]);
        assertEquals("class java.lang.Double", result[2]);
    }

    @Test
    void testNullClass() {
        String[] result = ClassInfo.getData(new Class<?>[] {null});
        assertEquals(1, result.length);
        assertEquals("null", result[0]);
    }

    @Test
    void testPrimitiveClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {int.class, double.class, boolean.class});
        assertEquals(3, result.length);
        assertEquals("int", result[0]);
        assertEquals("double", result[1]);
        assertEquals("boolean", result[2]);
    }

    @Test
    void testArrayClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {String[].class, int[][].class});
        assertEquals(2, result.length);
        assertEquals("class [Ljava.lang.String;", result[0]);
        assertEquals("class [[I", result[1]);
    }

    @Test
    void testInterfaceClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {List.class, Map.class});
        assertEquals(2, result.length);
        assertEquals("interface java.util.List", result[0]);
        assertEquals("interface java.util.Map", result[1]);
    }

    @Test
    void testInnerClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {OuterClass.InnerClass.class, OuterClass.StaticInnerClass.class});
        assertEquals(2, result.length);
        assertEquals("class com.jstevh.viewer.OuterClass$InnerClass", result[0]);
        assertEquals("class com.jstevh.viewer.OuterClass$StaticInnerClass", result[1]);
    }

    @Test
    void testAnonymousClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {new Object() {}.getClass(), new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        }.getClass()});
        assertEquals(2, result.length);
        assertEquals("class com.jstevh.viewer.ClassInfo_6Test$1", result[0]);
        assertEquals("class com.jstevh.viewer.ClassInfo_6Test$2", result[1]);
    }

    @Test
    void testLocalClasses() {
        class LocalClass {}
        String[] result = ClassInfo.getData(new Class<?>[] {LocalClass.class});
        assertEquals(1, result.length);
        assertEquals("class com.jstevh.viewer.ClassInfo_6Test$LocalClass", result[0]);
    }

    @Test
    void testGenericClasses() {
        String[] result = ClassInfo.getData(new Class<?>[] {List.class, List<String>.class, Map.Entry.class, Map.Entry<String, Integer>.class});
        assertEquals(4, result.length);
        assertEquals("interface java.util.List", result[0]);
        assertEquals("interface java.util.List<java.lang.String>", result[1]);
        assertEquals("interface java.util.Map$Entry", result[2]);
        assertEquals("interface java.util.Map$Entry<java.lang.String, java.lang.Integer>", result[3]);
    }
}
```