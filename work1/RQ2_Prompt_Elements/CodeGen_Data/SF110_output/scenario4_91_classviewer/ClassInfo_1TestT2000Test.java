// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {

	/**
	 * Returns a Class object for the current Class name
	 * at creation time.
	 */
	public Class getClassForName(String aClassName) {
		
		return Class.forName(aClassName, false, Thread.currentThread().getContextClassLoader() );
	}
	
	/**
	 * Prints out the class info with System.out.println.
	 */
	public void printClassInfo() {
		
		System.out.println("ClassInfo_1Test.printClassInfo() is called");
	}
}

// ClassInfo_2Test.java

class ClassInfo_2Test {
	
	/**
	 * Returns a Class object for the current Class name
	 * at creation time.
	 */
	public Class getClassForName(String aClassName) {
		
		return Class.forName(aClassName, false, Thread.currentThread().getContextClassLoader() );
	}
}
