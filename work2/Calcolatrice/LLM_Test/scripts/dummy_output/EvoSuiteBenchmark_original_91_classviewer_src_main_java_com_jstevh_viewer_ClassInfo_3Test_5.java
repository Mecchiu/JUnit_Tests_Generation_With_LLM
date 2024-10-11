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
		
    final static String baseName = "unused";
    
    /**
     * Runs the test with a given set of possible combinations of data for the class.
     *
     */
    @SuppressWarnings("EmptyForLoop")
	@Test
    public void testGetClassInfo() {
		try {
			run(createNewClassInfo());
		}
		catch (AssertionError e) {
			System.err.println("Test Failed: Exception raised");
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			System.err.println("Test Failed: Exception raised");
			e.printStackTrace();
			throw e;
		}
	}
	
}