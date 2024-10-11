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
	 * Test method for {@link ClassInfo#printInterfaces()}.
	 */
	@Test
    public void testPrintInterfaces() {
		//Test case #1
		ClassInfo ci;
		try {
			ci = new ClassInfo();
		}
		catch(Exception ex){
			String s = "Test #1 : Failed with exception.";
			ex.printStackTrace(System.err);
			throw new RuntimeException(s);
		}
		ci.printInterfaces();
	}
}