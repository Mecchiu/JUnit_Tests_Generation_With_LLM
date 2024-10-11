// ClassInfo_7Test.java
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
* It contains one unit test case for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {
		private static int NO_METHODS = 100, NO_INHERITED_METHODS = 101, i;

    /**
     *
     * @param args            String[] containing parameters for an instance of {@link ClassInfo}.
     * @throws Exception     Exceptions thrown for tests failures
     */
    @Test
    public void getDataClassInfo() throws Exception {
        assertNotNull(new ClassInfo());
    }

    /**
     *
     * @param args            String[] containing parameters for an instance of {@link ClassInfo}.
     * @param methodDataArray Array that is used to pass the class information data to the methods
     * @throws Exception     Exceptions thrown for tests failures
     */
    @Test
    public <T extends ClassInfo> void srchMethods(String[] args, T methodDataArray) throws Exception {
        int start = 0, end = 1, methodIndex = 1;
        ClassInfo temp = methodDataArray;
}
}