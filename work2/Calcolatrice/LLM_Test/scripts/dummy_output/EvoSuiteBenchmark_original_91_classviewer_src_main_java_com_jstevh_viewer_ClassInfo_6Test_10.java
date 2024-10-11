// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		private static ClassInfo_6Test instance = new ClassInfo_6Test();

		/**
		* Returns a new instance of ClassInfo_6Test.
		*/
		public static ClassInfo_6Test getInstance() {
				return instance;
		}


		/** 
		* Instantiates a new ClassInfo_6Test with default settings. 
		*/
		private ClassInfo_6Test() {
				super();
				System.out.println("");
				System.out.println("TEST " + this.getClass().getSimpleName());
				System.out.flush();
			}

		/**
		* Returns {@link ClassInfo_6Test} instance.
		*
		* @return Instance of ClassInfo_6Test.
		*/
		public static ClassInfo_6Test getInstanceOf() {
				return instance;
		}
}