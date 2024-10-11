// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		private Class c = javax.swing.WindowConstants.class;



	String className = "";
		String classPackage = "";
		String superClassName = "";
		
		String[] cMethods = {"print()", "print(String)", "print(int[])", "print(java.lang.Object[])"};
		ClassData classData = new ClassData();

		String[] fndMethods = {"getClass()", "getClass(String)", "getClass(int[])", "getClass(java.lang.Object[])"};
		ClassData classData1 = new ClassData();
		
		String[] fndMethods2 = {"getClass()", "getClass(String)", "getClass(int[])", "getClass(java.lang.Object[])"};
		ClassData classData2 = new ClassData();
		
		// Print function returns object
		public String getData(Class[] classArray) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {
}
}