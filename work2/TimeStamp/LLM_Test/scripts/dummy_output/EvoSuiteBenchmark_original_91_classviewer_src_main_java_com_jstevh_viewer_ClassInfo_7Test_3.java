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
		
    DirManager dirMan;

		
    public void setUp() throws Exception {
        dirMan = new DirManager();
    }
 
    public void test_srchMethods() throws Exception {
        Class obj = Class.forName("java.lang.Object");

        Class[] objCodes = obj.getClass().getInterfaces();

        Class objClass = Class.forName(objCodes[0].getName());


        // find the most common public interface 
        Method[] mTmp = objClass.getMethods();
        Method method = null;
        int i = mTmp.length;
        for (i = 1; i < mTmp.length; i++) {
            method = mTmp[i].getDeclaredMethod("toString");
            if (method == null) {
                break;
            }
        }
        
        if (method == null) {
            throw new Exception("Could not extract toString method from class " + obj.getName());
        }

        String[] methods = method.getParameterTypes();
}
}