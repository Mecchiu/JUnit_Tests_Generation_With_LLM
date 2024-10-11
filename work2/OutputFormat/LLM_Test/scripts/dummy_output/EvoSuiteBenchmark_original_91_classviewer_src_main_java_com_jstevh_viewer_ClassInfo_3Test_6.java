// ClassInfo_3Test.java
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
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {
		
	/**
	 * Main method for getting class information.
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {

    ClassInfo_3Test test = new ClassInfo_3Test();

		String c1 = test.new ClassInfo_3("Hello World");
		String c2 = test.new ClassInfo_3(String.class);
		String c3 = test.new ClassInfo_3(new String[] {"Hello World"});
		String c4 = test.new ClassInfo_3("Hello World", "Good class");

    System.err.println(c1);
        System.err.println(c2.toString());
        System.err.println(c3);
        System.err.println(c4);

	}

	/**
	* Prints out class information
	*/
	public void printClassInfo() {
    ClassInfo_3Test.printClassInfo();

        System.err.println("\n");
}
}