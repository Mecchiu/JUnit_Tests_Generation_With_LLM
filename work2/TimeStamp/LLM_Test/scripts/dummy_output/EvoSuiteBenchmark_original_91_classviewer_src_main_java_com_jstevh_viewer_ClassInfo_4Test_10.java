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
	* Private.
	*/
	private ClassInfo classInfo = new ClassInfo();

	/**
    * Test method for {@link ClassInfo#getClass(java.lang.String)}.
    */
    @Test
    public final void testGetClass_String() {
        Object obj = classInfo.getClass(0);
        assertNotNull(obj);
    }
	
	/**
	* Private.
	*/
	private ClassInfo_4Test() {
	}
	
	/**
    * Test method for {@link ClassInfo#getClass(java.lang.String)}.
    */
    @Test
    public final void testGetClass_String_ClassNotFound() {
        ClassNotFoundExcp.doTestClassNotFound(classInfo);
    }
    
    /**
    * Test method for {@link ClassInfo#getClass(java.lang.String)}.
    */
    @Test
    public final void testGetClass_String_ClassNotFoundFromPackage() {
}
}