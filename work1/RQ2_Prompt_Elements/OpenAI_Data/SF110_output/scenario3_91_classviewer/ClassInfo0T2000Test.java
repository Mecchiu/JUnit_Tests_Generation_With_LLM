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
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
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
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].toString();
        }
        return fieldNames;
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
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
	}
	
	/**
	 * Test case for {@link ClassInfo#printFields()} method.
	 * <p>
	 * This test case checks if the method returns the correct number of fields.
	 */
	@Test
	void testPrintFields() {
		ClassInfo ci = new ClassInfo(String.class);
		String[] fields = ci.printFields();
		assertEquals(fields.length, 2);
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
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].toString();
        }
        return fieldNames;
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
	 * Test case for {@link ClassInfo