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
/**
		 * Test the ClassInfo.getData() method, where we get
		 * the {@link Class[]} object as a <code>String[]</code>.
		 */
     @Test
     @SuppressWarnings("unused")
		public void testGetData()
			throws ClassNotFoundException
		{
			// Class[] classArray
		assertEquals("",new String[0]);

		// Class[] classArray2		
	}

	// ClassInfo_4.java
	public static String[] getData(Class[] m) {
        List<ClassInfo> mClassInfos = ClassInfo.classInfoList(m); 
        return mClassInfos.toArray(new ClassInfo[0]);
    }
        /**
     * @param m class array of Class objects
     * @return List of classinfos
     *
     */
    public static List<ClassInfo> classInfoList(Class[] m) {

        List<ClassInfo> classInfos = new Vector<ClassInfo>();

        for (Class clazz : m)
        {
            try
            {
                Method[] mt = clazz.getMethods();
        
                for (Method method : mt) {
                    Class[] cn = new Class[]{};
            	    String className = method.getName();
                    while (className!= null)
                    {
                        int endIndex = className.lastIndexOf('.');
                        if (endIndex == -1) {
                            if (className.length() == 1) {
                                className = className.substring(0, 1);
                            }
                            // throw new
                        } else 
                        {
                            className = className.substring(endIndex + 1);
                        }
                    }
                    // This is the test class itself.
        
                    for (int i = 0; i < mt.length; i++) // Method is first class
                    {
                        Class memberclass = mt[i].getDeclaringClass();
                        if (className.equals(memberclass.getName())) {
                            cn = new Class[]{mt[i].getReturnType()};
                        }
                    }
                    classInfos.add(new ClassInfo(className,cn));
                }
            } 
            catch (NoClassDefFoundError e) {
            	throw new RuntimeException(e);
            }
        }
        return classInfos;
    }
}
