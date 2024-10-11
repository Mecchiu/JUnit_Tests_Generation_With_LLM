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
	 * Test method for {@link StringUtil#getClassLoaderFromJars(String)}.
	 */
	@Test
	public void getClassLoaderFromJars()throws Exception {
		// Setup the classLoader to all the jars in the dir passed has 
		// second parameter has parameter with null name
	
		String jarDir = "./dir/";
		ClassLoader classLoader = getClassLoaderFromJars(jarDir);
		ClassLoader classLoader2 = null;

		//Test case for getting ClassLoader from all the JAR files within the jar directory
	
		Set<URL> urls = new HashSet<URL>();
		urls.add(new URL("test/dir/test_file1.jar"));	
		urls.add(new URL("test/dir/test_file2.jar"));
		urls.add(new URL("test/dir/test_file1.jar"));	
		urls.add(new URL("test/dir/test_file3.jar"));
		
		//Test case for getClassLoaderFromJars
		
	  Class.forName("test_class", true,classLoader);
	  

		//This is how we are able to determine the new Classloader from all the files in the directory 
	  // with a null name
		assertEquals(classLoader,classLoader2);
	
	}//Test case for getClassLoaderFromJars
    
}  //Test class of ClassUtilTest