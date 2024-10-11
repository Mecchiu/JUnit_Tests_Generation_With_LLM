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
		  static final String CLASS_NAME = "ClassInfo";
		  public ClassInfo_4Test() {
		  }    
			  
	  /**
	* Main method of ClassInfo.
	*
	* @param args String array for command line flags
	*/
	@Test
    public void testMain() throws Exception {
				
		// Get the data from the constructor of this class
	   final Class c = Class.forName(CLASS_NAME);
		  final ClassInfo[] cs = c.getDeclaredClasses();

		// Get the array of names in the constructor of the class
		final String[] names = c.getField("className").getIntrinsicValue();
		int n = 0;
		for (int i = 0; cs!= null && i < cs.length; i++)
		    if (cs[i] == CLASS_NAME)
				n++;
		    else
		    	break;

		// Print the first name and number of interfaces found for the constructor
}
}