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
		/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJars(String)} method returns the
	 * ClassLoader from the JARs present in the {@link ClassUtil#getClassLoaderFromJars(String)} method.
	*/
  @Test
  public void testClassLoaderFromJars() throws Exception {
    assertEquals("The Classloader returned from the getClassLoaderFromJars method does not
	* match with the ClassLoader returned from getSystemClassLoader",
	getClassLoaderFromJars("/bin/jni"), ClassUtil.getClassLoaderFromJars("/bin/jni"));
  }

	/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJar(String)} method returns the
	 * ClassLoader as it was passed in the constructor of the ClassUtil.
	*/
  @Test
  public void testGetSystemClassLoaderFromJar() throws Exception {
    assertEquals("The Classloader returned from the getSystemClassLoaderFromJar method does not
	* match with the ClassLoader returned from getClassLoaderFromJar",
	getClassLoaderFromJar(""), ClassUtil.getClassLoaderFromJar(""));
  }
	/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJar(String)} method returns none if an exception is caught.
	*/
  @Test(expected = NullPointerException.class)
  public void testGetSystemClassLoaderNullJar() throws Exception {
    assertEquals("The Classloader returned from the getClassLoaderFromJar(String) method does not
	* match with the ClassLoader returned from getClassLoaderFromJar(String) throws NullPointerException",
	getClassLoaderFromJar(""), ClassUtil.getClassLoaderFromJar(null));
  }

	/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJar(String)} method returns null if the jar does not contain
	 * any class loader.
	*/
  @Test(expected = NullPointerException.class)
  public void testGetClassLoaderFromJarNonJar() throws Exception {
    ClassLoader classLoader = ClassUtil.getClassLoaderFromJar("Non-Jar/");
    assertNull(classLoader);
  }

	/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJar(String)} method returns the ClassLoader
	 * contained in the jar, not the ClassLoader returned from the jar itself.
	*/
  @Test(expected = ClassNotFoundException.class)
  public void testClassLoaderFromJarJarIsNotInJar() throws Exception {
    ClassLoader classLoaders = ClassUtil.getClassLoaderFromJar("NoJar/Non-Class/");
    assertEquals("The Classloader returned from the classLoaderFromJar method does not 
	* match the ClassLoader returned from the classLoaderFromJar(String) method",
    getClassLoaderFromJar("NoJar/Non-Class/"), classLoaders);
  }

	/** This method tests if the loader returned from the {@link ClassUtil#getClassLoaderFromJar(String)} method returns the ClassLoader
	 * contained in the jar, but the ClassLoader returned from the jar itself.
	* A ClassLoader which has been made by the ClassLoaderFromJar method for this class under the hood has
	*/
  @Test(expected = ClassNotFoundException.class)
  public void testClassLoaderFromJarClassLoaderIsNotInJar() throws Exception {
    ClassLoader classLoaders = ClassUtil.getClassLoaderFromJar("NoJar/Class/");
    assertEquals("The Classloader returned from the classLoaderFromJar method does not 
	* match the ClassLoader returned from the classLoaderFromJar(String) method",
    getClassLoaderFromJar("NoJar/Class/"), classLoaders);
  }

  // ClassUtilTest.java
}