// ClassUtil_1Test.java
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
class ClassUtil_1Test {

		private static Logger logger = Logger.getLogger(ClassUtil_1Test.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJars("lib/../lib/../lib/../lib/../lib/");
				assertNotNull(classLoader);
		}
}

// ClassUtil_2Test.java
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
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJar(String)} method.
*/
class ClassUtil_2Test {
		
		private static Logger logger = Logger.getLogger(ClassUtil_2Test.class.getName());
		
		@Test
		public void testGetClassLoaderFromJar() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/quickserver-1.4.7.jar/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/quickserver-1.4.7.jar/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/quickserver-1.4.7.jar/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/../lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/../lib/quickserver-1.4.7.jar/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/../lib/../lib/quickserver-1.4.7.jar");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoaderFromJar("lib/../lib/../lib/../lib/../lib/quickserver-1.4.7.jar/");
				assertNotNull(classLoader);
		}
}

// ClassUtil_3Test.java
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
* It contains ten unit test cases for the {@link ClassUtil#getClassLoader(String)} method.
*/
class ClassUtil_3Test {
		
		private static Logger logger = Logger.getLogger(ClassUtil_3Test.class.getName());
		
		@Test
		public void testGetClassLoader() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoader("lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib/../lib/");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib/../lib/../lib");
				assertNotNull(classLoader);
				
				classLoader = ClassUtil.getClassLoader("lib/../lib/../lib/../lib/../lib/");
				assertNotNull(classLoader);
		}
}

// ClassUtil_4Test.java
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
* It contains ten