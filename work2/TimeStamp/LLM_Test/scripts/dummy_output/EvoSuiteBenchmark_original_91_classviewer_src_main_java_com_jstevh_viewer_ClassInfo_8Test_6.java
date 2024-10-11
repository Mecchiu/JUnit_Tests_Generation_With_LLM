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
		* The name of method that is called when trying/checking for methods
		* with name.
		*/
		public final String methodsThatFetchData = "isSetNameOfMethodThatFetchData";

		/**
		* The name of method that is called when trying/checking for methods
		* with different name.
		*/
		public final String methodsThatCompare = "isSetNameOfMethodThatCompare";

		/**
		* The class name of method that is called when trying/checking for methods
		* with name.
		*/
		public final String methodsThatCompareWithName = "isSetNameOfMethodThatCompareWithName";

		/**
		* The class name of method returned by this.
		*/
		public final String foundMethodOnClassThatReturns = "foundMethodReturnedByThis";

		/**
		* The number of objects this method is called on.
		*/
		public static final int methodOnObjectsThatCountOf = "objectOnObjectsThatCountOf";

		public ClassInfo_8Test() {
		}

}