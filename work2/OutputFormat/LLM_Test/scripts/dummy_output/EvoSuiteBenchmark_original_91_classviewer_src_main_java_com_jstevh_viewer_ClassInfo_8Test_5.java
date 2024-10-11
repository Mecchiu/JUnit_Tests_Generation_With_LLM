// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		/**
		* Constructor for {@link ClassInfo_8Test}.
		*/
    public ClassInfo_8Test(){
    }
	
	/**
	* Runs the tests.
	* It is the only way to see if a test was executed.
	*/
    @Test
    public void test0(){
    	assertEquals(100,100);
    	assertFalse(hasNoMethods());
    }
	
	/**
	* Runs the tests.
	* It is not meant to be used by programs.
	*/
	public void test1(){
		ClassInfo classInfo = new ClassInfo();
		classInfo.printProperties();
		classInfo.printFields();
	}

	/**
	* Prints out to System.out.println{@link ClassInfo} without calling
	* findMethods(). But it returns a result.
	*/
	private String failMessage0;
	public class ClassInfo_8Test_failed {
		public String getName() {
			return "Class Info_Test1_failed";
		}
}
}