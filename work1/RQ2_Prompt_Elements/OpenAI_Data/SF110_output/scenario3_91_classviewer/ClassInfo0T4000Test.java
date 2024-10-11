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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {

	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString(fields[i].getModifiers()) + " " + fields[i].getType().getName() + " " + fields[i].getName();
        }
        return fieldStrings;
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString(fields[i].getModifiers()) + " " + fields[i].getType().getName() + " " + fields[i].getName();
        }
        return fieldStrings;
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString(fields[i].getModifiers()) + " " + fields[i].getType().getName() + " " + fields[i].getName();
        }
        return fieldStrings;
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString(fields[i].getModifiers()) + " " + fields[i].getType().getName() + " " + fields[i].getName();
        }
        return fieldStrings;
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString(fields[i].getModifiers()) + " " + fields[i].getType().getName() + " " + fields[i].getName();
        }
        return fieldStrings;
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct array of strings.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo();
		String[] fields = ci.printFields();
		assertEquals(fields[0], "public static final int java.lang.Integer.MIN_VALUE");
		assertEquals(fields[1], "public static final int java.lang.Integer.MAX_VALUE");
		assertEquals(fields[2], "public static final Class java.lang.Integer.TYPE");
		assertEquals(fields[3], "public static final int java.lang.Integer.SIZE");
		assertEquals(fields[4], "public static final int java.lang.Integer.BYTES");
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
     * Returns an array of strings that contain the public fields for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public fields
     */
    public String[] printFields() {
        Field[] fields = c.getFields();
        String[] fieldStrings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldStrings[i] = Modifier.toString