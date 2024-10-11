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
		 * Test of getClassLoaderFromJars method.
		 */
		@Test
		void testGetClassLoaderFromJars() throws Exception {
		logger.config("Tests getClassLoaderFromJars");
		URL[] jarURL = new URL[1];
		ClassLoader loaderA = ClassUtil.getClassLoaderFromJars("classA");
		ClassLoader loaderB = ClassUtil.getClassLoaderFromJars("classB");
		assertEquals(loaderA, loaderB);
		URL[] jarsA = ClassUtil.getJarsInClasspath("org.apache.sling.testing.util.test");
		URL[] jarsB = ClassUtil.getJarsInClasspath("classB");
		assertEquals(jarsA, jarsB);
		}
}
