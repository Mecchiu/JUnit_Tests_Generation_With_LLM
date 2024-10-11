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
     * Searches through cMethods, the private array of public methods
     * for a given string fragment, and selects methods that have that
     * fragment in them.
     * <p>
     * This method calls searchStrings().
     *
     * @param tempStr string fragment with which to search
     * @return string array of found methods
     */
    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods!= null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
    }
}

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
		 * Provides a list of public constructors from the superClass object.
		 * It also provides a list of method names (if any) that are not
		 * public.
		 *
		 * @param superClass superClass object for the list of methods
		 * @return The methods and constructors for the class
		 */
		public List cMethods(Class superClass) {
			List methods = new ArrayList();
                        Class cClass = superClass;
			while (cClass!= null) {
                               	List methods2 = new ArrayList();
                               	for (int it = 0; it < superClass.getDeclaredConstructors().length; it ++) {
                                		cConstructor_7(superClass.getDeclaredConstructors()[it], it, methods);
                                	}
                                	cClass = cClass.getSuperclass();
                                }
			return methods;
		}

       private void cConstructor_7(Constructor cConstructor, int itCmp, List methods) {
                        Object[] theMethods = methods.toArray();
                        for (Object method : theMethods) {
                                if ((method instanceof Method)) {
                                        Method m = (Method) method;
                                        Class[] argumentTypes = m.getParameterTypes();
                                        if (argumentTypes.length == 1) {
                                                String theArgumentName = ((Parameter) m.getParameter(0)).getName();
                                                if (methodSigEquals(theArgumentName, itCmp, cConstructor))
                                                {
                                                        int iReturn = cConstructor.invoke(cClass, new Object[] {itCmp}, the);
                                                        Object returnMe = m.invoke(itCmp, null);
                                                        assertTrue("The value of the first return argument is correct.", (returnMe instanceof Boolean) && (((Boolean)returnMe).booleanValue() == true));
                                                }
                                        }
                                } else if (method instanceof Field) {
                                        Field m = (Field) method;
                                        Class[] argumentTypes = m.getParameterTypes();
                                        if (argumentTypes.length == 1) {
                                                String theArgumentName = ((Parameter) m.getParameter(0)).getName();
                                                if (methodSigEquals(theArgumentName, itCmp, cConstructor))
                                                {
                                                        Object returnMe = m.get(itCmp, null);
                                                        if (returnMe instanceof Boolean) {
                                                                  boolean bVal = ((Boolean)returnMe).booleanValue();
                                                                  if (getBoolean(bVal, itCmp, cConstructor))
                                                                  {
                                                                         int iResult = cConstructor.invoke(cClass, new Object[] {itCmp}, the);
                                                                         Object returnMe2 = m.get(itCmp, itCmp);
                                                                         assertTrue("The value of the second return argument is correct.", (returnMe2 instanceof Boolean) && (((Boolean)returnMe2).booleanValue() == true));
                                                                  }
                                                        } else {
                                                                  assertFalse("The value of the second return argument is incorrect", bVal);
                                                                  System.err.println("Could not interpret as boolean");
                                                        }
                                                }
                                        }
                                }
                        }
		}
}
