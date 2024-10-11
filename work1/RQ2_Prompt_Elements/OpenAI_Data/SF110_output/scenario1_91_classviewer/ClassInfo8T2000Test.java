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

		@Test
		void testGetFoundMethod() {
				ClassInfo classInfo = new ClassInfo();
				MethodData methodData = classInfo.getFoundMethod(0);
				assertEquals("java.lang.String", methodData.getMethClass());
				assertEquals("java.lang", methodData.getMethPackage());
				assertEquals("String", methodData.getMethName());
		}
}

// MethodData.java
package com.jstevh.viewer;

/**
 * Interface for {@link ClassInfo#getFoundMethod(int)}.
 *
 * @author James Harris
 * @version 2.0a
 */
public interface MethodData {

    /**
     * Returns the package name of the method.
     *
     * @return the package name of the method.
     */
    public String getMethPackage();

    /**
     * Returns the class name of the method.
     *
     * @return the class name of the method.
     */
    public String getMethClass();

    /**
     * Returns the method name.
     *
     * @return the method name.
     */
    public String getMethName();
}