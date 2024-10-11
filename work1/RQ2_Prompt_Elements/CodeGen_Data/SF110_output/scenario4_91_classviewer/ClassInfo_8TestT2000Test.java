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
		 * Test method for {@link ClassInfo#getFoundMethod(int)
  * getFoundMethod(int)}.
  */
	@Test
	void getFoundMethod_int() {
		TestInfo.printFoundMethod(TestInfo.getInstance().getClassInfo().getFoundMethods(), 100);

	}

	/**
	 * Test method for {@link ClassInfo#getFoundMethods()
  * getFoundMethods()}.
  *
  * @throws  Exception if test couldn't be run
  */
	@Test
	public void getFoundMethods() throws Exception {
		List<String> list = new ArrayList<>();

		TestInfo.printFoundMethods(list, 200);

		assertTrue(list.contains("getClass(String)"));
		assertTrue(list.contains("getMethods(int)"));
		assertFalse(list.contains("getMethod(String, Object)"));
		assertFalse(list.contains("getFindMethods()"));

	}

	/**
  * Test method for {