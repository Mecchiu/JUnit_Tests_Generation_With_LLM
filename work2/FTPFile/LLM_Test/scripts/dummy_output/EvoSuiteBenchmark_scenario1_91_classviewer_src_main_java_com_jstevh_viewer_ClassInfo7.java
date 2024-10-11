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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	@Test
	void testSrchMethods() {
		ClassInfo ci = new ClassInfo();
		String[] tempArray = ci.srchMethods("");
		assertNull(tempArray);
		tempArray = ci.srchMethods(null);
		assertNull(tempArray);
		tempArray = ci.srchMethods("a");
		assertNull(tempArray);
		tempArray = ci.srchMethods("ab");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abc");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcd");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcde");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdef");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefg");
		assertNull(tempArray);
		tempArray = ci.srchMethods("abcdefgh");
		assertNull(tempArray);
	}
}