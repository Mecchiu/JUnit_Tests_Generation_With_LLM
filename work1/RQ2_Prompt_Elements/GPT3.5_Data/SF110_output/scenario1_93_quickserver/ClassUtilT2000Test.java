Here's the source code for the ClassUtilTest class:

```
// ClassUtilTest.java
package org.quickserver.util;

import java.io.File;
import java.net.URLClassLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassUtil}.
 * It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
 */
class ClassUtilTest {

    @Test
    void testGetClassLoaderFromJars() throws Exception {
        String jarDir = "path/to/jars";
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithInvalidDir() {
        assertThrows(Exception.class, () -> {
            String jarDir = "invalid/path/to/jars";
            ClassUtil.getClassLoaderFromJars(jarDir);
        });
    }

    @Test
    void testGetClassLoaderFromJarsWithEmptyDir() {
        assertThrows(Exception.class, () -> {
            String jarDir = "";
            ClassUtil.getClassLoaderFromJars(jarDir);
        });
    }

    @Test
    void testGetClassLoaderFromJarsWithNullDir() {
        assertThrows(Exception.class, () -> {
            String jarDir = null;
            ClassUtil.getClassLoaderFromJars(jarDir);
        });
    }

    @Test
    void testGetClassLoaderFromJarsWithNonJarFiles() {
        assertThrows(Exception.class, () -> {
            String jarDir = "path/to/non-jars";
            ClassUtil.getClassLoaderFromJars(jarDir);
        });
    }

    @Test
    void testGetClassLoaderFromJarsWithOneJarFile() throws Exception {
        String jarDir = "path/to/one-jar";
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithMultipleJarFiles() throws Exception {
        String jarDir = "path/to/multiple-jars";
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithDuplicateJarFiles() throws Exception {
        String jarDir = "path/to/duplicate-jars";
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithNestedJarFiles() throws Exception {
        String jarDir = "path/to/nested-jars";
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }

    @Test
    void testGetClassLoaderFromJarsWithAbsolutePath() throws Exception {
        String jarDir = new File("path/to/jars").getAbsolutePath();
        URLClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader);
    }
}
```

This test class contains ten unit test cases for the `getClassLoaderFromJars` method of the `ClassUtil` class. The test cases cover various scenarios such as invalid directory, empty directory, null directory, non-jar files, one jar file, multiple jar files, duplicate jar files, nested jar files, and absolute path. The `assertThrows` method is used to assert that an exception is thrown in case of an error. The `assertNotNull` method is used to assert that the class loader object is not null in case of success.