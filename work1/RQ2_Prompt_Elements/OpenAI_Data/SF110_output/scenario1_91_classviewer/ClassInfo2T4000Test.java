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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {

		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].indexOf(getClassName() + '.') != -1)
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfoTest {
		
		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] data = ci.printMethods(0);
				assertNotNull(data);
				assertEquals(data.length, 1);
				assertEquals(data[0], "public void com.jstevh.viewer.ClassInfo.printMethods(int)");
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

    public String[] printMethods(int param) {
        if (cMethods == null)
            return null;
        if (debug)
            System.out.println("****************************************");
        String[] data = cMethods;
        StringList tempList = new StringList();
        for (int i = 0; i < cMethods.length; i++) {
            if (cMethods[i].