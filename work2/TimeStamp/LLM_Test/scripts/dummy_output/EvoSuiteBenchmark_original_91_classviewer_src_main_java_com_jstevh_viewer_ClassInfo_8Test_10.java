// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		
	/**
	 * Prints out all the class information with System.out.println.
	 */
	private void printClassInfo();

	/**
	 * Finds a Class object by using its package as a hint.
	 * Returns the matching Class, null if no match found.
	 * Then, it calls getData(index) method.
	 *
	 * @param  index  string array for searching
	 *
	 * @return      Class object for found method
	 */
	Class getClass(String[] index);

	/**
	 * Searches through cMethods, the private array of public methods
	 * for a given string fragment, with a given string index, and searches
	 * on the index for the fragment in them but gets method from cMethods.
	 * Then, it returns null if no match found.
	 * Same as the getClass() method.
	 *
	 * @param  pos  search position in array 0 is first.
	 *
	 * @return   MethodData object with information about method
	 */
}