// ClassInfoTest.java
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfoTest {

	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when no methods have been searched for.
	 */
	@Test
	public void testGetFoundMethod_NoMethodsSearchedFor_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(0));
	}
}

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
     * Searches through found methods and returns method at given
     * position, uses anonymous inner class.  If no methods
     * have been searched for it returns null.
     *
     * @param pos position of found methods in array 0 is first.
     * @return MethodData object with information about method
     */
    public MethodData getFoundMethod(final int pos) {
        if (foundMethods == null) {
            return null;
        }
        return new MethodData() {
            public String getName() {
                return foundMethods[pos].getName();
            }
            public String getReturnType() {
                return foundMethods[pos].getReturnType().getName();
            }
            public String[] getParameterTypes() {
                Class[] params = foundMethods[pos].getParameterTypes();
                String[] paramTypes = new String[params.length];
                for (int i = 0; i < params.length; i++) {
                    paramTypes[i] = params[i].getName();
                }
                return paramTypes;
            }
            public String[] getExceptionTypes() {
                Class[] exceptions = foundMethods[pos].getExceptionTypes();
                String[] exceptionTypes = new String[exceptions.length];
                for (int i = 0; i < exceptions.length; i++) {
                    exceptionTypes[i] = exceptions[i].getName();
                }
                return exceptionTypes;
            }
            public String getModifiers() {
                return Modifier.toString(foundMethods[pos].getModifiers());
            }
        };
    }
}

// ClassInfoTest.java
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when no methods have been searched for.
	 */
	@Test
	public void testGetFoundMethod_NoMethodsSearchedFor_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(0));
	}
	
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when the position is negative.
	 */
	@Test
	public void testGetFoundMethod_NegativePosition_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(-1));
	}
}

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
     * Searches through found methods and returns method at given
     * position, uses anonymous inner class.  If no methods
     * have been searched for it returns null.
     *
     * @param pos position of found methods in array 0 is first.
     * @return MethodData object with information about method
     */
    public MethodData getFoundMethod(final int pos) {
        if (foundMethods == null) {
            return null;
        }
        if (pos < 0) {
            return null;
        }
        return new MethodData() {
            public String getName() {
                return foundMethods[pos].getName();
            }
            public String getReturnType() {
                return foundMethods[pos].getReturnType().getName();
            }
            public String[] getParameterTypes() {
                Class[] params = foundMethods[pos].getParameterTypes();
                String[] paramTypes = new String[params.length];
                for (int i = 0; i < params.length; i++) {
                    paramTypes[i] = params[i].getName();
                }
                return paramTypes;
            }
            public String[] getExceptionTypes() {
                Class[] exceptions = foundMethods[pos].getExceptionTypes();
                String[] exceptionTypes = new String[exceptions.length];
                for (int i = 0; i < exceptions.length; i++) {
                    exceptionTypes[i] = exceptions[i].getName();
                }
                return exceptionTypes;
            }
            public String getModifiers() {
                return Modifier.toString(foundMethods[pos].getModifiers());
            }
        };
    }
}

// ClassInfoTest.java
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when no methods have been searched for.
	 */
	@Test
	public void testGetFoundMethod_NoMethodsSearchedFor_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(0));
	}
	
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when the position is negative.
	 */
	@Test
	public void testGetFoundMethod_NegativePosition_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(-1));
	}
	
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when the position is greater than the number of found methods.
	 */
	@Test
	public void testGetFoundMethod_PositionGreaterThanNumberOfFoundMethods_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(1