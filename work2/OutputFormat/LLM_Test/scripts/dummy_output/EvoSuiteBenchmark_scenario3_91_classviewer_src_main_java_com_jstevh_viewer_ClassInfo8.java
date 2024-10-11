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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfoTest {
		
	/**
	 * Test case for {@link ClassInfo#getFoundMethod(int)} method.
	 * <p>
	 * This test case checks if the method returns null when no methods have been searched for.
	 */
	@Test
	public void testGetFoundMethod_NoMethodsSearchedFor_ReturnsNull() {
		ClassInfo classInfo = new ClassInfo();
		assertNull(classInfo.getFoundMethod(0));
	}
}