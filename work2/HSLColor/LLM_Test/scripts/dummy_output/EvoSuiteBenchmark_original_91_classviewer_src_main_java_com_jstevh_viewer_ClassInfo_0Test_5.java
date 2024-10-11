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
		
    // Initializing stuff
	private Map<String, ClassInfo> mClassInfo=new HashMap<>();
    private List<String> mExpectedStr=new ArrayList<String>();
    
    /**
     * Constructor for the ClassInfo_0Test class.
	*
     * @exception  java.lang.NoSuchMethodException	  when an unknown constructor is thrown
     * @exception  java.lang.NullPointerException      when object is null and nullConstructor is false
     */
    public ClassInfo_0Test() throws NoSuchMethodException, NullPointerException {
    }

    /**
     * @exclude
     */
    @Test
    public void testArrayOfObject() throws Exception {
        assertNotNull("Array of objects", mClassInfo.get("[]").getData(getClass("java.util.Arrays")));
        assertNotNull("Array of Arrays", mClassInfo.get("[][]").getData(getClass("java.util.Arrays")));
    }
    
}