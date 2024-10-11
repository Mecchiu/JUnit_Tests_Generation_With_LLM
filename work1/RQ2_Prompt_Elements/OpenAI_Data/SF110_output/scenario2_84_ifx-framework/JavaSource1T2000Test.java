// JavaSourceTest.java
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
class JavaSourceTest {

	/**
	* Test case for {@link JavaSource#hasSuperClass()} method.
	* This test case checks if the method returns true when the superclass is not null.
	*/
	@Test
	void testHasSuperClass_True() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("SuperClass");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()} method.
	* This test case checks if the method returns false when the superclass is null.
	*/
	@Test
	void testHasSuperClass_False() {
		JavaSource javaSource = new JavaSource();
		assertFalse(javaSource.hasSuperClass());
	}
}