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

		@Test
		void testPrintFields() {
				ClassInfo ci = new ClassInfo();
				String[] result = ci.printFields();
				assertEquals(result[0], "public static final int com.jstevh.viewer.ClassInfo.length=0");
				assertEquals(result[1], "public static final int com.jstevh.viewer.ClassInfo.count=0");
				assertEquals(result[2], "public static final java.lang.Class com.jstevh.viewer.ClassInfo.c=class com.jstevh.viewer.ClassInfo");
				assertEquals(result[3], "public static final boolean com.jstevh.viewer.ClassInfo.debug=false");
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

    public String[] printFields() {
        Field[] f = c.getFields();
        length = f.length;
        String[] StringData = null;
        if (length > 0) {
            StringData = new String[length];
            String tempStr;
            Object obj = new Object();
            if (debug)
                System.out.println("****************************************");
            for (count = 0; count < length; count++) {
                try {
                    tempStr = f[count] + "=" + f[count].get(obj);
                    StringData[count] = tempStr;
                    if (debug)
                        System.out.println(tempStr);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    tempStr = f[count] + "= ILLEGAL ACCESS EXCEPTION, unable to load";
                    StringData[count] = tempStr;
                } catch (IllegalArgumentException j) {
                    j.printStackTrace();
                    tempStr = f[count] + "= ILLEGAL ARGUMENT EXCEPTION, unable to load";
                    StringData[count] = tempStr;
                }
            }
        } else if (debug)
            System.out.println("No public fields.");
        return StringData;
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
		
		@Test
		void testPrintFields() {
				ClassInfo ci = new ClassInfo();
				String[] result = ci.printFields();
				assertEquals(result[0], "public static final int com.jstevh.viewer.ClassInfo.length=0");
				assertEquals(result[1], "public static final int com.jstevh.viewer.ClassInfo.count=0");
				assertEquals(result[2], "public static final java.lang.Class com.jstevh.viewer.ClassInfo.c=class com.jstevh.viewer.ClassInfo");
				assertEquals(result[3], "public static final boolean com.jstevh.viewer.ClassInfo.debug=false");
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

    public String[] printFields() {
        Field[] f = c.getFields();
        length = f.length;
        String[] StringData = null;
        if (length > 0) {
            StringData = new String[length];
            String tempStr;
            Object obj = new Object();
            if (debug)
                System.out.println("****************************************");
            for (count = 0; count < length; count++) {
                try {
                    tempStr = f[count] + "=" + f[count].get(obj);
                    StringData[count] = tempStr;
                    if (debug)
                        System.out.println(tempStr);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    tempStr = f[count] + "= ILLEGAL ACCESS EXCEPTION, unable to load";
                    StringData[count] = tempStr;
                } catch (IllegalArgumentException j) {
                    j.printStackTrace();
                    tempStr = f[count] + "= ILLEGAL ARGUMENT EXCEPTION, unable to load";
                    StringData[count] = tempStr;
                }
            }
        } else if (debug)
            System.out.println("No public fields.");
        return StringData;
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
		
		@Test
		void testPrintFields() {
				ClassInfo ci = new ClassInfo();
				String[] result = ci.printFields();
				assertEquals(result[0], "public static final int com.jstevh.viewer.ClassInfo.length=0");
				assertEquals(result[1], "public static final int com.jstevh.viewer.ClassInfo.count=0");
				assertEquals(result[2], "public static final java.lang.Class com.jstevh.viewer.ClassInfo.c=class com.jstevh.viewer.ClassInfo");
				assertEquals(result[3], "public static final boolean com.jstevh.viewer.ClassInfo.debug=false");
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

    public String[] printFields