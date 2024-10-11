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
* It contains one unit test case for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		 
    /**
     * This method returns ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param dir path to the directory containing the jars
     * @return a ClassLoader to all the jars present in the
     * directory.
     * @throws Exception if any.
     */
    public static ClassLoader getClassLoaderFromJars (String dir) throws Exception {
        String[] jars = dir.split(File.separator);
        LinkedList<File> jArray = new LinkedList<File>();
        for (String jar : jars) {
            jArray.addAll(IOUtil.readClassesFromJar(jar));
        }

        LinkedList<ClassLoader> loader = new LinkedList<ClassLoader>();
        for (Iterator iterator = jArray.iterator(); iterator.hasNext();) {
            File jar =  (File) iterator.next();
            ClassLoader classLoader=ClassUtil.getClassLoaderFromJars(jar.getAbsolutePath());
            if (classLoader == null) {
                throw new IllegalStateException("ClassLoader is not set");
            }
            if (classLoader instanceof URLClassLoader)
                loader.add(((URLClassLoader) classLoader).getURLClassPath().iterator().next());
        }

        return  new URLClassLoader(loader.toArray( new URL[0] ));
    }

    /**
     * test case for {@link ClassUtil#getClassLoaderFromJars}, where given directory contains jars
     * with classpath elements (jar:jar:jar:file)
     */
    @Test
    public void testWithJars() throws Exception {
        String testDir = "src/test/testClassUtilWithClassLoaderFromJars";
        System.out.println(testDir);
        try {
            getClassLoaderFromJars(testDir);
        } catch (Exception e) {
            System.out.println("GetClassLoaderFromJars failed at ");
            e.printStackTrace();
            fail("Exception getting java class path from the JAR: "+testDir);
        }
    }

    /**
     * test case for {@link ClassUtil#getClassLoaderFromJars}, where given directory contains no classes
     * with classpath elements (jar:file)
     */
    @Test
    public void testNoJars() throws Exception {
        String testDir = "src/test/testClassUtilNoClassLoaderFromJars";
        System.out.println(testDir);
        try {
            getClassLoaderFromJars(testDir);
        } catch (Exception e) {
            System.out.println("GetClassLoaderFromJars failed at ");
            e.printStackTrace();
            fail("Exception getting java class path from a class file");
        }
    }

    public static void main(String args[]) throws Exception {
        ClassUtilTest test = new ClassUtilTest();
        System.out.println("This is the test that is run by the UnitTest framework.");
        test.testWithJars();
        test.testNoJars();
    }
}