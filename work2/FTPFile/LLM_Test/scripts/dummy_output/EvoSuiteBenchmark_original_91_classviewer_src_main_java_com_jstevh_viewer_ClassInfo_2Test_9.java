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
		
    public final static String ARRAY_START = " array = ";
    public final static String ARRAY_END = " ";
    public final static String IS_METHODS_START = " IS_METHODS = ";
    public final static String IS_METHODS_END = " ";

    /**
     * Main method when testing.
     * It builds arrays of objects for printing out.
     *
     * @param  test  object reference to build
     */
    private void buildDataTable(Object test) throws Exception {
        ClassInfo cInfo = (ClassInfo) test;
        // Create an HashMap with a single key set
        ArrayList<Object> dt = new ArrayList<Object>();
        // Create an HashMap for the values for each item in the data table
        HashMap<Object, ArrayList<String>> values = new HashMap<Object, ArrayList<String>>();
        dt.add(cInfo);
}
}