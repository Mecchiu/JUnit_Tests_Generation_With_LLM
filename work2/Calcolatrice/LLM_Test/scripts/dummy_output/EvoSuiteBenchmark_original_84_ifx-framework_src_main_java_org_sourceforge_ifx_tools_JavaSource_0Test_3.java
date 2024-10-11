// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		
	// Variables for testing
	String aString = null;
	String aString_1 = null;
	String a_ListString = null;
	String a_Array = null;
	String aStringArray = null;
	String b_ListString = null;
	ArrayList a_ArrayList = null;
	Iterator aIterator = null;

	// Unit tests

	/**
	 * Run a unit test.
	 * @param aString the string to test.
	 */
	private void unitTest(String aString) {

		// First, a unit test to make sure that getPackageName() returns the
		// class name.
		if (aString.length() > 0) {
			assertEquals("Invalid Package", aString, getPackageName());
		}

		// Then a unit test to make sure that getClassName() returns the class name.
		if (aString.length() > 0) {
			assertEquals("Invalid Classname", aString, getClassName());
		}

		// Then a unit test to make sure that getSuperClass() returns the class name.
		if (aString.length() > 0) {
			assertEquals("Invalid Super Class", getSuperClass(), aString);
		}

		// Finally a test to make sure that getSuperClass() returns null if the
		// class has no super class.
		if (aString.length() > 0) {
			assertEquals("Invalid Super Class", null, getSuperClass());
		}

		// Finally a unit test to make sure that getClassJavadocs() returns the
		// class javadocs.
		if (aString.length() > 0) {
			assertEquals("Invalid ClassJavadoc", aString, getClassJavadocs());
		}

		// Finally a unit test to make sure that getClassJavadocs() returns
		// the class javadocs.
		if (aString.length() > 0) {
			String classJavadoc = getClass().getClassJavadoc();
			if (classJavadoc.length() > 0) {
				System.out.println("ClassJavadoc= " + classJavadoc + "\n");
			}
		}

		// Finally a unit test to make sure that getMethod() returns true
		// if hasMemberVariables returns true and a parameter is null.
		if (aString.length() > 0) {
			String method = getMethod();
			assertTrue("Invalid Method", method.equals("hasMemberVariables", a_ListString));
		}
		
	}

	// Tests.
	/**
	 * Tests the creation of the JavaSource class.
	 */
	@Test
	void test_Create_1Test() {
		JavaSource_0Test b = new JavaSource_0Test();
		String testClassName = b.getClassName();
		String testPackageName = b.getPackageName();
		String testClassJavadocs = b.getClassJavadocs();
		String testClassName_1 = b.getClassName();
		String testPackageName_1 = b.getPackageName();
		String testSuperClass = b.getSuperClass();
		String testClassJavadocs_1 = b.getClassJavadocs();
		String testClassName_2 = b.getClassName();
		String testPackageName_2 = b.getPackageName();
		
		System.out.println("Test_1");
		System.out.println("\t\t" + testClassName);
		System.out.println("\t\t" + testClassName_1);
		System.out.println("\t\t" + testPackageName);
}
}