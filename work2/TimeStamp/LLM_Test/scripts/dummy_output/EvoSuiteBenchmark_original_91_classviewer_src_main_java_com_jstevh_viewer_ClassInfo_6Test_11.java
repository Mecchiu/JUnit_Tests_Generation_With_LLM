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
	 * Test if the array of classes is valid.
	 *
	 * @see ClassInfo_6Test#getData(java.lang.Class[])
	*/
	@Test
	public  void testBasicClassInfo() throws Exception {
		
		assertNotNull(getClass(null));
		assertNotNull(getClass(new String("Null")));
		
		Object[] data = getClass(new String [] {"Foo", "Bar"}).getData(new Class[]{"Foo", "Bar"});
}
}