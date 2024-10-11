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
		 * Test case for  {@link ClassUtil#getClassLoaderFromJars(String)}.
		 */
		@Test
		void getClassLoaderFromJars() {
                String dir = "../../jars/test-resources/";
		final URL jarUrl = ClassUtilTest.class.getClassLoader().getResource("myDBCollectionJars");
		assertNotNull(jarUrl);
                System.out.println("jarUrl = " + jarUrl);
		ClassLoader classLoader = null;

		try {
			classLoader = getClassLoaderFromJars(dir);
		} catch (Exception ex) {
			System.out.println("ClassUtilTest.getClassLoaderFromJars: " + ex.getMessage());
		}
		ClassLoader loader = getClassLoaderFromJars(dir);
		assertTrue(loader == classLoader);
		}
	}