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
		
	@Test
    public void testGetClassLoaderFromJars() throws Exception {
		
		URLClassLoader urlClassLoader = getClassLoaderFromJars("/");
		ClassLoader aClassLoader = urlClassLoader.getParent();
		
		//System.out.println("Loaded " + urlClassLoader.getClass().getName());
		
		// First load class from the jar, 
        // then load again from the classpath with the jar classloader.
        
		Class aClass = urlClassLoader.loadClass("org.quickserver.jaxws.TestClass");
        ClassLoader aClassLoaderWithJar = urlClassLoader.getParent();
        ClassLoader aClassLoaderWithNoJar = aClassLoader.newChild(aClassLoaderWithJar.getResource("JarUtil.class").getFile());

        File jarFile = new File(jarDir);
        
        URL jarUrl = jarFile.toURI().toURL();

        ClassUtil.getClassLoaderFromJars("/");
        
        //System.out.println("Loading Class from File:");
        //System.out.println(jarFile);
        //System.out.println("Using ClassLoader:");
        //System.out.println(aClass);
        //System.out.println("Loaded " + aClassLoaderWithJar.getClass().getName());

        jarFile.delete();

        aClassLoader = aClassLoaderWithNoJar.getParent();
        
        //System.out.println("Used ClassLoader:");
        //System.out.println(aClassLoader.getClass().getName());
        
        urlClassLoader = getClassLoaderFromJars("");
		
		//System.out.println("Loaded " + urlClassLoader.getClass().getName());
		
		
		// test loadClass from a jar
		//System.out.println("Testing load class from jar");
		URL jarLocation = jarFile.toURI().toURL();
		System.out.println("TestClass from jar:");
		System.out.println(jarUrl);
		URL aJarUrl = jarUrl.openStream();
		System.out.println("TestClass from jar (stream):");
		
		
		jarFile.delete();
		
		
		aClass = aClassWithNoJars.getClass();
		
		//System.out.println("TestClass from class (no jar):");
		
		
		assertNotNull(aClass);
		
		aClass.getResource("/")
		 .getFile().delete();
		
		/*

		
//
//		System.out.println("Testing loadClass from a location in the class-path");
//		System.out.println("testLoadClassFromJar()");
		
		aClass = aClassWithNoJars.getClass();
		
		//System.out.println("testLoadClassFromJar()");

        urlClassLoader = getClassLoaderFromJars("");
		
//
//       System.out.println("Unable to get class loader from the jar (class-path)");

        assertFalse(urlClassLoader.getClass().getName().startsWith("quickserver"));
        
        //System.out.println("Unable to get parent class loader");
        
        
//		System.out.println("Unable to get parent class loader from jar (location)");
		 */

        jarFile.delete();

        // the same as the above should work
        urlClassLoader = getClassLoaderFromJars("jar");
        //ClassLoader javaClassLoader = urlClassLoader.getParent();

        

		//System.out.println("Done With the test");
    }
    
    
	static URLClassLoader getClassLoaderFromJars(String jar) throws Exception{
		
		// first, load from jars directory
        // then from classpath (without jar)
		
		/*
        
		





		


		

		URLClassLoader urlClassLoader = urlClassLoaderFromJar.loadClass("quickserver.jaxws.TestClassImpl").getClassLoader();

		File jarFile = new File(jar);
		
		//System.out.println("Loading class from File:");
		//System.out.println(jarFile);
		//System.out.println("Using ClassLoader:");
		//System.out.println(urlClassLoader.getClass().getName());

		
		File jarDir = jarFile.getParentFile();
		
		URL url = jarFile.toURI().toURL();

		urlClassLoader = jarClassLoaderFromJar.getParent();

        URL aJarLocation = urlClassLoader.getParent().getParent().getResource(jar).toURI().toURL();
        
        url = aJarLocation.toURL();
		
		*/

		urlClassLoader = getParent();
		
		return urlClassLoader;

	}

    private static ClassLoader getParent()throws Exception{

//        URLClassLoader urlClassLoader = getParent();    // ajar

	URLClassLoader urlClassLoader = getClassLoaderFromJars("JarUtil");

	return urlClassLoader.getParent();
    }

}