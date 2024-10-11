// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
		
	/**
	* Tests if a constructor is not public and has no constructor
	* with public method defined for them.
	*/
	@Test
	public void testNoConstructor()  {
	//	ClassInfo.class is not allowed to have a constructor
		new ClassInfo_0();
	}
	
	/**
	* Tests if a constructor is not public and has a constructor
	* for inherited objects with one constructor defined for them.
	*/
	@Test
	public void testInheritedConstructor()  {
	//	MethodInfo.class is not allowed to have a constructor
		new ClassInfo_1();
	}
	
	/**
	* Tests if an inherited constructor of a class is found for
	* class it has inherited methods.
	*/
	@Test
	public void testInheritedMethod()  {
	//	ClassInfo.class is not allowed to have a constructor
		new ClassInfo_2();
	}
	
}