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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {

	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, fndMethods.length);
            return tempArray;
        }
        return null;
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
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

    public String[] srchMethods(String tempStr) {
        if (tempStr == null)
            return null;
        fndMethods = StringTools.searchStrings(cMethods, tempStr);
        if (fndMethods != null) {
            String[] tempArray = new String[fndMethods.length];
            System.arraycopy(fndMethods, 0, tempArray, 0, f