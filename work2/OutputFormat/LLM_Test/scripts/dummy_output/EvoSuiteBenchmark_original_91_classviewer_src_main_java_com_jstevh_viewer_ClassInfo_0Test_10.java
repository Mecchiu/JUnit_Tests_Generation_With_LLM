// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
		
    /**
     * A method for getting class information
     */
    public static ClassInfo getClassInfo(String className)
        throws ClassNotFoundException, NoSuchMethodException {
        ClassInfo ci = null;
        Class cls = Class.forName(className);
        Object instance;
        Method[] methods;
        try {
			instance = cls.newInstance();
			methods = cls.getDeclaredMethods();
			List methList = Utils.convertToList( methods );
			ClassInfo ci1 = new ClassInfo(( MethodData )methList.get( 0 ), true);
			ClassInfo ci2 = new ClassInfo(( MethodData )methList.get( 1 ), false);
			
			ci = new ClassInfo(className, ci1, ci2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
        return ci;
    }

}