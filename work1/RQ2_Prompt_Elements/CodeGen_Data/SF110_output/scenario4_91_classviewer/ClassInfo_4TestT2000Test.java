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
         * @param args
         */
        private static final String[] testPackages = {
                "",
        };

		public static String[] printInterfaceStrings = {
            "",
        };

		public static String[] expectedInterfaceStrings = {
                "",
        };
				/**
		 * @param args
		 */
        private static final String[] testClasses = {
                "",
        };

        private static Class[] interfaces;

        static {
			interfaces = ClassInfo.class.getInterfaces();
        }
    
    public static void printInterfaces() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SecurityException {
        System.out.print("\n\nClassInfo ");

        ClassInfo_4Test test = new ClassInfo_4Test();
        Class interface1 = test.getClass();
        ClassList interfacesList = new ClassList(Collections.<String> emptyList());
        ClassList interfacesList2 = (ClassList)getClasses(interfacesList, true);

		while (((Class)