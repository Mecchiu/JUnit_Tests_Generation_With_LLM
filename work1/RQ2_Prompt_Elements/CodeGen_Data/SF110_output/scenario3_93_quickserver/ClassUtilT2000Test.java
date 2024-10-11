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

// ClassUtilTest.java
    @Test
    public void testGetClassLoaderFromJars() throws Exception {
        List<File> jarsFileList = new ArrayList<File>();		
		jarsFileList.add(new File("../../src/testdata/quickserver/resources/jars.txt"));		
		assertEquals(getClassLoaderFromJars("."), ClassUtil.getClassLoaderFromJars(jarsFileList));
	}
    
// ClassUtilUtilityTest.java
    @Test
    public void testClassUtils() {
        List<String> expectedList = (new ArrayList<String>() {
                {
                        add("java.io.InputStream");
                        add("java.io.Writer");
                        add("org.quickserver.util.io");
                        add("io.IO");
                }
            });
        assertEquals(expectedList, ClassUtil.getClassUtils().getClasses());
    }

// ClassUtilTest-sourceUnitTests.java
    @Test
    public void testJavaFiles() {
        List<String> expectedList = (new ArrayList<String>());
        expectedList.add("org.quickserver.util.io");

        expectedList = (expectedList.isEmpty()? new ArrayList<String>() {{ append(
                "java.lang.File"); }}) : expectedList.retainAll(Arrays.asList("java.lang.IOException"));
        System.out.println("expectedList:"+expectedList);
        assertEquals(expectedList, ClassUtil.getClassUtils().getFiles());
    }

    @Test
    public void testJavaUrls() {
        List<String> expectedList = (new ArrayList<String>() {
                {
                    add("java.net"); add("java.net.URL"); add("java.net.URI");
                }
            } );
        System.out.println("expectedList:"+expectedList);
        assertEquals(expectedList, ClassUtil.getClassUtils().getUrls()); // The code at least tested is a java.net.URL.
    }
}

//ClassUtilTest-sourceUnitTests.java
    @Test
    public void testJarUtils() {
        List<String> expectedList = (new ArrayList<String>() {
                {
                    add("java.util.jar"); add("java.io.InputStream"); add("java.io.Writer"); add("org.quickserver.util.io");
                    add("io.IO");
                }
            } );
        System.out.println("expectedList:"+expectedList);
        assertEquals(expectedList, ClassUtil.getClassUtils().getExtensions(".jar"));
    }

    @Test
    public void testJarUrls() {
        List<String> expectedList = (new ArrayList<String>() {
                {
                    add("java.jar"); add("java.io.InputStream"); add("java.io.Writer"); add("org.quickserver.util.io");
                    add("io.IO");
                }
            } );
        System.out.println("expectedList:"+expectedList);
        assertEquals(expectedList, ClassUtil.getClassUtils().getUrls());
    }

// ClassUtilTest-sourceUnitTests.java
    @Test
    public void testUrlUtils() {
        List<String> expectedList = (new ArrayList<String>() {
                {
                    add("org.quickserver.util.io"); add("org.quickserver.util.IO");
                    add("org.quickserver.util.net.URL"); add("java.net.URI");

                    add("java.io.InputStream"); add("java.io.Writer"); add("org.quickserver.util.io");
                }
            } );
        System.out.println("expectedList:"+expectedList);
        assertEquals(expectedList, ClassUtil.getClassUtils().getExtensions(".uri"));
    }
}
