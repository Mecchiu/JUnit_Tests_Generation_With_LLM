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

    /**
     * Returns an array of strings that contain the public methods for
     * the class excluding inherited methods. The data is pulled from
     * the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @param param (not currently implemented) selects whether inherited
     *               objects are returned
     * @return string array of public methods
     */
    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.')!= -1)
                tempList.add(cMethods[i]);
        }
        if (!tempList.isEmpty())
            data = tempList.toArray();
        else
            data = null;
        if (debug && data == null)
            System.out.println("No public methods.");
        else {
            printArray(data);
        }
        return data;
    }
}

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
		
    /**
     * The test is to verify that methods are printed correctly.
     */
    @Test
    void verifyMethods() { 
        // This is the point where the unit tests exist.
		String[] data = new String[]{"abstract", "default", "static", "constructors", "overloads", "is-annotated",
		                        "implements", "annotated", "private", "extended", "annotation"};
        ClassInfo cMethods = new ClassInfo();
        // Try to get at the c methods array.    
        String res = cMethods.printMethods(0);
        assertEquals(res, data[2].toString());
        System.out.println("Successfully retrieved public methods for an interface.");
    }    
}
