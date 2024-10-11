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
		class Dummy {
		}
		
		int max = 0;
		
    static void show(LinkedList<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
			
	/**
	 * Test method of {@link ClassUtil#getClassLoaderFromJars(String)}.
	 */
	@Test
	public void test_getClassLoaderFromJars() throws Exception {
		ClassLoader loader = null;
		
	        //test if getClassLoaderFromJars does not throw Exception	
	        try {
	            loader = getClassLoaderFromJars("/file");	
	            assert (false);
	        } catch (Exception e) {
	            assert (true);
	        }
	        //this case should not throw Exception:

	        //test if getClassLoaderFromJars returns class loaded 
	        Class c = ClassUtil.getClassName("/file");
	        assert (c.getClassLoader().getClassLoader() == loader);
	}
	
	
			
	/**
	 * Test method of {@link ClassUtil#ClassUtilTest()}.
	 */
	@Test
	public void test_ClassUtilTest() {
		ClassUtilTest t = new ClassUtilTest();
		assertTrue(t.getClass() == ClassUtilTest.class);
		assertTrue(ClassUtilTest.class.getClassLoader() == null);
		assertTrue(ClassUtil.class.newInstance() == ClassUtil.class);
	}
	
		
			/**
	 * Test method of {@link ClassUtil#ClassUtilTest(LinkedList)}.
	 */
	@Test
	public void test_ClassUtilTest(LinkedList<String> list) {
		ClassUtilTest t = new ClassUtilTest(list);
	        assertTrue(t.getClass() == ClassUtilTest.class);
		assertTrue(t.getClass().getClassLoader() == null);
		assertTrue(t.getClass().getClassName().toUpperCase().startsWith("TYPE$"));
	}
		
		/**
	 * Test method of {@link ClassUtil#getClassName(String)}.
	 */
	@Test
	public void test_ClassUtilTest_getClassName() throws Exception {
	   String name = ClassUtilTest.class.getName().substring(5);
	   ClassName n = ClassUtil.getClassName(name);
		assert (n.toString().equals(ClassUtilTest.class.getName()));
	}
	
	/**
	 * Test method of {@link ClassUtil#ClassUtil(LinkedList)}.
	 */
	@Test
	public void test_ClassUtilTest_ClassUtil() throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		ClassUtil.ClassUtil(list);
	}
}