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
		public static boolean checkNotNull(Object o) {
		    return ((o!= null) && o.getClass().getCanonicalName().equals("java.lang.Object"));
        }
 
	    /**
	    * Test case for method {@link #getClassLoaderFromJars(String)}.
	    */
		@Test
		public void testClassLoaderFromJars(){
			System.out.println("TEST: ClassUtil.getClassLoaderFromJars(String)");
		}
}