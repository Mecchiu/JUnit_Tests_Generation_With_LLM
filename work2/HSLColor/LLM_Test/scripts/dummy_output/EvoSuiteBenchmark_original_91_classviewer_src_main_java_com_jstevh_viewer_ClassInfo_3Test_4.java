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
		String name;

		ClassInfo_3Test(String name) throws  ClassNotFoundException {
			System.setProperty("jtst.package", "com.jstvh");
			System.setProperty("jtst.class", "jstvh.MainClass");
			System.setProperty("com.jstvh.class", "MainClass");
			System.setProperty("jtst.class", "MainClass2");
			this.name = name;
		}

		@Test
		public void testInstanceof() throws Exception {
	    	assertNotNull("Class is null", ClassInfo.getClass(name));
			ArrayList<Class> classes = new ArrayList<Class>();

			ClassInfo.setDefaultDirManager(new DirManager("data3"));
			ClassInfo.setDefaultDirManager (new DirManager("data1"));
			ClassInfo.setDefaultDirManager ("data2")
					.addMember(new ArrayList<String>("a"),
							 new ArrayList<String>());
}
}