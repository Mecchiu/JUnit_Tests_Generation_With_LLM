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
		
	@Test
	public void hasInterface() {
		assertTrue("Failed to run test because no class in source was found.", hasInterface());
	}
	
	@Test
	public void hasSuperClass() {
		assertTrue("Failed to run test because no class in source was found.", hasSuperClass());
	}
	
	@Test	
	public void getNumberOfMemberVariables() {
		assertEquals("Failed to run test for java.lang.String", 10, getNumberOfMemberVariables());
	}
	
	@Test
	public void addMemberVariable() {
		ArrayList<String> mvNames = new ArrayList<String>();
		assertEquals("Failed to run test for java.lang.String", 11, getNumberOfMemberVariables());
		addMemberVariable("Foo", false, true);
		assertEquals("Failed to run test for java.lang.String", 1, getNumberOfMemberVariables());
		addMemberVariable("Foo", false, false);
		assertEquals("Failed to run test for java.lang.String", 1, getNumberOfMemberVariables());
		addMemberVariable("Foo", true, true);
		assertEquals("Failed to run test for java.lang.String", 2, getNumberOfMemberVariables());
		addMemberVariable("Foo", true, false);
		assertEquals("Failed to run test for java.lang.String", 2, getNumberOfMemberVariables());
		addMemberVariable("Foo", false, false);
		assertEquals("Failed to run test for java.lang.String", 2, getNumberOfMemberVariables());
	}
	
	@Test
	public void addMemberVariable2() {
		ArrayList<String> mvNames = new ArrayList<String>();
		assertEquals("Failed to run test for java.lang.String", 12, getNumberOfMemberVariables());
		addMemberVariable("Foo"    ,   false, true);
		addMemberVariable("Bar"    ,   false, true);
		addMemberVariable("Foo"    ,   false, false);
		addMemberVariable("Bar"    ,   false, false);
		addMemberVariable("Foo"    ,   true,  true);
		addMemberVariable("Bar"    ,   true,  true);
		addMemberVariable("Baz"    ,   true,  true);
		addMemberVariable("Foo"    ,   false, false);
		addMemberVariable("Bar"    ,   false, false);
		addMemberVariable("Foo"    ,   false,  false);
		addMemberVariable("Bar"    ,   false,  false);
		addMemberVariable("Foo"    ,   false, true);
		addMemberVariable("Bar"    ,   false, true);
		addMemberVariable("Foo"    ,   false, false);
		addMemberVariable("Bar"    ,   false, false);
		addMemberVariable("Foo"    ,   true,  true);
		addMemberVariable("Bar"    ,   true,  true);
		assertFalse("Failed to run test for java.lang.String", getNumberOfMemberVariables() > 0);
		addMemberVariable("Bar"    , false, false);
		addMemberVariable("Foo"    , false,  false);
		addMemberVariable("Bar"    , false,  false);
		addMemberVariable("Baz"    , false, false);
	}
	
	@Test	
	public void toString() {
		assertTrue("Failed to run test because no class in source was found.", toString().length() == 0);
	}
	
	@Test
	public void memberVariablesIterator() {
		Iterator<String> i = memberVariables.iterator();
}
}