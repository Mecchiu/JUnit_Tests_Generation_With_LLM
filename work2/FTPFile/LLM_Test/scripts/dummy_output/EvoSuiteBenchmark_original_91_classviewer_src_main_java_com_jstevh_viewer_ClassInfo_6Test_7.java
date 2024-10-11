// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		/**
     * Tests for the method with string array for which to get class name.
     */
    @Test
    void test01() {
    	findClass("ClassInfo");
    }
	
	/**
	 * Asserts that the data return from {@link ClassInfo#getData(javax.swing.AbstractButton)
	 * getData method} equals to string array.
	 *
	 * @param  strArray  string array to get data
	 */
	public void findClass(String[] strArray) {
		if (strArray == null) {
			throw new NullPointerException("ClassInfo.getData() method can't return null.");
		}
		if (strArray.length!= 2) {
			throw new RuntimeException("Invalid getData method parameter length: " + strArray.length);
		}
		assertEquals(strArray[0], "ClassInfo");
		assertEquals(strArray[1], "java.lang.Object");
	}
	
}