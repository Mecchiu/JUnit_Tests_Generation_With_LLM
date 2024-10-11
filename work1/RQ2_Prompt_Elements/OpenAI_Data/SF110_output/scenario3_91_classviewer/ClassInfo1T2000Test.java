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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfoTest {

	@Test
	void testPrintMethods() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.printMethods();
		assertEquals(methods[0], "public void com.jstevh.viewer.ClassInfo.printMethods()");
		assertEquals(methods[1], "public void com.jstevh.viewer.ClassInfo.printFields()");
		assertEquals(methods[2], "public void com.jstevh.viewer.ClassInfo.printConstructors()");
		assertEquals(methods[3], "public void com.jstevh.viewer.ClassInfo.printInterfaces()");
		assertEquals(methods[4], "public void com.jstevh.viewer.ClassInfo.printSuperclass()");
		assertEquals(methods[5], "public void com.jstevh.viewer.ClassInfo.printClassName()");
		assertEquals(methods[6], "public void com.jstevh.viewer.ClassInfo.printClassModifiers()");
		assertEquals(methods[7], "public void com.jstevh.viewer.ClassInfo.printClassPackage()");
		assertEquals(methods[8], "public void com.jstevh.viewer.ClassInfo.printClass()");
		assertEquals(methods[9], "public void com.jstevh.viewer.ClassInfo.printClassInfo()");
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
     * Returns an array of strings that contain the public methods for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public methods
     */
    public String[] printMethods();
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfoTest {
		
	@Test
	void testPrintMethods() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.printMethods();
		assertEquals(methods[0], "public void com.jstevh.viewer.ClassInfo.printMethods()");
		assertEquals(methods[1], "public void com.jstevh.viewer.ClassInfo.printFields()");
		assertEquals(methods[2], "public void com.jstevh.viewer.ClassInfo.printConstructors()");
		assertEquals(methods[3], "public void com.jstevh.viewer.ClassInfo.printInterfaces()");
		assertEquals(methods[4], "public void com.jstevh.viewer.ClassInfo.printSuperclass()");
		assertEquals(methods[5], "public void com.jstevh.viewer.ClassInfo.printClassName()");
		assertEquals(methods[6], "public void com.jstevh.viewer.ClassInfo.printClassModifiers()");
		assertEquals(methods[7], "public void com.jstevh.viewer.ClassInfo.printClassPackage()");
		assertEquals(methods[8], "public void com.jstevh.viewer.ClassInfo.printClass()");
		assertEquals(methods[9], "public void com.jstevh.viewer.ClassInfo.printClassInfo()");
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
     * Returns an array of strings that contain the public methods for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public methods
     */
    public String[] printMethods();
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfoTest {
		
	@Test
	void testPrintMethods() {
		ClassInfo ci = new ClassInfo();
		String[] methods = ci.printMethods();
		assertEquals(methods[0], "public void com.jstevh.viewer.ClassInfo.printMethods()");
		assertEquals(methods[1], "public void com.jstevh.viewer.ClassInfo.printFields()");
		assertEquals(methods[2], "public void com.jstevh.viewer.ClassInfo.printConstructors()");
		assertEquals(methods[3], "public void com.jstevh.viewer.ClassInfo.printInterfaces()");
		assertEquals(methods[4], "public void com.jstevh.viewer.ClassInfo.printSuperclass()");
		assertEquals(methods[5], "public void com.jstevh.viewer.ClassInfo.printClassName()");
		assertEquals(methods[6], "public void com.jstevh.viewer.ClassInfo.printClassModifiers()");
		assertEquals(methods[7], "public void com.jstevh.viewer.ClassInfo.printClassPackage()");
		assertEquals(methods[8], "public void com.jstevh.viewer.ClassInfo.printClass()");
		assertEquals(methods[9], "public void com.jstevh.viewer.ClassInfo.printClassInfo()");
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
public