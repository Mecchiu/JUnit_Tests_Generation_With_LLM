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
	 * Gets method info and adds all methods the info
	 * to a list, for test cases.
	 * @param arg0  object that is the first object to add to the list
	 *
	 * @return    void
	 */
	public void printMethods(Object... arg0) { 	
		Object info = ClassInfo.tryClass(arg0[0].getClass().getName());
		List l = ClassInfo.printMethods(new Object[] { arg0[0], info });
		Arrays.sort(l);
		for (int i = 0; i < info.length(); i++)
			System.out.println(i + " -> " + info[i].toString());
	}

	/**
	 * Prints out class info.
	 * @param arg0  ClassInfo object
	 */
	public static void printClassInfo(ClassInfo arg0) { 
}
}