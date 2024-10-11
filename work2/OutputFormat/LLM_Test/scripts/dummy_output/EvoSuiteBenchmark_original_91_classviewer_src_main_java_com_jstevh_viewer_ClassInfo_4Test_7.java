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
		
		private String name;
		private JLabel label1;
		private JPanel panel;
		private JScrollPane pane;
		private JTable table;

		private ClassInfo(String name) throws ClassNotFoundException {
			this.name = name;
		}

		public static ClassInfo classInfo(String name) throws ClassNotFoundException {
			return new ClassInfo(name);
		}

		public void testStringRepresentations() {
			ClassInfo_4Test.classInfo("String");
		}

		@Test
		public void classInfo_1_returnsInterfacesOfExistingEnclosingClass() throws ClassNotFoundException {
			classInfo("String");
		}

		@Test
		public void classInfo_2_returnsAllClassesNotInKnownPackages() throws ClassNotFoundException {
			classInfo("String");

			Enumeration<Class> allClasses = ClassInfo.getClasses();
			Class cl = allClasses.nextElement();
			String[] names = cl.getInterfaces();
}
}