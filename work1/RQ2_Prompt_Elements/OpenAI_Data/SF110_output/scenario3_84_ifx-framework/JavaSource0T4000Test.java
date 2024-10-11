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
	* It tests the method with a null interface.
	*/
	@Test
	public void testHasInterfaceWithNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* It tests the method with an empty interface.
	*/
	@Test
	public void testHasInterfaceWithEmptyInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* It tests the method with a non-empty interface.
	*/
	@Test
	public void testHasInterfaceWithNonEmptyInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}