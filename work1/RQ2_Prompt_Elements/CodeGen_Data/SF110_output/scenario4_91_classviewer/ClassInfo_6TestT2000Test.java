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
/*public static void main (String[] args) {
			if (args.length > 0 && "new".equals(args[0])) {
				ClassInfo_6Test test = new ClassInfo_6Test();
				test.testPrintClass();
				junit.textui.TestRunner.run(test);
			} else {
			junit.textui.TestRunner.run(new ClassInfo_6Test());
		}
			}*/

    /**
     * Unit test of  {@link ClassInfo#getData(Class[])}
     */
    private void testPrintClass()
    {
        // Set up debugging object
        if (debug) {
            System.setOut(new PrintStream(System.out, false, "UTF-8"));
            System.setErr(new PrintStream(System.err, false, "UTF-8"));
        }

        // Retrieve class' object
        ClassInfo c = null;
        try {
            Method[] ms = c.getClass().getDeclaredMethods();
            if