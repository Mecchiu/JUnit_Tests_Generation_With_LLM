// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
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
            if (cMethods[i].indexOf(getClassName() + '.')!= -1)
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

// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
		/**
		* No test code generated here.
		*/
    private static final String[] null = {};
    private static final String[] all = {};
		
	@Test
	public void test_constructor_1() throws NoSuchMethodException, SecurityException {
	
		//noinspection StatementWithEmptyBody
		if (classInfo == null)
			return;
		
		assertNotNull(classInfo.getClass());
		assertNotNull(classInfo.getClass().newInstance());
	}
	
	@Test
    public void test_printMethods_2() throws NoSuchMethodException {
    	
    	if (isTestClassEnabled(ClassInfo.class)) {
			String[] interfaces;
    		ClassInfo_2 testInfo = new ClassInfo_2();
    		public boolean testConstructor(TestInfo testInfo, Object instance, Object[] args) throws Throwable {
    			assertNotNull("testConstructor", args);
    			assertTrue("testConstructor", all.length == args.length);
				if (false) {
					int i = 0;
					ClassInfo new1 = (ClassInfo) testConstructorArgs[0].getClass ().newInstance();
					ClassInfo.printMethods(testConstructorArgs[0].getClass ());
    			}
    			if (all.length == 0) {
    				System.out.println("*** Printing all methods ***"
    				 + "============================");
    	    		ClassInfo_2.printMethods(testInfo.getClass(), System.out);
    				System.out.println("===========================================");
    				return false;
    			} else {
    				if (cMethods.length > 0)
    					System.out.println("*** Printing methods ***"
    					 + "========================");
    				interfaces = ClassInfo.printMethods(testInfo.getClass(), Arrays.asList(ClassInfo.all));
    				System.out.println("interfaces = " + interfaces);
    				if (interfaces.length == 0) {
    					System.out.println("*** Printing all methods ***"
    					 + "========================");
    	    			ClassInfo_2.printMethods(testInfo.getClass(), System.out);
    					System.out.println("===========================================");
				    return false;
    				} else
    					return true;
    			}
    		}
    		public void assertConstructor(TestInfo testInfo, Object instance, Object[] args,
    		 		String[] foundMethods, Throwable expectedException) throws Throwable {
    			String[] notFoundMethods = getClassNameSorted(testInfo.getClass()).split("$");
    			for (int i = 0; i < notFoundMethods.length; i++) {
    				assertEquals(foundMethods[i], "NOT_FOUND_METHOD" + i);
    			}
    			assertEquals(foundMethods.length, args.length);
    		}
    		
    		
    		@Test
    			public void test_constructor_2() throws NoSuchMethodException {
    				if (cMethods.length == 0) {
    					System.out.println("The class can't be created. "
    					+ "You must use one of the methods to create a class.");
    				} else {
    					System.out.println("The class can be created.");
    				}
    			}
    		
    		public void test_constructor_3() throws Throwable {
    			testConstructor((ClassInfo)testInfo,null,(Object[])null);
    		}
    		public void test_constructor_7() throws Throwable {
    			try {
    				testConstructor((ClassInfo)null, (Object[])null);
    			} catch (RuntimeException e) {
    				Assert.assertTrue(e.getMessage().equals("expected RuntimeException"));
    			}
    		}
    		public int test_constructor_9() throws Throwable {
    			return 0;
    		}
    		
    	    public Object test_allConstructors_1() throws Throwable {
    			return all;
    		}
    		
    		public Object test_allConstructors_2() throws Throwable {
    			return all;
    		}
    		
    		public Object test_allConstructors() throws Throwable {
    			return all;
    		}
			
    		public String[] test_allMethods() {
    			return all;
    		}
    		
    		public Throwable getExpectedException(ClassInfo.ClassException throwableClassException) {
    			if ((TestInfo.class.isAssignableFrom(throwableClassException.getClass()) ||
    					TestInfo.class.isAssignableFrom(throwableClassException.getClass().getSuperclass()))
                            && throwableClassException.getClass().getName()!= null
                            && throwableClassException.getClass().getName().startsWith("java.lang")) {
    				return throwableClassException;
    			}
    			return null;
    		}
    }
}