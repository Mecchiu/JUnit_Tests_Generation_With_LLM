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
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}