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
		
    /** The set of known packages.
     */
    ClassInfo[] knownPackages;

    /** The map of classNames used to search for class.
     */
    Map<String, Class> classMaps;

    /** The map of classes to be searched for.
     */
    Map<String, Class> classMap;

    /**
     * Main test method to run all tests.
     *
     * @param  args    string array for main
     */
    @Test
    public void testGetClass(String args[]) {
        int count = 1;
        int length = 0;

}
}