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
		
	/**
	   * Constructor for the ClassInfo_7Test class.
	   *
	   * @param  s     string representation of
	   */
    ClassInfo_7Test(String s) throws ClassNotFoundException {
		
		// Get the Class object of our class. As opposed to a public field in Object
		if (this.c == null) {
			this.c = getClass(s);
		}
		
		// Get the array of method names
		this.fndMethods = new String[this.c.getDeclaredMethods().length];
}
}