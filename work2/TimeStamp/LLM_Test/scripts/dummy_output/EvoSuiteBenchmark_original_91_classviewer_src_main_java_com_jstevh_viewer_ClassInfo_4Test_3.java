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
		private ClassInfo c2;

		public ClassInfo_4Test() throws Exception {
			System.out.println("");
			c2 = ClassInfo_4Test.class.getDeclaredClasses();
			while(c2.getClassName()!= null) {
				ClassInfo_4Test.class.getDeclaredClasses();
			}
		}

		public boolean isAbstract() throws Exception {
			return c2.isAbstract();
		}

		public boolean isInterface() throws Exception {
			return c2.isInterface();
		}

		public String getClassName() throws Exception {
			return c2.getClassName();
		}

		public String[] getKnownPackages() throws Exception {
			ClassInfo_4Test.knownPackages = c2.getKnownPackages();
			return knownPackages;
		}

		public String[] getKnownPackages(String[] initNames) throws Exception {
			ClassInfo_4Test.knownPackages = c2.getKnownPackages(initNames);
			return knownPackages;
		}
}