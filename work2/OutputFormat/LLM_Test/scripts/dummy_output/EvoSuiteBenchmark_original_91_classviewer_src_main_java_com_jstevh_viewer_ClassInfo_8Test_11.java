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
	 * Prints out data with System.out.println.
	 */
	public static void printClassInfo() {
		System.out.println("ClassInfo class: " + this.getClass());
		System.out.println("Public Methods: " + this.methods());
		System.out.println("Known Packages: " + this.knownPackages());
		System.out.println("Constructors: " + this.cMethods());
		System.out.println("Public Constructors: " + this.fndMethods());
		System.out.println("Found Methods: " + this.getArrayListOfFoundMethods());
		System.out.println("Inherited Methods: " + this.getArrayListOfInheritedMethods());
		System.out.println("Exceptions: " + this.getArrayListOfExceptions());
	}
	
	/**
	 * Prints out all packages.
	 */
	public static void printSomeKnownPackages() {
}
}