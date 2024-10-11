// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
		// ===========================================================
		// Constants
		// ===========================================================
	
	private final static String[] cMethods = new String[] {
	    "public void start()", "public void stop()"
	};
	private final static String[] fndMeths = new String[] {
	    "public static void printFields()", "public static void printMethods()"
	};

    // ===========================================================
    // Public stuff
    // ===========================================================
	/**
	* Returns the number of methods found in the object.
	*
	* @return  number of methods found in the object
	*/
	public int getLength();

	/**
	* Returns a specific method from a given name.
	*
	* @param  pMethod  method name
	*
	* @return      object
	*/
	public Object getData(String pMethod);

}