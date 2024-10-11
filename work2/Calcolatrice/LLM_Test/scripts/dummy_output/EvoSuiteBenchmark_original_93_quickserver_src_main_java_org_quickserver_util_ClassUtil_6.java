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
		private enum Classes {Foo,Bar,FooBar};
		private List<Class> classes;
		private ClassLoader cl;

		/**
		 * The {@link Class#loadClass(String)} method returns class which has not superclass
		 * and has the path on classpath in this parameter.
		 *
		 * @throws ClassNotFoundException if the class cannot be found in classpath
		 */
		@Test
		public void testLoadClassFromJars() throws ClassNotFoundException {
			String javaFile = "org/quickserver/sample/Base.class";
			File file = new File("lib/j2se/Base.class");
			cl = ClassUtil.getClassLoaderFromJars(javaFile);
			File[] classpath = cl.getPath();
			for (File f : classpath) {
				if (f.getName().endsWith(".jar")) {
					try {
						file = new File(f, javaFile);
						f.delete();
						System.out.println(file.getName());
						classes = Files.readAllLines(file.toPath()).stream().collect(Collectors.toList());
						return;
					} catch (Exception ignored) {}
				}
			}
			fail("Cannot find class with path on classpath : " + file.getName());
		}

		@Test
		public void testLoadClassNotFound() throws Exception {
			cl = ClassUtil.getClassLoaderFromJars("");
			classes = Files.readAllLines(cl.getResource("Base.class")).stream().collect(Collectors.toList());
			assertNotNull(classes);
			fail("Cannot find class : ");
		}
};