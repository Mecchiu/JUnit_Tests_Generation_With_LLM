// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		
    /**
     * Simple constructor.
     */
    public ClassInfo_8Test() { }

    /**
    * Basic method.
     * <p>
     * This method is always returns immediately.
    *
    * @param p0 parameters of the method
    * @return return class of method
    */
    public static Class getClass(Integer[] p0) {
        ClassInfo_0 classInfo_0 = new ClassInfo_0(p0);
		classInfo_0.printClassInfo();
        return classInfo_0.getClass();
    }

	public static ClassInfo getInfoOfClass(String className) throws ClassNotFoundException {
		String[] arr = className.split("\\.");
}
}