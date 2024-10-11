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
		
    /**
     * Test cases for the methods of {@link ClassInfo}.
     *
     * @throws Exception 	exception thrown  if test fails
     */
	@Test
    public void testSRCHMethods() throws Exception {
        System.out.println("ClassInfo_7Test.testSRCHMethods");
		
		Class[] classes = {MyClass.class};
		Object[] objects = {new MyObject(classes)};

		Method[] methods = new Method[2];
        Method publicMethod = ClassInfo_7Test.class.getDeclaredMethod("srchMethods", new Class[]{cls, Collection.class});
        methods[1] = publicMethod;
 		
        //System.out.println(Arrays.toString(methods));
		//System.out.println(Arrays.toString(objects));
		assertDoesNotThrow(publicMethod);
		
        //System.out.println(Arrays.toString(methods));
		//System.out.println(Arrays.toString(objects));
}
}