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
// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    public String[] printInterfaces() {
        Class[] inter = c.getInterfaces();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(inter);
        if (c!= java.lang.Object.class &&!c.isInterface()) {
            Class superC = c.getSuperclass();
            TreeSet<String> hInterfaces = new TreeSet<String>();
            int i = 0;
            if (data!= null)
                for (i = 0; i < data.length; i++) {
                    hInterfaces.add(data[i]);
                }
            while (superC!= null && superC!= java.lang.Object.class) {
                inter = superC.getInterfaces();
                if (debug)
                    System.out.println("****************************************");
                data = getData(inter);
                if (data!= null)
                    for (i = 0; i < data.length; i++) {
                        hInterfaces.add(data[i]);
                    }
                superC = superC.getSuperclass();
            }
            if (hInterfaces.size()!= 0) {
                data = new String[hInterfaces.size()];
                Iterator it = hInterfaces.iterator();
                i = 0;
                while (it.hasNext()) {
                    data[i] = (String) it.next();
                    i++;
                }
            }
        }
        if (debug && data == null)
            System.out.println("No interfaces.");
        else
            printArray(data);
        return data;
    }
}

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
	     * ClassInfo_4Test's data parameters.
	*/
	static final int debug = 0;
	static final int numTestCases = 1;
	static final Class[] c1 = { null };
	static final Class[] c2 = { java.lang.String.class, java.lang.Class.class, java.lang.Runnable.class };
	static final Class[] c3 = { java.lang.Runnable.class, java.lang.Runnable.class, java.lang.Object.class, Object.class, java.lang.Object };
	static final Class[] c4 = { java.lang.String[].class };
	static final Class[] c5 = { null};
	static final Object[] c6 = { null, "a", null, "b", "c", "d", null, null, null, null, null };
	static final Object[] c7 = { null, "a", null, "b", "c", "d", null };
	static final String[] c8 = {"a", "b", null};
	static final String[] c9 = {"c", "d", null};
	static final String[] c10 = {null};
        
	/**
	 * ClassInfo_4Test's data for the following tests.
	 */
    public static void test(int k, Class[] cases, Object[] results) {
        assertEquals(numTestCases, tests.length);
        int i = 0;
        String[] data = getData(cases);
        
        do {
            System.out.println("Starting test case "+data[i]);
            results[i] = null;
            i++;
            try {
                ClassInfo_3 d = new ClassInfo_3(data[i]);
                results[i] = d.getData();
                if (results[i] instanceof String) {
                    if (debug)
                        System.out.println("Data is "+results[i]);
                }
                results[i] = d;
            } catch (Throwable t) {
                t.printStackTrace();
                System.out.println("Failure "+t);
            }
        } while (i < cases.length);
    }

/**
	 * tests.
	*/
      static class ClassInfo_3 {

	/**
	    * Gets the data.
	    * @param cases The class objects for printing.
	    * @return The array.
	    */
	    public String[] getData(Class[] cases) {
		String[] data = new String[cases.length];
		int i = 0;
		for (; i < cases.length; i++) {
		    data[i] = cases[i].getName();
		}
		return data;
	    }
	}
});

