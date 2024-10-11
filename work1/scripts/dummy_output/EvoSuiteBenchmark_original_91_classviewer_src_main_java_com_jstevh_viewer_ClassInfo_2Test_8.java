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
		/**
  * Constructor for the test class.
  */
	  public ClassInfo_2Test() {
  }

  /**
   * Tests a given string of methods and prints out with System.out.println after the test is complete.
   *
   * @param  methodName     name of the method
   * @param  index          String array with names of methods to search.
   */
  protected void testMethod(String methodName, String index) throws Exception {
    Method[] methods = ClassInfo.class.getMethods();
    Class[] classes = ClassInfo.class.getClasses();
    ClassInfo c = new ClassInfo(ClassInfo.c);                          // Instantiate new ClassInfo

    ClassInfo.printArray(classes);                                   // Prints out classes found
    ClassInfo.printArray(methods);                                   // Prints out methods found

    Class c2 = null;
}
}