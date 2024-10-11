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
		/**
		* Initialize Test
		* Allocate the array of members based on the class member names
		*
		* @throws Exception
		*/
	private static void initializeTest() throws Exception {
		
    		Vector v = new Vector();

    		Class c = Class.forName("com.jstvh.test.ClassInfo_1");

    		ClassInfo[] classes = new ClassInfo[6];


    		ClassInfo ci;

    		c.getConstructors();

    		classes[0] = new ClassInfo();

    		ci = classes[0];


    		c.getField("s");

    		classes[0].getFile();

    		classes[0].getArray();

    		classes[1] = new ClassInfo();

    		ci = classes[1];


    		classes[2] = new ClassInfo();

    		ci.setClassName("TestClass");

    		classes[2].setClassName("TestClass");

    		classes[2].getClassName();

}
}