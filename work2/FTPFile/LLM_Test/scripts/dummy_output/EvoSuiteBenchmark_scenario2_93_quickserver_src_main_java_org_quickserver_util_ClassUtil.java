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
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}