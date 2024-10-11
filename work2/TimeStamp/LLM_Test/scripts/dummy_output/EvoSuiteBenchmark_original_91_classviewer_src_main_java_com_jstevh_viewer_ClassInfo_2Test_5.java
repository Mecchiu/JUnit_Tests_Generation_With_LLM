// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
		private ClassInfo object;

		private TestRunner testRunner;

		private List<String> list = new ArrayList<>();

		private String cName;

		/**
         */
		public ClassInfo_2Test() {
			testRunner = TestRunner.runner(this);
		}

		private void getClassInfo(String name) {
			cName = name;
		}

		/**
         * Takes a given class name and prints out with System.out.println.
         *
	     * @param    name  name of class
         */
        private void printClassInfo() {
        	if(object!= null) {
                object.printClassInfo();

        		if(!object.list.isEmpty()) {
					list.addAll(object.list);
        		}
        	}
        }

		/**
         * Takes a given class and finds its string index.
         *
	     * @param    name  name of class
         *
	     * @return   String array value of name
         */
}