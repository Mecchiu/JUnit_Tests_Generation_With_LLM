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
		/**
		* Test method for {@link ClassInfo#printInterfaces()}
		*
		* @throws  java.lang.Exception
		*/
		@Test
		void printInterfaces() throws Exception {
				ClassInfo_4Test obj = new ClassInfo_4Test();
				System.out.println("It's not a java.lang.Class");
				System.out.println(obj.printInterfaces());
				assertTrue(obj.canPrintMethods());
				assertFalse(obj.canPrintInherited());
				assertFalse(obj.canPrintSuperClass());
		}
}