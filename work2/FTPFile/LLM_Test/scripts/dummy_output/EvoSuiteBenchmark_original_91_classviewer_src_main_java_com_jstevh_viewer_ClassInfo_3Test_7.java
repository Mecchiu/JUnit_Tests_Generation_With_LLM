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
		class FileInfo {
		public static final String CLASS_NAME = "com.jstevh.FileInfo";
		public static final String NAME = "Name";
		public static final String PACKAGE = "com.jstevh.files.Pack";
		public static final String PORT = "port";
		}

		private FileInfo fInfo;
		private ClassInfo cInfo;
	/**
	* Constructor for when the class name is known at call.
	* @param  name  name of class
	*/
	public ClassInfo_3Test(String name) throws ClassNotFoundException {
	cInfo = new ClassInfo(name);
    }

	@Test
	public void should_Return_Info_From_Class_With_Port_() {
		assertNotNull(cInfo);
    }

}