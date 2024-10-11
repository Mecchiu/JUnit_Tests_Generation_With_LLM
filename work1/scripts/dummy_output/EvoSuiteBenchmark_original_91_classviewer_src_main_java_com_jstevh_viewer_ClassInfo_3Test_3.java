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
		
	private ClassInfo _class_in;
	
	public ClassInfo_3Test() {
	}

	protected void setUp() throws Exception {
		super.setUp();
		this._class_in = null;
		this._class_in = new ClassInfo_3();
		this._class_in.printConstructors();
		this._class_in.clearData();
	}

	public void testsprintConstructors() {
		// Check method
		/** Test for getClass() : no exceptions */
		assertSame("getClass", this._class_in.getClass().getName(), this._class_in.getClass1().getName());
		
		// Check returned value from method getClass()
		ClassInfo in = _class_in;
		assertNotNull("returned " + in.getClass1().getName(), in.getClass1());
		// Make sure it always returns the same object
		assertSame("getClass", in.getClass().getName(), in.getClass1().getName());

		// Check method getData()
}
}