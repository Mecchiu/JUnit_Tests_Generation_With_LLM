// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
		/**
		* Simple method for testing {@link ClassInfo#getClass(String)}, {@link ClassInfo#isAbstract()},
		* {@link ClassInfo#isInterface()} and {@link ClassInfo#printFields()}
		*/
		@Test
		
		public void test_01_01(){
			System.out.println(ClassInfo_5Test.class.getName()); //ClassInfo_5Test.class.getName());
			ClassInfo_5Test test_02 = new ClassInfo_5Test();            
			if (debug) Thread.dumpStack();
			try {
				Field field = ClassInfo_5Test.class.getDeclaredField("classeName");
				field.setAccessible(true);
				String className = (String) field.get(test_02);
					assertEquals(className,"ClassInfo_5Test");
			}catch(Exception e){e.printStackTrace(System.out);  throw e;}
			assertTrue(test_02.isAbstract());
}
}