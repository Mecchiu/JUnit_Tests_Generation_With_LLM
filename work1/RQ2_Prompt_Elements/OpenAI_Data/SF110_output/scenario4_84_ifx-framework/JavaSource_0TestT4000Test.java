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
	* The method should return false.
	*/
	@Test
	void testHasSuperClass_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("\b");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a non-empty superclass name.
	* The method should return true.
	*/
	@Test
	void testHasSuperClass_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Runnable");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* The test case tests the method with a non-empty superclass name.
	* The method should return true.
	*/
	@Test
	void testHasSuperClass_9() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Runnable");
		assertTrue(javaSource.hasSuperClass());
	}
}

// JavaSource_2Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getNumberOfMemberVariables()} method.
*/
class JavaSource_2Test {
		
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with an empty list of member variables.
	* The method should return 0.
	*/
	@Test
	void testGetNumberOfMemberVariables_0() {
		JavaSource javaSource = new JavaSource();
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of one member variable.
	* The method should return 1.
	*/
	@Test
	void testGetNumberOfMemberVariables_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of two member variables.
	* The method should return 2.
	*/
	@Test
	void testGetNumberOfMemberVariables_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(2, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of three member variables.
	* The method should return 3.
	*/
	@Test
	void testGetNumberOfMemberVariables_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(3, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of four member variables.
	* The method should return 4.
	*/
	@Test
	void testGetNumberOfMemberVariables_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(4, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of five member variables.
	* The method should return 5.
	*/
	@Test
	void testGetNumberOfMemberVariables_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(5, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of six member variables.
	* The method should return 6.
	*/
	@Test
	void testGetNumberOfMemberVariables_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(6, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of seven member variables.
	* The method should return 7.
	*/
	@Test
	void testGetNumberOfMemberVariables_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		assertEquals(7, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for the {@link JavaSource#getNumberOfMemberVariables()} method.
	* The test case tests the method with a list of eight member variables.
	* The method should return 8.
	*/
	@Test
	void testGetNumberOfMemberVariables_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.addMemberVariable("java.lang.String", false);
		javaSource.