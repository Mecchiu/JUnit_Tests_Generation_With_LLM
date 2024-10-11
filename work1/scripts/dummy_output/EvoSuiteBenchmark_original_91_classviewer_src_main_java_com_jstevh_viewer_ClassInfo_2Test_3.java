// ClassInfo_2Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
		//@ requires c == null^;
		private static final ClassInfo_2Test obj = new ClassInfo_2Test();

		/**
	     * @return {@link ClassInfo's} constructor.
	     */
	    private ClassInfo_2Test() throws ClassNotFoundException {
	        this.c = Class.forName("java.lang.ClassInfo");
	    }

	    @Test public void test1() {
	        String myPackages[] = null;
	        String myClassPackage = "com.jstevh.myClass";
	        //@ nowarn VerifyError;
			myPackages = StringUtils.split(getClass(myClassPackage)
					.toString(true)
					.substring(getClass(myClassPackage).toString(true).lastIndexOf(".") + 1),
					'/');
			//@ assume myPackages!= null;
			assertEquals(myPackages.length, new Integer(0).intValue());
			assertFalse(myPackages.length > 0);
}
}