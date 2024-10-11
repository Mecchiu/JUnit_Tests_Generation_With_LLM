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
	 * Method for printing out data with System.out.println
	 *
	 * @param args      string array of arguments to print out
	 */
	protected void printArray(String... args) {
		System.out.println(args);
	}
	
	/**
	 * Method for printing out object info with System.out.println
	 *
	 * @param args      string array of arguments to print out
	 */
	protected void printObjectInfo(String... args) {
		Object[] obj = new Object[args.length];
		for (int i=0; i < args.length; i++) {
			obj[i] = args[i];
		}
		printArray(obj, 0);
	}
	
	/**
	 * Main private unit test.
	 *
	 * @return  unittest result, always success
	 */
	private static Integer test(Object[] obj) {
		assertTrue(obj.length > 0 || obj[0]!= null, "Objects empty or null");
		return null;
}
}