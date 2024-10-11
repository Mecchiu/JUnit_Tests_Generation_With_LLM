// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		public static String s = "This is a String.";
    		private static String s2 = "This is a String.";
    		private String s3 = "This is a String";

		{
		}

    	/**
    	The data that is being retrieved.
    	*/
    	private Hashtable<String, String> m = new Hashtable<>(6);

    	/**
    	Gets the string of the value for key m.
    	*/
        private String getString(String mName) {
          return getString(mName, ""); //$NON-NLS-1$
        }

    	/**
    	Gets the string of the value for key m.
    	*/
        private String getString(String mName, String mDefault) {
          return getString(mName, mDefault, s3); //$NON-NLS-1$
        }

    	/**
    	Gets the string of the value for key m.
    	*/
}