// ClassInfo_7Test.java
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
* It contains one unit test case for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {
		
  private static final String PACKAGE = "com.jstevh.viewer";
  private static final String CONSTRUCTOR = "JViewerButton";
  private static final String NAME = PACKAGE + "." + CONSTRUCTOR;
  
 /**
 * Main method of the unit test. Prints out and test the information of the
 * instance of the ClassInfo class.
 *
 * @throws Exception If anything happens during the instance retrieval.
 */
  public static void main(String[] args) throws Exception {
    //TODO: Add in the methods that can be tested if there are any.
    ClassFileWriter c = new ClassFileWriter(args);
    MethodInfo mi = c.getNextMethod();
    System.out.println(mi);

	ClassInfo instance = new ClassInfo(NAME);

	MethodData p0 = c.getNextMethod();
	MethodData p1 = c.getNextMethod();
	MethodData p2 = c.getNextMethod();
	MethodData p3 = c.getNextMethod();
}
}