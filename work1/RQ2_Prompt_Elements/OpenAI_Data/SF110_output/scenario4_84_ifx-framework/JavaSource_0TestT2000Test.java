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
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {

	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a null interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with an empty interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a whitespace interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(" ");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a tab interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("\t");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a newline interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("\n");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a carriage return interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("\r");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a form feed interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("\f");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a backspace interface name.
	* The method should return false.
	*/
	@Test
	void testHasInterface_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("\b");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a non-empty interface name.
	* The method should return true.
	*/
	@Test
	void testHasInterface_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
	
	/**
	* Test case for the {@link JavaSource#hasInterface()} method.
	* The test case tests the method with a non-empty interface name.
	* The method should return true.
	*/
	@Test
	void testHasInterface_9() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a null superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with an empty superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a whitespace superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(" ");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a tab superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("\t");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a newline superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("\n");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a carriage return superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("\r");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a form feed superclass name.
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("\f");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a backspace superclass name.
	