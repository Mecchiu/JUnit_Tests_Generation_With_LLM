// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
		public static void printFields() {
			Count c = new Count();
			assertEquals(0, c.value);
		}

		public void testStrings() {
			String className = ClassInfo.class.getName();
			Count c = new Count();
			Object[] array = { new Dummy(), "" };
			className = className.replace('.', '/');
			String[] arrayStrings = className.split("/(?=[^/])/");
			String[] arrayTmp = arrayStrings;
			ClassInfo.printClassInfo(className);
			System.out.println("arrayNames" + arrayNames(className));
			arrayNames(c);
			System.out.println("arrayStrs" + Arrays.toString(array));
			Array.toString(array);
			Array.hashCode(array);
			String expectedString = className.replace('/', '.');
			System.out.println("expected:" + expectedString);
			String expectedString2 = className.replace('.', '/');
}
}