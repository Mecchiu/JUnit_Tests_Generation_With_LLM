// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
		
	/**
	 * This class includes methods that are expected to be found on a class.
	 * It includes methods found in superclasses and implemented interfaces and
	 * implemented interfaces with same name as the class.
	 * <p>
	 * This class also includes methods of any interfaces that don't extend
	 * either of them. This is to test that the ClassInfo class works
	 * correctly in all cases.
	 * <p>
	 * It is intended to be used for testing in the class level.
	 * <p>
	 * To prevent the assertion errors because of
	 * the different order in which they are put in the class, the following code
	 * is replaced by a try-catch block following the order:
	 * <pre>
	 * ClassInfo_4Test.className = superClassName;
	 * try {
	 * 	ClassInfo_4Test.testGetInterfaces();
	 * } catch(ClassNotFoundException e) {
	 * 	e.printStackTrace();
	 * }
	 * </pre>
	 */
}