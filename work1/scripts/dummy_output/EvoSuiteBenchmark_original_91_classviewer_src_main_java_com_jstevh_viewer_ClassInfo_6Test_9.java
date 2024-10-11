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
		/**
     * Gets the name of the class for a given class.
     *
     * @param  clazz the class to find the name of
     *
     * @return    str for name
     */
    static String getClassNameOf(Class clazz) {
        if (debug) System.out.println("getClassNameOf(" + clazz.getClassName() + ")");
        return "Test of " + clazz.getClassName();
    }

    /**
     * Gets the package name of the class for a given class.
     *
     * @param  clazz the class to find the package of
     *
     * @return    str  Name of this class's package 
     */
    static String getPackageNameOf(Class clazz) {
        if (debug) System.out.println("getPackageNameOf(" + clazz.getClassName() + ")");
        return  clazz.getClassLoader().getPackage().getName();
    }

}