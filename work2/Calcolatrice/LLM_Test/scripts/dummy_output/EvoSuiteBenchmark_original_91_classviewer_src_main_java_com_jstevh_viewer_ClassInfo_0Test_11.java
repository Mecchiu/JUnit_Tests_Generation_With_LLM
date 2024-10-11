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
		/**
		 * Class constructor.
		 */
		public ClassInfo_0Test() {
		}
		/**
		 * Class constructor.
		 * @param pName  name of class
		 */
		public ClassInfo_0Test(String pName) {
		}
		/**
		 * Class constructor.
		 * @param pName  name of class
		 * @param pPackage  package of class
		 */
		public ClassInfo_0Test(String pName, String pPackage) {
		}

		/**
		 * Private method test the constructor.
		 */
		private void test(String pName) {
		}
}

/**
* Class of {@link ClassInfo}.
*/
public class ClassInfo_0 extends ClassInfo {
	public ClassInfo_0(String pName){
		super(pName);
	}
	
	/**
	* Returns the class name.
	*
	* @return  class name
	*/
	String getClassName();
	
	String getSuperClassName();
	
}