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
    * Constructor for ClassInfo_7Test.
    */
    public ClassInfo_7Test(){}
    
    /**
    * ClassInfo_7Test_1_001_test.sc - Constructor test
    */
    @Test
    public void test_7_001_test(){
        
        String[] methods = ClassInfo.srchMethods("ClassInfo_7Test_1_001_test");
        assertNull(methods);
    }
    
	/**
	* ClassInfo_7Test_2_003_test.sc - Constructor test
	*/
	@Test
	public void test_7_003_test(){
		
		String[] methods = ClassInfo.srchMethods("ClassInfo_7Test_2_003_test");
		assertNotNull(methods);
		assertEquals(2, methods.length);
		assertTrue(methods[0].equals("ClassInfo_1_001_test"));
		assertTrue(methods[1].equals("ClassInfo_2_003_test"));
	}
}
