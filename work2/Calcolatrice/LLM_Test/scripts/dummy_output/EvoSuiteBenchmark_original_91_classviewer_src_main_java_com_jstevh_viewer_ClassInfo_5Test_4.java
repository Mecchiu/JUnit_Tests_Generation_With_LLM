// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
		/**
		 * This unit test case uses two Class objects, with no data or 
		 * interfaces but with a single class
		 */
	 private static final String CLASSNAME = "ClassName";

		 /**
	     * Private constructor for Unit test Object class.
	     */
	 private ClassInfo_5Test() {
	 }

	 /**
	 * Private constructor for Class object.
	 * @param c reference to Class object
	 *
	 * @return test case object with default set for Class
	 */
	private static final ClassInfo_5Test withDefault(Class c) {

		return new ClassInfo_5Test();
	 }

	 /**
	  * Return a String array of strings using the
	  * default method that will return the information
	  * in the specified member list.
	  *
	  * @param memberList    member list to inspect
	  *
	  * @return          array of strings
	  */
	private static String[] printMethods(Member[] memberList);
}