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
		 *  testClassInfo is an alternative to testClassInfo
		 *  because it is defined in a subclass.
		 */
 	static class testClassE extends ClassE {
		/**
		 *  returns the Class object of a {@link ClassInfo_5Test#getData(Member[])}
		 *  method
		 *  and the index it was searched in.
		 *
		 *  @returns the found member
		 */
		public Class getClass() {
			return ClassName_5Test.class;
		}
	}

	public static class ClassInfo_5TestClass extends ClassInfo {
		public testClassE getClassE() {
			return this.data[0];
		}
		public  Member[]getData(String[]array1) {
			return array1;
		}
	}


}