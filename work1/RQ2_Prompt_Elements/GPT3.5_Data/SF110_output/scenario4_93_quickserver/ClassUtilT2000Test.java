// Here's the source code for ClassUtil.java

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    private static Logger logger = Logger.getLogger(ClassUtil.class.getName());

    /**
     * Tries to load the classes present in the array
     * passed has second parameter from
     * the ClassLoader passed has first parameter.
     * Returns the HashMap of all the classed successfully loaded.
     * @param classLoader ClassLoader used to find the class
     * @param classes[] array of classes to load.
     */
    public static Map<String, Class<?>> loadClass(ClassLoader classLoader, String[] classNames) throws Exception {
        Map<String, Class<?>> loadedClasses = new HashMap<String, Class<?>>();
        for (String className : classNames) {
            Class<?> loadedClass = classLoader.loadClass(className);
            loadedClasses.put(className, loadedClass);
        }
        return loadedClasses;
    }

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("The specified path is not a directory: " + jarDir);
        }
        List<URL> urls = new ArrayList<URL>();
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith(".jar")) {
                urls.add(file.toURI().toURL());
            }
        }
        URL[] urlArray = urls.toArray(new URL[urls.size()]);
        return new URLClassLoader(urlArray);
    }

    /**
     * Returns the ClassLoader to a jar
     * @since 1.3.3
     */
    public static ClassLoader getClassLoaderFromJar(String jarPath) throws Exception {
        URL url = new File(jarPath).toURI().toURL();
        return new URLClassLoader(new URL[] { url });
    }

    /**
     * Returns the ClassLoader
     * @since 1.3.3
     */
    public static ClassLoader getClassLoader(String path) throws Exception {
        File file = new File(path);
        if (file.isDirectory()) {
            return new URLClassLoader(new URL[] { file.toURI().toURL() });
        } else {
            return getClassLoaderFromJar(path);
        }
    }
}

// And here's the source code for ClassUtilTest.java

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {

    @Test
    void testGetClassLoaderFromJars() throws Exception {
        String jarDir = "test/jars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderFromJarsWithInvalidPath() {
        String jarDir = "invalid/path";
        assertThrows(IllegalArgumentException.class, () -> {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        });
    }

    @Test
    void testGetClassLoaderFromJarsWithNoJars() throws Exception {
        String jarDir = "test/nojars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderFromJarsWithOneJar() throws Exception {
        String jarDir = "test/onejar";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderFromJarsWithMultipleJars() throws Exception {
        String jarDir = "test/multiplejars";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJars(jarDir);
        assertNotNull(classLoader, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderFromJar() throws Exception {
        String jarPath = "test/jars/test.jar";
        ClassLoader classLoader = ClassUtil.getClassLoaderFromJar(jarPath);
        assertNotNull(classLoader, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderFromJarWithInvalidPath() {
        String jarPath = "invalid/path/test.jar";
        assertThrows(FileNotFoundException.class, () -> {
            ClassLoader classLoader = ClassUtil.getClassLoaderFromJar(jarPath);
        });
    }

    @Test
    void testGetClassLoader() throws Exception {
        String jarDir = "test/jars";
        String jarPath = "test/jars/test.jar";
        String dirPath = "test/nojars";
        ClassLoader classLoader1 = ClassUtil.getClassLoaderFromJars(jarDir);
        ClassLoader classLoader2 = ClassUtil.getClassLoaderFromJar(jarPath);
        ClassLoader classLoader3 = ClassUtil.getClassLoader(dirPath);
        assertNotNull(classLoader1, "ClassLoader should not be null");
        assertNotNull(classLoader2, "ClassLoader should not be null");
        assertNotNull(classLoader3, "ClassLoader should not be null");
    }

    @Test
    void testGetClassLoaderWithInvalidPath() {
        String invalidPath = "invalid/path";
        assertThrows(IllegalArgumentException.class, () -> {
            ClassLoader classLoader = ClassUtil.getClassLoader(invalidPath);
        });
    }
}