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
	* This test case tests the method with a null superclass.
	*/
	@Test
	void testHasSuperClass_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with an empty superclass.
	*/
	@Test
	void testHasSuperClass_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_9() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for the {@link JavaSource#hasSuperClass()} method.
	* This test case tests the method with a superclass.
	*/
	@Test
	void testHasSuperClass_10() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
}